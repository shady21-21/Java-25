package OppsV2.accessmodifiers.test;
/*
    Like here, we are doing in the whole application only one "School" Object
    you are creating rather than create multiple.
*/
public class School {
    private static School instance;

    private School(){

    }

    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }
}
