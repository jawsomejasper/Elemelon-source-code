package com.jawsomemods.elemelons;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class EarthmelonBlock extends Block
{
	public IIcon[] texturesEarthmelon = new IIcon[6];

	protected EarthmelonBlock(Material material) 
	{
		super(material);
		this.setHardness(1.0F);
	}

	public void registerBlockIcons(IIconRegister reg)
	{
		for(int i = 0; i<6; i++)
		{
			this.texturesEarthmelon[i] = reg.registerIcon(this.getTextureName()+ "_"+i);
		}
	}
	
	public IIcon getIcon(int side, int meta)
	{
		return this.texturesEarthmelon[side];
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ElemelonMod.earthmelon;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 2 + rand.nextInt(4);
	}
}