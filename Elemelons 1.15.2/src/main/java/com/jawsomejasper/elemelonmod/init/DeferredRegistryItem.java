package com.jawsomejasper.elemelonmod.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.jawsomejasper.elemelonmod.ElemelonMod;
import com.jawsomejasper.elemelonmod.ElemelonMod.ElemelonItemGroup;

public class DeferredRegistryItem 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			ElemelonMod.MOD_ID);
	
	public static final RegistryObject<Item> WATERMELON_SEED = ITEMS.register("watermelon_seed", () -> new BlockItem(DeferredRegistryBlock.WATERMELON_CROP.get(), new Item.Properties().group(ElemelonItemGroup.instance)));
	public static final RegistryObject<Item> AIRMELON_SEED = ITEMS.register("airmelon_seed", () -> new BlockItem(DeferredRegistryBlock.AIRMELON_CROP.get(), new Item.Properties().group(ElemelonItemGroup.instance)));
	public static final RegistryObject<Item> FIREMELON_SEED = ITEMS.register("firemelon_seed", () -> new BlockItem(DeferredRegistryBlock.FIREMELON_CROP.get(), new Item.Properties().group(ElemelonItemGroup.instance)));
	public static final RegistryObject<Item> EARTHMELON_SEED = ITEMS.register("earthmelon_seed", () -> new BlockItem(DeferredRegistryBlock.EARTHMELON_CROP.get(), new Item.Properties().group(ElemelonItemGroup.instance)));
	public static final RegistryObject<Item> ULTIMELON_SEED = ITEMS.register("ultimelon_seed", () -> new BlockItem(DeferredRegistryBlock.ULTIMELON_CROP.get(), new Item.Properties().group(ElemelonItemGroup.instance)));
}
