package OppsV2.statickeyword;

public class College {

    private static College college = new College();
    private College(){
        //how to create Object of College coz it's private.
    }

    public static College getInstance(){
        return college;
    }

    //test that to call any method in that functions.
    public void heyDebu(){
        System.out.println("Hey debu this is the SINGLETON IMPLEMENTATION!!");
    }
}
