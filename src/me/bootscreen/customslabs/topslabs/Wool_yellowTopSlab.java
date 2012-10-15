package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_yellowTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_yellowTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.yellow.name.top", "Yellow Wool TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.yellowWool.getStepSound());
        this.setHardness(MaterialData.yellowWool.getHardness());
        this.setFriction(MaterialData.yellowWool.getFriction());
        this.setLightLevel(MaterialData.yellowWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_yellowSlab));
    }
}