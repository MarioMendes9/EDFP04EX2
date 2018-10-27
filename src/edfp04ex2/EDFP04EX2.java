/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex2;

/**
 *
 * @author User
 */
public class EDFP04EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      QueueADT<String> que=new CircularArrayQueue<>(4);
      que.enqueue("A");
      que.enqueue("B");
      que.enqueue("C");
      que.enqueue("D");
      
      System.out.println(que.toString());
      
       //System.out.println("remove:"+que.dequeue());
      
      //System.out.println("primeiro:"+que.first());
      //System.out.println(que.toString());
      //que.enqueue("E");
      //que.dequeue();
      //que.enqueue("F");
      System.out.println(que.toString());
      que.enqueue("H");
      System.out.println("primeiro:"+que.first());
      que.dequeue();
      que.enqueue("J");
      que.enqueue("E");
      System.out.println(que.toString());
      
    }
    
}
