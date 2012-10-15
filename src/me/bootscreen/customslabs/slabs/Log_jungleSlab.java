package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Log_jungleSlab extends GenericCuboidCustomBlock
{
    public Log_jungleSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("log3.name.normal", "Jungle Wood Slab"), 126, 3, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.jungleLog.getStepSound());
        this.setHardness(MaterialData.jungleLog.getHardness());
        this.setFriction(MaterialData.jungleLog.getFriction());
        this.setLightLevel(MaterialData.jungleLog.getLightLevel());
    }
}