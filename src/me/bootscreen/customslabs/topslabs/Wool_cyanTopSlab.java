package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_cyanTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_cyanTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.cyan.name.top", "Cyan Wool TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.cyanWool.getStepSound());
        this.setHardness(MaterialData.cyanWool.getHardness());
        this.setFriction(MaterialData.cyanWool.getFriction());
        this.setLightLevel(MaterialData.cyanWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_cyanSlab));
    }
}