package me.bootscreen.customslabs;

import me.bootscreen.customslabs.slabs.SoulsandSlab;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Events implements Listener{
	
	public CustomSlabs plugin;
	public Events(CustomSlabs instance) 
	{
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
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.BookshelfSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.BOOKSHELF);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.DirtSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.DIRT);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.EndstoneSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.ENDER_STONE);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.GlasSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.GLASS);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.GlowstoneSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.GLOWSTONE);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.GravelSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.GRAVEL);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.LapislazuliSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LAPIS_BLOCK);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.LogSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LOG);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Log1Slab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LOG);
					BlockAgainst.setData((byte) 1);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Log2Slab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.LOG);
					BlockAgainst.setData((byte) 2);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.NetherbrickSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.NETHER_BRICK);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.NetherrackSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.NETHERRACK);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.ObsidianSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.OBSIDIAN);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.SandSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.SAND);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.SoulsandSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.SOUL_SAND);
					event.setCancelled(true);
				}
				
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.StoneSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.STONE);
					event.setCancelled(true);
				}

				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_blackSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 15);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_blueSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 11);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_brownSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 12);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_cyanSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 9);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_graySlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 7);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_greenSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 13);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_lightblueSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 3);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_lightgraySlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 8);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_limeSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 5);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_magentaSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 2);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_orangeSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 1);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_pinkSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 6);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_purpleSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 10);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_redSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 14);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_whiteSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 0);
					event.setCancelled(true);
				}
				if(CustomBlockAgainst.getClass() == me.bootscreen.customslabs.slabs.Wool_yellowSlab.class)
				{
					BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
					plugin.getServer().getPluginManager().callEvent(blockbreakevent);
					BlockAgainst.setType(Material.WOOL);
					BlockAgainst.setData((byte) 4);
					event.setCancelled(true);
				}
				
				if(event.isCancelled())
				{
					ItemStack IS = new ItemStack(event.getPlayer().getItemInHand());
					IS.setAmount(IS.getAmount()-1);
					event.getPlayer().setItemInHand(IS);
				}
			}
		}
	}

	/*
	 * Workaround to prevent the spawning of blocks when customblock is placed on the same customblock
	 */
	@EventHandler
	public void onItemSpawn(ItemSpawnEvent event)
	{
		SpoutBlock Block = (SpoutBlock) event.getLocation().getBlock();		
		Location loc = Block.getLocation();
		loc.add(0, 1, 0);
		SpoutBlock BlockAbove = (SpoutBlock) loc.getBlock();

		if(Block.isCustomBlock() && BlockAbove.isCustomBlock())
		{
			CustomBlock CustomBlock = Block.getCustomBlock();
			CustomBlock CustomBlockAbove = BlockAbove.getCustomBlock(); 
			String[] SplitNameCustomBlock = CustomBlock.getFullName().split("\\.");
			String[] SplitNameCustomBlockAbove = CustomBlockAbove.getFullName().split("\\.");

			if(SplitNameCustomBlock[0].equals("CustomSlabs") && SplitNameCustomBlockAbove[0].equals("CustomSlabs"))
			{
				event.setCancelled(true);
			}
		}
	}
	
	/*
	 *  Thanks to Zach Hinchy for the permission to use his SpeedCode from Pavement.
	 */
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) 
	{
		SpoutPlayer sp = (SpoutPlayer) event.getPlayer();
	        
		boolean doMultiply = false;

		Block below = event.getPlayer().getWorld().getBlockAt(event.getPlayer().getLocation().getBlockX(), event.getPlayer().getLocation().getBlockY() - 1, event.getPlayer().getLocation().getBlockZ());
		SpoutBlock sb = (SpoutBlock) below;
	    
	    if (sb.getCustomBlock() != null) 
	    {
	    	if ((sb.getCustomBlock() instanceof SoulsandSlab)) 
	    	{
	    		doMultiply = true;
	    	}
	    }

	    if (!doMultiply) 
	    {
	    	Block at = event.getPlayer().getWorld().getBlockAt(event.getPlayer().getLocation().getBlockX(), event.getPlayer().getLocation().getBlockY(), event.getPlayer().getLocation().getBlockZ());
	    	SpoutBlock sb2 = (SpoutBlock) at;

	    	if (sb2.getCustomBlock() != null)
	    	{
	    		if ((sb2.getCustomBlock() instanceof SoulsandSlab))
	    		{
	    			doMultiply = true;
	    		}
	    	}
	    }
	    
	    if (doMultiply) 
	    {
	    	sp.setAirSpeedMultiplier(0.5);
	    	sp.setWalkingMultiplier(0.5);
	    }
	    else
	    {
	    	sp.setAirSpeedMultiplier(1);
	    	sp.setWalkingMultiplier(1);
	    }
	}
}
