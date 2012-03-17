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

public class CustomSlabs extends JavaPlugin{
	private final BlockListener blockListener = new BlockListener(this);
	
	public final Logger log = Logger.getLogger("Minecraft");

	FileConfiguration config = null;

	PluginDescriptionFile plugdisc;

	public static CustomBlock BookshelfSlab;
	public static CustomBlock DirtSlab;
	public static CustomBlock EndstoneSlab;
	public static CustomBlock GlasSlab;
	public static CustomBlock GlowstoneSlab;
	public static CustomBlock GravelSlab;
	public static CustomBlock LapislazuliSlab;
	public static CustomBlock LogSlab;
	public static CustomBlock Log1Slab;
	public static CustomBlock Log2Slab;
	public static CustomBlock NetherbrickSlab;
	public static CustomBlock NetherrackSlab;
	public static CustomBlock ObsidianSlab;
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


	public static Texture BookshelfTexture;
	public static Texture DirtTexture;
	public static Texture EndstoneTexture;
	public static Texture GlasTexture;
	public static Texture GlowstoneTexture;
	public static Texture GravelTexture;
	public static Texture LapislazuliTexture;
	public static Texture LogTexture;
	public static Texture Log1Texture;
	public static Texture Log2Texture;
	public static Texture NetherbrickTexture;
	public static Texture NetherrackTexture;
	public static Texture ObsidianTexture;
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
		
		BookshelfTexture = new Texture(this,config.getString("bookshelf.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bookshelf.png"),config.getInt("bookshelf.size",16) * 2, config.getInt("bookshelf.size",16), config.getInt("bookshelf.size",16));
		DirtTexture = new Texture(this,config.getString("dirt.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/dirt.png"),config.getInt("dirt.size",16) * 2, config.getInt("dirt.size",16) , config.getInt("dirt.size",16));
		EndstoneTexture = new Texture(this,config.getString("endstone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/endstone.png"),config.getInt("endstone.size",16) * 2, config.getInt("endstone.size",16) , config.getInt("endstone.size",16));
		GlasTexture = new Texture(this,config.getString("glas.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glas.png"),config.getInt("glas.size",16) * 2, config.getInt("glas.size",16), config.getInt("glas.size",16));
		GlowstoneTexture = new Texture(this,config.getString("glowstone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glowstone.png"),config.getInt("glowstone.size",16) * 2, config.getInt("glowstone.size",16), config.getInt("glowstone.size",16));
		GravelTexture = new Texture(this,config.getString("gravel.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/gravel.png"),config.getInt("gravel.size",16) * 2, config.getInt("gravel.size",16) , config.getInt("gravel.size",16));
		LapislazuliTexture = new Texture(this,config.getString("lapislazuli.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/lapislazuli.png"),config.getInt("lapislazuli.size",16) * 2, config.getInt("lapislazuli.size",16) , config.getInt("lapislazuli.size",16));
		LogTexture = new Texture(this,config.getString("log.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log.png"),config.getInt("log.size",16) * 2, config.getInt("log.size",16), config.getInt("log.size",16));
		Log1Texture = new Texture(this,config.getString("log1.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log1.png"),config.getInt("log1.size",16) * 2, config.getInt("log1.size",16), config.getInt("log1.size",16));
		Log2Texture = new Texture(this,config.getString("log2.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log2.png"),config.getInt("log2.size",16) * 2, config.getInt("log2.size",16), config.getInt("log2.size",16));
		NetherbrickTexture = new Texture(this,config.getString("netherbrick.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherbrick.png"),config.getInt("netherbrick.size",16) * 2, config.getInt("netherbrick.size",16), config.getInt("netherbrick.size",16));
		NetherrackTexture = new Texture(this,config.getString("netherrack.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherrack.png"),config.getInt("netherrack.size",16) * 2, config.getInt("netherrack.size",16), config.getInt("netherrack.size",16));
		ObsidianTexture = new Texture(this,config.getString("obsidian.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/obsidian.png"),config.getInt("obsidian.size",16) * 2, config.getInt("obsidian.size",16), config.getInt("obsidian.size",16));
		SandTexture = new Texture(this,config.getString("sand.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/sand.png"),config.getInt("sand.size",16) * 2, config.getInt("sand.size",16), config.getInt("sand.size",16));
		SoulsandTexture = new Texture(this,config.getString("soulsand.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/soulsand.png"),config.getInt("soulsand.size",16) * 2, config.getInt("soulsand.size",16) , config.getInt("soulsand.size",16));
		StoneTexture = new Texture(this,config.getString("clean_stone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/stone.png"),config.getInt("clean_stone.size",16) * 2, config.getInt("clean_stone.size",16) , config.getInt("clean_stone.size",16));
		Wool_blackTexture = new Texture(this,config.getString("wool.black.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_black.png"),config.getInt("wool.black.size",16) * 2, config.getInt("wool.black.size",16) , config.getInt("wool.black.size",16));
		Wool_blueTexture = new Texture(this,config.getString("wool.blue.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_blue.png"),config.getInt("wool.blue.size",16) * 2, config.getInt("wool.blue.size",16) , config.getInt("wool.blue.size",16));
		Wool_brownTexture = new Texture(this,config.getString("wool.brown.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_brown.png"),config.getInt("wool.brown.size",16) * 2, config.getInt("wool.brown.size",16) , config.getInt("wool.brown.size",16));
		Wool_cyanTexture = new Texture(this,config.getString("wool.cyan.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_cyan.png"),config.getInt("wool.cyan.size",16) * 2, config.getInt("wool.cyan.size",16) , config.getInt("wool.cyan.size",16));
		Wool_grayTexture = new Texture(this,config.getString("wool.gray.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_gray.png"),config.getInt("wool.gray.size",16) * 2, config.getInt("wool.gray.size",16) , config.getInt("wool.gray.size",16));
		Wool_greenTexture = new Texture(this,config.getString("wool.green.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_green.png"),config.getInt("wool.green.size",16) * 2, config.getInt("wool.green.size",16) , config.getInt("wool.green.size",16));
		Wool_lightblueTexture = new Texture(this,config.getString("wool.lightblue.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightblue.png"),config.getInt("wool.lightblue.size",16) * 2, config.getInt("wool.lightblue.size",16) , config.getInt("wool.lightblue.size",16));
		Wool_lightgrayTexture = new Texture(this,config.getString("wool.lightgray.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightgray.png"),config.getInt("wool.lightgray.size",16) * 2, config.getInt("wool.lightgray.size",16) , config.getInt("wool.lightgray.size",16));
		Wool_limeTexture = new Texture(this,config.getString("wool.lime.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lime.png"),config.getInt("wool.lime.size",16) * 2, config.getInt("wool.lime.size",16) , config.getInt("wool.lime.size",16));
		Wool_magentaTexture = new Texture(this,config.getString("wool.magenta.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_magenta.png"),config.getInt("wool.magenta.size",16) * 2, config.getInt("wool.magenta.size",16) , config.getInt("wool.magenta.size",16));
		Wool_orangeTexture = new Texture(this,config.getString("wool.orange.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_orange.png"),config.getInt("wool.orange.size",16) * 2, config.getInt("wool.orange.size",16) , config.getInt("wool.orange.size",16));
		Wool_pinkTexture = new Texture(this,config.getString("wool.pink.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_pink.png"),config.getInt("wool.pink.size",16) * 2, config.getInt("wool.pink.size",16) , config.getInt("wool.pink.size",16));
		Wool_purpleTexture = new Texture(this,config.getString("wool.purple.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_purple.png"),config.getInt("wool.purple.size",16) * 2, config.getInt("wool.purple.size",16) , config.getInt("wool.purple.size",16));
		Wool_redTexture = new Texture(this,config.getString("wool.red.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_red.png"),config.getInt("wool.red.size",16) * 2, config.getInt("wool.red.size",16) , config.getInt("wool.red.size",16));
		Wool_whiteTexture = new Texture(this,config.getString("wool.white.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_white.png"),config.getInt("wool.white.size",16) * 2, config.getInt("wool.white.size",16) , config.getInt("wool.white.size",16));
		Wool_yellowTexture = new Texture(this,config.getString("wool.yellow.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_yellow.png"),config.getInt("wool.yellow.size",16) * 2, config.getInt("wool.yellow.size",16) , config.getInt("wool.yellow.size",16));
		
		BookshelfSlab = new Bookshelf (this, BookshelfTexture);
		DirtSlab = new Dirt (this, DirtTexture);
		EndstoneSlab = new Endstone (this, EndstoneTexture);
		GlasSlab = new Glas (this, GlasTexture);
		GlowstoneSlab = new Glowstone (this, GlowstoneTexture);
		GravelSlab = new Gravel (this, GravelTexture);
		LapislazuliSlab = new Lapislazuli (this, LapislazuliTexture);
		LogSlab = new Log (this, LogTexture);
		Log1Slab = new Log1 (this, Log1Texture);
		Log2Slab = new Log2 (this, Log2Texture);
		NetherbrickSlab = new Netherbrick (this, NetherbrickTexture);
		NetherrackSlab = new Netherrack (this, NetherrackTexture);
		ObsidianSlab = new Obsidian (this, ObsidianTexture);
		SandSlab = new Sand (this, SandTexture);
		SoulsandSlab = new Soulsand (this, SoulsandTexture);
		StoneSlab = new Stone (this, StoneTexture);
		Wool_blackSlab = new Wool_black (this, Wool_blackTexture);
		Wool_blueSlab = new Wool_blue (this, Wool_blueTexture);
		Wool_brownSlab = new Wool_brown (this, Wool_brownTexture);
		Wool_cyanSlab = new Wool_cyan (this, Wool_cyanTexture);
		Wool_graySlab = new Wool_gray (this, Wool_grayTexture);
		Wool_greenSlab = new Wool_green (this, Wool_greenTexture);
		Wool_lightblueSlab = new Wool_lightblue (this, Wool_lightblueTexture);
		Wool_lightgraySlab = new Wool_lightgray (this, Wool_lightgrayTexture);
		Wool_limeSlab = new Wool_lime (this, Wool_limeTexture);
		Wool_magentaSlab = new Wool_magenta (this, Wool_magentaTexture);
		Wool_orangeSlab = new Wool_orange (this, Wool_orangeTexture);
		Wool_pinkSlab = new Wool_pink (this, Wool_pinkTexture);
		Wool_purpleSlab = new Wool_purple (this, Wool_purpleTexture);
		Wool_redSlab = new Wool_red (this, Wool_redTexture);
		Wool_whiteSlab = new Wool_white (this, Wool_whiteTexture);
		Wool_yellowSlab = new Wool_yellow (this, Wool_yellowTexture);


	    SpoutShapedRecipe BookshelfRecipe = new SpoutShapedRecipe(new SpoutItemStack(BookshelfSlab, 3));
	    BookshelfRecipe.shape(new String[] { "AAA" });
        BookshelfRecipe.setIngredient('A', MaterialData.bookshelf);
        SpoutManager.getMaterialManager().registerSpoutRecipe(BookshelfRecipe);

	    SpoutShapedRecipe DirtRecipe = new SpoutShapedRecipe(new SpoutItemStack(DirtSlab, 3));
	    DirtRecipe.shape(new String[] { "AAA" });
        DirtRecipe.setIngredient('A', MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(DirtRecipe);

	    SpoutShapedRecipe EndstoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(EndstoneSlab, 3));
	    EndstoneRecipe.shape(new String[] { "AAA" });
	    EndstoneRecipe.setIngredient('A', MaterialData.endStone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(EndstoneRecipe);
        
	    SpoutShapedRecipe GlasRecipe = new SpoutShapedRecipe(new SpoutItemStack(GlasSlab, 3));
	    GlasRecipe.shape(new String[] { "AAA" });
        GlasRecipe.setIngredient('A', MaterialData.glass);
        SpoutManager.getMaterialManager().registerSpoutRecipe(GlasRecipe);

	    SpoutShapedRecipe GlowstoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(GlowstoneSlab, 3));
	    GlowstoneRecipe.shape(new String[] { "AAA" });
	    GlowstoneRecipe.setIngredient('A', MaterialData.glowstoneBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(GlowstoneRecipe);
        
	    SpoutShapedRecipe GravelRecipe = new SpoutShapedRecipe(new SpoutItemStack(GravelSlab, 3));
	    GravelRecipe.shape(new String[] { "AAA" });
        GravelRecipe.setIngredient('A', MaterialData.gravel);
        SpoutManager.getMaterialManager().registerSpoutRecipe(GravelRecipe);

	    SpoutShapedRecipe LapislazuliRecipe = new SpoutShapedRecipe(new SpoutItemStack(LapislazuliSlab, 3));
	    LapislazuliRecipe.shape(new String[] { "AAA" });
	    LapislazuliRecipe.setIngredient('A', MaterialData.lapisBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(LapislazuliRecipe);
        
	    SpoutShapedRecipe LogRecipe = new SpoutShapedRecipe(new SpoutItemStack(LogSlab, 3));
	    LogRecipe.shape(new String[] { "AAA" });
	    LogRecipe.setIngredient('A', MaterialData.log);
        SpoutManager.getMaterialManager().registerSpoutRecipe(LogRecipe);
	    SpoutShapedRecipe Log1Recipe = new SpoutShapedRecipe(new SpoutItemStack(Log1Slab, 3));
	    Log1Recipe.shape(new String[] { "AAA" });
        Log1Recipe.setIngredient('A', MaterialData.spruceLog);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Log1Recipe);
	    SpoutShapedRecipe Log2Recipe = new SpoutShapedRecipe(new SpoutItemStack(Log1Slab, 3));
	    Log2Recipe.shape(new String[] { "AAA" });
	    Log2Recipe.setIngredient('A', MaterialData.birchLog);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Log2Recipe);

	    SpoutShapedRecipe NetherbrickRecipe = new SpoutShapedRecipe(new SpoutItemStack(NetherbrickSlab, 3));
	    NetherbrickRecipe.shape(new String[] { "AAA" });
	    NetherbrickRecipe.setIngredient('A', MaterialData.netherBrick);
        SpoutManager.getMaterialManager().registerSpoutRecipe(NetherbrickRecipe);

	    SpoutShapedRecipe NetherrackRecipe = new SpoutShapedRecipe(new SpoutItemStack(NetherrackSlab, 3));
	    NetherrackRecipe.shape(new String[] { "AAA" });
	    NetherrackRecipe.setIngredient('A', MaterialData.netherrack);
        SpoutManager.getMaterialManager().registerSpoutRecipe(NetherrackRecipe);

	    SpoutShapedRecipe ObsidianRecipe = new SpoutShapedRecipe(new SpoutItemStack(ObsidianSlab, 3));
	    ObsidianRecipe.shape(new String[] { "AAA" });
	    ObsidianRecipe.setIngredient('A', MaterialData.obsidian);
        SpoutManager.getMaterialManager().registerSpoutRecipe(ObsidianRecipe);
        
	    SpoutShapedRecipe SandRecipe = new SpoutShapedRecipe(new SpoutItemStack(SandSlab, 3));
	    SandRecipe.shape(new String[] { "AAA" });
        SandRecipe.setIngredient('A', MaterialData.sand);
        SpoutManager.getMaterialManager().registerSpoutRecipe(SandRecipe);

	    SpoutShapedRecipe SoulsandRecipe = new SpoutShapedRecipe(new SpoutItemStack(SoulsandSlab, 3));
	    SoulsandRecipe.shape(new String[] { "AAA" });
	    SoulsandRecipe.setIngredient('A', MaterialData.soulSand);
        SpoutManager.getMaterialManager().registerSpoutRecipe(SoulsandRecipe);
        
	    SpoutShapedRecipe StoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(StoneSlab, 3));
	    StoneRecipe.shape(new String[] { "AAA" });
        StoneRecipe.setIngredient('A', MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(StoneRecipe);

	    SpoutShapedRecipe Wool_blackRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_blackSlab, 3));
	    Wool_blackRecipe.shape(new String[] { "AAA" });
	    Wool_blackRecipe.setIngredient('A', MaterialData.blackWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_blackRecipe);
	    SpoutShapedRecipe Wool_blueRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_blueSlab, 3));
	    Wool_blueRecipe.shape(new String[] { "AAA" });
	    Wool_blueRecipe.setIngredient('A', MaterialData.blueWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_blueRecipe);
	    SpoutShapedRecipe Wool_brownRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_brownSlab, 3));
	    Wool_brownRecipe.shape(new String[] { "AAA" });
	    Wool_brownRecipe.setIngredient('A', MaterialData.brownWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_brownRecipe);
	    SpoutShapedRecipe Wool_cyanRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_cyanSlab, 3));
	    Wool_cyanRecipe.shape(new String[] { "AAA" });
	    Wool_cyanRecipe.setIngredient('A', MaterialData.cyanWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_cyanRecipe);
	    SpoutShapedRecipe Wool_grayRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_graySlab, 3));
	    Wool_grayRecipe.shape(new String[] { "AAA" });
	    Wool_grayRecipe.setIngredient('A', MaterialData.greyWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_grayRecipe);
	    SpoutShapedRecipe Wool_greenRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_greenSlab, 3));
	    Wool_greenRecipe.shape(new String[] { "AAA" });
	    Wool_greenRecipe.setIngredient('A', MaterialData.greenWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_greenRecipe);
	    SpoutShapedRecipe Wool_lightblueRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_lightblueSlab, 3));
	    Wool_lightblueRecipe.shape(new String[] { "AAA" });
	    Wool_lightblueRecipe.setIngredient('A', MaterialData.lightBlueWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_lightblueRecipe);
	    SpoutShapedRecipe Wool_lightgrayRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_lightgraySlab, 3));
	    Wool_lightgrayRecipe.shape(new String[] { "AAA" });
	    Wool_lightgrayRecipe.setIngredient('A', MaterialData.lightGreyWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_lightgrayRecipe);
	    SpoutShapedRecipe Wool_limeRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_limeSlab, 3));
	    Wool_limeRecipe.shape(new String[] { "AAA" });
	    Wool_limeRecipe.setIngredient('A', MaterialData.limeWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_limeRecipe);
	    SpoutShapedRecipe Wool_magentaRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_magentaSlab, 3));
	    Wool_magentaRecipe.shape(new String[] { "AAA" });
	    Wool_magentaRecipe.setIngredient('A', MaterialData.magentaWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_magentaRecipe);
	    SpoutShapedRecipe Wool_orangeRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_orangeSlab, 3));
	    Wool_orangeRecipe.shape(new String[] { "AAA" });
	    Wool_orangeRecipe.setIngredient('A', MaterialData.orangeWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_orangeRecipe);
	    SpoutShapedRecipe Wool_pinkRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_pinkSlab, 3));
	    Wool_pinkRecipe.shape(new String[] { "AAA" });
	    Wool_pinkRecipe.setIngredient('A', MaterialData.pinkWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_pinkRecipe);
	    SpoutShapedRecipe Wool_purpleRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_purpleSlab, 3));
	    Wool_purpleRecipe.shape(new String[] { "AAA" });
	    Wool_purpleRecipe.setIngredient('A', MaterialData.purpleWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_purpleRecipe);
	    SpoutShapedRecipe Wool_redRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_redSlab, 3));
	    Wool_redRecipe.shape(new String[] { "AAA" });
	    Wool_redRecipe.setIngredient('A', MaterialData.redWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_redRecipe);
	    SpoutShapedRecipe Wool_whiteRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_whiteSlab, 3));
	    Wool_whiteRecipe.shape(new String[] { "AAA" });
	    Wool_whiteRecipe.setIngredient('A', MaterialData.whiteWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_whiteRecipe);
	    SpoutShapedRecipe Wool_yellowRecipe = new SpoutShapedRecipe(new SpoutItemStack(Wool_yellowSlab, 3));
	    Wool_yellowRecipe.shape(new String[] { "AAA" });
	    Wool_yellowRecipe.setIngredient('A', MaterialData.yellowWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(Wool_yellowRecipe);
        
        
		log.info("[" + plugdisc.getName() + "] Version " + plugdisc.getVersion() + " enabled.");	
	}
	
	public void loadConfig()
	{
		config.addDefault("bookshelf.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bookshelf.png");
		config.addDefault("bookshelf.size",16);
		config.addDefault("dirt.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/dirt.png");
		config.addDefault("dirt.size",16);
		config.addDefault("endstone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/endstone.png");
		config.addDefault("endstone.size",16);
		config.addDefault("glas.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glas.png");
		config.addDefault("glas.size",16);
		config.addDefault("glowstone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glowstone.png");
		config.addDefault("glowstone.size",16);
		config.addDefault("gravel.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/gravel.png");
		config.addDefault("gravel.size",16);
		config.addDefault("lapislazuli.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/lapislazuli.png");
		config.addDefault("lapislazuli.size",16);
		config.addDefault("log.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log.png");
		config.addDefault("log.size",16);
		config.addDefault("log1.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log1.png");
		config.addDefault("log1.size",16);
		config.addDefault("log2.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log2.png");
		config.addDefault("log2.size",16);
		config.addDefault("netherbrick.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherbrick.png");
		config.addDefault("netherbrick.size",16);
		config.addDefault("netherrack.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/netherrack.png");
		config.addDefault("netherrack.size",16);
		config.addDefault("obsidian.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/obsidian.png");
		config.addDefault("obsidian.size",16);
		config.addDefault("sand.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/sand.png");
		config.addDefault("sand.size",16);
		config.addDefault("soulsand.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/soulsand.png");
		config.addDefault("soulsand.size",16);
		config.addDefault("clean_stone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/stone.png");
		config.addDefault("clean_stone.size",16);
		config.addDefault("wool.black.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_black.png");
		config.addDefault("wool.black.size",16);
		config.addDefault("wool.blue.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_blue.png");
		config.addDefault("wool.blue.size",16);
		config.addDefault("wool.brown.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_brown.png");
		config.addDefault("wool.brown.size",16);
		config.addDefault("wool.cyan.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_cyan.png");
		config.addDefault("wool.cyan.size",16);
		config.addDefault("wool.gray.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_gray.png");
		config.addDefault("wool.gray.size",16);
		config.addDefault("wool.green.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_green.png");
		config.addDefault("wool.green.size",16);
		config.addDefault("wool.lightblue.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightblue.png");
		config.addDefault("wool.lightblue.size",16);
		config.addDefault("wool.lightgray.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lightgray.png");
		config.addDefault("wool.lightgray.size",16);
		config.addDefault("wool.lime.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_lime.png");
		config.addDefault("wool.lime.size",16);
		config.addDefault("wool.magenta.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_magenta.png");
		config.addDefault("wool.magenta.size",16);
		config.addDefault("wool.orange.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_orange.png");
		config.addDefault("wool.orange.size",16);
		config.addDefault("wool.pink.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_pink.png");
		config.addDefault("wool.pink.size",16);
		config.addDefault("wool.purple.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_purple.png");
		config.addDefault("wool.purple.size",16);
		config.addDefault("wool.red.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_red.png");
		config.addDefault("wool.red.size",16);
		config.addDefault("wool.white.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_white.png");
		config.addDefault("wool.white.size",16);
		config.addDefault("wool.yellow.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/wool_yellow.png");
		config.addDefault("wool.yellow.size",16);
		config.options().copyDefaults(true);
		saveConfig();
	}
}
