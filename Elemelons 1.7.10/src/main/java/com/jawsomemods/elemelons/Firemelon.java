package com.jawsomemods.elemelons;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Firemelon extends ItemFood
{

	public Firemelon(int hunger, float saturation, boolean wolfFood) 
	{
		super(hunger, saturation, wolfFood);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.fireResistance.id, 120, 0, 1.0F);
	}
}
