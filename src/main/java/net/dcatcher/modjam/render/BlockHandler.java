package net.dcatcher.modjam.render;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class BlockHandler implements ISimpleBlockRenderingHandler {
    @Override
    public void renderInventoryBlock(Block block, int i, int i2, RenderBlocks renderBlocks) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderNode.texture);
        GL11.glTranslated(0.5, 1.9, 0.5);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(1.3f, 1.3f, 1.3f);
        RenderNode.ModelNode.render(0.0625F);
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
        return RenderingRegistry.getNextAvailableRenderId();
    }
}