package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Log_jungleTopSlab extends GenericCuboidCustomBlock
{
    public Log_jungleTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log3.name.top", "Jungle Log TopSlab"), 126, 11, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.jungleLog.getStepSound());
        this.setHardness(MaterialData.jungleLog.getHardness());
        this.setFriction(MaterialData.jungleLog.getFriction());
        this.setLightLevel(MaterialData.jungleLog.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Log3Slab));
    }
}