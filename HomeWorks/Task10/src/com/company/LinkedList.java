package com.company;

/**
 * Created by Макс on 23.04.2018.
 */
public class LinkedList<T> implements List<T> {
    private Node top;
    private Node last;
    private int count;

    public int getCount() {
        return count;
    }

    private class Node{
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (top == null){
            top = newNode;
            last = newNode;
        }
        else{
            last.next = newNode;
            last = newNode;
        }
        count ++;
    }

    @Override
    public T get(int index) {
        int localCount = 0;
        Node currentNode = top;
        if(index == 0) return top.value;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            localCount++;
            if(localCount == index) break;
        }
        return  currentNode.value;
    }

    @Override
    public boolean delete(T element) {
        Node currentNode = top;
        int localCount = 0;
        while(currentNode.next != null){
            if(currentNode.value.equals(element)){
               delete(localCount);
               return true;
            }
            localCount++;
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public void delete(int index) {
        int localCount = 0;
        Node currentNode = top;
        Node previousNode = null;
        Node followngNode = null;
        if(index == 0){
            top = top.next;
        }
        else if(index > 0 && index < count){
            while(currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
                followngNode = currentNode.next;
                localCount++;
                if(localCount == index)previousNode.next = followngNode;
            }
        }
        else if (index == count - 1) {
            while(currentNode.next != null){
                currentNode = currentNode.next;
                localCount++;
                if(localCount == index - 1) last = currentNode ;
            }
        }
        count --;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T element) {
        Node currentNode = top;
        while(currentNode.next != null){
            if(currentNode.value.equals(element)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
