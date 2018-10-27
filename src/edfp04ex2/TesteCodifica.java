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
public class TesteCodifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CircularArrayQueue<String> cod=new CircularArrayQueue<>();
       CircularArrayQueue<Integer> key=new CircularArrayQueue<>();   
       
       cod.enqueue("n");
       cod.enqueue("o");
       cod.enqueue("v");
       cod.enqueue("a");
       cod.enqueue("n");
       cod.enqueue("j");
       cod.enqueue("g");
       cod.enqueue("h");
       cod.enqueue("l");
       cod.enqueue(" ");
       cod.enqueue("m");
       cod.enqueue("u");
       cod.enqueue(" ");
       cod.enqueue("u");
       cod.enqueue("r");
       cod.enqueue("x");
       cod.enqueue("l");
       cod.enqueue("v");
       
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(4);
       key.enqueue(2);
       key.enqueue(5);
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(0);//key.enqueue(null);
       key.enqueue(4);
       key.enqueue(2);
       key.enqueue(0);//key.enqueue(null);
       key.enqueue(5);
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(4);
       
       Codifica codifica=new Codifica(cod, key);
        codifica.traduzMessage();
       System.out.println(codifica.getMensageDesc().toString());
       
       
       
       
    }
    
}
