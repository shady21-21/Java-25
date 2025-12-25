package PriorityQueue;
import java.util.ArrayList;

public class HeapImplementation {
    static class Heap{ //this is a min Heap Implementation.
      ArrayList<Integer>list = new ArrayList<>();
       //create add method.
        public void add(int data){
            list.add(data); //add the val in last index.

            int childIndex = list.size()-1;
            int parentIndex = (childIndex-1)/2;// cal the parent index.

            while (list.get(parentIndex) > list.get(childIndex)){ // log n
                //swap
                int tem = list.get(childIndex);
                list.set(childIndex, list.get(parentIndex));
                list.set(parentIndex, tem);

                //update pointers.
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }
        }

        //peek method.
        public int peek(){
            if(list.isEmpty()){
                throw new IllegalStateException("Heap is Empty!");
            }
            return list.get(0);
        }

        //Delete in Heap..
        public int remove(){
            if(list.isEmpty()){
                throw new IllegalStateException("Heap is empty!");
            }

            // delete in heap means -> remove the mini element.
            // this is 3-step process.
            //1. swap 1st and last node.
            //2.remove last index value.
            //3. Fixed my heap. (To Fixed heap we are using Heapify)
            int data = list.get(0);
            //step1: swap 1st & last.
            int tem = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, tem);

            //step2: delete the last.
            list.remove(list.size()-1);

            //step3: heapify to rearrange the heap.
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }
        private void heapify(int index){
            int leftChild = 2*index+1;
            int rightChild = 2*index+2;
            int minIndex = index; //this root index

            if(leftChild < list.size() && list.get(minIndex) > list.get(leftChild)){
                minIndex = leftChild;
            } if(rightChild < list.size() && list.get(minIndex) > list.get(rightChild)){
                minIndex = rightChild;
            }

            if(minIndex != index){
              //swap.
              int tem = list.get(index);
              list.set(index, list.get(minIndex));
              list.set(minIndex, tem);

              heapify(minIndex);
            }
        }

    }

    public static void main(String[] args) {

        Heap pq = new Heap(); // heap class min heap logic define.
        // to create max heap you just change add and heapify method.
        pq.add(21);
        pq.add(6);
        pq.add(33);
        pq.add(23);

        while(!pq.isEmpty()){ //this is also be called as "HEAP SORT"
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
