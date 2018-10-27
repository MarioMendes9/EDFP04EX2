/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex2;

/**
 *
 * @author User
 * @param <T>
 */
public class CircularArrayQueue<T> implements QueueADT<T>{

    private T[] array;
    private int front;
    private int rear;
    private int count;
    
    private final int DEFAULT_CAPACITY = 10;

    public CircularArrayQueue(int tam) {
        this.array = (T[])(new Object[tam]);
        this.front = 0;
        this.rear = 0;
        this.count=0;
    }
    
    
     public CircularArrayQueue() {
        this.array = (T[])(new Object[DEFAULT_CAPACITY]);
        this.front = 0;
        this.rear = 0;
        this.count=0;
    }
    
    @Override
    public void enqueue(T element) {
         if(isEmpty()){
             this.array[0]=element;
         }
         else{
             rear=(rear+1)%array.length;
             if(this.array[rear]==null){
                 this.array[this.rear]=element;
             }else{
                 this.newArray();
                 //this.rear++;
                 this.array[this.rear]=element;
             }
             
             
         }   
        this.count++;
    }

    @Override
    public T dequeue() {
        T elemento;
        if(isEmpty())
            return null;
        else{
            elemento=this.array[this.front];
            this.array[this.front]=null;
            this.front++;
            if(this.front==array.length)
                this.front=0;
            this.count--;
            return elemento;
        }
        
    }

    @Override
    public T first() {
       return this.array[front];
    }

    @Override
    public boolean isEmpty() {
        return(count==0);
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public String toString() {
      String s="Circular array:";
      
      if(this.rear<this.front){
          for(int i=this.front;i<this.array.length;i++){
              s+=this.array[i];
              
          }
          for(int i=0;i<=this.rear;i++){
              s+=this.array[i];
          }
      }
      else{
          for(int i=this.front;i<=this.rear;i++){
              s+=this.array[i];
          }
      }
       
       return s;
    }
    
    private void newArray(){
        T[] array2=(T[])(new Object[this.array.length+1]);
        if(this.rear<=this.front){
           for(int i=0;i<this.rear;i++){
            array2[i]=this.array[i];
        }
           for(int i=this.front;i<this.array.length;i++){
            array2[i+1]=this.array[i];
        }
           this.front++;
           this.array=array2;
        }else{
            
        
        for(int i=0;i<this.array.length;i++){
            array2[i]=this.array[i];
        }
        this.array=array2;
        }
        
    }
    
}
