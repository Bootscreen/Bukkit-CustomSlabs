package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_magentaTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_magentaTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.magenta.name.top", "Magenta Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.magentaWool.getStepSound());
        this.setHardness(MaterialData.magentaWool.getHardness());
        this.setFriction(MaterialData.magentaWool.getFriction());
        this.setLightLevel(MaterialData.magentaWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_magentaSlab));
    }
}