package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_lightblueSlab extends GenericCuboidCustomBlock
{
	
    public Wool_lightblueSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.lightblue.name", "Light Blue Wool Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.lightBlueWool.getStepSound());
        this.setHardness(MaterialData.lightBlueWool.getHardness());
        this.setFriction(MaterialData.lightBlueWool.getFriction());
        this.setLightLevel(MaterialData.lightBlueWool.getLightLevel());
    }
}