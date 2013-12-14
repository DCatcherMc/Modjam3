package net.dcatcher.modjam.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import java.util.List;
import java.util.Random;

public class TENode extends TileEntity{
    public boolean isActive;
    public TENode(){
        isActive = false;
    }
    public float cubeXRotation, cubeYRotation,cubeZRotation;

    public TENode pairedNode;

    @Override
    @SideOnly(Side.CLIENT)
    public void updateEntity() {
        super.updateEntity();
        Random random = new Random();
        if(worldObj.isRemote){
            if(isActive){
                cubeXRotation += (float)(random.nextInt(2) +1) / 15;
                cubeYRotation += (float)(random.nextInt(2) +1) / 15;
                cubeZRotation += (float)(random.nextInt(2) +1) / 15;
            }
        }
    }

    public void setActive(boolean active){
        isActive = active;
        System.out.println("Setting active!" + active);

    }

    public void toggleActive(){
        isActive = !isActive;
        System.out.println("Toggling active!");
    }

    public TENode findClosestInactiveNode(){
        List entities = worldObj.loadedTileEntityList;
        TENode closestNode = null;
        double closestNodeDistance = 20;
        for(Object entity : entities){
            if(entity instanceof TENode && !entity.equals(this) && !((TENode) entity).isActive){
                TENode current = (TENode)entity;
                double distance = current.getDistanceFrom(xCoord, yCoord, zCoord);

                if(distance < closestNodeDistance){
                    closestNodeDistance = distance;
                    closestNode = current;
                }
            }
        }
        return closestNode;
    }

    public void pairNode(TENode pairedNode){
        this.pairedNode = pairedNode;
        this.setActive(true);
    }

    public void desync(){
        this.pairedNode = null;
        this.setActive(false);
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
        this.setActive(nbt.getBoolean("isActive"));
        System.out.println("ISACTIVE: " + isActive);

        this.pairedNode = (TENode)worldObj.getBlockTileEntity(nbt.getInteger("pairedCoordX"),
                                nbt.getInteger("pairedCoordY"), nbt.getInteger("pairedCoordZ"));

    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setFloat("cubeXRotation", this.cubeXRotation);
        nbt.setFloat("cubeYRotation", this.cubeYRotation);
        nbt.setFloat("cubeZRotation", this.cubeZRotation);
        nbt.setBoolean("isPaired", (pairedNode != null));
        nbt.setInteger("pairedCoordX", pairedNode.xCoord);
        nbt.setInteger("pairedCoordY", pairedNode.yCoord);
        nbt.setInteger("pairedCoordZ", pairedNode.zCoord);
    }
}
