package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_magenta extends GenericCuboidCustomBlock
{
	
    public Wool_magenta(Plugin plugin, Texture texture)
    {
        super(plugin, "Magenta Wool Slab", 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        setBlockDesign(getBlockDesign().setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        setStepSound(MaterialData.magentaWool.getStepSound());
    }
}