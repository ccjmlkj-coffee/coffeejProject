package com.coffee.alg.StackQueen;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> outQueue;
    Queue<Integer> inQueue;
    public MyStack() {
        outQueue = new LinkedList<>();
        inQueue = new LinkedList<>();
    }

    public void push(int x) {
        inQueue.add(x);
    }

    public int pop() {
        exchangeQueueIndex(inQueue,outQueue);
        return outQueue.poll();
    }

    public int top() {
        exchangeQueueIndex(inQueue,outQueue);
        return outQueue.peek();
    }

    public boolean empty() {
        return outQueue.isEmpty() && inQueue.isEmpty();
    }

    public void exchangeQueueIndex(Queue<Integer> inQueue,Queue<Integer> outQueue){
        Queue<Integer> tmpQueue= new LinkedList<>();
        if (inQueue.isEmpty()){
            return;
        }
        int i = inQueue.peek();
        while(!inQueue.isEmpty()){
            i = inQueue.poll();
            tmpQueue.add(i);
        }

        outQueue.add(i);
        inQueue = tmpQueue;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
    }
}
