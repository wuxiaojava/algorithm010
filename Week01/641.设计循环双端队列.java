/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 */

// @lc code=start
class MyCircularDeque{
    private int[] arr;
    private int size;
    private int front;
    private int last;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        if(k>=1 && k<=1000){
            this.arr = new int[k];
            this.size = 0;
            this.front = 0;
            this.last = 0;
        }else{
            throw new IllegalArgumentException("参数异常，合法参数范围为[1,1000]");
        }
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (size == arr.length) {
            return false;
        }
        if (front == 0) {
            arr[arr.length - 1] = value;
            front = arr.length - 1;
        } else {
            arr[--front] = value;
        }
        size ++;
 
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (size == arr.length) {
            return false;
        }
        arr[last] = value;
        size ++;
        last = last == arr.length - 1 ? 0 : last + 1;
        return true; 
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        front = front == arr.length - 1 ? 0 : front + 1;
        size--;
        return true; 
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
         if (size == 0) {
            return false;
        }
        if (last == 0) {
            last = arr.length - 1;
        } else {
            last --;
        }
        size --;
        return true; 
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(size == 0){
            return -1;
        }
        return arr[front];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(size == 0){
            return -1;
        }
        return last == 0 ? arr[arr.length - 1] : arr[last - 1];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return this.size == this.arr.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
// @lc code=end

