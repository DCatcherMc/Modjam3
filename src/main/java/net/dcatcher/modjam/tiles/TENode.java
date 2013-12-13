package net.dcatcher.modjam.tiles;

import net.minecraft.tileentity.TileEntity;

public class TENode extends TileEntity{

    private float cubeRotation;

    @Override
    public void updateEntity() {
        boolean isDaytime = worldObj.isDaytime();

        super.updateEntity();

        cubeRotation += 0.1F;

    }


    public float getCubeRotation(){
        return cubeRotation;
    }
}
