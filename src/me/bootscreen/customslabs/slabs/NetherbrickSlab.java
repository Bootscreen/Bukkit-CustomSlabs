package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class NetherbrickSlab extends GenericCuboidCustomBlock
{
	
    public NetherbrickSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("netherbrick.name.normal", "Nether Brick Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.netherBrick.getStepSound());
        this.setHardness(MaterialData.netherBrick.getHardness());
        this.setFriction(MaterialData.netherBrick.getFriction());
        this.setLightLevel(MaterialData.netherBrick.getLightLevel());
    }
}