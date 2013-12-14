package net.dcatcher.modjam.render;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.dcatcher.modjam.blocks.BlockNode;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class BlockHandler implements ISimpleBlockRenderingHandler {

    public static final int ID = RenderingRegistry.getNextAvailableRenderId();

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderBlocks) {
        if(modelID == ID){
            if(block instanceof BlockNode){
                FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("dcatchermodjam", "/textures/models/model_node.png"));
                GL11.glTranslated(0.5, 1.9, 0.5);
                GL11.glRotatef(180F, 0, 0, 1);
                GL11.glScalef(1.3F, 1.3F, 1.3F);
                RenderNode.ModelNode.renderItem(0.0625F);
            }
        }
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess iBlockAccess, int i, int i2, int i3, Block block, int i4, RenderBlocks renderBlocks) {
        return false;
    }

    @Override
    public boolean shouldRender3DInInventory() {
        return true;
    }

    @Override
    public int getRenderId() {
        return ID;
    }
}
