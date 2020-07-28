package com.jawsomemods.elemelons;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AirmelonCrop extends BlockCrops {
	
	@Override
    protected Item func_149866_i()
    {
        return ElemelonMod.airmelonSeeds;
    }
	
	@Override
    protected Item func_149865_P()
    {
        return ElemelonMod.airmelon;
    }
}