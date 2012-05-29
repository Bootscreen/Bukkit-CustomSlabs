package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_limeTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_limeTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.lime.name.top", "Light Green Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.limeWool.getStepSound());
        this.setHardness(MaterialData.limeWool.getHardness());
        this.setFriction(MaterialData.limeWool.getFriction());
        this.setLightLevel(MaterialData.limeWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_limeSlab));
    }
}