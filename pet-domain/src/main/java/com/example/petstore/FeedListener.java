package com.example.petstore;


public class FeedListener implements Listener {

    int feedCriteria = 0;

    public FeedListener(int criteria) {
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCriteria){
            System.out.println("please feed some food.");
        }
    }
    
    
}
