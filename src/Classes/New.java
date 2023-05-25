/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nipun
 */
public class New {
    int i = 10;
    int x = 32;
        static Thread t1;
    public static void main(String[] args) {
        
 t1= new Thread(new Runnable() {
         @Override
         public void run() {
             for(int i = 0; i<10; i++){
             System.err.println(i);
             }
         }
     });
        
      Thread t2 = new Thread(new Runnable() {
         @Override
         public void run() {
             try {
                 t1.join();
             } catch (InterruptedException ex) {
                 Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
             }
             for(int i = 10; i<20; i++){
             System.err.println(i);
             }
         }
     });
      
   
      t1.start();
      t2.start();
    }  
}
