package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class SoulsandSlab extends GenericCuboidCustomBlock
{
	
    public SoulsandSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("soulsand.name.normal", "Soul Sand Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.soulSand.getStepSound());
        this.setHardness(MaterialData.soulSand.getHardness());
        this.setFriction(MaterialData.soulSand.getFriction());
        this.setLightLevel(MaterialData.soulSand.getLightLevel());
    }
}