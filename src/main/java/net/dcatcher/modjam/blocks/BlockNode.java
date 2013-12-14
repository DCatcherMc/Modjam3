package net.dcatcher.modjam.blocks;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.dcatcher.modjam.DCModjam;
import net.dcatcher.modjam.render.BlockHandler;
import net.dcatcher.modjam.tiles.TENode;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNode extends BlockContainer {
    public BlockNode(int id) {
        super(id, Material.rock);
        setUnlocalizedName("blockNode");
        setCreativeTab(DCModjam.tabDCatcher);
    }


    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        par1IconRegister.registerIcon("dcatchermodjam:block_node");
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess world, int par2, int par3, int par4) {
        setBlockBounds(0F, 0F, 0F, 1F, 0.6F, 1F);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

        return true;
    }

    @Override
    public int getRenderType() {
        return BlockHandler.ID;
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TENode();
    }
}
