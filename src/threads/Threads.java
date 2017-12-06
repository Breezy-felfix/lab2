/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author admin
 */
public class Threads {
 public static int ages []={20,45,47,38,35,67,18,34};
    public static void main(String[] args) {
        
        Thread t1= new Thread (new Runnable(){
            @Override
            public void run (){
                for (int i=0;i<ages.length;i++){
                    System.out.println(ages[i]);
                }}});
        
        
        Thread t2 = new Thread (new Runnable(){
            @Override 
            public void run(){
                for (int i=0;i<ages.length;i++){
                    System.out.println("years elapsed"+(ages[i]-18));
                }}});
            
        Thread t3 = new Thread (new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<ages.length;i++){
                    int f = ages[i]-18/5+1;
                    System.out.println("No. voting" + f);
                }
            }
        });
        t1.start();
        try{
            t1.join();
        }catch(Exception ex) {
        }
        t2.start();
        try{
            t2.join();
        }catch (Exception ex) {
        }
        t3.start();
        try{
            t3.join();
        }catch (Exception ex) {
       }
    }}
    
    
