package net.dcatcher.modjam;

import net.minecraftforge.common.Configuration;

import java.io.File;
import java.io.IOException;

/**
 * Copyright: DCatcher
 */
public class DCConfig {

    public static int idBlockNode;


    public void registerConfigs(File directory){
        File configFile = new File(directory + "/DCatcher.cfg");

        try{
            configFile.createNewFile();
        }catch(IOException ex){
            System.out.println("Error creating DCatcher's Config! OH NOES! - This is probably a bug.. report it NOW!");
            ex.printStackTrace();
        }

        Configuration c = new Configuration(configFile);


        //Load Config:
        c.load();

        idBlockNode = c.getBlock("BlockNode", 500).getInt();

        //Save Config:
        c.save();
    }
}
