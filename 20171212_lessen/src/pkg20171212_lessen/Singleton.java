/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171212_lessen;

/**
 *
 * @author _smil
 */
public class Singleton {

    private static int count;
    
    
    static void addCount(int aInt) {
        count+=aInt;
    }
    
    static int getCount(){
        return count;
    }
    
  
    
    
    private Singleton() {
        count = 0;
    }
    
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    private static class SingletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }
    
    
    
}
