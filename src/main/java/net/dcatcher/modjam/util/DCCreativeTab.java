package net.dcatcher.modjam.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.dcatcher.modjam.blocks.DCBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Copyright: DCatcher
 */
public class DCCreativeTab extends CreativeTabs {

    public DCCreativeTab(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return DCBlocks.blockNode.blockID;
    }
}
