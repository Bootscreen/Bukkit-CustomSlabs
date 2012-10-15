package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class SoulsandTopSlab extends GenericCuboidCustomBlock
{
	
    public SoulsandTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("soulsand.name.top", "Soul Sand TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.soulSand.getStepSound());
        this.setHardness(MaterialData.soulSand.getHardness());
        this.setFriction(MaterialData.soulSand.getFriction());
        this.setLightLevel(MaterialData.soulSand.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.SoulsandSlab));
    }
}