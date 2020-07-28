package com.jawsomejasper.elemelonmod.util;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import com.jawsomejasper.elemelonmod.ElemelonMod;
import com.jawsomejasper.elemelonmod.init.DeferredRegistryBlock;

@Mod.EventBusSubscriber(modid = ElemelonMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber 
{
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) 
	{
		RenderTypeLookup.setRenderLayer(DeferredRegistryBlock.WATERMELON_CROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(DeferredRegistryBlock.AIRMELON_CROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(DeferredRegistryBlock.FIREMELON_CROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(DeferredRegistryBlock.EARTHMELON_CROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(DeferredRegistryBlock.ULTIMELON_CROP.get(), RenderType.getCutout());
	}
}
