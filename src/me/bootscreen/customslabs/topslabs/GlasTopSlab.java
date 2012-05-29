package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class GlasTopSlab extends GenericCuboidCustomBlock
{
    public GlasTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("glas.name.top", "Glass TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.glass.getStepSound());
        this.setHardness(MaterialData.glass.getHardness());
        this.setFriction(MaterialData.glass.getFriction());
        this.setLightLevel(MaterialData.glass.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.GlasSlab));
    }
}