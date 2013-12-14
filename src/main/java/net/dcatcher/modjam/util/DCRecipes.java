package net.dcatcher.modjam.util;

import cpw.mods.fml.common.registry.GameRegistry;
import net.dcatcher.modjam.blocks.DCBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Copyright: DCatcher
 */
public class DCRecipes {

    public static void registerRecipes(){
        GameRegistry.addRecipe(new ItemStack(DCBlocks.blockNode, 1), " e ", " i ", "iii", 'e', new ItemStack(Item.emerald, 1), 'i', new ItemStack(Block.blockIron, 1));
    }
}
