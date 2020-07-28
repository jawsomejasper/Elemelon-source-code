package com.jawsomemods.elemelons;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class UltimelonCrop extends BlockCrops {
	
	@Override
    protected Item func_149866_i()
    {
        return ElemelonMod.ultimelonSeeds;
    }
	
	@Override
    protected Item func_149865_P()
    {
        return ElemelonMod.ultimelon;
    }
}
