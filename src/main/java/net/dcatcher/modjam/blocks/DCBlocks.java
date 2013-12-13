package net.dcatcher.modjam.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.dcatcher.modjam.DCConfig;
import net.minecraft.block.Block;

/**
 * Copyright: DCatcher
 */
public class DCBlocks {


    public static Block blockNode;

    public void initialiseBlocks(){
        blockNode = new BlockNode(DCConfig.idBlockNode);


        GameRegistry.registerBlock(blockNode, "blockNode");
        LanguageRegistry.addName(blockNode, "Node");
    }
}
