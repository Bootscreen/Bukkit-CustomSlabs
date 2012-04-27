package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Planks_jungleSlab extends GenericCuboidCustomBlock
{
    public Planks_jungleSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("planks.jungle.name", "Jungle Wood Planks Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.woodenSlab.getStepSound());
        this.setHardness(MaterialData.woodenSlab.getHardness());
        this.setFriction(MaterialData.woodenSlab.getFriction());
        this.setLightLevel(MaterialData.woodenSlab.getLightLevel());
    }
}