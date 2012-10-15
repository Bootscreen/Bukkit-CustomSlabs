package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class GrassSlab extends GenericCuboidCustomBlock
{
    public GrassSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("grass.name.normal", "Grass Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {2,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.grass.getStepSound());
        this.setHardness(MaterialData.grass.getHardness());
        this.setFriction(MaterialData.grass.getFriction());
        this.setLightLevel(MaterialData.grass.getLightLevel());
    }
}