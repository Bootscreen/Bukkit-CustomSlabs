package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_grayTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_grayTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.gray.name.top", "Grey Wool TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.greyWool.getStepSound());
        this.setHardness(MaterialData.greyWool.getHardness());
        this.setFriction(MaterialData.greyWool.getFriction());
        this.setLightLevel(MaterialData.greyWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_graySlab));
    }
}