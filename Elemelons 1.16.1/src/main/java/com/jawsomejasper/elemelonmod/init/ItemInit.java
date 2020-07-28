package com.jawsomejasper.elemelonmod.init;

import java.util.function.Supplier;

import com.jawsomejasper.elemelonmod.ElemelonMod;
import com.jawsomejasper.elemelonmod.ElemelonMod.ElemelonItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ElemelonMod.MOD_ID, bus = Bus.MOD)

@ObjectHolder(ElemelonMod.MOD_ID)
public class ItemInit 
{
	public static final Item watermelon_essence = null;
	public static final Item airmelon_essence = null;
	public static final Item firemelon_essence = null;
	public static final Item earthmelon_essence = null;
	public static final Item melon_essence = null;
	
	public static final Item watermelon = null;
	public static final Item airmelon = null;
	public static final Item firemelon = null;
	public static final Item earthmelon = null;
	public static final Item ultimelon = null;
	
	public static final Item watermelon_sword = null;
	public static final Item watermelon_pickaxe = null;
	public static final Item watermelon_shovel = null;
	public static final Item watermelon_axe = null;
	public static final Item watermelon_hoe = null;
	
	public static final Item airmelon_sword = null;
	public static final Item airmelon_pickaxe = null;
	public static final Item airmelon_shovel = null;
	public static final Item airmelon_axe = null;
	public static final Item airmelon_hoe = null;
	
	public static final Item firemelon_sword = null;
	public static final Item firemelon_pickaxe = null;
	public static final Item firemelon_shovel = null;
	public static final Item firemelon_axe = null;
	public static final Item firemelon_hoe = null;
	
	public static final Item earthmelon_sword = null;
	public static final Item earthmelon_pickaxe = null;
	public static final Item earthmelon_shovel = null;
	public static final Item earthmelon_axe = null;
	public static final Item earthmelon_hoe = null;
	
	public static final Item melon_sword = null;
	public static final Item melon_pickaxe = null;
	public static final Item melon_shovel = null;
	public static final Item melon_axe = null;
	public static final Item melon_hoe = null;
	
	public static final Item ultimelon_sword = null;
	public static final Item ultimelon_pickaxe = null;
	public static final Item ultimelon_shovel = null;
	public static final Item ultimelon_axe = null;
	public static final Item ultimelon_hoe = null;
	
	public static final Item melon_helmet = null;
	public static final Item melon_chestplate = null;
	public static final Item melon_leggings = null;
	public static final Item melon_boots = null;
	
	public static final Item watermelon_helmet = null;
	public static final Item watermelon_chestplate = null;
	public static final Item watermelon_leggings = null;
	public static final Item watermelon_boots = null;
	
	public static final Item airmelon_helmet = null;
	public static final Item airmelon_chestplate = null;
	public static final Item airmelon_leggings = null;
	public static final Item airmelon_boots = null;
	
	public static final Item firemelon_helmet = null;
	public static final Item firemelon_chestplate = null;
	public static final Item firemelon_leggings = null;
	public static final Item firemelon_boots = null;
	
	public static final Item earthmelon_helmet = null;
	public static final Item earthmelon_chestplate = null;
	public static final Item earthmelon_leggings = null;
	public static final Item earthmelon_boots = null;
	
	public static final Item ultimelon_helmet = null;
	public static final Item ultimelon_chestplate = null;
	public static final Item ultimelon_leggings = null;
	public static final Item ultimelon_boots = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_essence"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_essence"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_essence"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_essence"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_essence"));
		
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance).food(new Food.Builder().hunger(5).saturation(0.8F).setAlwaysEdible().meat().effect(new EffectInstance(Effects.WATER_BREATHING, 2400, 0), 1.0F).build())).setRegistryName("watermelon"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance).food(new Food.Builder().hunger(5).saturation(0.8F).setAlwaysEdible().meat().effect(new EffectInstance(Effects.SPEED, 2400, 0), 1.0F).build())).setRegistryName("airmelon"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance).food(new Food.Builder().hunger(5).saturation(0.8F).setAlwaysEdible().meat().effect(new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 0), 1.0F).build())).setRegistryName("firemelon"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance).food(new Food.Builder().hunger(5).saturation(0.8F).setAlwaysEdible().meat().effect(new EffectInstance(Effects.HASTE, 2400, 0), 1.0F).build())).setRegistryName("earthmelon"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElemelonItemGroup.instance).food(new Food.Builder().hunger(5).saturation(0.8F).setAlwaysEdible().meat().effect(new EffectInstance(Effects.WATER_BREATHING, 2400, 0), 1.0F).effect(new EffectInstance(Effects.HASTE, 2400, 1), 1.0F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 0), 1.0F).effect(new EffectInstance(Effects.SPEED, 2400, 1), 1.0F).build())).setRegistryName("ultimelon"));
		
		event.getRegistry().register(new SwordItem(WatermelonItemTier.WATERMELON, 3, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_sword"));
		event.getRegistry().register(new PickaxeItem(WatermelonItemTier.WATERMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_pickaxe"));
		event.getRegistry().register(new ShovelItem(WatermelonItemTier.WATERMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_shovel"));
		event.getRegistry().register(new AxeItem(WatermelonItemTier.WATERMELON, 6, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_axe"));
		event.getRegistry().register(new HoeItem(WatermelonItemTier.WATERMELON, -3, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_hoe"));
		
		event.getRegistry().register(new SwordItem(AirmelonItemTier.AIRMELON, 3, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_sword"));
		event.getRegistry().register(new PickaxeItem(AirmelonItemTier.AIRMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_pickaxe"));
		event.getRegistry().register(new ShovelItem(AirmelonItemTier.AIRMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_shovel"));
		event.getRegistry().register(new AxeItem(AirmelonItemTier.AIRMELON, 6, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_axe"));
		event.getRegistry().register(new HoeItem(AirmelonItemTier.AIRMELON, -3, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_hoe"));
		
		event.getRegistry().register(new SwordItem(FiremelonItemTier.FIREMELON, 3, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_sword"));
		event.getRegistry().register(new PickaxeItem(FiremelonItemTier.FIREMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_pickaxe"));
		event.getRegistry().register(new ShovelItem(FiremelonItemTier.FIREMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_shovel"));
		event.getRegistry().register(new AxeItem(FiremelonItemTier.FIREMELON, 6, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_axe"));
		event.getRegistry().register(new HoeItem(FiremelonItemTier.FIREMELON, -3, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_hoe"));
		
		event.getRegistry().register(new SwordItem(EarthmelonItemTier.EARTHMELON, 3, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_sword"));
		event.getRegistry().register(new PickaxeItem(EarthmelonItemTier.EARTHMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_pickaxe"));
		event.getRegistry().register(new ShovelItem(EarthmelonItemTier.EARTHMELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_shovel"));
		event.getRegistry().register(new AxeItem(EarthmelonItemTier.EARTHMELON, 6, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_axe"));
		event.getRegistry().register(new HoeItem(EarthmelonItemTier.EARTHMELON, -3, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_hoe"));
		
		event.getRegistry().register(new SwordItem(MelonItemTier.MELON, 2, -3, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_sword"));
		event.getRegistry().register(new PickaxeItem(MelonItemTier.MELON, 1, -3.2F, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_pickaxe"));
		event.getRegistry().register(new ShovelItem(MelonItemTier.MELON, 1, -3.2F, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_shovel"));
		event.getRegistry().register(new AxeItem(MelonItemTier.MELON, 5, -3.2F, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_axe"));
		event.getRegistry().register(new HoeItem(MelonItemTier.MELON, -4, -3.2F, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_hoe"));
		
		event.getRegistry().register(new SwordItem(UltimelonItemTier.ULTIMELON, 2, -1, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_sword"));
		event.getRegistry().register(new PickaxeItem(UltimelonItemTier.ULTIMELON, 1, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_pickaxe"));
		event.getRegistry().register(new ShovelItem(UltimelonItemTier.ULTIMELON, 1, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_shovel"));
		event.getRegistry().register(new AxeItem(UltimelonItemTier.ULTIMELON, 5, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_axe"));
		event.getRegistry().register(new HoeItem(UltimelonItemTier.ULTIMELON, -4, -2, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_hoe"));
	
		event.getRegistry().register(new ArmorItem(MelonArmorMaterial.MELON, EquipmentSlotType.HEAD, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_helmet"));
		event.getRegistry().register(new ArmorItem(MelonArmorMaterial.MELON, EquipmentSlotType.CHEST, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_chestplate"));
		event.getRegistry().register(new ArmorItem(MelonArmorMaterial.MELON, EquipmentSlotType.LEGS, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_leggings"));
		event.getRegistry().register(new ArmorItem(MelonArmorMaterial.MELON, EquipmentSlotType.FEET, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_boots"));
		
		event.getRegistry().register(new ArmorItem(WatermelonArmorMaterial.WATERMELON, EquipmentSlotType.HEAD, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_helmet"));
		event.getRegistry().register(new ArmorItem(WatermelonArmorMaterial.WATERMELON, EquipmentSlotType.CHEST, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_chestplate"));
		event.getRegistry().register(new ArmorItem(WatermelonArmorMaterial.WATERMELON, EquipmentSlotType.LEGS, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_leggings"));
		event.getRegistry().register(new ArmorItem(WatermelonArmorMaterial.WATERMELON, EquipmentSlotType.FEET, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_boots"));
		
		event.getRegistry().register(new ArmorItem(AirmelonArmorMaterial.AIRMELON, EquipmentSlotType.HEAD, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_helmet"));
		event.getRegistry().register(new ArmorItem(AirmelonArmorMaterial.AIRMELON, EquipmentSlotType.CHEST, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_chestplate"));
		event.getRegistry().register(new ArmorItem(AirmelonArmorMaterial.AIRMELON, EquipmentSlotType.LEGS, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_leggings"));
		event.getRegistry().register(new ArmorItem(AirmelonArmorMaterial.AIRMELON, EquipmentSlotType.FEET, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_boots"));
	
		event.getRegistry().register(new ArmorItem(FiremelonArmorMaterial.FIREMELON, EquipmentSlotType.HEAD, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_helmet"));
		event.getRegistry().register(new ArmorItem(FiremelonArmorMaterial.FIREMELON, EquipmentSlotType.CHEST, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_chestplate"));
		event.getRegistry().register(new ArmorItem(FiremelonArmorMaterial.FIREMELON, EquipmentSlotType.LEGS, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_leggings"));
		event.getRegistry().register(new ArmorItem(FiremelonArmorMaterial.FIREMELON, EquipmentSlotType.FEET, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_boots"));
	
		event.getRegistry().register(new ArmorItem(EarthmelonArmorMaterial.EARTHMELON, EquipmentSlotType.HEAD, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_helmet"));
		event.getRegistry().register(new ArmorItem(EarthmelonArmorMaterial.EARTHMELON, EquipmentSlotType.CHEST, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_chestplate"));
		event.getRegistry().register(new ArmorItem(EarthmelonArmorMaterial.EARTHMELON, EquipmentSlotType.LEGS, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_leggings"));
		event.getRegistry().register(new ArmorItem(EarthmelonArmorMaterial.EARTHMELON, EquipmentSlotType.FEET, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_boots"));
	
		event.getRegistry().register(new ArmorItem(UltimelonArmorMaterial.ULTIMELON, EquipmentSlotType.HEAD, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_helmet"));
		event.getRegistry().register(new ArmorItem(UltimelonArmorMaterial.ULTIMELON, EquipmentSlotType.CHEST, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_chestplate"));
		event.getRegistry().register(new ArmorItem(UltimelonArmorMaterial.ULTIMELON, EquipmentSlotType.LEGS, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_leggings"));
		event.getRegistry().register(new ArmorItem(UltimelonArmorMaterial.ULTIMELON, EquipmentSlotType.FEET, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_boots"));
	}
	
	public enum MelonArmorMaterial implements IArmorMaterial
	{
		MELON(ElemelonMod.MOD_ID + ":melon", 15, new int[]{2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, () -> {
			return Ingredient.fromItems(Items.MELON_SLICE);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[]{62, 62, 62, 62};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private MelonArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float func_230304_f_() {
			return 0;
		}
	}
	
	public enum WatermelonArmorMaterial implements IArmorMaterial
	{
		WATERMELON(ElemelonMod.MOD_ID + ":watermelon", 20, new int[]{3, 6, 8, 3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 3.0F, () -> {
			return Ingredient.fromItems(ItemInit.watermelon);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[]{94, 94, 94, 94};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private WatermelonArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float func_230304_f_() {
			return 0;
		}
	}
	
	public enum FiremelonArmorMaterial implements IArmorMaterial
	{
		FIREMELON(ElemelonMod.MOD_ID + ":firemelon", 20, new int[]{3, 6, 8, 3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 3.0F, () -> {
			return Ingredient.fromItems(ItemInit.firemelon);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[]{94, 94, 94, 94};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private FiremelonArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float func_230304_f_() {
			return 0;
		}
	}
	
	public enum AirmelonArmorMaterial implements IArmorMaterial
	{
		AIRMELON(ElemelonMod.MOD_ID + ":airmelon", 20, new int[]{3, 6, 8, 3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 3.0F, () -> {
			return Ingredient.fromItems(ItemInit.airmelon);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[]{94, 94, 94, 94};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private AirmelonArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float func_230304_f_() {
			return 0;
		}
	}
	
	public enum EarthmelonArmorMaterial implements IArmorMaterial
	{
		EARTHMELON(ElemelonMod.MOD_ID + ":earthmelon", 20, new int[]{3, 6, 8, 3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 3.0F, () -> {
			return Ingredient.fromItems(ItemInit.earthmelon);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[]{94, 94, 94, 94};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private EarthmelonArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float func_230304_f_() {
			return 0;
		}
	}
	
	public enum UltimelonArmorMaterial implements IArmorMaterial
	{
		ULTIMELON(ElemelonMod.MOD_ID + ":ultimelon", 25, new int[]{5, 8, 10, 5}, 40, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 5.0F, () -> {
			return Ingredient.fromItems(ItemInit.ultimelon);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[]{94, 94, 94, 94};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private UltimelonArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float func_230304_f_() {
			return 0;
		}
	}
	
	public enum WatermelonItemTier implements IItemTier
	{
		WATERMELON(4, 1750, 8, 3, 22, () -> {
			return Ingredient.fromItems(ItemInit.watermelon);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private WatermelonItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.enchantability = enchantability;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum AirmelonItemTier implements IItemTier
	{
		AIRMELON(4, 1750, 8, 3, 22, () -> {
			return Ingredient.fromItems(ItemInit.airmelon);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private AirmelonItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.enchantability = enchantability;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum EarthmelonItemTier implements IItemTier
	{
		EARTHMELON(4, 1750, 8, 3, 22, () -> {
			return Ingredient.fromItems(ItemInit.earthmelon);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private EarthmelonItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.enchantability = enchantability;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum MelonItemTier implements IItemTier
	{
		MELON(2, 1500, 6.0F, 2.0F, 14, () -> {
			return Ingredient.fromItems(Items.MELON_SLICE);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private MelonItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.enchantability = enchantability;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum FiremelonItemTier implements IItemTier
	{
		FIREMELON(4, 1750, 8, 3, 22, () -> {
			return Ingredient.fromItems(ItemInit.firemelon);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private FiremelonItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.enchantability = enchantability;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum UltimelonItemTier implements IItemTier
	{
		ULTIMELON(5, 2500, 9, 4, 50, () -> {
			return Ingredient.fromItems(ItemInit.ultimelon);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private UltimelonItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.enchantability = enchantability;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
}