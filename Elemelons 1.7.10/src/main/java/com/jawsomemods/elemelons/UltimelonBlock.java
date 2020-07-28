package com.jawsomemods.elemelons;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class UltimelonBlock extends Block
{
	public IIcon[] ultimelonTextures = new IIcon[6];
	
	protected UltimelonBlock(Material material) 
	{
		super(material);
		this.setHardness(1.3F);
	}
	
	public void registerBlockIcons(IIconRegister reg)
	{
		for(int i = 0; i<6; i++)
		{
			this.ultimelonTextures[i] = reg.registerIcon(this.getTextureName()+ "_"+i);
		}
	}
	
	public IIcon getIcon(int side, int meta)
	{
		return this.ultimelonTextures[side];
	}
}
