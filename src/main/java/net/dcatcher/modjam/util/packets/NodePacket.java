package net.dcatcher.modjam.util.packets;

import ch.epfl.lamp.util.ByteArray;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Copyright: DCatcher
 */
public abstract class NodePacket {

    public static final String CHANNEL = "DCModJam-Nodes";
    private static final BiMap<Integer, Class<? extends NodePacket>> idMap;

    static{
        ImmutableBiMap.Builder<Integer, Class<? extends NodePacket>> builder = ImmutableBiMap.builder();
        //TODO: Add packets!

        idMap = builder.build();
    }


    public abstract void write(ByteArrayDataOutput out);

    public abstract void read(ByteArrayDataInput in);

    public abstract void execute(EntityPlayer player, Side side);
}
