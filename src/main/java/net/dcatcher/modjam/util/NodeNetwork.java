package net.dcatcher.modjam.util;

import net.dcatcher.modjam.tiles.TENode;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: DCatcher
 */
public class NodeNetwork {

    public static Map<TENode, TENode> nodeMap = new HashMap<TENode, TENode>();
    public static List<TENode> unmappedNodes = new ArrayList<TENode>();

    public void NodeNetwork(){

    }


    public void addNode(TENode node){
        unmappedNodes.add(node);
    }

    public void pairNode(TENode nodeA, TENode nodeB){

    }

    public TENode findClosestInactiveNode(World world, int x, int y, int z){
        List entities = world.loadedTileEntityList;
        TENode closestNode = null;
        double closestNodeDistance = 20;
        for(Object entity : entities){
            if(entity instanceof TENode && !entity.equals(this) && !((TENode) entity).isActive){
                TENode current = (TENode)entity;
                double distance = current.getDistanceFrom(x, y, z);

                if(distance < closestNodeDistance){
                    closestNodeDistance = distance;
                    closestNode = current;
                }
            }
        }
        return closestNode;
    }

    public void desync(TENode nodeA){
        nodeA.pairedNode.pairedNode = null;
        nodeA.pairedNode = null;
    }
}
