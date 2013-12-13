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
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        ModelNode.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    /**
    public void render(TENode teNode, World world, int x, int y, int z, Block block){
        Tessellator tesselator = Tessellator.instance;

        float f = block.getBlockBrightness(world, x, y, z);

        int l = world.getLightBrightnessForSkyBlocks(x, y, z, 0);
        tesselator.setColorOpaque_F(f, f, f);

        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)l % 65536, (float)l / 65536);

        int dir = world.getBlockMetadata(x, y, z);

        GL11.glPushMatrix();
        GL11.glTranslatef(0.5F, 0, 0.5F);
        GL11.glRotatef(dir * (-90F), 0F, 1F, 0F);
        GL11.glTranslatef(-0.5F, 0, -0.5F);



        GL11.glPopMatrix();
    }
       */
}
