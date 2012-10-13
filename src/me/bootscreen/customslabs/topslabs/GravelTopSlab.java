package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class GravelTopSlab extends GenericCuboidCustomBlock
{
    public GravelTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("gravel.name.top", "Gravel TopSlab"), 44, 8, new  GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.gravel.getStepSound());
        this.setHardness(MaterialData.gravel.getHardness());
        this.setFriction(MaterialData.gravel.getFriction());
        this.setLightLevel(MaterialData.gravel.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.GravelSlab));
    }
}