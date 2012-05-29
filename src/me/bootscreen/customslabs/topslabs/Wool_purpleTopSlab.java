package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_purpleTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_purpleTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.purple.name.top", "Purple Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.purpleWool.getStepSound());
        this.setHardness(MaterialData.purpleWool.getHardness());
        this.setFriction(MaterialData.purpleWool.getFriction());
        this.setLightLevel(MaterialData.purpleWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_purpleSlab));
    }
}