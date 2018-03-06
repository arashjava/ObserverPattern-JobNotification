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
public interface SubjectInt {
    public void register(ObserverInt o);
    public void unregister(ObserverInt o);
    public void notifyObserver();
}
