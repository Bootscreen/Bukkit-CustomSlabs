package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class ClaySlab extends GenericCuboidCustomBlock
{
    public ClaySlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("clay.name.normal", "Clay Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.clayBlock.getStepSound());
        this.setHardness(MaterialData.clayBlock.getHardness());
        this.setFriction(MaterialData.clayBlock.getFriction());
        this.setLightLevel(MaterialData.clayBlock.getLightLevel());
    }
}