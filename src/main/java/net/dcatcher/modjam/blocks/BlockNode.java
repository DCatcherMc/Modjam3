package net.dcatcher.modjam.blocks;

import net.dcatcher.modjam.DCModjam;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import javax.swing.*;

/**
 * Copyright: DCatcher
 */
public class BlockNode extends Block {
    public BlockNode(int id) {
        super(id, Material.rock);
        setUnlocalizedName("blockNode");
        setCreativeTab(DCModjam.tabDCatcher);
    }


    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        par1IconRegister.registerIcon("dcatchermodjam:block_node");
    }
}
