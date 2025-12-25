package Hashing;

public class StudentInfo {

    private String name;
    private String clg;

    private String address;

    public void setName(String name) {
        this.name = name;
    }


    public void setClg(String clg) {
        this.clg = clg;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentInfo [" +
                "Name :'" + name + '\'' +
                ", College :'" + clg + '\'' +
                ", Address :'" + address + '\'' +
                ']';
    }
}
