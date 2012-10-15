package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class BookshelfTopSlab extends GenericCuboidCustomBlock
{
    public BookshelfTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("bookshelf.name.top", "Bookshelf TopSlab"), 126, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.bookshelf.getStepSound());
        this.setHardness(MaterialData.bookshelf.getHardness());
        this.setFriction(MaterialData.bookshelf.getFriction());
        this.setLightLevel(MaterialData.bookshelf.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.BookshelfSlab));
    }
}