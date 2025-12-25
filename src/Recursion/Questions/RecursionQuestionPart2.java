package Recursion.Questions;

public class RecursionQuestionPart2 {

    //q1: Skip a character
    void skipCharacter(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(char ch : str.toCharArray()){
           
        }
    }








    public static void main(String[] args) {
        RecursionQuestionPart2 q = new RecursionQuestionPart2();

        q.skipCharacter("baccad", "");
    }
}
