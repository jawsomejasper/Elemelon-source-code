package com.jawsomejasper.elemelonmod.init;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import com.jawsomejasper.elemelonmod.ElemelonMod;
import com.jawsomejasper.elemelonmod.ElemelonMod.ElemelonItemGroup;

@ObjectHolder(ElemelonMod.MOD_ID)
@Mod.EventBusSubscriber(modid = ElemelonMod.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
	public static final Block watermelon_block = null;
	public static final Block airmelon_block = null;
	public static final Block firemelon_block = null;
	public static final Block earthmelon_block = null;
	public static final Block ultimelon_block = null;
	
	public static final Block watermelon_essence_ore = null;
	public static final Block airmelon_essence_ore = null;
	public static final Block firemelon_essence_ore = null;
	public static final Block earthmelon_essence_ore = null;
	public static final Block melon_essence_ore = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.GOURD).hardnessAndResistance(1).sound(SoundType.WOOD)).setRegistryName("watermelon_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.GOURD).hardnessAndResistance(1).sound(SoundType.WOOD)).setRegistryName("airmelon_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.GOURD).hardnessAndResistance(1).sound(SoundType.WOOD)).setRegistryName("firemelon_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.GOURD).hardnessAndResistance(1).sound(SoundType.WOOD)).setRegistryName("earthmelon_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.GOURD).hardnessAndResistance(1).sound(SoundType.WOOD)).setRegistryName("ultimelon_block"));
		
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3).sound(SoundType.STONE)).setRegistryName("watermelon_essence_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3).sound(SoundType.STONE)).setRegistryName("airmelon_essence_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3).sound(SoundType.STONE)).setRegistryName("firemelon_essence_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3).sound(SoundType.STONE)).setRegistryName("earthmelon_essence_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3).sound(SoundType.STONE)).setRegistryName("melon_essence_ore"));
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(watermelon_block, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_block"));
		event.getRegistry().register(new BlockItem(airmelon_block, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_block"));
		event.getRegistry().register(new BlockItem(firemelon_block, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_block"));
		event.getRegistry().register(new BlockItem(earthmelon_block, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_block"));
		event.getRegistry().register(new BlockItem(ultimelon_block, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("ultimelon_block"));
		
		event.getRegistry().register(new BlockItem(watermelon_essence_ore, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("watermelon_essence_ore"));
		event.getRegistry().register(new BlockItem(airmelon_essence_ore, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("airmelon_essence_ore"));
		event.getRegistry().register(new BlockItem(firemelon_essence_ore, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("firemelon_essence_ore"));
		event.getRegistry().register(new BlockItem(earthmelon_essence_ore, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("earthmelon_essence_ore"));
		event.getRegistry().register(new BlockItem(melon_essence_ore, new Item.Properties().group(ElemelonItemGroup.instance)).setRegistryName("melon_essence_ore"));
	}
}