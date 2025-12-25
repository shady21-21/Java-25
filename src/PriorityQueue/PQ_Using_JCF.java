package PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;


public class PQ_Using_JCF {
    //What happen if we want to store an Object in PQ.
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s1){
            return this.rank - s1.rank;
        }
    }

    public static void main(String[] args) {

       /* PriorityQueue<Integer> pq = new PriorityQueue<>(); // default whose value is low -> his priority is high.

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        //for this, pq2 is whose value is high -> his priority is high.

        pq.add(21); //to add in pq take 0(log n) time.
        pq.add(3);
        pq.add(4);
        pq.add(51);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // peek takes 0(1)
            pq.remove(); //it's take 0(log n)
        }*/


        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Rakim", 84));
        pq.add(new Student("Jay-Z", 69));
        pq.add(new Student("Nas", 77));
        pq.add(new Student("Snoop", 94));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

    }



}
