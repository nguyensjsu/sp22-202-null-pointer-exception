package main.java.com;

import java.io.IOException;
import java.util.ArrayList;

public class DataSet {
   // private ArrayList<Integer> data = new ArrayList<Integer>()  ;
	private AudioStrategy strategy;

    public DataSet() throws IOException
    {
        strategy = new GameMusic() ;
    }

    public void changeStrategy(AudioStrategy s) {
	    strategy = s ;
	}

    public void doSort() throws Exception {
       
            strategy.sort();
            
	
}
}
