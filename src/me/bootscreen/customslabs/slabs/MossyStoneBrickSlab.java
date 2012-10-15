package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class MossyStoneBrickSlab extends GenericCuboidCustomBlock
{
    public MossyStoneBrickSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("stonebrick.mossy.name.normal", "Mossy Stone Brick Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.mossyStoneBricks.getStepSound());
        this.setHardness(MaterialData.mossyStoneBricks.getHardness());
        this.setFriction(MaterialData.mossyStoneBricks.getFriction());
        this.setLightLevel(MaterialData.mossyStoneBricks.getLightLevel());
    }
}