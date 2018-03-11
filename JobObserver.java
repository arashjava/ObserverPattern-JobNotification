/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobserverpattern;

/**
 *
 * @author arash
 */
public class JobObserver implements ObserverInt{
      private String newJob;
      private String category;
      private int observerId;
    // refrence to Subject
    private SubjectInt jobGrabber;
      
    public String getNewJob() {
        return newJob;
    }

    public void setNewJob(String newJob) {
        this.newJob = newJob;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getObserverId() {
        return observerId;
    }

    public void setObserverId(int observerId) {
        this.observerId = observerId;
    }

    // constructor with subject parameter
    public JobObserver(SubjectInt jobPicker) {
        this.jobGrabber = jobPicker;
        
        // register the applicant
        jobPicker.register(this);
    }
    
    @Override
    public void update(){
        showUpdates();
    }

    public void showUpdates( ){
       if(getNewJob().toLowerCase().contains(getCategory().toLowerCase())){ ((JobPicker)jobGrabber).setNewJob(category);}
            System.out.println( "Observer ID: " + getObserverId()+ " For category: " + getCategory() + ", " + getNewJob() + " is available. \n");
        }
    }