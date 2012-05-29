package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class BedrockTopSlab extends GenericCuboidCustomBlock
{
    public BedrockTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("bedrock.name.top", "Bedrock TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.bedrock.getStepSound());
        this.setHardness(MaterialData.bedrock.getHardness());
        this.setFriction(MaterialData.bedrock.getFriction());
        this.setLightLevel(MaterialData.bedrock.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.BedrockSlab));
    }
}