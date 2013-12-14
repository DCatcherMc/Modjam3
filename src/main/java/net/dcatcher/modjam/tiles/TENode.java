package net.dcatcher.modjam.tiles;

import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class TENode extends TileEntity{

    private float cubeXRotation, cubeYRotation,cubeZRotation;


    @Override
    public void updateEntity() {
        super.updateEntity();

        boolean isActive = false;

        Random random = new Random();

        if(isActive){
            cubeXRotation += (float)(random.nextInt(2) +1) / 15;
            cubeYRotation += (float)(random.nextInt(2) +1) / 15;
            cubeZRotation += (float)(random.nextInt(2) +1) / 15;
        }else{

        }

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
