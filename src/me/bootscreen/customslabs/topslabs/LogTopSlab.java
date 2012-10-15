package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class LogTopSlab extends GenericCuboidCustomBlock
{
    public LogTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log.name.top", "Log TopSlab"), 126, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.log.getStepSound());
        this.setHardness(MaterialData.log.getHardness());
        this.setFriction(MaterialData.log.getFriction());
        this.setLightLevel(MaterialData.log.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.LogSlab));
    }
}