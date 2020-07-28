package com.jawsomemods.elemelons;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class FiremelonCrop extends BlockCrops {
	
	@Override
    protected Item func_149866_i()
    {
        return ElemelonMod.firemelonSeeds;
    }
	
	@Override
    protected Item func_149865_P()
    {
        return ElemelonMod.firemelon;
    }
}
