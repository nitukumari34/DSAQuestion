package org.example.Stack;

public class QueueUsingArray {
    static int[]arr=new int[100];
   static int start=-1,end=-1,size=0,capacity=100;
    // push(),pop(),peek(),isEmpty()
    //fifo: first in first out
    public  static  void push(int val){
        if(size>capacity){
            System.out.println("queue is full");
        }
        arr[++start]=val;
    }
    public  static  int pop(){
      if(size==0){
          System.out.println("queue is empty");
      }
      return  arr[end++];
//      size--
    }
    public  static  int peek(){
        if(size==0){
            System.out.println("queue is empty");
        }
        return  arr[start];
    }
    public  static boolean isEmpty(){
      return  size==0;
    }
    public static void main(String[] args) {
     push(10);
     push(89);
     push(90);
        System.out.println(pop());
        System.out.println(isEmpty());
        System.out.println(peek());


    }
}
