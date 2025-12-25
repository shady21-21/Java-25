package OppsV2.statickeyword;

import OppsV2.statickeyword.utils.Utlity;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setId("1210012");
        student1.setName("Debu");
        student1.setAge(21);

        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        System.out.println(Student.cnt);
        int res = Utlity.max(12, 2);
        System.out.println(res);

        String ans = Utlity.removeSpaceToUpperCase("dncdcd dcdncd ");
        System.out.println(ans);

        College college = College.getInstance();
        college.heyDebu();
    }
}
