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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        LList l = new LList();

        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);

        l.print();
        
        System.out.println("");
        
        
        System.out.println("Count = "+Singleton.getCount());
        
        System.out.println("");
        
        System.out.println("SIZE: " + l.size());
        

    }

}
