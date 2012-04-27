package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class GravelSlab extends GenericCuboidCustomBlock
{
    public GravelSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("gravel.name", "Gravel Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.gravel.getStepSound());
        this.setHardness(MaterialData.gravel.getHardness());
        this.setFriction(MaterialData.gravel.getFriction());
        this.setLightLevel(MaterialData.gravel.getLightLevel());
    }
}