package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class DirtTopSlab extends GenericCuboidCustomBlock
{
    public DirtTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("dirt.name.top", "Dirt TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.dirt.getStepSound());
        this.setHardness(MaterialData.dirt.getHardness());
        this.setFriction(MaterialData.dirt.getFriction());
        this.setLightLevel(MaterialData.dirt.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.DirtSlab));
    }
}