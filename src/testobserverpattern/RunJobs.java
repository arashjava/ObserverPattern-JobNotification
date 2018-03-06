package testobserverpattern;

import java.util.ArrayList;

/**
 *
 * @author arash
 */
public class RunJobs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jobAvailable="Java-Database developer - backend";
        
        //  Feeding some job categories applied by observers as input
        ArrayList<String> observers = new ArrayList<String>();
        observers= registeredObservers();
        for (int i=1; i < observers.size()+1; i++){
            System.out.println("Registered observers are: "+ i + " = "+ observers.get(i-1));
        }
        System.out.println("\n");
        
        JobPicker jobGrabber = new JobPicker();

        for (int i=0; i< observers.size() ; i++){
            if (jobAvailable.toLowerCase().contains(observers.get(i).toLowerCase())){
                 Runnable getJob= new GetJobs(i, jobGrabber, observers.get(i), jobAvailable);
                 new Thread(getJob).start();
            }
        }
    }
    
    private static ArrayList<String> registeredObservers(){
        ArrayList<String> observerList = new ArrayList<String> ();
        
        observerList.add("PHP");
        observerList.add("Python");
        observerList.add("PHP");
        observerList.add("Web");        
        observerList.add("PHP");
        observerList.add("PHP");
        observerList.add("PHP");
        observerList.add("Java");
        observerList.add("Python");
        observerList.add("Web");
        observerList.add("Database");
        observerList.add("Java");
        observerList.add("Java");
        return observerList;
    } 
    
}
