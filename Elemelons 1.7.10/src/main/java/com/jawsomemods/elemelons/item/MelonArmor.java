package com.jawsomemods.elemelons.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MelonArmor extends ItemArmor {

	public MelonArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "em:textures/models/armor/melon_layer_2.png";
		}
		return "em:textures/models/armor/melon_layer_1.png";
	}
}
