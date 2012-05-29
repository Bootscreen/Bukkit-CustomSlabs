package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Planks_birchTopSlab extends GenericCuboidCustomBlock
{
    public Planks_birchTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("planks.birch.name.top", "Birch Wood Planks TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.woodenSlab.getStepSound());
        this.setHardness(MaterialData.woodenSlab.getHardness());
        this.setFriction(MaterialData.woodenSlab.getFriction());
        this.setLightLevel(MaterialData.woodenSlab.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Planks_birchSlab));
    }
}