package com.jawsomemods.elemelons;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class WatermelonBlock extends Block
{
	public IIcon[] texturesWatermelon = new IIcon[6];
	
	protected WatermelonBlock(Material material) 
	{
		super(material);
		this.setHardness(1.0F);
	}
	
	public void registerBlockIcons(IIconRegister reg)
	{
		for(int i = 0; i<6; i++)
		{
			this.texturesWatermelon[i] = reg.registerIcon(this.getTextureName()+ "_"+i);
		}
	}
	
	public IIcon getIcon(int side, int meta)
	{
		return this.texturesWatermelon[side];
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ElemelonMod.watermelon;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 2 + rand.nextInt(4);
	}
}
