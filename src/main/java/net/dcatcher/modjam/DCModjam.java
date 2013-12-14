package net.dcatcher.modjam;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.dcatcher.modjam.blocks.DCBlocks;
import net.dcatcher.modjam.tiles.TENode;
import net.dcatcher.modjam.util.ClientProxy;
import net.dcatcher.modjam.util.CommonProxy;
import net.dcatcher.modjam.util.DCCreativeTab;
import net.dcatcher.modjam.util.DCRecipes;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = "dcmodjam", name = "DCModJam - 3", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DCModjam {

    @Mod.Instance("dcmodjam")
    public static DCModjam instance;

    private DCConfig config = new DCConfig();
    private DCBlocks blocks = new DCBlocks();

    public static CreativeTabs tabDCatcher = new DCCreativeTab(CreativeTabs.getNextID(), "DCatcher - ModJam 3");

    @SidedProxy(clientSide = "net.dcatcher.modjam.util.ClientProxy", serverSide = "net.dcatcher.modjam.util.CommonProxy")
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        config.registerConfigs(e.getModConfigurationDirectory());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent e){
        GameRegistry.registerTileEntity(TENode.class, "dcNode");
        ClientProxy.registerRendering();
        //Initialise Blocks:
        blocks.initialiseBlocks();
        DCRecipes.registerRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }
}
