package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class LogSlab extends GenericCuboidCustomBlock
{
    public LogSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log.name", "Oak Wood Slab"), 126, 0, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.log.getStepSound());
        this.setHardness(MaterialData.log.getHardness());
        this.setFriction(MaterialData.log.getFriction());
        this.setLightLevel(MaterialData.log.getLightLevel());
    }
}