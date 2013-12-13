package net.dcatcher.modjam.blocks;

import net.dcatcher.modjam.DCConfig;
import net.minecraft.block.Block;

/**
 * Copyright: DCatcher
 */
public class DCBlocks {


    public static Block blockNode;

    public void initialiseBlocks(){
        blockNode = new BlockNode(DCConfig.idBlockNode);
    }
}
