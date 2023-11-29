package assignment2;
import java.util.*;
public class Game {
//TODO: Design a Game.java class to handle top-level gameplay
//You may add whatever constructor or methods you like
    public GameConfiguration config;
    public boolean state = false;


    public Game(GameConfiguration config ){
        this.config = config;
        state = true;

    }
    public boolean setState(){
        return !state;
    }

    public void start(){
        

    }







}
