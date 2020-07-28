package com.jawsomemods.elemelons;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Watermelon extends ItemFood 
{

	public Watermelon(int hunger, float saturation, boolean wolfFood) 
	{
		super(hunger, saturation, wolfFood);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.waterBreathing.id, 120, 0, 1.0F);
	}

}
