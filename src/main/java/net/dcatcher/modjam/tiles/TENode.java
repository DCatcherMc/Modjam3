package net.dcatcher.modjam.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import java.util.List;
import java.util.Random;

public class TENode extends TileEntity{

    public float cubeXRotation, cubeYRotation,cubeZRotation;
    public boolean isActive;

    @Override
    @SideOnly(Side.CLIENT)
    public void updateEntity() {
        super.updateEntity();
        Random random = new Random();

        if(isActive){
            cubeXRotation += (float)(random.nextInt(2) +1) / 15;
            cubeYRotation += (float)(random.nextInt(2) +1) / 15;
            cubeZRotation += (float)(random.nextInt(2) +1) / 15;
        }
    }

    public void setActive(boolean active){
        isActive = active;
        System.out.println("Setting active!");

    }

    public void toggleActive(){
        isActive = !isActive;
        System.out.println("Toggling active!");
    }

    public TENode findClosestNode(){
        List entities = worldObj.getEntitiesWithinAABB(TENode.class, getRenderBoundingBox().expand(10d, 10d, 10d));
        TENode closestNode = null;
        double closestNodeDistance = 20;
        for(Object entity : entities){
            TENode current = (TENode)entity;
            double distance = current.getDistanceFrom(xCoord, yCoord, zCoord);

            if(distance < closestNodeDistance){
                closestNodeDistance = distance;
                closestNode = current;
            }
        }
        return closestNode;
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


    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.cubeXRotation = nbt.getFloat("cubeXRotation");
        this.cubeYRotation = nbt.getFloat("cubeYRotation");
        this.cubeZRotation = nbt.getFloat("cubeZRotation");
        setActive(nbt.getBoolean("isActive"));

    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setFloat("cubeXRotation", this.cubeXRotation);
        nbt.setFloat("cubeYRotation", this.cubeYRotation);
        nbt.setFloat("cubeZRotation", this.cubeZRotation);
        nbt.setBoolean("isActive", this.isActive);
    }
}
