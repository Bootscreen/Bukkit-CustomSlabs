package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_brownTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_brownTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.brown.name.top", "Brown Wool TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.brownWool.getStepSound());
        this.setHardness(MaterialData.brownWool.getHardness());
        this.setFriction(MaterialData.brownWool.getFriction());
        this.setLightLevel(MaterialData.brownWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_brownSlab));
    }
}