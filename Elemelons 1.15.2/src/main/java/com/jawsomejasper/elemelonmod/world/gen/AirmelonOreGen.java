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

public class AirmelonOreGen 
{
	public static void generateOre()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{
			ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 5, 20));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.airmelon_essence_ore.getDefaultState(), 10)).withPlacement(customConfig));
		}
	}
}
