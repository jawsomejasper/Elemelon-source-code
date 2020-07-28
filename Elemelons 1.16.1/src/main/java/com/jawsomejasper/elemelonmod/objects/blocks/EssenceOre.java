package com.jawsomejasper.elemelonmod.objects.blocks;

import java.util.Random;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class EssenceOre extends OreBlock 
{

	public EssenceOre(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	protected int getExperience(Random rand)
	{
		return MathHelper.nextInt(rand, 3, 7);
	}
}
