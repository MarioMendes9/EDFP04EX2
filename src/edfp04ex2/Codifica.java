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
public class Codifica {
    
    private CircularArrayQueue<String> mensageCod;
    private CircularArrayQueue<Integer> key;
    private CircularArrayQueue<String> mensageDesc;
    public Codifica(CircularArrayQueue<String> mensageCod, CircularArrayQueue<Integer> key) {
        this.mensageCod = mensageCod;
        this.key = key;
        this.mensageDesc=new CircularArrayQueue<>(mensageCod.size());
    }
    
    public void traduzMessage(){
        
        while(!mensageCod.isEmpty()){
            
            
            char c=mensageCod.dequeue().charAt(0);
            int k=key.dequeue();
            if(c==' '){
                mensageDesc.enqueue(" ");}
            
            
            else{
             
             int ch=(int)c;
             ch=ch-k;
                if(ch<97){
                    ch+=26;
                }
            
            c=(char)ch;
            String add=""+c;
            mensageDesc.enqueue(add);
        }
        }
       
    }

    public CircularArrayQueue<String> getMensageCod() {
        return mensageCod;
    }

    public CircularArrayQueue<Integer> getKey() {
        return key;
    }

    public CircularArrayQueue<String> getMensageDesc() {
        return mensageDesc;
    }
    
    
    
}
