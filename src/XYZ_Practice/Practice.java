package XYZ_Practice;

public class Practice {
    public static void main(String[] args) {

        Stack stk = new Stack();

//        stk.push(12);
//        stk.push(13);
//        stk.push(14);
//        stk.push(15);
//        stk.push(16);
////        stk.push(17);
//        stk.printStack();
////        System.out.println(stk.isEmpty());

        Queue q = new Queue(5);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.printQueue();
    }
}

class Stack{

    int[]arr = new int[5];
    int index;
    int size = 0;


    void push(int x){
        if(index == arr.length) System.out.println("Stack is Full!");

        arr[index] = x;
        index++;
        size++;
    }


    int pop(){
        if(index == 0) System.out.println("Stack is Empty!!");

        int x = arr[index];
        index--;
        size--;
        return x;
    }

    int peek(){
        return arr[index-1];
    }

    int getSize(){
        return size;
    }

    boolean isEmpty(){
        return index == 0;
    }

    void printStack(){
        System.out.print("[");
        for(int x : arr){
            System.out.print(x + ",");
        }
        System.out.print(']');
    }
}


class Queue{

    int[]arr;
    int font;
    int rear;
    int size;

    Queue(int SIZE){
        arr = new int[SIZE];
        this.font = -1;
        this.rear  = -1;
        this.size = SIZE;
    }

    boolean isEmpty(){
        return font == -1 && rear == -1;
    }

    boolean isFull(){
        return rear == size - 1;
    }

    void add(int x){
        if(isFull()){
            System.out.println("Queue is Full!!");
        }
        if(isEmpty()){font = 0;}
        arr[rear] = x;
        rear++;
    }

    int remove(){
        if(isEmpty()){System.out.println("Queue is Empty!!");}

        int removeEle = arr[font];
        if(font == rear){
            font = -1;
            rear = -1;
        }else{
            font++;
        }
        return removeEle;
    }

    int peek(){
        if(isEmpty()){System.out.println("Queue is Empty!!");}
        return arr[font];
    }

    void printQueue(){
        System.out.print("[");
        for(int i = font;i<= rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}
