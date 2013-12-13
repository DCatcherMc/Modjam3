package net.dcatcher.modjam.render;

import net.dcatcher.modjam.tiles.TENode;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Copyright: DCatcher
 */
public class RenderNode extends TileEntitySpecialRenderer{

    public static final ModelNode ModelNode = new ModelNode();
    public static final ResourceLocation texture = new ResourceLocation("dcatchermodjam", "/textures/models/model_node.png");

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float floaty) {
        TENode tileEntity = (TENode)te;

        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5, y + 1.95, z + 0.5);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(1.3f, 1.3f, 1.3f);

        ModelNode.render(0.0625F);

        GL11.glPopMatrix();
    }
}
