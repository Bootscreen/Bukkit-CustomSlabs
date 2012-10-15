package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_blackTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_blackTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.black.name.top", "Black Wool TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.blackWool.getStepSound());
        this.setHardness(MaterialData.blackWool.getHardness());
        this.setFriction(MaterialData.blackWool.getFriction());
        this.setLightLevel(MaterialData.blackWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_blackSlab));
    }
}