package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_lightblueTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_lightblueTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.lightblue.name.top", "Light Blue Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.lightBlueWool.getStepSound());
        this.setHardness(MaterialData.lightBlueWool.getHardness());
        this.setFriction(MaterialData.lightBlueWool.getFriction());
        this.setLightLevel(MaterialData.lightBlueWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_lightblueSlab));
    }
}