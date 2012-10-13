package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class StoneTopSlab extends GenericCuboidCustomBlock
{
	
    public StoneTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("clean_stone.name.top", "Clean Stone TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.stone.getStepSound());
        this.setHardness(MaterialData.stone.getHardness());
        this.setFriction(MaterialData.stone.getFriction());
        this.setLightLevel(MaterialData.stone.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.StoneSlab));
    }
}