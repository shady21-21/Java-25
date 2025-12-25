package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer , StudentInfo> stDetails = new HashMap<>();
        StudentInfo st1 = new StudentInfo();
        st1.setName("Debu");
        st1.setClg("Bengal Institute Of Technology");
        st1.setAddress("Kamarpakur, Hugli");
        stDetails.put(1, st1);

        List<StudentInfo> info = new ArrayList<>();

        for(Map.Entry<Integer, StudentInfo> entry  : stDetails.entrySet()){
            info.add(entry.getValue());
        }

        for(StudentInfo st : info){
            System.out.println(st);
        }
    }
}
