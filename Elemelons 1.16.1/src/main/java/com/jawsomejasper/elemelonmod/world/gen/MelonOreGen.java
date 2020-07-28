package com.jawsomejasper.elemelonmod.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import com.jawsomejasper.elemelonmod.init.BlockInit;

public class MelonOreGen 
{
	public static void generateOre()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{
			ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 1, 5, 68));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.melon_essence_ore.getDefaultState(), 9)).withPlacement(customConfig));
		}
	}
}
