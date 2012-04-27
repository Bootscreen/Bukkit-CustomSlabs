package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Log_spruceSlab extends GenericCuboidCustomBlock
{
    public Log_spruceSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log1.name", "Spruce Log Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.spruceLog.getStepSound());
        this.setHardness(MaterialData.spruceLog.getHardness());
        this.setFriction(MaterialData.spruceLog.getFriction());
        this.setLightLevel(MaterialData.spruceLog.getLightLevel());
    }
}