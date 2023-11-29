package assignment4;

import java.util.*;

class Graph{
    private Map<String, Node> nodes;

    public Graph(){
        nodes = new HashMap<String, Node>();
    }   
    
    public void addString(String s){
        s = s.toLowerCase();
        String[] words = s.split(" ");
        
        for(int i = 0; i < (words.length - 1); i++){
            Node a;
            Node b;

            if(nodes.containsKey(words[i])){
                a = nodes.get(words[i]);
            }
            else{
                a = new Node(words[i]);
                nodes.put(words[i], a);
            }

            if(nodes.containsKey(words[i + 1])){
                b = nodes.get(words[i + 1]);
            }
            else{
                b = new Node(words[i + 1]);
                nodes.put(words[i + 1], b);
            }
            a.addEdge(b);
        }
        PrintGraph();
    }
    
    public String generatePoem(String s){
        String[] array = s.split(" ");
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            arrayList.add(array[i]);
        }

        for(int i = 0; i < (arrayList.size() - 1); i++){
            String a = arrayList.get(i).toLowerCase().replaceAll("[:;/|!*()`~+-_=<>]", "");
            String b = arrayList.get(i + 1).toLowerCase().replaceAll("[:;/|!*()`~+-_=<>]", "");

            if(nodes.containsKey(a) && nodes.containsKey(b)){
                String bridge = nodes.get(a).findBridge(nodes.get(b));
                arrayList.add(i + 1, bridge);
                i++; 
            }
        }
        String poem = "";
        for(int i = 0; i < arrayList.size(); i++){
            poem = poem.concat(arrayList.get(i) + " ");
        }
        poem = poem.replaceAll("  ", " ");
        return poem;
    }
    public void PrintGraph(){
        Object[] keyListObj = nodes.keySet().toArray();
        String[] keyList = new String[keyListObj.length];
        for(int i = 0; i < keyListObj.length; i++){
            keyList[i] = keyListObj[i].toString();
        }
        for(int i = 0; i < keyList.length; i++){
            System.out.print(keyList[i] + " -> ");
            nodes.get(keyList[i]).printConnections();
        }
        return;
    }

}
