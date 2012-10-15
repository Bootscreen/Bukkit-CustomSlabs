package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class DirtSlab extends GenericCuboidCustomBlock
{
    public DirtSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("dirt.name.normal", "Dirt Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.dirt.getStepSound());
        this.setHardness(MaterialData.dirt.getHardness());
        this.setFriction(MaterialData.dirt.getFriction());
        this.setLightLevel(MaterialData.dirt.getLightLevel());
    }
}