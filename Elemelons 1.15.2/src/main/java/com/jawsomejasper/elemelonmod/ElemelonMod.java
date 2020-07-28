package com.jawsomejasper.elemelonmod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jawsomejasper.elemelonmod.init.DeferredRegistryBlock;
import com.jawsomejasper.elemelonmod.init.DeferredRegistryItem;
import com.jawsomejasper.elemelonmod.init.ItemInit;
import com.jawsomejasper.elemelonmod.objects.blocks.AirmelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.EarthmelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.FiremelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.UltimelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.WatermelonCrop;
import com.jawsomejasper.elemelonmod.world.gen.AirmelonOreGen;
import com.jawsomejasper.elemelonmod.world.gen.EarthmelonOreGen;
import com.jawsomejasper.elemelonmod.world.gen.FiremelonOreGen;
import com.jawsomejasper.elemelonmod.world.gen.MelonOreGen;
import com.jawsomejasper.elemelonmod.world.gen.WatermelonOreGen;

@Mod("elemelon")
@Mod.EventBusSubscriber(modid = ElemelonMod.MOD_ID, bus = Bus.MOD)
public class ElemelonMod {
	private static final Logger LOGGER = LogManager.getLogger();

	public static final String MOD_ID = "elemelon";
	public static ElemelonMod instance;

	public ElemelonMod() {
		FMLJavaModLoadingContext.get().getModEventBus()
				.addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus()
				.addListener(this::doClientStuff);

		DeferredRegistryItem.ITEMS.register(FMLJavaModLoadingContext.get()
				.getModEventBus());
		DeferredRegistryBlock.BLOCKS.register(FMLJavaModLoadingContext.get()
				.getModEventBus());

		instance = this;

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		DeferredRegistryBlock.BLOCKS
				.getEntries()
				.stream()
				.filter(block -> !(block.get() instanceof WatermelonCrop))
				.filter(block -> !(block.get() instanceof AirmelonCrop))
				.filter(block -> !(block.get() instanceof FiremelonCrop))
				.filter(block -> !(block.get() instanceof EarthmelonCrop))
				.filter(block -> !(block.get() instanceof UltimelonCrop))
				.map(RegistryObject::get)
				.forEach(
						block -> {
							final Item.Properties properties = new Item.Properties()
									.group(ElemelonItemGroup.instance);
							final BlockItem blockItem = new BlockItem(block,
									properties);
							blockItem.setRegistryName(block.getRegistryName());
							registry.register(blockItem);
						});

		LOGGER.debug("Registered BlockItems");
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	private void doClientStuff(final FMLClientSetupEvent event) {

	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {

	}

	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		MelonOreGen.generateOre();
		WatermelonOreGen.generateOre();
		AirmelonOreGen.generateOre();
		FiremelonOreGen.generateOre();
		EarthmelonOreGen.generateOre();
	}

	public static class ElemelonItemGroup extends ItemGroup {
		public static final ElemelonItemGroup instance = new ElemelonItemGroup(
				ItemGroup.GROUPS.length, "tabElemelonMod");

		private ElemelonItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.ultimelon);
		}
	}
}
