package net.dcatcher.modjam.tiles;

import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class TENode extends TileEntity{

    private float cubeXRotation, cubeYRotation,cubeZRotation;

    @Override
    public void updateEntity() {
        boolean isDaytime = worldObj.isDaytime();

        super.updateEntity();

        Random random = new Random();
        cubeXRotation += (float)(random.nextInt(3) +1) / 10;
        cubeYRotation += (float)(random.nextInt(3) +1) / 10;
        cubeZRotation += (float)(random.nextInt(3) +1) / 10;
        ;

    }


    public float getCubeXRotation(){
        return cubeXRotation;
    }

    public float getCubeYRotation(){
        return cubeYRotation;
    }

    public float getCubeZRotation(){
        return cubeZRotation;
    }
}
