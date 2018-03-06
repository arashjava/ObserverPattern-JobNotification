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
public class GetJobs implements Runnable{
    
    private String jobCategory;
    private String jobTitle;
    
    private SubjectInt jobGrabber;
    private int observerId;

    public GetJobs(int observerId, SubjectInt jobGrabber, String newJobCategory, String newJobTitle ) {
        this.jobCategory = newJobCategory;
        this.jobTitle = newJobTitle;
        this.jobGrabber = jobGrabber;
        this.observerId= observerId+1;
    }

    
    
    @Override
    public void run() {
        final String strJava="Java";
 //       final String strDatabase="Database";
 //       final String strPhp="PHP";
        JobObserver obs = new JobObserver(jobGrabber);
  //      System.out.println("Job observer: "+ JobObserver);
        obs.setCategory(jobCategory);
        obs.setNewJob(jobTitle);
        obs.setObserverId(observerId);
        obs.update( );
//        if(jobCategory.toLowerCase().contains(strJava.toLowerCase())){ ((JobPicker)jobGrabber).setNewJob(jobTitle);}
//            System.out.println( "Observer ID: " + observerId+ " For category: " + jobCategory + ", " + jobTitle + " is available. \n");
 //       }
    }
}