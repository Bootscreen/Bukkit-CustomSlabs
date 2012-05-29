package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class LapislazuliTopSlab extends GenericCuboidCustomBlock
{
	
    public LapislazuliTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("lapislazuli.name.top", "Lapis Lazuli TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.lapisBlock.getStepSound());
        this.setHardness(MaterialData.lapisBlock.getHardness());
        this.setFriction(MaterialData.lapisBlock.getFriction());
        this.setLightLevel(MaterialData.lapisBlock.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.LapislazuliSlab));
    }
}