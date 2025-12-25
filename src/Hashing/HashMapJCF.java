package Hashing;
import java.util.HashMap;
import java.util.Objects;

//What happen if i want to create my own key value pair.
//[College , Ranking]
class MyCollege{
    int regNo;
    private int  hashCode;
    MyCollege(int regNo){
        this.regNo = regNo;
        this.hashCode  = Objects.hashCode(regNo);
    }
    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        MyCollege clg = (MyCollege)obj; //type cast for comparison
        return this.regNo == clg.regNo;
    }
}
class MyRanking{
    int rank;
    MyRanking(int rank){
        this.rank = rank;
    }
    @Override
    public String toString() {
        return ""+this.rank;
    }

    @Override
    public boolean equals(Object obj) {
        MyRanking r = (MyRanking) obj;
        return  this.rank == r.rank;
    }
}

public class HashMapJCF {
    public static void main(String[] args) {
        /*
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Debu");
        map.put(2, "21 Savage");
        map.put(3, "EM");
        map.put(4, "Kendrick");
        map.put(5, "The Game");
        map.put(6, "Wayne");
        System.out.println(map);
        map.put(2, "Snoop");
        System.out.println(map);

        System.out.println(map.get(6));
        System.out.println(map.get(7)); // not in the map get null
        System.out.println(map.containsKey(7));
        // line no 19 doesn't exist do it on a better way.
        System.out.println(map.getOrDefault(7, "Not Present"));


        // now iterate in hashMap
        for(Map.Entry<Integer, String> entry : map.entrySet()){ //using entrySet
            System.out.print("KEY:" + entry.getKey() + " | ");
            System.out.println("VALUE:" + entry.getValue());
        }

        System.out.println("-----------------------------------------");
        //using keySet.
        for(Integer key : map.keySet()){
            System.out.print("KEY:" + key + " | ");
            System.out.println("VALUE:" + map.get(key));
        }*/

        HashMap<Integer, Integer> collegeRankingMap = new HashMap<>();
        collegeRankingMap.put(101, 1); //[clgId , Rank]
        collegeRankingMap.put(102, 2);
        collegeRankingMap.put(103, 3);
        collegeRankingMap.put(104, 4);

        System.out.println(collegeRankingMap.get(103));


        //creating my custom map.
        HashMap<MyCollege, MyRanking> collegeRankingMap2 = new HashMap<>();
        collegeRankingMap2.put(new MyCollege(101),new MyRanking(1)); //[clgId , Rank]
        collegeRankingMap2.put(new MyCollege(102),new MyRanking(2)); //[clgId , Rank]
        collegeRankingMap2.put(new MyCollege(103),new MyRanking(3)); //[clgId , Rank]
        collegeRankingMap2.put(new MyCollege(104),new MyRanking(4)); //[clgId , Rank]


        System.out.println(collegeRankingMap2.get(new MyCollege(103))); // same thing doing but give me null
        System.out.println(collegeRankingMap2.containsValue(new MyRanking(2))); // same thing doing but give me null
    }
}



