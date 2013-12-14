package net.dcatcher.modjam.util;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.dcatcher.modjam.render.BlockHandler;
import net.dcatcher.modjam.render.RenderNode;
import net.dcatcher.modjam.tiles.TENode;

public class ClientProxy extends CommonProxy {

    public static void registerRendering(){
        RenderingRegistry.registerBlockHandler(new BlockHandler());
        ClientRegistry.bindTileEntitySpecialRenderer(TENode.class, new RenderNode());
    }

}
