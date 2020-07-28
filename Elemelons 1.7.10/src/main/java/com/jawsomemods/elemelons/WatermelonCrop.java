package com.jawsomemods.elemelons;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class WatermelonCrop extends BlockCrops {
	
	@Override
    protected Item func_149866_i()
    {
        return ElemelonMod.watermelonSeeds;
    }
	
	@Override
    protected Item func_149865_P()
    {
        return ElemelonMod.watermelon;
    }
}
