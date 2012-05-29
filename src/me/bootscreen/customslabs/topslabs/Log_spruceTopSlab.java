package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Log_spruceTopSlab extends GenericCuboidCustomBlock
{
    public Log_spruceTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log1.name.top", "Spruce Log TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.spruceLog.getStepSound());
        this.setHardness(MaterialData.spruceLog.getHardness());
        this.setFriction(MaterialData.spruceLog.getFriction());
        this.setLightLevel(MaterialData.spruceLog.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Log1Slab));
    }
}