package com.leet.Solution.aprilChallenge;


import java.util.Comparator;
import java.util.TreeMap;

public class MinStack {
    private Node node;
    TreeMap<Node,Integer> nodes;
    public MinStack() {
        this.nodes = new TreeMap<>(Comparator.comparingInt(Node::getVal));

    }

    public void push(int x) {
        if(this.node != null){
            final Node temp = new Node(x);
            temp.next = this.node;
            this.node = temp;
        }else {
            this.node = new Node(x);
        }
        if(this.nodes.containsKey(this.node)){
            this.nodes.put(this.node,this.nodes.get(this.node)+1);
        } else {
            this.nodes.put(this.node, 1);
        }
    }

    public void pop() {
        if(this.node != null){
            Node temp = this.node ;
            this.node = temp.next;
            if(this.nodes.containsKey(temp)){
               if(this.nodes.get(temp) > 1 ){
                   this.nodes.put(temp,this.nodes.get(temp)-1);
               } else {
                   this.nodes.remove(temp);
               }
            }
            temp = null;
        } else {
            throw new NullPointerException("Stack is empty");
        }
    }

    public int top() {
        if(this.node != null){
            return this.node.getVal();
        }else {
            throw new NullPointerException("Stack is empty");
        }
    }

    public int getMin() {
        return this.nodes.firstKey().getVal();
    }

    private class Node {
        private int val;
        private Node next;
        public Node(final int x) {
            this.val = x; }
        public int getVal() {
            return this.val;
        }

        public void setVal(final int val) {
            this.val = val;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(final Node next) {
            this.next = next;
        }

    }

}
