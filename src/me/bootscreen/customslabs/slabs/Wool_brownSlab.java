package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_brownSlab extends GenericCuboidCustomBlock
{
	
    public Wool_brownSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.brown.name", "Brown Wool Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.brownWool.getStepSound());
        this.setHardness(MaterialData.brownWool.getHardness());
        this.setFriction(MaterialData.brownWool.getFriction());
        this.setLightLevel(MaterialData.brownWool.getLightLevel());
    }
}