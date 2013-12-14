package net.dcatcher.modjam.util;

import net.dcatcher.modjam.tiles.TENode;

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

    public void desync(TENode nodeA){
        nodeA.pairedNode.pairedNode = null;
        nodeA.pairedNode = null;
    }
}
