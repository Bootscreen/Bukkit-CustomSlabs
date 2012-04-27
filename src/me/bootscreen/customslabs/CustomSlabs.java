package me.bootscreen.customslabs;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;

import me.bootscreen.customslabs.slabs.*;

public class CustomSlabs extends JavaPlugin 
{
	private final Events blockListener = new Events(this);

	public final Logger log = Logger.getLogger("Minecraft");

	public FileConfiguration config = null;

	PluginDescriptionFile plugdisc;

	public static CustomBlock BedrockSlab;
	public static CustomBlock BookshelfSlab;
	public static CustomBlock ClaySlab;
	public static CustomBlock CrackedStoneBrickSlab;
	public static CustomBlock DirtSlab;
	public static CustomBlock EndstoneSlab;
	public static CustomBlock GlasSlab;
	public static CustomBlock GlowstoneSlab;
	public static CustomBlock GravelSlab;
	public static CustomBlock LapislazuliSlab;
	public static CustomBlock LogSlab;
	public static CustomBlock Log1Slab;
	public static CustomBlock Log2Slab;
	public static CustomBlock Log3Slab;
	public static CustomBlock MossStoneSlab;
	public static CustomBlock MossyStoneBrickSlab;
	public static CustomBlock NetherbrickSlab;
	public static CustomBlock NetherrackSlab;
	public static CustomBlock ObsidianSlab;
	public static CustomBlock Planks_birchSlab;
	public static CustomBlock Planks_jungleSlab;
	public static CustomBlock Planks_spruceSlab;
	public static CustomBlock SandSlab;
	public static CustomBlock SoulsandSlab;
	public static CustomBlock StoneSlab;
	public static CustomBlock Wool_blackSlab;
	public static CustomBlock Wool_blueSlab;
	public static CustomBlock Wool_brownSlab;
	public static CustomBlock Wool_cyanSlab;
	public static CustomBlock Wool_graySlab;
	public static CustomBlock Wool_greenSlab;
	public static CustomBlock Wool_lightblueSlab;
	public static CustomBlock Wool_lightgraySlab;
	public static CustomBlock Wool_limeSlab;
	public static CustomBlock Wool_magentaSlab;
	public static CustomBlock Wool_orangeSlab;
	public static CustomBlock Wool_pinkSlab;
	public static CustomBlock Wool_purpleSlab;
	public static CustomBlock Wool_redSlab;
	public static CustomBlock Wool_whiteSlab;
	public static CustomBlock Wool_yellowSlab;

	public static Texture BedrockTexture;
	public static Texture BookshelfTexture;
	public static Texture ClayTexture;
	public static Texture CrackedStoneBrickTexture;
	public static Texture DirtTexture;
	public static Texture EndstoneTexture;
	public static Texture GlasTexture;
	public static Texture GlowstoneTexture;
	public static Texture GravelTexture;
	public static Texture LapislazuliTexture;
	public static Texture LogTexture;
	public static Texture Log1Texture;
	public static Texture Log2Texture;
	public static Texture Log3Texture;
	public static Texture MossStoneTexture;
	public static Texture MossyStoneBrickTexture;
	public static Texture NetherbrickTexture;
	public static Texture NetherrackTexture;
	public static Texture ObsidianTexture;
	public static Texture Planks_birchTexture;
	public static Texture Planks_jungleTexture;
	public static Texture Planks_spruceTexture;
	public static Texture SandTexture;
	public static Texture SoulsandTexture;
	public static Texture StoneTexture;
	public static Texture Wool_blackTexture;
	public static Texture Wool_blueTexture;
	public static Texture Wool_brownTexture;
	public static Texture Wool_cyanTexture;
	public static Texture Wool_grayTexture;
	public static Texture Wool_greenTexture;
	public static Texture Wool_lightblueTexture;
	public static Texture Wool_lightgrayTexture;
	public static Texture Wool_limeTexture;
	public static Texture Wool_magentaTexture;
	public static Texture Wool_orangeTexture;
	public static Texture Wool_pinkTexture;
	public static Texture Wool_purpleTexture;
	public static Texture Wool_redTexture;
	public static Texture Wool_whiteTexture;
	public static Texture Wool_yellowTexture;

	@Override
	public void onDisable() {
		log.info("[" + plugdisc.getName() + "] Version " + plugdisc.getVersion() + " disabled.");		
	}

	@Override
	public void onEnable() {
		plugdisc = this.getDescription();

		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(blockListener, this);

		config = this.getConfig();
		loadConfig();

		if(!config.getBoolean("bedrock.disabled",false))
		{
			BedrockTexture = new Texture(this,config.getString("bedrock.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bedrock.png"),config.getInt("bedrock.size",16) * 2, config.getInt("bedrock.size",16), config.getInt("bedrock.size",16));
			BedrockSlab = new BedrockSlab (this, BedrockTexture);
			SpoutShapedRecipe BedrockRecipe = new SpoutShapedRecipe(new SpoutItemStack(BedrockSlab, 6));
			BedrockRecipe.shape(new String[] { "AAA" });
			BedrockRecipe.setIngredient('A', MaterialData.bedrock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(BedrockRecipe);
		}
		if(!config.getBoolean("bookshelf.disabled",false))
		{
			BookshelfTexture = new Texture(this,config.getString("bookshelf.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bookshelf.png"),config.getInt("bookshelf.size",16) * 2, config.getInt("bookshelf.size",16), config.getInt("bookshelf.size",16));
			BookshelfSlab = new BookshelfSlab (this, BookshelfTexture);
			SpoutShapedRecipe BookshelfRecipe = new SpoutShapedRecipe(new SpoutItemStack(BookshelfSlab, 6));
			BookshelfRecipe.shape(new String[] { "AAA" });
			BookshelfRecipe.setIngredient('A', MaterialData.bookshelf);
			SpoutManager.getMaterialManager().registerSpoutRecipe(BookshelfRecipe);
		}
		if(!config.getBoolean("clay.disabled",false))
		{
			ClayTexture = new Texture(this,config.getString("clay.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/clay.png"),config.getInt("clay.size",16) * 2, config.getInt("clay.size",16) , config.getInt("clay.size",16));
			ClaySlab = new ClaySlab (this, ClayTexture);
			SpoutShapedRecipe ClayRecipe = new SpoutShapedRecipe(new SpoutItemStack(ClaySlab, 6));
			ClayRecipe.shape(new String[] { "AAA" });
			ClayRecipe.setIngredient('A', MaterialData.clay);
			SpoutManager.getMaterialManager().registerSpoutRecipe(ClayRecipe);
		}
		if(!config.getBoolean("dirt.disabled",false))
		{
			DirtTexture = new Texture(this,config.getString("dirt.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/dirt.png"),config.getInt("dirt.size",16) * 2, config.getInt("dirt.size",16) , config.getInt("dirt.size",16));
			DirtSlab = new DirtSlab (this, DirtTexture);
			SpoutShapedRecipe DirtRecipe = new SpoutShapedRecipe(new SpoutItemStack(DirtSlab, 6));
			DirtRecipe.shape(new String[] { "AAA" });
			DirtRecipe.setIngredient('A', MaterialData.dirt);
			SpoutManager.getMaterialManager().registerSpoutRecipe(DirtRecipe);
		}
		if(!config.getBoolean("endstone.disabled",false))
		{
			EndstoneTexture = new Texture(this,config.getString("endstone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/endstone.png"),config.getInt("endstone.size",16) * 2, config.getInt("endstone.size",16) , config.getInt("endstone.size",16));
			EndstoneSlab = new EndstoneSlab (this, EndstoneTexture);
			SpoutShapedRecipe EndstoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(EndstoneSlab, 6));
			EndstoneRecipe.shape(new String[] { "AAA" });
			EndstoneRecipe.setIngredient('A', MaterialData.endStone);
			SpoutManager.getMaterialManager().registerSpoutRecipe(EndstoneRecipe);
		}
		if(!config.getBoolean("glas.disabled",false))
		{
			GlasTexture = new Texture(this,config.getString("glas.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glas.png"),config.getInt("glas.size",16) * 2, config.getInt("glas.size",16), config.getInt("glas.size",16));
			GlasSlab = new GlasSlab (this, GlasTexture);
			SpoutShapedRecipe GlasRecipe = new SpoutShapedRecipe(new SpoutItemStack(GlasSlab, 6));
			GlasRecipe.shape(new String[] { "AAA" });
			GlasRecipe.setIngredient('A', MaterialData.glass);
			SpoutManager.getMaterialManager().registerSpoutRecipe(GlasRecipe);
		}
		if(!config.getBoolean("glowstone.disabled",false))
		{
			GlowstoneTexture = new Texture(this,config.getString("glowstone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glowstone.png"),config.getInt("glowstone.size",16) * 2, config.getInt("glowstone.size",16), config.getInt("glowstone.size",16));
			GlowstoneSlab = new GlowstoneSlab (this, GlowstoneTexture);
			SpoutShapedRecipe GlowstoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(GlowstoneSlab, 6));
			GlowstoneRecipe.shape(new String[] { "AAA" });
			GlowstoneRecipe.setIngredient('A', MaterialData.glowstoneBlock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(GlowstoneRecipe);
		}
		if(!config.getBoolean("gravel.disabled",false))
		{
			GravelTexture = new Texture(this,config.getString("gravel.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/gravel.png"),config.getInt("gravel.size",16) * 2, config.getInt("gravel.size",16) , config.getInt("gravel.size",16));
			GravelSlab = new GravelSlab (this, GravelTexture);
			SpoutShapedRecipe GravelRecipe = new SpoutShapedRecipe(new SpoutItemStack(GravelSlab, 6));
			GravelRecipe.shape(new String[] { "AAA" });
			GravelRecipe.setIngredient('A', MaterialData.gravel);
			SpoutManager.getMaterialManager().registerSpoutRecipe(GravelRecipe);
		}
		if(!config.getBoolean("lapislazuli.disabled",false))
		{
			LapislazuliTexture = new Texture(this,config.getString("lapislazuli.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/lapislazuli.png"),config.getInt("lapislazuli.size",16) * 2, config.getInt("lapislazuli.size",16) , config.getInt("lapislazuli.size",16));
			LapislazuliSlab = new LapislazuliSlab (this, LapislazuliTexture);
			SpoutShapedRecipe LapislazuliRecipe = new SpoutShapedRecipe(new SpoutItemStack(LapislazuliSlab, 6));
			LapislazuliRecipe.shape(new String[] { "AAA" });
			LapislazuliRecipe.setIngredient('A', MaterialData.lapisBlock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(LapislazuliRecipe);
		}
		if(!config.getBoolean("log.disabled",false))
		{
			LogTexture = new Texture(this,config.getString("log.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log.png"),config.getInt("log.size",16) * 2, config.getInt("log.size",16), config.getInt("log.size",16));
			LogSlab = new LogSlab (this, LogTexture);
			SpoutShapedRecipe LogRecipe = new SpoutShapedRecipe(new SpoutItemStack(LogSlab, 6));
			LogRecipe.shape(new String[] { "AAA" });
			LogRecipe.setIngredient('A', MaterialData.log);
			SpoutManager.getMaterialManager().registerSpoutRecipe(LogRecipe);
		}
		if(!config.getBoolean("log1.disabled",false))
		{
			Log1Texture = new Texture(this,config.getString("log1.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log1.png"),config.getInt("log1.size",16) * 2, config.getInt("log1.size",16), config.getInt("log1.size",16));
			Log1Slab = new Log_spruceSlab (this, Log1Texture);
			SpoutShapedRecipe Log1Recipe = new SpoutShapedRecipe(new SpoutItemStack(Log1Slab, 6));
			Log1Recipe.shape(new String[] { "AAA" });
			Log1Recipe.setIngredient('A', MaterialData.spruceLog);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Log1Recipe);
		}
		if(!config.getBoolean("log2.disabled",false))
		{
			Log2Texture = new Texture(this,config.getString("log2.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log2.png"),config.getInt("log2.size",16) * 2, config.getInt("log2.size",16), config.getInt("log2.size",16));
			Log2Slab = new Log_birchSlab (this, Log2Texture);
			SpoutShapedRecipe Log2Recipe = new SpoutShapedRecipe(new SpoutItemStack(Log2Slab, 6));
			Log2Recipe.shape(new String[] { "AAA" });
			Log2Recipe.setIngredient('A', MaterialData.birchLog);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Log2Recipe);
		}
		if(!config.getBoolean("log3.disabled",false))
		{
			Log3Texture = new Texture(this,config.getString("log3.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log3.png"),config.getInt("log3.size",16) * 2, config.getInt("log3.size",16), config.getInt("log3.size",16));
			Log3Slab = new Log_jungleSlab (this, Log3Texture);
			SpoutShapedRecipe Log3Recipe = new SpoutShapedRecipe(new SpoutItemStack(Log3Slab, 6));
			Log3Recipe.shape(new String[] { "AAA" });
			Log3Recipe.setIngredient('A', MaterialData.jungleLog);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Log3Recipe);
		}
		if(!config.getBoolean("mossstone.disabled",false))
		{
			MossStoneTexture = new Texture(this,config.getString("mossstone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/mossstone.png"),config.getInt("mossstone.size",16) * 2, config.getInt("mossstone.size",16), config.getInt("mossstone.size",16));
			MossStoneSlab = new MossStoneSlab (this, MossStoneTexture);
			SpoutShapedRecipe MossStoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(MossStoneSlab, 6));
			MossStoneRecipe.shape(new String[] { "AAA" });
			MossStoneRecipe.setIngredient('A', MaterialData.mossStone);
			SpoutManager.getMaterialManager().registerSpoutRecipe(MossStoneRecipe);
		}
		if(!config.getBoolean("netherbrick.disabled",false))
		{
			NetherbrickTexture = new Texture(this,config.getString("netherbrick.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherbrick.png"),config.getInt("netherbrick.size",16) * 2, config.getInt("netherbrick.size",16), config.getInt("netherbrick.size",16));
			NetherbrickSlab = new NetherbrickSlab (this, NetherbrickTexture);
			SpoutShapedRecipe NetherbrickRecipe = new SpoutShapedRecipe(new SpoutItemStack(NetherbrickSlab, 6));
			NetherbrickRecipe.shape(new String[] { "AAA" });
			NetherbrickRecipe.setIngredient('A', MaterialData.netherBrick);
			SpoutManager.getMaterialManager().registerSpoutRecipe(NetherbrickRecipe);
		}
		if(!config.getBoolean("netherrack.disabled",false))
		{
			NetherrackTexture = new Texture(this,config.getString("netherrack.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherrack.png"),config.getInt("netherrack.size",16) * 2, config.getInt("netherrack.size",16), config.getInt("netherrack.size",16));
			NetherrackSlab = new NetherrackSlab (this, NetherrackTexture);
			SpoutShapedRecipe NetherrackRecipe = new SpoutShapedRecipe(new SpoutItemStack(NetherrackSlab, 6));
			NetherrackRecipe.shape(new String[] { "AAA" });
			NetherrackRecipe.setIngredient('A', MaterialData.netherrack);
			SpoutManager.getMaterialManager().registerSpoutRecipe(NetherrackRecipe);
		}
		if(!config.getBoolean("obsidian.disabled",false))
		{
			ObsidianTexture = new Texture(this,config.getString("obsidian.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/obsidian.png"),config.getInt("obsidian.size",16) * 2, config.getInt("obsidian.size",16), config.getInt("obsidian.size",16));
			ObsidianSlab = new ObsidianSlab (this, ObsidianTexture);
			SpoutShapedRecipe ObsidianRecipe = new SpoutShapedRecipe(new SpoutItemStack(ObsidianSlab, 6));
			ObsidianRecipe.shape(new String[] { "AAA" });
			ObsidianRecipe.setIngredient('A', MaterialData.obsidian);
			SpoutManager.getMaterialManager().registerSpoutRecipe(ObsidianRecipe);
		}
		if(!config.getBoolean("planks.birch.disabled",false))
		{
			Planks_birchTexture = new Texture(this,config.getString("planks.birch.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/planks_birch.png"),config.getInt("planks.birch.size",16) * 2, config.getInt("planks.birch.size",16), config.getInt("planks.birch.size",16));
			Planks_birchSlab = new Planks_birchSlab (this, Planks_birchTexture);
			SpoutShapedRecipe Planks_birchRecipe = new SpoutShapedRecipe(new SpoutItemStack(Planks_birchSlab, 6));
			Planks_birchRecipe.shape(new String[] { "AAA" });
			Planks_birchRecipe.setIngredient('A', MaterialData.getMaterial(5, (short) 2));
			SpoutManager.getMaterialManager().registerSpoutRecipe(Planks_birchRecipe);
		}
		if(!config.getBoolean("planks.jungle.disabled",false))
		{
			Planks_jungleTexture = new Texture(this,config.getString("planks.jungle.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/planks_jungle.png"),config.getInt("planks.jungle.size",16) * 2, config.getInt("planks.jungle.size",16), config.getInt("planks.jungle.size",16));
			Planks_jungleSlab = new Planks_jungleSlab (this, Planks_jungleTexture);
			SpoutShapedRecipe Planks_jungleRecipe = new SpoutShapedRecipe(new SpoutItemStack(Planks_birchSlab, 6));
			Planks_jungleRecipe.shape(new String[] { "AAA" });
			Planks_jungleRecipe.setIngredient('A', MaterialData.getMaterial(5, (short) 3));
			SpoutManager.getMaterialManager().registerSpoutRecipe(Planks_jungleRecipe);
		}
		if(!config.getBoolean("planks.spruce.disabled",false))
		{
			Planks_spruceTexture = new Texture(this,config.getString("planks.spruce.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/planks_spruce.png"),config.getInt("planks.spruce.size",16) * 2, config.getInt("planks.spruce.size",16), config.getInt("planks.spruce.size",16));
			Planks_spruceSlab = new Planks_spruceSlab (this, Planks_spruceTexture);
			SpoutShapedRecipe Planks_spruceRecipe = new SpoutShapedRecipe(new SpoutItemStack(Planks_spruceSlab, 6));
			Planks_spruceRecipe.shape(new String[] { "AAA" });
			Planks_spruceRecipe.setIngredient('A', MaterialData.getMaterial(5, (short) 1));
			SpoutManager.getMaterialManager().registerSpoutRecipe(Planks_spruceRecipe);
		}
		if(!config.getBoolean("sand.disabled",false))
		{
			SandTexture = new Texture(this,config.getString("sand.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/sand.png"),config.getInt("sand.size",16) * 2, config.getInt("sand.size",16), config.getInt("sand.size",16));
			SandSlab = new SandSlab (this, SandTexture);
			SpoutShapedRecipe SandRecipe = new SpoutShapedRecipe(new SpoutItemStack(SandSlab, 6));
			SandRecipe.shape(new String[] { "AAA" });
			SandRecipe.setIngredient('A', MaterialData.sand);
			SpoutManager.getMaterialManager().registerSpoutRecipe(SandRecipe);
		}
		if(!config.getBoolean("soulsand.disabled",false))
		{
			SoulsandTexture = new Texture(this,config.getString("soulsand.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/soulsand.png"),config.getInt("soulsand.size",16) * 2, config.getInt("soulsand.size",16) , config.getInt("soulsand.size",16));
			SoulsandSlab = new SoulsandSlab (this, SoulsandTexture);
			SpoutShapedRecipe SoulsandRecipe = new SpoutShapedRecipe(new SpoutItemStack(SoulsandSlab, 6));
			SoulsandRecipe.shape(new String[] { "AAA" });
			SoulsandRecipe.setIngredient('A', MaterialData.soulSand);
			SpoutManager.getMaterialManager().registerSpoutRecipe(SoulsandRecipe);
		}
		if(!config.getBoolean("stonebrick.cracked.disabled",false))
		{
			CrackedStoneBrickTexture = new Texture(this,config.getString("stonebrick.cracked.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/crackedstonebrick.png"),config.getInt("stonebrick.cracked.size",16) * 2, config.getInt("stonebrick.cracked.size",16) , config.getInt("stonebrick.cracked.size",16));
			CrackedStoneBrickSlab = new CrackedStoneBrickSlab (this, CrackedStoneBrickTexture);
			SpoutShapedRecipe CrackedStoneBrickRecipe = new SpoutShapedRecipe(new SpoutItemStack(CrackedStoneBrickSlab, 6));
			CrackedStoneBrickRecipe.shape(new String[] { "AAA" });
			CrackedStoneBrickRecipe.setIngredient('A', MaterialData.crackedStoneBricks);
			SpoutManager.getMaterialManager().registerSpoutRecipe(CrackedStoneBrickRecipe);
		}
		if(!config.getBoolean("stonebrick.mossy.disabled",false))
		{
			MossyStoneBrickTexture = new Texture(this,config.getString("stonebrick.mossy.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/mossystonebrick.png"),config.getInt("stonebrick.mossy.size",16) * 2, config.getInt("stonebrick.mossy.size",16) , config.getInt("stonebrick.mossys.size",16));
			MossyStoneBrickSlab = new MossyStoneBrickSlab (this, MossyStoneBrickTexture);
			SpoutShapedRecipe MossyStoneBrickRecipe = new SpoutShapedRecipe(new SpoutItemStack(MossyStoneBrickSlab, 6));
			MossyStoneBrickRecipe.shape(new String[] { "AAA" });
			MossyStoneBrickRecipe.setIngredient('A', MaterialData.mossyStoneBricks);
			SpoutManager.getMaterialManager().registerSpoutRecipe(MossyStoneBrickRecipe);
		}
		if(!config.getBoolean("clean_stone.disabled",false))
		{
			StoneTexture = new Texture(this,config.getString("clean_stone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/stone.png"),config.getInt("clean_stone.size",16) * 2, config.getInt("clean_stone.size",16) , config.getInt("clean_stone.size",16));
			StoneSlab = new StoneSlab (this, StoneTexture);
			SpoutShapedRecipe StoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(StoneSlab, 1));
			StoneRecipe.shape(new String[] { "A" });
			StoneRecipe.setIngredient('A', MaterialData.stoneSlab);
			SpoutManager.getMaterialManager().registerSpoutRecipe(StoneRecipe);
			
			SpoutShapedRecipe StoneRecipe2 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.stoneSlab, 1));
			StoneRecipe2.shape(new String[] { "A" });
			StoneRecipe2.setIngredient('A', StoneSlab);
			SpoutManager.getMaterialManager().registerSpoutRecipe(StoneRecipe2);
		}
		if(!config.getBoolean("wool.black.disabled",false))
		{
			Wool_blackTexture = new Texture(this,config.getString("wool.black.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_black.png"),config.getInt("wool.black.size",16) * 2, config.getInt("wool.black.size",16) , config.getInt("wool.black.size",16));
			Wool_blackSlab = new Wool_blackSlab (this, Wool_blackTexture);
			SpoutShapedRecipe Wool_blackRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_blackSlab, 6));
			Wool_blackRecipe.shape(new String[] { "AAA" });
			Wool_blackRecipe.setIngredient('A', MaterialData.blackWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_blackRecipe);
		}
		if(!config.getBoolean("wool.blue.disabled",false))
		{
			Wool_blueTexture = new Texture(this,config.getString("wool.blue.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_blue.png"),config.getInt("wool.blue.size",16) * 2, config.getInt("wool.blue.size",16) , config.getInt("wool.blue.size",16));
			Wool_blueSlab = new Wool_blueSlab (this, Wool_blueTexture);
			SpoutShapedRecipe Wool_blueRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_blueSlab, 6));
			Wool_blueRecipe.shape(new String[] { "AAA" });
			Wool_blueRecipe.setIngredient('A', MaterialData.blueWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_blueRecipe);
		}
		if(!config.getBoolean("wool.brown.disabled",false))
		{
			Wool_brownTexture = new Texture(this,config.getString("wool.brown.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_brown.png"),config.getInt("wool.brown.size",16) * 2, config.getInt("wool.brown.size",16) , config.getInt("wool.brown.size",16));
			Wool_brownSlab = new Wool_brownSlab (this, Wool_brownTexture);
			SpoutShapedRecipe Wool_brownRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_brownSlab, 6));
			Wool_brownRecipe.shape(new String[] { "AAA" });
			Wool_brownRecipe.setIngredient('A', MaterialData.brownWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_brownRecipe);
		}
		if(!config.getBoolean("wool.cyan.disabled",false))
		{
			Wool_cyanTexture = new Texture(this,config.getString("wool.cyan.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_cyan.png"),config.getInt("wool.cyan.size",16) * 2, config.getInt("wool.cyan.size",16) , config.getInt("wool.cyan.size",16));
			Wool_cyanSlab = new Wool_cyanSlab (this, Wool_cyanTexture);
			SpoutShapedRecipe Wool_cyanRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_cyanSlab, 6));
			Wool_cyanRecipe.shape(new String[] { "AAA" });
			Wool_cyanRecipe.setIngredient('A', MaterialData.cyanWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_cyanRecipe);
		}
		if(!config.getBoolean("wool.grey.disabled",false))
		{
			Wool_grayTexture = new Texture(this,config.getString("wool.gray.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_gray.png"),config.getInt("wool.gray.size",16) * 2, config.getInt("wool.gray.size",16) , config.getInt("wool.gray.size",16));
			Wool_graySlab = new Wool_graySlab (this, Wool_grayTexture);
			SpoutShapedRecipe Wool_grayRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_graySlab, 6));
			Wool_grayRecipe.shape(new String[] { "AAA" });
			Wool_grayRecipe.setIngredient('A', MaterialData.greyWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_grayRecipe);
		}
		if(!config.getBoolean("wool.green.disabled",false))
		{
			Wool_greenTexture = new Texture(this,config.getString("wool.green.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_green.png"),config.getInt("wool.green.size",16) * 2, config.getInt("wool.green.size",16) , config.getInt("wool.green.size",16));
			Wool_greenSlab = new Wool_greenSlab (this, Wool_greenTexture);
			SpoutShapedRecipe Wool_greenRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_greenSlab, 6));
			Wool_greenRecipe.shape(new String[] { "AAA" });
			Wool_greenRecipe.setIngredient('A', MaterialData.greenWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_greenRecipe);
		}
		if(!config.getBoolean("wool.lightblue.disabled",false))
		{
			Wool_lightblueTexture = new Texture(this,config.getString("wool.lightblue.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightblue.png"),config.getInt("wool.lightblue.size",16) * 2, config.getInt("wool.lightblue.size",16) , config.getInt("wool.lightblue.size",16));
			Wool_lightblueSlab = new Wool_lightblueSlab (this, Wool_lightblueTexture);
			SpoutShapedRecipe Wool_lightblueRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_lightblueSlab, 6));
			Wool_lightblueRecipe.shape(new String[] { "AAA" });
			Wool_lightblueRecipe.setIngredient('A', MaterialData.lightBlueWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_lightblueRecipe);
		}
		if(!config.getBoolean("wool.lightgray.disabled",false))
		{
			Wool_lightgrayTexture = new Texture(this,config.getString("wool.lightgray.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightgray.png"),config.getInt("wool.lightgray.size",16) * 2, config.getInt("wool.lightgray.size",16) , config.getInt("wool.lightgray.size",16));
			Wool_lightgraySlab = new Wool_lightgraySlab (this, Wool_lightgrayTexture);
			SpoutShapedRecipe Wool_lightgrayRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_lightgraySlab, 6));
			Wool_lightgrayRecipe.shape(new String[] { "AAA" });
			Wool_lightgrayRecipe.setIngredient('A', MaterialData.lightGreyWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_lightgrayRecipe);
		}
		if(!config.getBoolean("wool.lime.disabled",false))
		{
			Wool_limeTexture = new Texture(this,config.getString("wool.lime.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lime.png"),config.getInt("wool.lime.size",16) * 2, config.getInt("wool.lime.size",16) , config.getInt("wool.lime.size",16));
			Wool_limeSlab = new Wool_limeSlab (this, Wool_limeTexture);
			SpoutShapedRecipe Wool_limeRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_limeSlab, 6));
			Wool_limeRecipe.shape(new String[] { "AAA" });
			Wool_limeRecipe.setIngredient('A', MaterialData.limeWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_limeRecipe);
		}
		if(!config.getBoolean("wool.magenta.disabled",false))
		{
			Wool_magentaTexture = new Texture(this,config.getString("wool.magenta.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_magenta.png"),config.getInt("wool.magenta.size",16) * 2, config.getInt("wool.magenta.size",16) , config.getInt("wool.magenta.size",16));
			Wool_magentaSlab = new Wool_magentaSlab (this, Wool_magentaTexture);
			SpoutShapedRecipe Wool_magentaRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_magentaSlab, 6));
			Wool_magentaRecipe.shape(new String[] { "AAA" });
			Wool_magentaRecipe.setIngredient('A', MaterialData.magentaWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_magentaRecipe);
		}
		if(!config.getBoolean("wool.orange.disabled",false))
		{
			Wool_orangeTexture = new Texture(this,config.getString("wool.orange.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_orange.png"),config.getInt("wool.orange.size",16) * 2, config.getInt("wool.orange.size",16) , config.getInt("wool.orange.size",16));
			Wool_orangeSlab = new Wool_orangeSlab (this, Wool_orangeTexture);
			SpoutShapedRecipe Wool_orangeRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_orangeSlab, 6));
			Wool_orangeRecipe.shape(new String[] { "AAA" });
			Wool_orangeRecipe.setIngredient('A', MaterialData.orangeWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_orangeRecipe);
		}
		if(!config.getBoolean("wool.pink.disabled",false))
		{
			Wool_pinkTexture = new Texture(this,config.getString("wool.pink.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_pink.png"),config.getInt("wool.pink.size",16) * 2, config.getInt("wool.pink.size",16) , config.getInt("wool.pink.size",16));
			Wool_pinkSlab = new Wool_pinkSlab (this, Wool_pinkTexture);
			SpoutShapedRecipe Wool_pinkRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_pinkSlab, 6));
			Wool_pinkRecipe.shape(new String[] { "AAA" });
			Wool_pinkRecipe.setIngredient('A', MaterialData.pinkWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_pinkRecipe);
		}
		if(!config.getBoolean("wool.purple.disabled",false))
		{
			Wool_purpleTexture = new Texture(this,config.getString("wool.purple.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_purple.png"),config.getInt("wool.purple.size",16) * 2, config.getInt("wool.purple.size",16) , config.getInt("wool.purple.size",16));
			Wool_purpleSlab = new Wool_purpleSlab (this, Wool_purpleTexture);
			SpoutShapedRecipe Wool_purpleRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_purpleSlab, 6));
			Wool_purpleRecipe.shape(new String[] { "AAA" });
			Wool_purpleRecipe.setIngredient('A', MaterialData.purpleWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_purpleRecipe);
		}
		if(!config.getBoolean("wool.red.disabled",false))
		{
			Wool_redTexture = new Texture(this,config.getString("wool.red.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_red.png"),config.getInt("wool.red.size",16) * 2, config.getInt("wool.red.size",16) , config.getInt("wool.red.size",16));
			Wool_redSlab = new Wool_redSlab (this, Wool_redTexture);
			SpoutShapedRecipe Wool_redRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_redSlab, 6));
			Wool_redRecipe.shape(new String[] { "AAA" });
			Wool_redRecipe.setIngredient('A', MaterialData.redWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_redRecipe);
		}
		if(!config.getBoolean("wool.white.disabled",false))
		{
			Wool_whiteTexture = new Texture(this,config.getString("wool.white.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_white.png"),config.getInt("wool.white.size",16) * 2, config.getInt("wool.white.size",16) , config.getInt("wool.white.size",16));
			Wool_whiteSlab = new Wool_whiteSlab (this, Wool_whiteTexture);
			SpoutShapedRecipe Wool_whiteRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_whiteSlab, 6));
			Wool_whiteRecipe.shape(new String[] { "AAA" });
			Wool_whiteRecipe.setIngredient('A', MaterialData.whiteWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_whiteRecipe);
		}
		if(!config.getBoolean("wool.yellow.disabled",false))
		{
			Wool_yellowTexture = new Texture(this,config.getString("wool.yellow.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_yellow.png"),config.getInt("wool.yellow.size",16) * 2, config.getInt("wool.yellow.size",16) , config.getInt("wool.yellow.size",16));
			Wool_yellowSlab = new Wool_yellowSlab (this, Wool_yellowTexture);
			SpoutShapedRecipe Wool_yellowRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_yellowSlab, 6));
			Wool_yellowRecipe.shape(new String[] { "AAA" });
			Wool_yellowRecipe.setIngredient('A', MaterialData.yellowWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_yellowRecipe);
		}


		log.info("[" + plugdisc.getName() + "] Version " + plugdisc.getVersion() + " enabled.");	
	}
	     
	public void loadConfig()
	{
		config.addDefault("bedrock.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bedrock.png");
		config.addDefault("bedrock.size",16);
		config.addDefault("bedrock.disabled",false);
		config.addDefault("bedrock.name","Bedrock Slab");
		config.addDefault("bookshelf.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bookshelf.png");
		config.addDefault("bookshelf.size",16);
		config.addDefault("bookshelf.disabled",false);
		config.addDefault("bookshelf.name","Bookshelf Slab");
		config.addDefault("clay.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/clay.png");
		config.addDefault("clay.size",16);
		config.addDefault("clay.disabled",false);
		config.addDefault("clay.name","Clay Slab");
		config.addDefault("dirt.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/dirt.png");
		config.addDefault("dirt.size",16);
		config.addDefault("dirt.disabled",false);
		config.addDefault("dirt.name","Dirt Slab");
		config.addDefault("endstone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/endstone.png");
		config.addDefault("endstone.size",16);
		config.addDefault("endstone.disabled",false);
		config.addDefault("endstone.name","End Stone Slab");
		config.addDefault("glas.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glas.png");
		config.addDefault("glas.size",16);
		config.addDefault("glas.disabled",false);
		config.addDefault("glas.name","Glass Slab");
		config.addDefault("glowstone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glowstone.png");
		config.addDefault("glowstone.size",16);
		config.addDefault("glowstone.disabled",false);
		config.addDefault("glowstone.name","Glowstone Slab");
		config.addDefault("gravel.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/gravel.png");
		config.addDefault("gravel.size",16);
		config.addDefault("gravel.disabled",false);
		config.addDefault("gravel.name","Gravel Slab");
		config.addDefault("lapislazuli.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/lapislazuli.png");
		config.addDefault("lapislazuli.size",16);
		config.addDefault("lapislazuli.disabled",false);
		config.addDefault("lapislazuli.name","Lapis Lazuli Slab");
		config.addDefault("log.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log.png");
		config.addDefault("log.size",16);
		config.addDefault("log.disabled",false);
		config.addDefault("log.name","Log Slab");
		config.addDefault("log1.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log1.png");
		config.addDefault("log1.size",16);
		config.addDefault("log1.disabled",false);
		config.addDefault("log1.name","Spruce Log Slab");
		config.addDefault("log2.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log2.png");
		config.addDefault("log2.size",16);
		config.addDefault("log2.disabled",false);
		config.addDefault("log2.name","Birch Log Slab");
		config.addDefault("log3.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log3.png");
		config.addDefault("log3.size",16);
		config.addDefault("log3.disabled",false);
		config.addDefault("log3.name","Jungle Log Slab");
		config.addDefault("mossstone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/mossstone.png");
		config.addDefault("mossstone.size",16);
		config.addDefault("mossstone.disabled",false);
		config.addDefault("mossstone.name","Moss Stone Slab");
		config.addDefault("netherbrick.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherbrick.png");
		config.addDefault("netherbrick.size",16);
		config.addDefault("netherbrick.disabled",false);
		config.addDefault("netherbrick.name","Nether Brick Slab");
		config.addDefault("netherrack.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherrack.png");
		config.addDefault("netherrack.size",16);
		config.addDefault("netherrack.disabled",false);
		config.addDefault("netherrack.name","Netherrack Slab");
		config.addDefault("obsidian.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/obsidian.png");
		config.addDefault("obsidian.size",16);
		config.addDefault("obsidian.disabled",false);
		config.addDefault("obsidian.name","Obsidian Slab");
		config.addDefault("planks.birch.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/planks_birch.png");
		config.addDefault("planks.birch.size",16);
		config.addDefault("planks.birch.disabled",false);
		config.addDefault("planks.birch.name","Birch Wood Planks Slab");
		config.addDefault("planks.jungle.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/planks_jungle.png");
		config.addDefault("planks.jungle.size",16);
		config.addDefault("planks.jungle.disabled",false);
		config.addDefault("planks.jungle.name","Jungle Wood Planks Slab");
		config.addDefault("planks.spruce.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/planks_spruce.png");
		config.addDefault("planks.spruce.size",16);
		config.addDefault("planks.spruce.disabled",false);
		config.addDefault("planks.spruce.name","Spruce Wood Planks Slab");
		config.addDefault("sand.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/sand.png");
		config.addDefault("sand.size",16);
		config.addDefault("sand.disabled",false);
		config.addDefault("sand.name","Sand Slab");
		config.addDefault("soulsand.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/soulsand.png");
		config.addDefault("soulsand.size",16);
		config.addDefault("soulsand.disabled",false);
		config.addDefault("soulsand.name","Soul Sand Slab");
		config.addDefault("stonebrick.cracked.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/crackedstonebrick.png");
		config.addDefault("stonebrick.cracked.size",16);
		config.addDefault("stonebrick.cracked.disabled",false);
		config.addDefault("stonebrick.cracked.name","Cracked Stone Brick Slab");
		config.addDefault("stonebrick.mossy.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/mossystonebrick.png");
		config.addDefault("stonebrick.mossy.size",16);
		config.addDefault("stonebrick.mossy.disabled",false);
		config.addDefault("stonebrick.mossy.name","Mossy Stone Brick Slab");
		config.addDefault("clean_stone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/stone.png");
		config.addDefault("clean_stone.size",16);
		config.addDefault("clean_stone.disabled",false);
		config.addDefault("clean_stone.name","Clean Stone Slab");
		config.addDefault("wool.black.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_black.png");
		config.addDefault("wool.black.size",16);
		config.addDefault("wool.black.disabled",false);
		config.addDefault("wool.black.name","Black Wool Slab");
		config.addDefault("wool.blue.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_blue.png");
		config.addDefault("wool.blue.size",16);
		config.addDefault("wool.blue.disabled",false);
		config.addDefault("wool.blue.name","Blue Wool Slab");
		config.addDefault("wool.brown.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_brown.png");
		config.addDefault("wool.brown.size",16);
		config.addDefault("wool.brown.disabled",false);
		config.addDefault("wool.brown.name","Brown Wool Slab");
		config.addDefault("wool.cyan.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_cyan.png");
		config.addDefault("wool.cyan.size",16);
		config.addDefault("wool.cyan.disabled",false);
		config.addDefault("wool.cyan.name","Cyan Wool Slab");
		config.addDefault("wool.gray.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_gray.png");
		config.addDefault("wool.gray.size",16);
		config.addDefault("wool.gray.disabled",false);
		config.addDefault("wool.gray.name","Grey Wool Slab");
		config.addDefault("wool.green.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_green.png");
		config.addDefault("wool.green.size",16);
		config.addDefault("wool.green.disabled",false);
		config.addDefault("wool.green","Dark Green Slab");
		config.addDefault("wool.lightblue.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightblue.png");
		config.addDefault("wool.lightblue.size",16);
		config.addDefault("wool.lightblue.disabled",false);
		config.addDefault("wool.lightblue","Light Blue Wool Slab");
		config.addDefault("wool.lightgray.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightgray.png");
		config.addDefault("wool.lightgray.size",16);
		config.addDefault("wool.lightgray.disabled",false);
		config.addDefault("wool.lightgray","Light Grey Wool Slab");
		config.addDefault("wool.lime.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lime.png");
		config.addDefault("wool.lime.size",16);
		config.addDefault("wool.lime.disabled",false);
		config.addDefault("wool.lime.name","Light Green Wool Slab");
		config.addDefault("wool.magenta.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_magenta.png");
		config.addDefault("wool.magenta.size",16);
		config.addDefault("wool.magenta.disabled",false);
		config.addDefault("wool.magenta.name","Magenta Wool Slab");
		config.addDefault("wool.orange.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_orange.png");
		config.addDefault("wool.orange.size",16);
		config.addDefault("wool.orange.disabled",false);
		config.addDefault("wool.orange.name","Orange Wool Slab");
		config.addDefault("wool.pink.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_pink.png");
		config.addDefault("wool.pink.size",16);
		config.addDefault("wool.pink.disabled",false);
		config.addDefault("wool.pink.name","Pink Wool Slab");
		config.addDefault("wool.purple.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_purple.png");
		config.addDefault("wool.purple.size",16);
		config.addDefault("wool.purple.disabled",false);
		config.addDefault("wool.purple.name","Purple Wool Slab");
		config.addDefault("wool.red.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_red.png");
		config.addDefault("wool.red.size",16);
		config.addDefault("wool.red.disabled",false);
		config.addDefault("wool.red.name","Red Wool Slab");
		config.addDefault("wool.white.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_white.png");
		config.addDefault("wool.white.size",16);
		config.addDefault("wool.white.disabled",false);
		config.addDefault("wool.white.name","White Wool Slab");
		config.addDefault("wool.yellow.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_yellow.png");
		config.addDefault("wool.yellow.size",16);
		config.addDefault("wool.yellow.disabled",false);
		config.addDefault("wool.yellow.name","Yellow Woll Slab");
		config.options().copyDefaults(true);
		saveConfig();
	}
}
