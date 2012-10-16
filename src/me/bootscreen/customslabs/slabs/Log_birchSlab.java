package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Log_birchSlab extends GenericCuboidCustomBlock
{
    public Log_birchSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log2.name.normal", "Birch Wood Slab"), 126, 2, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.birchLog.getStepSound());
        this.setHardness(MaterialData.birchLog.getHardness());
        this.setFriction(MaterialData.birchLog.getFriction());
        this.setLightLevel(MaterialData.birchLog.getLightLevel());
    }
}