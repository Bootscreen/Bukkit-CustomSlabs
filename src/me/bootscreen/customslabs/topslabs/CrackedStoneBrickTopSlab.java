package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class CrackedStoneBrickTopSlab extends GenericCuboidCustomBlock
{
    public CrackedStoneBrickTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("stonebrick.cracked.name.top", "Cracked Stone Brick TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.crackedStoneBricks.getStepSound());
        this.setHardness(MaterialData.crackedStoneBricks.getHardness());
        this.setFriction(MaterialData.crackedStoneBricks.getFriction());
        this.setLightLevel(MaterialData.crackedStoneBricks.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.CrackedStoneBrickSlab));
    }
}