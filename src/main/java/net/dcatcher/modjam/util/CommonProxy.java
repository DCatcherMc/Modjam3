package net.dcatcher.modjam.util;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Copyright: DCatcher
 */
public class CommonProxy implements IGuiHandler {


    public void initialise(){

    }

    @Override
    public Object getServerGuiElement(int i, EntityPlayer entityPlayer, World world, int i2, int i3, int i4) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int i, EntityPlayer entityPlayer, World world, int i2, int i3, int i4) {
        return null;
    }
}
