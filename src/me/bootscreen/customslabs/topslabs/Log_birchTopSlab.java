package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Log_birchTopSlab extends GenericCuboidCustomBlock
{
    public Log_birchTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log2.name.top", "Birch Log TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.birchLog.getStepSound());
        this.setHardness(MaterialData.birchLog.getHardness());
        this.setFriction(MaterialData.birchLog.getFriction());
        this.setLightLevel(MaterialData.birchLog.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Log2Slab));
    }
}