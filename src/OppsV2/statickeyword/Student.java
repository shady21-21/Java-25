package OppsV2.statickeyword;

public class Student {

    public static int cnt = 0;

    private String id;
    private String name;
    private int age;

    Student(){
        cnt++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
