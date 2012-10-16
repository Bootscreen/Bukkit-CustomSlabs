package me.bootscreen.customslabs;

import java.util.HashMap;
import java.util.Map;

import me.bootscreen.customslabs.slabs.SoulsandSlab;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.Block;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;
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

		CustomBlock CustomBlockAgainst = BlockAgainst.getCustomBlock();
		CustomBlock CustomBlockPlaced = BlockPlaced.getCustomBlock(); 

		if(CustomBlockAgainst != null && 
				CustomBlockPlaced != null)
		{

			if(BlockAgainst.getX() == BlockPlaced.getX() &&
				(BlockAgainst.getY() == BlockPlaced.getY()-1/* || BlockAgainst.getY() == BlockPlaced.getY()+1*/) &&
				BlockAgainst.getZ() == BlockPlaced.getZ())
			{

				if(CustomBlockAgainst.getClass() == CustomBlockPlaced.getClass())
				{
					Map<CustomBlock, Block> Slab_TopSlab = new HashMap<CustomBlock, Block>();
					Slab_TopSlab.put(plugin.BedrockSlab, MaterialData.bedrock);
					Slab_TopSlab.put(plugin.BookshelfSlab, MaterialData.bookshelf);
					Slab_TopSlab.put(plugin.ClaySlab, MaterialData.clayBlock);
					Slab_TopSlab.put(plugin.CrackedStoneBrickSlab, MaterialData.crackedStoneBricks);
					Slab_TopSlab.put(plugin.DirtSlab, MaterialData.dirt);
					Slab_TopSlab.put(plugin.GrassSlab, MaterialData.grass);
					Slab_TopSlab.put(plugin.EndstoneSlab, MaterialData.endStone);
					Slab_TopSlab.put(plugin.GlasSlab, MaterialData.glass);
					Slab_TopSlab.put(plugin.GlowstoneSlab, MaterialData.glowstoneBlock);
					Slab_TopSlab.put(plugin.GravelSlab, MaterialData.gravel);
					Slab_TopSlab.put(plugin.LapislazuliSlab, MaterialData.lapisBlock);              
					Slab_TopSlab.put(plugin.LogSlab, MaterialData.log);
					Slab_TopSlab.put(plugin.Log1Slab, MaterialData.spruceLog);
					Slab_TopSlab.put(plugin.Log2Slab, MaterialData.birchLog);
					Slab_TopSlab.put(plugin.Log3Slab, MaterialData.jungleLog);
					Slab_TopSlab.put(plugin.MossStoneSlab, MaterialData.mossStone);
					Slab_TopSlab.put(plugin.MossyStoneBrickSlab, MaterialData.mossyStoneBricks);
					Slab_TopSlab.put(plugin.NetherbrickSlab, MaterialData.netherBrick);
					Slab_TopSlab.put(plugin.NetherrackSlab, MaterialData.netherrack);
					Slab_TopSlab.put(plugin.ObsidianSlab, MaterialData.obsidian);
					Slab_TopSlab.put(plugin.SandSlab, MaterialData.sand);
					Slab_TopSlab.put(plugin.SoulsandSlab, MaterialData.soulSand);
					Slab_TopSlab.put(plugin.StoneSlab, MaterialData.stone);
					Slab_TopSlab.put(plugin.Wool_blackSlab, MaterialData.blackWool);
					Slab_TopSlab.put(plugin.Wool_blueSlab, MaterialData.blueWool);
					Slab_TopSlab.put(plugin.Wool_brownSlab, MaterialData.brownWool);
					Slab_TopSlab.put(plugin.Wool_cyanSlab, MaterialData.cyanWool);
					Slab_TopSlab.put(plugin.Wool_graySlab, MaterialData.greyWool);
					Slab_TopSlab.put(plugin.Wool_greenSlab, MaterialData.greenWool);
					Slab_TopSlab.put(plugin.Wool_lightblueSlab, MaterialData.lightBlueWool);
					Slab_TopSlab.put(plugin.Wool_lightgraySlab, MaterialData.lightGreyWool);
					Slab_TopSlab.put(plugin.Wool_limeSlab, MaterialData.limeWool);
					Slab_TopSlab.put(plugin.Wool_magentaSlab, MaterialData.magentaWool);
					Slab_TopSlab.put(plugin.Wool_orangeSlab, MaterialData.orangeWool);
					Slab_TopSlab.put(plugin.Wool_pinkSlab, MaterialData.pinkWool);
					Slab_TopSlab.put(plugin.Wool_purpleSlab, MaterialData.purpleWool);
					Slab_TopSlab.put(plugin.Wool_redSlab, MaterialData.redWool);
					Slab_TopSlab.put(plugin.Wool_whiteSlab, MaterialData.whiteWool);
					Slab_TopSlab.put(plugin.Wool_yellowSlab, MaterialData.yellowWool);

					if(Slab_TopSlab.containsKey(CustomBlockAgainst))
					{
						BlockBreakEvent blockbreakevent = new BlockBreakEvent(BlockAgainst, event.getPlayer());
						plugin.getServer().getPluginManager().callEvent(blockbreakevent);
						BlockAgainst.setTypeId(Slab_TopSlab.get(CustomBlockAgainst).getRawId());
						BlockAgainst.setData((byte) Slab_TopSlab.get(CustomBlockAgainst).getRawData());
						event.setCancelled(true);
					}

					if(event.isCancelled() && event.getPlayer().getGameMode() == GameMode.SURVIVAL)
					{
						ItemStack IS = new ItemStack(event.getPlayer().getItemInHand());
						IS.setAmount(IS.getAmount()-1);
						event.getPlayer().setItemInHand(IS);
					}
				}
			}
		}
		
		if(CustomBlockPlaced != null)
		{
			if(BlockAgainst.getY() == BlockPlaced.getY()+1)
			{
				Map<CustomBlock, CustomBlock> Slab_TopSlab = new HashMap<CustomBlock, CustomBlock>();
				Slab_TopSlab.put(plugin.BedrockSlab, plugin.BedrockTopSlab);
				Slab_TopSlab.put(plugin.BookshelfSlab, plugin.BookshelfTopSlab);
				Slab_TopSlab.put(plugin.ClaySlab, plugin.ClayTopSlab);
				Slab_TopSlab.put(plugin.CrackedStoneBrickSlab, plugin.CrackedStoneBrickTopSlab);
				Slab_TopSlab.put(plugin.DirtSlab, plugin.DirtTopSlab);
				Slab_TopSlab.put(plugin.GrassSlab, plugin.GrassTopSlab);
				Slab_TopSlab.put(plugin.EndstoneSlab, plugin.EndstoneTopSlab);
				Slab_TopSlab.put(plugin.GlasSlab, plugin.GlasTopSlab);
				Slab_TopSlab.put(plugin.GlowstoneSlab, plugin.GlowstoneTopSlab);
				Slab_TopSlab.put(plugin.GravelSlab, plugin.GravelTopSlab);
				Slab_TopSlab.put(plugin.LapislazuliSlab, plugin.LapislazuliTopSlab);
				Slab_TopSlab.put(plugin.LogSlab, plugin.LogTopSlab);
				Slab_TopSlab.put(plugin.Log1Slab, plugin.Log1TopSlab);
				Slab_TopSlab.put(plugin.Log2Slab, plugin.Log2TopSlab);
				Slab_TopSlab.put(plugin.Log3Slab, plugin.Log3TopSlab);
				Slab_TopSlab.put(plugin.MossStoneSlab, plugin.MossStoneTopSlab);
				Slab_TopSlab.put(plugin.MossyStoneBrickSlab, plugin.MossyStoneBrickTopSlab);
				Slab_TopSlab.put(plugin.NetherbrickSlab, plugin.NetherbrickTopSlab);
				Slab_TopSlab.put(plugin.NetherrackSlab, plugin.NetherrackTopSlab);
				Slab_TopSlab.put(plugin.ObsidianSlab, plugin.ObsidianTopSlab);
				Slab_TopSlab.put(plugin.Planks_birchSlab, plugin.Planks_birchTopSlab);
				Slab_TopSlab.put(plugin.Planks_jungleSlab, plugin.Planks_jungleTopSlab);
				Slab_TopSlab.put(plugin.Planks_spruceSlab, plugin.Planks_spruceTopSlab);
				Slab_TopSlab.put(plugin.SandSlab, plugin.SandTopSlab);
				Slab_TopSlab.put(plugin.SoulsandSlab, plugin.SoulsandTopSlab);
				Slab_TopSlab.put(plugin.StoneSlab, plugin.StoneTopSlab);
				Slab_TopSlab.put(plugin.Wool_blackSlab, plugin.Wool_blackTopSlab);
				Slab_TopSlab.put(plugin.Wool_blueSlab, plugin.Wool_blueTopSlab);
				Slab_TopSlab.put(plugin.Wool_brownSlab, plugin.Wool_brownTopSlab);
				Slab_TopSlab.put(plugin.Wool_cyanSlab, plugin.Wool_cyanTopSlab);
				Slab_TopSlab.put(plugin.Wool_graySlab, plugin.Wool_grayTopSlab);
				Slab_TopSlab.put(plugin.Wool_greenSlab, plugin.Wool_greenTopSlab);
				Slab_TopSlab.put(plugin.Wool_lightblueSlab, plugin.Wool_lightblueTopSlab);
				Slab_TopSlab.put(plugin.Wool_lightgraySlab, plugin.Wool_lightgrayTopSlab);
				Slab_TopSlab.put(plugin.Wool_limeSlab, plugin.Wool_limeTopSlab);
				Slab_TopSlab.put(plugin.Wool_magentaSlab, plugin.Wool_magentaTopSlab);
				Slab_TopSlab.put(plugin.Wool_orangeSlab, plugin.Wool_orangeTopSlab);
				Slab_TopSlab.put(plugin.Wool_pinkSlab, plugin.Wool_pinkTopSlab);
				Slab_TopSlab.put(plugin.Wool_purpleSlab, plugin.Wool_purpleTopSlab);
				Slab_TopSlab.put(plugin.Wool_redSlab, plugin.Wool_redTopSlab);
				Slab_TopSlab.put(plugin.Wool_whiteSlab, plugin.Wool_whiteTopSlab);
				Slab_TopSlab.put(plugin.Wool_yellowSlab, plugin.Wool_yellowTopSlab);
				if(Slab_TopSlab.containsKey(CustomBlockPlaced))
				{					
					//b.setTypeId(Slab_TopSlab.get(CustomBlockPlaced).getRawId());
					
					BlockPlaced.setCustomBlock(Slab_TopSlab.get(CustomBlockPlaced));

					org.bukkit.block.Block b = (org.bukkit.block.Block) BlockPlaced;
					
					//BlockPlaced.setData((byte) Slab_TopSlab.get(CustomBlockPlaced).getRawData());
					b.setData((byte) ((int) BlockPlaced.getData() + 8));
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

		CustomBlock CustomBlock = Block.getCustomBlock();
		CustomBlock CustomBlockAbove = BlockAbove.getCustomBlock(); 

		if(CustomBlock != null && CustomBlockAbove != null)
		{
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

		org.bukkit.block.Block below = sp.getLocation().subtract(0, 1, 0).getBlock();
		//Block below = event.getPlayer().getWorld().getBlockAt(event.getPlayer().getLocation().getBlockX(), event.getPlayer().getLocation().getBlockY() - 1, event.getPlayer().getLocation().getBlockZ());
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
			org.bukkit.block.Block at = sp.getLocation().getBlock();
			//Block at = event.getPlayer().getWorld().getBlockAt(event.getPlayer().getLocation().getBlockX(), event.getPlayer().getLocation().getBlockY(), event.getPlayer().getLocation().getBlockZ());
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
