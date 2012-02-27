package me.bootscreen.customslabs;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;

import me.bootscreen.customslabs.slabs.*;

public class CustomSlabs extends JavaPlugin{

	public final Logger log = Logger.getLogger("Minecraft");

	FileConfiguration config = null;

	PluginDescriptionFile plugdisc;

	CustomBlock BookshelfSlab;
	CustomBlock DirtSlab;
	CustomBlock GlasSlab;
	CustomBlock GravelSlab;
	CustomBlock LogSlab;
	CustomBlock Log1Slab;
	CustomBlock Log2Slab;
	CustomBlock SandSlab;
	CustomBlock StoneSlab;

	Texture BookshelfTexture;
	Texture DirtTexture;
	Texture GlasTexture;
	Texture GravelTexture;
	Texture LogTexture;
	Texture Log1Texture;
	Texture Log2Texture;
	Texture SandTexture;
	Texture StoneTexture;
	
	@Override
	public void onDisable() {
		log.info("[" + plugdisc.getName() + "] Version " + plugdisc.getVersion() + " disabled.");		
	}
	
	public void onEnable() {
		plugdisc = this.getDescription();
		
		config = this.getConfig();
		loadConfig();
		
		BookshelfTexture = new Texture(this,config.getString("bookshelf.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bookshelf.png"),config.getInt("bookshelf.size",16) * 2, config.getInt("bookshelf.size",16), config.getInt("bookshelf.size",16));
		DirtTexture = new Texture(this,config.getString("dirt.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/dirt.png"),config.getInt("dirt.size",16) * 2, config.getInt("dirt.size",16) , config.getInt("dirt.size",16));
		GlasTexture = new Texture(this,config.getString("glas.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glas.png"),config.getInt("glas.size",16) * 2, config.getInt("glas.size",16), config.getInt("glas.size",16));
		GravelTexture = new Texture(this,config.getString("gravel.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/gravel.png"),config.getInt("gravel.size",16) * 2, config.getInt("gravel.size",16) , config.getInt("gravel.size",16));
		LogTexture = new Texture(this,config.getString("log.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log.png"),config.getInt("log.size",16) * 2, config.getInt("log.size",16), config.getInt("log.size",16));
		Log1Texture = new Texture(this,config.getString("log1.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log1.png"),config.getInt("log1.size",16) * 2, config.getInt("log1.size",16), config.getInt("log1.size",16));
		Log2Texture = new Texture(this,config.getString("log2.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log2.png"),config.getInt("log2.size",16) * 2, config.getInt("log2.size",16), config.getInt("log2.size",16));
		SandTexture = new Texture(this,config.getString("sand.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/sand.png"),config.getInt("sand.size",16) * 2, config.getInt("sand.size",16), config.getInt("sand.size",16));
		StoneTexture = new Texture(this,config.getString("clean_stone.url","http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/stone.png"),config.getInt("clean_stone.size",16) * 2, config.getInt("clean_stone.size",16) , config.getInt("clean_stone.size",16));

		BookshelfSlab = new Bookshelf(this, BookshelfTexture);
		DirtSlab = new Dirt(this, DirtTexture);
		GlasSlab = new Glas(this, GlasTexture);
		GravelSlab = new Gravel(this, GravelTexture);
		LogSlab = new Log(this, LogTexture);
		Log1Slab = new Log1(this, Log1Texture);
		Log2Slab = new Log2(this, Log2Texture);
		SandSlab = new Sand(this, SandTexture);
		StoneSlab = new Stone(this, StoneTexture);

		
	    SpoutShapedRecipe BookshelfRecipe = new SpoutShapedRecipe(new SpoutItemStack(BookshelfSlab, 3));
	    BookshelfRecipe.shape(new String[] { "AAA" });
        BookshelfRecipe.setIngredient('A', MaterialData.bookshelf);
        SpoutManager.getMaterialManager().registerSpoutRecipe(BookshelfRecipe);
        
	    SpoutShapedRecipe DirtRecipe = new SpoutShapedRecipe(new SpoutItemStack(DirtSlab, 3));
	    DirtRecipe.shape(new String[] { "AAA" });
        DirtRecipe.setIngredient('A', MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(DirtRecipe);
        
	    SpoutShapedRecipe GlasRecipe = new SpoutShapedRecipe(new SpoutItemStack(GlasSlab, 3));
	    GlasRecipe.shape(new String[] { "AAA" });
        GlasRecipe.setIngredient('A', MaterialData.glass);
        SpoutManager.getMaterialManager().registerSpoutRecipe(GlasRecipe);
        
	    SpoutShapedRecipe GravelRecipe = new SpoutShapedRecipe(new SpoutItemStack(GravelSlab, 3));
	    GravelRecipe.shape(new String[] { "AAA" });
        GravelRecipe.setIngredient('A', MaterialData.gravel);
        SpoutManager.getMaterialManager().registerSpoutRecipe(GravelRecipe);

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
        
	    SpoutShapedRecipe SandRecipe = new SpoutShapedRecipe(new SpoutItemStack(SandSlab, 3));
	    SandRecipe.shape(new String[] { "AAA" });
        SandRecipe.setIngredient('A', MaterialData.sand);
        SpoutManager.getMaterialManager().registerSpoutRecipe(SandRecipe);
        
	    SpoutShapedRecipe StoneRecipe = new SpoutShapedRecipe(new SpoutItemStack(StoneSlab, 3));
	    StoneRecipe.shape(new String[] { "AAA" });
        StoneRecipe.setIngredient('A', MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(StoneRecipe);
        
        
		log.info("[" + plugdisc.getName() + "] Version " + plugdisc.getVersion() + " enabled.");	
	}
	
	public void loadConfig()
	{
		config.addDefault("bookshelf.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/bookshelf.png");
		config.addDefault("bookshelf.size",16);
		config.addDefault("dirt.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/dirt.png");
		config.addDefault("dirt.size",16);
		config.addDefault("glas.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/glas.png");
		config.addDefault("glas.size",16);
		config.addDefault("gravel.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/gravel.png");
		config.addDefault("gravel.size",16);
		config.addDefault("log.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log.png");
		config.addDefault("log.size",16);
		config.addDefault("log1.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log1.png");
		config.addDefault("log1.size",16);
		config.addDefault("log2.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/log2.png");
		config.addDefault("log2.size",16);
		config.addDefault("sand.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/sand.png");
		config.addDefault("sand.size",16);
		config.addDefault("clean_stone.url", "http://dl.dropbox.com/u/4401431/Bukkit/CustomSlabs/stone.png");
		config.addDefault("clean_stone.size",16);
		config.options().copyDefaults(true);
		saveConfig();
	}
}
