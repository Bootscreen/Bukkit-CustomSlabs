package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_redTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_redTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.red.name.top", "Red Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.redWool.getStepSound());
        this.setHardness(MaterialData.redWool.getHardness());
        this.setFriction(MaterialData.redWool.getFriction());
        this.setLightLevel(MaterialData.redWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_redSlab));
    }
}