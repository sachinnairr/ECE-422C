package assignment4;

import java.util.*;


public class Node {
    private String lable;
    private HashMap <Node, Integer> edges;
    
    public Node(String lable){
        this.lable = lable;
        edges = new HashMap<Node, Integer>();
    }
    public String toString(){
        return lable;
    }
    
    
    public void addEdge(Node n) {
        try {
            if (n == null) {
                throw new NullPointerException();
            }
        if (this.edges.containsKey(n)) {
            Integer weight = this.edges.get(n);
            weight++;
            this.edges.put(n, weight);
        } else {
            this.edges.put(n, 1);
        }
    }
    catch(NullPointerException ex) {
        System.out.println("Node cannot be null");
    }
        return;
    }


    public String findBridge(Node n){
        ArrayList<Node> bridges = new ArrayList<Node>(this.edges.size());
        bridges.addAll(this.edges.keySet());

        Node bridge = null;
        for(int i = 0; i < bridges.size(); i++){
            if(bridges.get(i).edges.containsKey(n)){
                if(bridge == null){
                    bridge = bridges.get(i);
                }
                else{
                    if(this.edges.get(bridge) < this.edges.get(bridges.get(i)) ){
                        bridge = bridges.get(i);
                    }

                }
            }
        } 

        if(bridge == null){
            return "";
        }
        else{
            return (bridge.toString());
        }
        
    }
    public void printConnections(){
        System.out.print("'" + lable + "' has the map: ");
        System.out.println(edges);
    }

}
