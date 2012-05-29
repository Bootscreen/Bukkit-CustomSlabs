package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_whiteTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_whiteTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.white.name.top", "White Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.whiteWool.getStepSound());
        this.setHardness(MaterialData.whiteWool.getHardness());
        this.setFriction(MaterialData.whiteWool.getFriction());
        this.setLightLevel(MaterialData.whiteWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_whiteSlab));
    }
}