package net.dcatcher.modjam.render;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.dcatcher.modjam.tiles.TENode;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class RenderNode extends TileEntitySpecialRenderer{

    public static int renderID = RenderingRegistry.getNextAvailableRenderId();

    public static final ModelNode ModelNode = new ModelNode();
    public static final ResourceLocation texture = new ResourceLocation("dcatchermodjam", "/textures/models/model_node.png");

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
        GL11.glRotatef(180f, 0f, 0f, 1f);
        GL11.glRotatef((0 * 90.0F), 0.0F, 1.0F, 0.0F);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        bindTexture(texture);
        ModelNode.render(te, 0.0625F);
        GL11.glPopMatrix();
    }


}
