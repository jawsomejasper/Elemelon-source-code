package com.jawsomemods.elemelons;

import com.jawsomemods.elemelons.item.AirmelonArmor;
import com.jawsomemods.elemelons.item.AirmelonAxe;
import com.jawsomemods.elemelons.item.AirmelonHoe;
import com.jawsomemods.elemelons.item.AirmelonPickaxe;
import com.jawsomemods.elemelons.item.AirmelonShovel;
import com.jawsomemods.elemelons.item.AirmelonSword;
import com.jawsomemods.elemelons.item.EarthmelonArmor;
import com.jawsomemods.elemelons.item.EarthmelonAxe;
import com.jawsomemods.elemelons.item.EarthmelonHoe;
import com.jawsomemods.elemelons.item.EarthmelonPickaxe;
import com.jawsomemods.elemelons.item.EarthmelonShovel;
import com.jawsomemods.elemelons.item.EarthmelonSword;
import com.jawsomemods.elemelons.item.FiremelonArmor;
import com.jawsomemods.elemelons.item.FiremelonAxe;
import com.jawsomemods.elemelons.item.FiremelonHoe;
import com.jawsomemods.elemelons.item.FiremelonPickaxe;
import com.jawsomemods.elemelons.item.FiremelonShovel;
import com.jawsomemods.elemelons.item.FiremelonSword;
import com.jawsomemods.elemelons.item.MelonAxe;
import com.jawsomemods.elemelons.item.MelonArmor;
import com.jawsomemods.elemelons.item.MelonHoe;
import com.jawsomemods.elemelons.item.MelonPickaxe;
import com.jawsomemods.elemelons.item.MelonShovel;
import com.jawsomemods.elemelons.item.MelonSword;
import com.jawsomemods.elemelons.item.UltimelonArmor;
import com.jawsomemods.elemelons.item.UltimelonAxe;
import com.jawsomemods.elemelons.item.UltimelonHoe;
import com.jawsomemods.elemelons.item.UltimelonPickaxe;
import com.jawsomemods.elemelons.item.UltimelonShovel;
import com.jawsomemods.elemelons.item.UltimelonSword;
import com.jawsomemods.elemelons.item.WatermelonArmor;
import com.jawsomemods.elemelons.item.WatermelonAxe;
import com.jawsomemods.elemelons.item.WatermelonHoe;
import com.jawsomemods.elemelons.item.WatermelonPickaxe;
import com.jawsomemods.elemelons.item.WatermelonShovel;
import com.jawsomemods.elemelons.item.WatermelonSword;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "elemelon", name = "The Elemelon Mod", version = "1.0.0")
public class ElemelonMod 
{
	public static Item watermelon;
	public static Item airmelon;
	public static Item earthmelon;
	public static Item firemelon;
	public static Item ultimelon;
	
	public static Item melonPickaxe;
	public static Item melonAxe;
	public static Item melonShovel;
	public static Item melonHoe;
	public static Item melonSword;
	
	public static Item watermelonPickaxe;
	public static Item watermelonAxe;
	public static Item watermelonShovel;
	public static Item watermelonHoe;
	public static Item watermelonSword;
	
	public static Item airmelonPickaxe;
	public static Item airmelonAxe;
	public static Item airmelonShovel;
	public static Item airmelonHoe;
	public static Item airmelonSword;
	
	public static Item firemelonPickaxe;
	public static Item firemelonAxe;
	public static Item firemelonShovel;
	public static Item firemelonHoe;
	public static Item firemelonSword;
	
	public static Item earthmelonPickaxe;
	public static Item earthmelonAxe;
	public static Item earthmelonShovel;
	public static Item earthmelonHoe;
	public static Item earthmelonSword;
	
	public static Item ultimelonPickaxe;
	public static Item ultimelonAxe;
	public static Item ultimelonShovel;
	public static Item ultimelonHoe;
	public static Item ultimelonSword;
	
	public static Item melonHelmet;
	public static Item melonChestplate;
	public static Item melonLeggings;
	public static Item melonBoots;
	
	public static Item watermelonHelmet;
	public static Item watermelonChestplate;
	public static Item watermelonLeggings;
	public static Item watermelonBoots;
	
	public static Item airmelonHelmet;
	public static Item airmelonChestplate;
	public static Item airmelonLeggings;
	public static Item airmelonBoots;
	
	public static Item earthmelonHelmet;
	public static Item earthmelonChestplate;
	public static Item earthmelonLeggings;
	public static Item earthmelonBoots;
	
	public static Item firemelonHelmet;
	public static Item firemelonChestplate;
	public static Item firemelonLeggings;
	public static Item firemelonBoots;
	
	public static Item ultimelonHelmet;
	public static Item ultimelonChestplate;
	public static Item ultimelonLeggings;
	public static Item ultimelonBoots;
	
	public static Item airmelonEssence;
	public static Item watermelonEssence;
	public static Item firemelonEssence;
	public static Item earthmelonEssence;
	public static Item melonEssence;
	
	public static final Item.ToolMaterial melonToolMaterial = EnumHelper.addToolMaterial("melonToolMaterial", 2, 600, 6.0F, 2.0F, 10);
	public static final Item.ToolMaterial elemelonToolMaterial = EnumHelper.addToolMaterial("elemelonToolMaterial", 3, 1600, 10.0F, 5.0F, 22);
	public static final Item.ToolMaterial ultimelonToolMaterial = EnumHelper.addToolMaterial("ultimelonToolMaterial", 5, 2000, 15.0F, 7.0F, 50);
	
	public static final ItemArmor.ArmorMaterial melonArmorMaterial = EnumHelper.addArmorMaterial("melonArmorMaterial", 300, new int[]{2,6,5,2}, 10);
	public static final ItemArmor.ArmorMaterial elemelonArmorMaterial = EnumHelper.addArmorMaterial("elemelonArmorMaterial", 1600, new int[]{3,8,6,3}, 22);
	public static final ItemArmor.ArmorMaterial ultimelonArmorMaterial = EnumHelper.addArmorMaterial("ultimelonArmorMaterial", 2200, new int[]{5,10,8,5}, 40);
	
	public static Block watermelonBlock;
	public static Block earthmelonBlock;
	public static Block firemelonBlock;
	public static Block airmelonBlock;
	public static Block ultimelonBlock;
	
	public static Block watermelonEssenceOre;
	public static Block airmelonEssenceOre;
	public static Block earthmelonEssenceOre;
	public static Block firemelonEssenceOre;
	public static Block melonEssenceOre;
	
	public static Block airmelonCrop;
	public static Block watermelonCrop;
	public static Block firemelonCrop;
	public static Block earthmelonCrop;
	public static Block ultimelonCorps;
	
	public static Item airmelonSeeds;
	public static Item watermelonSeeds;
	public static Item firemelonSeeds;
	public static Item earthmelonSeeds;
	public static Item ultimelonSeeds;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		airmelonCrop = new AirmelonCrop().setBlockTextureName("em:airmelonCrop").setBlockName("AirmelonCrop");
		watermelonCrop = new WatermelonCrop().setBlockTextureName("em:watermelonCrop").setBlockName("WatermelonCrop");
		firemelonCrop = new FiremelonCrop().setBlockTextureName("em:firemelonCrop").setBlockName("FiremelonCrop");
		earthmelonCrop = new EarthmelonCrop().setBlockTextureName("em:earthmelonCrop").setBlockName("EarthmelonCrop");
		ultimelonCorps = new UltimelonCrop().setBlockTextureName("em:ultimelonCorps").setBlockName("UltimelonCrop");
		
		GameRegistry.registerBlock(airmelonCrop, airmelonCrop.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(watermelonCrop, watermelonCrop.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(firemelonCrop, firemelonCrop.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(earthmelonCrop, earthmelonCrop.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ultimelonCorps, ultimelonCorps.getUnlocalizedName().substring(5));
		
		airmelonSeeds = new ItemSeeds(ElemelonMod.airmelonCrop, Blocks.farmland).setUnlocalizedName("airmelonSeeds").setTextureName("em:airmelon_seeds").setCreativeTab(tabElemelonsMod);
		watermelonSeeds = new ItemSeeds(ElemelonMod.watermelonCrop, Blocks.farmland).setUnlocalizedName("watermelonSeeds").setTextureName("em:watermelon_seeds").setCreativeTab(tabElemelonsMod);
		firemelonSeeds = new ItemSeeds(ElemelonMod.firemelonCrop, Blocks.farmland).setUnlocalizedName("firemelonSeeds").setTextureName("em:firemelon_seeds").setCreativeTab(tabElemelonsMod);
		earthmelonSeeds = new ItemSeeds(ElemelonMod.earthmelonCrop, Blocks.farmland).setUnlocalizedName("earthmelonSeeds").setTextureName("em:earthmelon_seeds").setCreativeTab(tabElemelonsMod);
		ultimelonSeeds = new ItemSeeds(ElemelonMod.ultimelonCorps, Blocks.farmland).setUnlocalizedName("ultimelonSeeds").setTextureName("em:ultimelon_seeds").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(airmelonSeeds, airmelonSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonSeeds, watermelonSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonSeeds, firemelonSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonSeeds, earthmelonSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonSeeds, ultimelonSeeds.getUnlocalizedName().substring(5));
		
		watermelonEssence = new WatermelonEssence().setUnlocalizedName("WatermelonEssence").setTextureName("em:watermelonEssence").setCreativeTab(tabElemelonsMod);
		airmelonEssence = new AirmelonEssence().setUnlocalizedName("AirmelonEssence").setTextureName("em:airmelonEssence").setCreativeTab(tabElemelonsMod);
		firemelonEssence = new FiremelonEssence().setUnlocalizedName("FiremelonEssence").setTextureName("em:firemelonEssence").setCreativeTab(tabElemelonsMod);
		earthmelonEssence = new EarthmelonEssence().setUnlocalizedName("EarthmelonEssence").setTextureName("em:earthmelonEssence").setCreativeTab(tabElemelonsMod);
		melonEssence = new MelonEssence().setUnlocalizedName("MelonEssence").setTextureName("em:melonEssence").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(airmelonEssence, airmelonEssence.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonEssence, watermelonEssence.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonEssence, firemelonEssence.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonEssence, earthmelonEssence.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonEssence, melonEssence.getUnlocalizedName().substring(5));
		
		airmelonEssenceOre = new AirmelonEssenceOre(Material.rock).setBlockName("AirmelonEssenceOre").setBlockTextureName("em:airmelonEssence_ore").setCreativeTab(tabElemelonsMod);
		watermelonEssenceOre= new WatermelonEssenceOre(Material.rock).setBlockName("WatermelonEssenceOre").setBlockTextureName("em:watermelonEssence_ore").setCreativeTab(tabElemelonsMod);
		firemelonEssenceOre = new FiremelonEssenceOre(Material.rock).setBlockName("FiremelonEssenceOre").setBlockTextureName("em:firemelonEssence_ore").setCreativeTab(tabElemelonsMod);
		earthmelonEssenceOre = new EarthmelonEssenceOre(Material.rock).setBlockName("EarthmelonEssenceOre").setBlockTextureName("em:earthmelonEssence_ore").setCreativeTab(tabElemelonsMod);
		melonEssenceOre = new MelonEssenceOre(Material.rock).setBlockName("MelonEssenceOre").setBlockTextureName("em:melonEssence_ore").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerBlock(airmelonEssenceOre, airmelonEssenceOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(watermelonEssenceOre, watermelonEssenceOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(firemelonEssenceOre, firemelonEssenceOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(earthmelonEssenceOre, earthmelonEssenceOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(melonEssenceOre, melonEssenceOre.getUnlocalizedName().substring(5));
		
		watermelon = new Watermelon(6, 0.8F, true).setUnlocalizedName("Watermelon").setTextureName("em:watermelon").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerItem(watermelon, watermelon.getUnlocalizedName().substring(5));
		
		firemelon = new Firemelon(6, 0.8F, true).setUnlocalizedName("Firemelon").setTextureName("em:firemelon").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerItem(firemelon, firemelon.getUnlocalizedName().substring(5));
		
		airmelon = new Airmelon(6, 0.8F, true).setUnlocalizedName("Airmelon").setTextureName("em:airmelon").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerItem(airmelon, airmelon.getUnlocalizedName().substring(5));
		
		earthmelon = new Earthmelon(6, 0.8F, true).setUnlocalizedName("Earthmelon").setTextureName("em:earthmelon").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerItem(earthmelon, earthmelon.getUnlocalizedName().substring(5));
		
		ultimelon = new Ultimelon(8, 1.0F, true, new PotionEffect(Potion.moveSpeed.id, 2400, 1), new PotionEffect(Potion.digSpeed.id, 2400, 1), new PotionEffect(Potion.waterBreathing.id, 2400, 0), new PotionEffect(Potion.fireResistance.id, 2400, 0)).setUnlocalizedName("Ultimelon").setTextureName("em:ultimelon").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerItem(ultimelon, ultimelon.getUnlocalizedName().substring(5));
		
		watermelonBlock = new WatermelonBlock(Material.wood).setBlockName("WatermelonBlock").setBlockTextureName("em:watermelonBlock").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerBlock(watermelonBlock, watermelonBlock.getUnlocalizedName().substring(5));
		
		earthmelonBlock = new EarthmelonBlock(Material.wood).setBlockName("EarthmelonBlock").setBlockTextureName("em:earthmelonBlock").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerBlock(earthmelonBlock, earthmelonBlock.getUnlocalizedName().substring(5));
		
		firemelonBlock = new FiremelonBlock(Material.wood).setBlockName("FiremelonBlock").setBlockTextureName("em:firemelonBlock").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerBlock(firemelonBlock, firemelonBlock.getUnlocalizedName().substring(5));
		
		airmelonBlock = new AirmelonBlock(Material.wood).setBlockName("AirmelonBlock").setBlockTextureName("em:airmelonBlock").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerBlock(airmelonBlock, airmelonBlock.getUnlocalizedName().substring(5));
		
		ultimelonBlock = new UltimelonBlock(Material.wood).setBlockName("UltimelonBlock").setBlockTextureName("em:ultimelonBlock").setCreativeTab(tabElemelonsMod);
		GameRegistry.registerBlock(ultimelonBlock, ultimelonBlock.getUnlocalizedName().substring(5));
		
		melonPickaxe = new MelonPickaxe(melonToolMaterial).setUnlocalizedName("MelonPickaxe").setTextureName("em:melonpickaxe").setCreativeTab(tabElemelonsMod);
		melonAxe = new MelonAxe(melonToolMaterial).setUnlocalizedName("MelonAxe").setTextureName("em:melonaxe").setCreativeTab(tabElemelonsMod);
		melonShovel = new MelonShovel(melonToolMaterial).setUnlocalizedName("MelonShovel").setTextureName("em:melonshovel").setCreativeTab(tabElemelonsMod);
		melonHoe = new MelonHoe(melonToolMaterial).setUnlocalizedName("MelonHoe").setTextureName("em:melonhoe").setCreativeTab(tabElemelonsMod);
		melonSword = new MelonSword(melonToolMaterial).setUnlocalizedName("MelonSword").setTextureName("em:melonsword").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(melonPickaxe, melonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonAxe, melonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonShovel, melonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonHoe, melonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonSword, melonSword.getUnlocalizedName().substring(5));
		
		watermelonPickaxe = new WatermelonPickaxe(elemelonToolMaterial).setUnlocalizedName("WatermelonPickaxe").setTextureName("em:watermelonpickaxe").setCreativeTab(tabElemelonsMod);
		watermelonAxe = new WatermelonAxe(elemelonToolMaterial).setUnlocalizedName("WatermelonAxe").setTextureName("em:watermelonaxe").setCreativeTab(tabElemelonsMod);
		watermelonShovel = new WatermelonShovel(elemelonToolMaterial).setUnlocalizedName("WatermelonShovel").setTextureName("em:watermelonshovel").setCreativeTab(tabElemelonsMod);
		watermelonHoe = new WatermelonHoe(elemelonToolMaterial).setUnlocalizedName("WatermelonHoe").setTextureName("em:watermelonhoe").setCreativeTab(tabElemelonsMod);
		watermelonSword = new WatermelonSword(elemelonToolMaterial).setUnlocalizedName("WatermelonSword").setTextureName("em:watermelonsword").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(watermelonPickaxe, watermelonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonShovel, watermelonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonAxe, watermelonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonHoe, watermelonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonSword, watermelonSword.getUnlocalizedName().substring(5));
		
		airmelonPickaxe = new AirmelonPickaxe(elemelonToolMaterial).setUnlocalizedName("AirmelonPickaxe").setTextureName("em:airmelonpickaxe").setCreativeTab(tabElemelonsMod);
		airmelonAxe = new AirmelonAxe(elemelonToolMaterial).setUnlocalizedName("AirmelonAxe").setTextureName("em:airmelonaxe").setCreativeTab(tabElemelonsMod);
		airmelonShovel = new AirmelonShovel(elemelonToolMaterial).setUnlocalizedName("AirmelonShovel").setTextureName("em:airmelonshovel").setCreativeTab(tabElemelonsMod);
		airmelonHoe = new AirmelonHoe(elemelonToolMaterial).setUnlocalizedName("AirmelonHoe").setTextureName("em:airmelonhoe").setCreativeTab(tabElemelonsMod);
		airmelonSword = new AirmelonSword(elemelonToolMaterial).setUnlocalizedName("AirmelonSword").setTextureName("em:airmelonsword").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(airmelonPickaxe, airmelonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonShovel, airmelonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonAxe, airmelonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonHoe, airmelonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonSword, airmelonSword.getUnlocalizedName().substring(5));
		
		firemelonPickaxe = new FiremelonPickaxe(elemelonToolMaterial).setUnlocalizedName("FiremelonPickaxe").setTextureName("em:firemelonpickaxe").setCreativeTab(tabElemelonsMod);
		firemelonAxe = new FiremelonAxe(elemelonToolMaterial).setUnlocalizedName("FiremelonAxe").setTextureName("em:firemelonaxe").setCreativeTab(tabElemelonsMod);
		firemelonShovel = new FiremelonShovel(elemelonToolMaterial).setUnlocalizedName("FiremelonShovel").setTextureName("em:firemelonshovel").setCreativeTab(tabElemelonsMod);
		firemelonHoe = new FiremelonHoe(elemelonToolMaterial).setUnlocalizedName("FiremelonHoe").setTextureName("em:firemelonhoe").setCreativeTab(tabElemelonsMod);
		firemelonSword = new FiremelonSword(elemelonToolMaterial).setUnlocalizedName("FiremelonSword").setTextureName("em:firemelonsword").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(firemelonPickaxe, firemelonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonAxe, firemelonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonShovel, firemelonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonHoe, firemelonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonSword, firemelonSword.getUnlocalizedName().substring(5));
		
		earthmelonPickaxe = new EarthmelonPickaxe(elemelonToolMaterial).setUnlocalizedName("EarthmelonPickaxe").setTextureName("em:earthmelonpickaxe").setCreativeTab(tabElemelonsMod);
		earthmelonAxe = new EarthmelonAxe(elemelonToolMaterial).setUnlocalizedName("EarthmelonAxe").setTextureName("em:earthmelonaxe").setCreativeTab(tabElemelonsMod);
		earthmelonShovel = new EarthmelonShovel(elemelonToolMaterial).setUnlocalizedName("EarthmelonShovel").setTextureName("em:earthmelonshovel").setCreativeTab(tabElemelonsMod);
		earthmelonHoe = new EarthmelonHoe(elemelonToolMaterial).setUnlocalizedName("EarthmelonHoe").setTextureName("em:earthmelonhoe").setCreativeTab(tabElemelonsMod);
		earthmelonSword = new EarthmelonSword(elemelonToolMaterial).setUnlocalizedName("EarthmelonSword").setTextureName("em:earthmelonsword").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(earthmelonPickaxe, earthmelonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonAxe, earthmelonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonShovel, earthmelonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonHoe, earthmelonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonSword, earthmelonSword.getUnlocalizedName().substring(5));
	
		ultimelonPickaxe = new UltimelonPickaxe(ultimelonToolMaterial).setUnlocalizedName("UltimelonPickaxe").setTextureName("em:ultimelonpickaxe").setCreativeTab(tabElemelonsMod);
		ultimelonAxe = new UltimelonAxe(ultimelonToolMaterial).setUnlocalizedName("UltimelonAxe").setTextureName("em:ultimelonaxe").setCreativeTab(tabElemelonsMod);
		ultimelonShovel = new UltimelonShovel(ultimelonToolMaterial).setUnlocalizedName("UltimelonShovel").setTextureName("em:ultimelonshovel").setCreativeTab(tabElemelonsMod);
		ultimelonHoe = new UltimelonHoe(ultimelonToolMaterial).setUnlocalizedName("UltimelonHoe").setTextureName("em:ultimelonhoe").setCreativeTab(tabElemelonsMod);
		ultimelonSword = new UltimelonSword(ultimelonToolMaterial).setUnlocalizedName("UltimelonSword").setTextureName("em:ultimelonsword").setCreativeTab(tabElemelonsMod);
	
		GameRegistry.registerItem(ultimelonPickaxe, ultimelonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonAxe, ultimelonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonShovel, ultimelonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonHoe, ultimelonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonSword, ultimelonSword.getUnlocalizedName().substring(5));
		
		melonHelmet = new MelonArmor(melonArmorMaterial, 0, 0).setUnlocalizedName("MelonHelmet").setTextureName("em:melonhelmet").setCreativeTab(tabElemelonsMod);
		melonChestplate = new MelonArmor(melonArmorMaterial, 0, 1).setUnlocalizedName("MelonChestplate").setTextureName("em:melonchestplate").setCreativeTab(tabElemelonsMod);
		melonLeggings = new MelonArmor(melonArmorMaterial, 0, 2).setUnlocalizedName("MelonLeggings").setTextureName("em:melonleggings").setCreativeTab(tabElemelonsMod);
		melonBoots = new MelonArmor(melonArmorMaterial, 0, 3).setUnlocalizedName("MelonBoots").setTextureName("em:melonboots").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(melonHelmet, melonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonChestplate, melonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonLeggings, melonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(melonBoots, melonBoots.getUnlocalizedName().substring(5));
		
		watermelonHelmet = new WatermelonArmor(elemelonArmorMaterial, 0, 0).setUnlocalizedName("WatermelonHelmet").setTextureName("em:watermelonhelmet").setCreativeTab(tabElemelonsMod);
		watermelonChestplate = new WatermelonArmor(elemelonArmorMaterial, 0, 1).setUnlocalizedName("WatermelonChestplate").setTextureName("em:watermelonchestplate").setCreativeTab(tabElemelonsMod);
		watermelonLeggings = new WatermelonArmor(elemelonArmorMaterial, 0, 2).setUnlocalizedName("WatermelonLeggings").setTextureName("em:watermelonleggings").setCreativeTab(tabElemelonsMod);
		watermelonBoots = new WatermelonArmor(elemelonArmorMaterial, 0, 3).setUnlocalizedName("WatermelonBoots").setTextureName("em:watermelonboots").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(watermelonHelmet, watermelonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonChestplate, watermelonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonLeggings, watermelonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelonBoots, watermelonBoots.getUnlocalizedName().substring(5));
	
		airmelonHelmet = new AirmelonArmor(elemelonArmorMaterial, 0, 0).setUnlocalizedName("AirmelonHelmet").setTextureName("em:airmelonhelmet").setCreativeTab(tabElemelonsMod);
		airmelonChestplate = new AirmelonArmor(elemelonArmorMaterial, 0, 1).setUnlocalizedName("AirmelonChestplate").setTextureName("em:airmelonchestplate").setCreativeTab(tabElemelonsMod);
		airmelonLeggings = new AirmelonArmor(elemelonArmorMaterial, 0, 2).setUnlocalizedName("AirmelonLeggings").setTextureName("em:airmelonleggings").setCreativeTab(tabElemelonsMod);
		airmelonBoots = new AirmelonArmor(elemelonArmorMaterial, 0, 3).setUnlocalizedName("AirmelonBoots").setTextureName("em:airmelonboots").setCreativeTab(tabElemelonsMod);
		
		GameRegistry.registerItem(airmelonHelmet, airmelonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonChestplate, airmelonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonLeggings, airmelonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(airmelonBoots, airmelonBoots.getUnlocalizedName().substring(5));
	
		earthmelonHelmet = new EarthmelonArmor(elemelonArmorMaterial, 0, 0).setUnlocalizedName("EarthmelonHelmet").setTextureName("em:earthmelonhelmet").setCreativeTab(tabElemelonsMod);
		earthmelonChestplate = new EarthmelonArmor(elemelonArmorMaterial, 0, 1).setUnlocalizedName("EarthmelonChestplate").setTextureName("em:earthmelonchestplate").setCreativeTab(tabElemelonsMod);
		earthmelonLeggings = new EarthmelonArmor(elemelonArmorMaterial, 0, 2).setUnlocalizedName("EarthmelonLeggings").setTextureName("em:earthmelonleggings").setCreativeTab(tabElemelonsMod);
		earthmelonBoots = new EarthmelonArmor(elemelonArmorMaterial, 0, 3).setUnlocalizedName("EarthmelonBoots").setTextureName("em:earthmelonboots").setCreativeTab(tabElemelonsMod);
	
		GameRegistry.registerItem(earthmelonHelmet, earthmelonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonChestplate, earthmelonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonLeggings, earthmelonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthmelonBoots, earthmelonBoots.getUnlocalizedName().substring(5));
		
		firemelonHelmet = new FiremelonArmor(elemelonArmorMaterial, 0, 0).setUnlocalizedName("FiremelonHelmet").setTextureName("em:firemelonhelmet").setCreativeTab(tabElemelonsMod);
		firemelonChestplate = new FiremelonArmor(elemelonArmorMaterial, 0, 1).setUnlocalizedName("FiremelonChestplate").setTextureName("em:firemelonchestplate").setCreativeTab(tabElemelonsMod);
		firemelonLeggings = new FiremelonArmor(elemelonArmorMaterial, 0, 2).setUnlocalizedName("FiremelonLeggings").setTextureName("em:firemelonleggings").setCreativeTab(tabElemelonsMod);
		firemelonBoots = new FiremelonArmor(elemelonArmorMaterial, 0, 3).setUnlocalizedName("FiremelonBoots").setTextureName("em:firemelonboots").setCreativeTab(tabElemelonsMod);
	
		GameRegistry.registerItem(firemelonHelmet, firemelonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonChestplate, firemelonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonLeggings, firemelonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(firemelonBoots, firemelonBoots.getUnlocalizedName().substring(5));
		
		ultimelonHelmet = new UltimelonArmor(ultimelonArmorMaterial, 0, 0).setUnlocalizedName("UltimelonHelmet").setTextureName("em:ultimelonhelmet").setCreativeTab(tabElemelonsMod);
		ultimelonChestplate = new UltimelonArmor(ultimelonArmorMaterial, 0, 1).setUnlocalizedName("UltimelonChestplate").setTextureName("em:ultimelonchestplate").setCreativeTab(tabElemelonsMod);
		ultimelonLeggings = new UltimelonArmor(ultimelonArmorMaterial, 0, 2).setUnlocalizedName("UltimelonLeggings").setTextureName("em:ultimelonleggings").setCreativeTab(tabElemelonsMod);
		ultimelonBoots = new UltimelonArmor(ultimelonArmorMaterial, 0, 3).setUnlocalizedName("UltimelonBoots").setTextureName("em:ultimelonboots").setCreativeTab(tabElemelonsMod);
	
		GameRegistry.registerItem(ultimelonHelmet, ultimelonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonChestplate, ultimelonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonLeggings, ultimelonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ultimelonBoots, ultimelonBoots.getUnlocalizedName().substring(5));
		
		GameRegistry.registerWorldGenerator(new MelonEssenceGeneration(), 0);
		GameRegistry.registerWorldGenerator(new ElemelonEssenceGeneration(), 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(watermelonBlock), new Object[]{"WWW",
																			"WWW",
																			"WWW", 'W', watermelon});
		
		GameRegistry.addRecipe(new ItemStack(firemelonBlock), new Object[]{"FFF",
																		   "FFF",
																		   "FFF", 'F', firemelon});
		
		GameRegistry.addRecipe(new ItemStack(airmelonBlock), new Object[]{"AAA",
																		  "AAA",
																		  "AAA", 'A', airmelon});
		
		GameRegistry.addRecipe(new ItemStack(earthmelonBlock), new Object[]{"EEE",
																			"EEE",
																			"EEE", 'E', earthmelon});
		
		GameRegistry.addRecipe(new ItemStack(ultimelonBlock), new Object[]{"UUU",
																		   "UUU",
																		   "UUU", 'U', ultimelon});
		
		GameRegistry.addRecipe(new ItemStack(Items.melon), new Object[]{"EEE", "EEE", "EEE", 'E', melonEssence});
		GameRegistry.addRecipe(new ItemStack(watermelon), new Object[]{"EEE", "EME", "EEE", 'E', watermelonEssence, 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(airmelon), new Object[]{"EEE", "EME", "EEE", 'E', airmelonEssence, 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(firemelon), new Object[]{"EEE", "EME", "EEE", 'E', firemelonEssence, 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(earthmelon), new Object[]{"EEE", "EME", "EEE", 'E', earthmelonEssence, 'M', Items.melon});
		
		GameRegistry.addSmelting(melonEssenceOre, new ItemStack(melonEssence), 5.0F);
		GameRegistry.addSmelting(watermelonEssenceOre, new ItemStack(watermelonEssence), 5.0F);
		GameRegistry.addSmelting(firemelonEssenceOre, new ItemStack(firemelonEssence), 5.0F);
		GameRegistry.addSmelting(airmelonEssenceOre, new ItemStack(airmelonEssence), 5.0F);
		GameRegistry.addSmelting(earthmelonEssenceOre, new ItemStack(earthmelonEssence), 5.0F);
		
		GameRegistry.addShapelessRecipe(new ItemStack(watermelon, 9), new Object[]{watermelonBlock});
		
		GameRegistry.addShapelessRecipe(new ItemStack(firemelon, 9), new Object[]{firemelonBlock});
		
		GameRegistry.addShapelessRecipe(new ItemStack(airmelon, 9), new Object[]{airmelonBlock});
		
		GameRegistry.addShapelessRecipe(new ItemStack(earthmelon, 9), new Object[]{earthmelonBlock});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ultimelon, 9), new Object[]{ultimelonBlock});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ultimelon), new Object[]{watermelon, firemelon, airmelon, earthmelon});
		
		GameRegistry.addShapelessRecipe(new ItemStack(airmelonSeeds), new Object[]{airmelon});
		GameRegistry.addShapelessRecipe(new ItemStack(watermelonSeeds), new Object[]{watermelon});
		GameRegistry.addShapelessRecipe(new ItemStack(earthmelonSeeds), new Object[]{earthmelon});
		GameRegistry.addShapelessRecipe(new ItemStack(firemelonSeeds), new Object[]{firemelon});
		GameRegistry.addShapelessRecipe(new ItemStack(ultimelonSeeds), new Object[]{ultimelon});
		
		GameRegistry.addRecipe(new ItemStack(melonPickaxe), new Object[]{"MMM", " S ", " S ", 'M', Items.melon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(melonAxe), new Object[]{" MM", " SM", " S ", 'M', Items.melon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(melonAxe), new Object[]{"MM ", "MS ", " S ", 'M', Items.melon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(melonShovel), new Object[]{"M", "S", "S", 'M', Items.melon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(melonHoe), new Object[]{"MM ", " S ", " S ", 'M', Items.melon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(melonHoe), new Object[]{" MM", " S ", " S ", 'M', Items.melon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(melonSword), new Object[]{"M", "M", "S", 'M', Items.melon, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(watermelonPickaxe), new Object[]{"MMM", " S ", " S ", 'M', watermelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(watermelonAxe), new Object[]{" MM", " SM", " S ", 'M', watermelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(watermelonAxe), new Object[]{"MM ", "MS ", " S ", 'M', watermelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(watermelonShovel), new Object[]{"M", "S", "S", 'M', watermelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(watermelonHoe), new Object[]{"MM ", " S ", " S ", 'M', watermelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(watermelonHoe), new Object[]{" MM", " S ", " S ", 'M', watermelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(watermelonSword), new Object[]{"M", "M", "S", 'M', watermelon, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(firemelonPickaxe), new Object[]{"MMM", " S ", " S ", 'M', firemelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(firemelonAxe), new Object[]{" MM", " SM", " S ", 'M', firemelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(firemelonAxe), new Object[]{"MM ", "MS ", " S ", 'M', firemelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(firemelonShovel), new Object[]{"M", "S", "S", 'M', firemelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(firemelonHoe), new Object[]{"MM ", " S ", " S ", 'M', firemelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(firemelonHoe), new Object[]{" MM", " S ", " S ", 'M', firemelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(firemelonSword), new Object[]{"M", "M", "S", 'M', firemelon, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(earthmelonPickaxe), new Object[]{"MMM", " S ", " S ", 'M', earthmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(earthmelonAxe), new Object[]{" MM", " SM", " S ", 'M', earthmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(earthmelonAxe), new Object[]{"MM ", "MS ", " S ", 'M', earthmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(earthmelonShovel), new Object[]{"M", "S", "S", 'M', earthmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(earthmelonHoe), new Object[]{"MM ", " S ", " S ", 'M', earthmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(earthmelonHoe), new Object[]{" MM", " S ", " S ", 'M', earthmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(earthmelonSword), new Object[]{"M", "M", "S", 'M', earthmelon, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(airmelonPickaxe), new Object[]{"MMM", " S ", " S ", 'M', airmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(airmelonAxe), new Object[]{" MM", " SM", " S ", 'M', airmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(airmelonAxe), new Object[]{"MM ", "MS ", " S ", 'M', airmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(airmelonShovel), new Object[]{"M", "S", "S", 'M', airmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(airmelonHoe), new Object[]{"MM ", " S ", " S ", 'M', airmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(airmelonHoe), new Object[]{" MM", " S ", " S ", 'M', airmelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(airmelonSword), new Object[]{"M", "M", "S", 'M', airmelon, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(ultimelonPickaxe), new Object[]{"MMM", " S ", " S ", 'M', ultimelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ultimelonAxe), new Object[]{" MM", " SM", " S ", 'M', ultimelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ultimelonAxe), new Object[]{"MM ", "MS ", " S ", 'M', ultimelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ultimelonShovel), new Object[]{"M", "S", "S", 'M', ultimelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ultimelonHoe), new Object[]{"MM ", " S ", " S ", 'M', ultimelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ultimelonHoe), new Object[]{" MM", " S ", " S ", 'M', ultimelon, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ultimelonSword), new Object[]{"M", "M", "S", 'M', ultimelon, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(melonHelmet), new Object[]{"MMM","M M","   ", 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(melonHelmet), new Object[]{"   ","MMM","M M", 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(melonChestplate), new Object[]{"M M","MMM","MMM", 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(melonLeggings), new Object[]{"MMM","M M","M M", 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(melonBoots), new Object[]{"   ","M M","M M", 'M', Items.melon});
		GameRegistry.addRecipe(new ItemStack(melonBoots), new Object[]{"M M","M M","   ", 'M', Items.melon});
		
		GameRegistry.addRecipe(new ItemStack(watermelonHelmet), new Object[]{"MMM","M M","   ", 'M', watermelon});
		GameRegistry.addRecipe(new ItemStack(watermelonHelmet), new Object[]{"   ","MMM","M M", 'M', watermelon});
		GameRegistry.addRecipe(new ItemStack(watermelonChestplate), new Object[]{"M M","MMM","MMM", 'M', watermelon});
		GameRegistry.addRecipe(new ItemStack(watermelonLeggings), new Object[]{"MMM","M M","M M", 'M', watermelon});
		GameRegistry.addRecipe(new ItemStack(watermelonBoots), new Object[]{"   ","M M","M M", 'M', watermelon});
		GameRegistry.addRecipe(new ItemStack(watermelonBoots), new Object[]{"M M","M M","   ", 'M', watermelon});
		
		GameRegistry.addRecipe(new ItemStack(airmelonHelmet), new Object[]{"MMM","M M","   ", 'M', airmelon});
		GameRegistry.addRecipe(new ItemStack(airmelonHelmet), new Object[]{"   ","MMM","M M", 'M', airmelon});
		GameRegistry.addRecipe(new ItemStack(airmelonChestplate), new Object[]{"M M","MMM","MMM", 'M', airmelon});
		GameRegistry.addRecipe(new ItemStack(airmelonLeggings), new Object[]{"MMM","M M","M M", 'M', airmelon});
		GameRegistry.addRecipe(new ItemStack(airmelonBoots), new Object[]{"   ","M M","M M", 'M', airmelon});
		GameRegistry.addRecipe(new ItemStack(airmelonBoots), new Object[]{"M M","M M","   ", 'M', airmelon});
		
		GameRegistry.addRecipe(new ItemStack(earthmelonHelmet), new Object[]{"MMM","M M","   ", 'M', earthmelon});
		GameRegistry.addRecipe(new ItemStack(earthmelonHelmet), new Object[]{"   ","MMM","M M", 'M', earthmelon});
		GameRegistry.addRecipe(new ItemStack(earthmelonChestplate), new Object[]{"M M","MMM","MMM", 'M', earthmelon});
		GameRegistry.addRecipe(new ItemStack(earthmelonLeggings), new Object[]{"MMM","M M","M M", 'M', earthmelon});
		GameRegistry.addRecipe(new ItemStack(earthmelonBoots), new Object[]{"   ","M M","M M", 'M', earthmelon});
		GameRegistry.addRecipe(new ItemStack(earthmelonBoots), new Object[]{"M M","M M","   ", 'M', earthmelon});
		
		GameRegistry.addRecipe(new ItemStack(firemelonHelmet), new Object[]{"MMM","M M","   ", 'M', firemelon});
		GameRegistry.addRecipe(new ItemStack(firemelonHelmet), new Object[]{"   ","MMM","M M", 'M', firemelon});
		GameRegistry.addRecipe(new ItemStack(firemelonChestplate), new Object[]{"M M","MMM","MMM", 'M', firemelon});
		GameRegistry.addRecipe(new ItemStack(firemelonLeggings), new Object[]{"MMM","M M","M M", 'M', firemelon});
		GameRegistry.addRecipe(new ItemStack(firemelonBoots), new Object[]{"   ","M M","M M", 'M', firemelon});
		GameRegistry.addRecipe(new ItemStack(firemelonBoots), new Object[]{"M M","M M","   ", 'M', firemelon});
		
		GameRegistry.addRecipe(new ItemStack(ultimelonHelmet), new Object[]{"MMM","M M","   ", 'M', ultimelon});
		GameRegistry.addRecipe(new ItemStack(ultimelonHelmet), new Object[]{"   ","MMM","M M", 'M', ultimelon});
		GameRegistry.addRecipe(new ItemStack(ultimelonChestplate), new Object[]{"M M","MMM","MMM", 'M', ultimelon});
		GameRegistry.addRecipe(new ItemStack(ultimelonLeggings), new Object[]{"MMM","M M","M M", 'M', ultimelon});
		GameRegistry.addRecipe(new ItemStack(ultimelonBoots), new Object[]{"   ","M M","M M", 'M', ultimelon});
		GameRegistry.addRecipe(new ItemStack(ultimelonBoots), new Object[]{"M M","M M","   ", 'M', ultimelon});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabElemelonsMod = new CreativeTabs("tabElemelonsMod")
	{
		@Override
		public Item getTabIconItem()
		{
			return new ItemStack(ultimelon).getItem();
		}
	};
}