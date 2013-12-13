package net.dcatcher.modjam.util;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.dcatcher.modjam.render.BlockHandler;
import net.dcatcher.modjam.render.RenderNode;
import net.dcatcher.modjam.tiles.TENode;

/**
 * Copyright: DCatcher
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initialise(){
        super.initialise();
        RenderingRegistry.registerBlockHandler(new BlockHandler());
        ClientRegistry.bindTileEntitySpecialRenderer(TENode.class, new RenderNode());
    }

}
