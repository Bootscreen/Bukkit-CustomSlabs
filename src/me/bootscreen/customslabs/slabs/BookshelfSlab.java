package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class BookshelfSlab extends GenericCuboidCustomBlock
{
    public BookshelfSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("bookshelf.name", "Bookshelf Slab"), 126, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.bookshelf.getStepSound());
        this.setHardness(MaterialData.bookshelf.getHardness());
        this.setFriction(MaterialData.bookshelf.getFriction());
        this.setLightLevel(MaterialData.bookshelf.getLightLevel());
    }
}