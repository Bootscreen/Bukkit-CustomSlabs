package me.bootscreen.customslabs;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.CustomBlock;

public class BlockListener implements Listener{
	
	public CustomSlabs plugin;
	public BlockListener(CustomSlabs instance) {
	plugin = instance;
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event)
	{		
		SpoutBlock BlockAgainst = (SpoutBlock) event.getBlockAgainst();
		SpoutBlock BlockPlaced = (SpoutBlock) event.getBlockPlaced();

		if(BlockAgainst.isCustomBlock() && 
		   BlockPlaced.isCustomBlock() &&
		   BlockAgainst.getX() == BlockPlaced.getX() &&
		   BlockAgainst.getZ() == BlockPlaced.getZ())
		{
			CustomBlock CustomBlockAgainst = BlockAgainst.getCustomBlock();
			CustomBlock CustomBlockPlaced = BlockPlaced.getCustomBlock(); 
				
			if(CustomBlockAgainst.getClass() == CustomBlockPlaced.getClass())
			{
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Bookshelf.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.BOOKSHELF);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Dirt.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.DIRT);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Endstone.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.ENDER_STONE);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Glas.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.GLASS);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Glowstone.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.GLOWSTONE);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Gravel.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.GRAVEL);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Lapislazuli.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LAPIS_BLOCK);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Log.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LOG);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Log1.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LOG);
					BlockAgainst.setData((byte) 1);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Log2.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LOG);
					BlockAgainst.setData((byte) 2);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Netherbrick.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.NETHER_BRICK);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Netherrack.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.NETHERRACK);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Obsidian.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.OBSIDIAN);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Sand.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.SAND);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Soulsand.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.SOUL_SAND);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Stone.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.STONE);
					event.setCancelled(true);
				}

				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_black.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 15);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_blue.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 11);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_brown.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 12);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_cyan.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 9);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_gray.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 7);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_green.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 13);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_lightblue.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 3);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_lightgray.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 8);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_lime.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 5);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_magenta.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 2);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_orange.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 1);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_pink.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 6);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_purple.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 10);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_red.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 14);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_white.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 0);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_yellow.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 4);
					event.setCancelled(true);
				}
			}
		}
	}
}
