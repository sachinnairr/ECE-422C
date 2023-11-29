package assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class GraphPoet {

    static Graph graph;
    /**
     *
     * @param corpus text file from which to derive the poet's affinity graph
     * @throws IOException if the corpus file cannot be found or read
     */
    public GraphPoet(File corpus) throws IOException {
        try { /* Read in Corpus File */
            graph = new Graph();
            FileReader f = new FileReader(corpus);
            BufferedReader in = new BufferedReader(f);
            String s = "";
            String s2;
            while ((s2 = in.readLine()) != null) {
                s = s.concat(s2 + " ");
            }
            graph.addString(s);
            f.close();
            in.close();
        }

        catch(IOException ex) {
            System.out.println("Cannot read in file '" + corpus + "'");
            System.exit(-1);
        }
       
    }

    /**
     * Generate a poem.
     *
     * @param input File from which to create the poem
     * @return poem (as described above)
     */
    public String poem(File input) throws IOException {
        
        /* Read in input and use graph to complete poem */
        FileReader f = new FileReader((input));
        BufferedReader in = new BufferedReader(f);
        String s = "";
        String s2;
        while((s2 = in.readLine()) != null){
            s = s.concat( s2+ " ");
        }
        f.close();
        in.close();   
        return graph.generatePoem(s);
            

    }

}
