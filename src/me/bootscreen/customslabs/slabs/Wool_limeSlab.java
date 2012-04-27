package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_limeSlab extends GenericCuboidCustomBlock
{
	
    public Wool_limeSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.lime.name", "Light Green Wool Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.limeWool.getStepSound());
        this.setHardness(MaterialData.limeWool.getHardness());
        this.setFriction(MaterialData.limeWool.getFriction());
        this.setLightLevel(MaterialData.limeWool.getLightLevel());
    }
}