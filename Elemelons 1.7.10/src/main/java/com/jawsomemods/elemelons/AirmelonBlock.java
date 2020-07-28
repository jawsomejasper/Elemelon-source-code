package com.jawsomemods.elemelons;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class AirmelonBlock extends Block
{
	public IIcon[] airmelonTextures = new IIcon[6];
	
	protected AirmelonBlock(Material material) 
	{
		super(material);
		this.setHardness(1.0F);
		
	}
	
	public void registerBlockIcons(IIconRegister reg)
	{
		for(int i = 0; i<6; i++)
		{
			this.airmelonTextures[i] = reg.registerIcon(this.getTextureName()+ "_"+i);
		}
	}
	
	public IIcon getIcon(int side, int meta)
	{
		return this.airmelonTextures[side];
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ElemelonMod.airmelon;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 2 + rand.nextInt(4);
	}
}
