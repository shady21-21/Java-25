package OppsV2.statickeyword.utils;

public class Utlity {

    public static int max(int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }

    public static String removeSpaceToUpperCase(String str){
        return str.replace(" ","").toUpperCase();
    }
}
