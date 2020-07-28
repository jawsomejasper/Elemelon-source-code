package com.jawsomejasper.elemelonmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.jawsomejasper.elemelonmod.ElemelonMod;
import com.jawsomejasper.elemelonmod.objects.blocks.AirmelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.EarthmelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.FiremelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.UltimelonCrop;
import com.jawsomejasper.elemelonmod.objects.blocks.WatermelonCrop;

public class DeferredRegistryBlock
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			ElemelonMod.MOD_ID);
	
	public static final RegistryObject<Block> WATERMELON_CROP = BLOCKS.register("watermelon_crop", () -> new WatermelonCrop(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> AIRMELON_CROP = BLOCKS.register("airmelon_crop", () -> new AirmelonCrop(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> FIREMELON_CROP = BLOCKS.register("firemelon_crop", () -> new FiremelonCrop(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> EARTHMELON_CROP = BLOCKS.register("earthmelon_crop", () -> new EarthmelonCrop(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> ULTIMELON_CROP = BLOCKS.register("ultimelon_crop", () -> new UltimelonCrop(Block.Properties.from(Blocks.WHEAT)));
}
