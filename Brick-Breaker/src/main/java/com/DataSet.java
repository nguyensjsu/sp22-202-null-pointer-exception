package main.java.com;

import java.io.IOException;
import java.util.ArrayList;

public class DataSet {
	private AudioStrategy strategy;

    // Constructor
    public DataSet() throws IOException
    {
        strategy = new GameMusic() ;
    }

// Change audio strategy
    public void changeStrategy(AudioStrategy s) {
	    strategy = s ;
	}

    // Perform strategy
    public void doSort() throws Exception {
       
            strategy.sort();
            
	
}
}
