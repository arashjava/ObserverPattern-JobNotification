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

    

    
    // refrence to Subject
    private SubjectInt jobGrabber;

    // constructor with subject parameter
    public JobObserver(SubjectInt jobPicker) {
        this.jobGrabber = jobPicker;
        
        // assign an id to observer and increase the counter
  //      this.observerId = ++observerIdCounter;
        
 //       System.out.println("New observer created: "+ this.observerId);
        
        // register the applicant
        jobPicker.register(this);
    }
    
    
    

    @Override
    public void update(){
        // shows new updated jobs
  //              this.observerId = ++observerIdCounter;
   //             System.out.println("New observer created: "+ this.observerId);
  //      System.out.println(observerId + "\n new Job: for observer id: "+ observerId);
 //       System.out.println(observerId + "\n new Job: for observer id: "+ observerId);
        showUpdates();
    }

    public void showUpdates( ){
        // shows new updated jobs
  //              this.observerId = ++observerIdCounter;
   //             System.out.println("New observer created: "+ this.observerId);
  //      System.out.println(observerId + "\n new Job: for observer id: "+ observerId);
 //       System.out.println(observerId + "\n new Job: for observer id: "+ observerId);
       if(getNewJob().toLowerCase().contains(getCategory().toLowerCase())){ ((JobPicker)jobGrabber).setNewJob(category);}
            System.out.println( "Observer ID: " + getObserverId()+ " For category: " + getCategory() + ", " + getNewJob() + " is available. \n");
        }
    }