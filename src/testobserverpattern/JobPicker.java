/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobserverpattern;

import java.util.ArrayList;

/**
 *
 * @author arash
 */
public class JobPicker implements SubjectInt{
    // list of observers
    private ArrayList<ObserverInt> observers;
    private String newJob;

    public JobPicker() {
        // creates a list to hold all the observers
        observers = new ArrayList<ObserverInt>();
    }
    
    
    
    @Override
    public void register(ObserverInt newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(ObserverInt removeObserver) {
        // find index of the requested observer to temove
        int observerIndex = observers.indexOf(removeObserver);
        
        observers.remove(observerIndex);
        
        System.out.println("Observer: " +observerIndex+1 + " is removed.");
        
    }

    @Override
    public void notifyObserver() {
        for (ObserverInt observer: observers){
            observer.update();
        }
    }

    public String getNewJob() {
        return newJob;
    }

    public void setNewJob(String newJob) {
        this.newJob = newJob;
    }


    
    
    
}
