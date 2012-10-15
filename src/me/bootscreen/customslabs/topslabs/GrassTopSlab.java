package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class GrassTopSlab extends GenericCuboidCustomBlock
{
    public GrassTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("grass.name.top", "Grass TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {2,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.grass.getStepSound());
        this.setHardness(MaterialData.grass.getHardness());
        this.setFriction(MaterialData.grass.getFriction());
        this.setLightLevel(MaterialData.grass.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.GrassSlab));
    }
}