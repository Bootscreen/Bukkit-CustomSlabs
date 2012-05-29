package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class MossStoneTopSlab extends GenericCuboidCustomBlock
{
    public MossStoneTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("mossstone.name.top", "Moss Stone TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.mossStone.getStepSound());
        this.setHardness(MaterialData.mossStone.getHardness());
        this.setFriction(MaterialData.mossStone.getFriction());
        this.setLightLevel(MaterialData.mossStone.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.MossStoneSlab));
    }
}