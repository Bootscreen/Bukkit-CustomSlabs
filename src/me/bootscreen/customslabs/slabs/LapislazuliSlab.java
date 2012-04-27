package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class LapislazuliSlab extends GenericCuboidCustomBlock
{
	
    public LapislazuliSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("lapislazuli.name", "Lapis Lazuli Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.lapisBlock.getStepSound());
        this.setHardness(MaterialData.lapisBlock.getHardness());
        this.setFriction(MaterialData.lapisBlock.getFriction());
        this.setLightLevel(MaterialData.lapisBlock.getLightLevel());
    }
}