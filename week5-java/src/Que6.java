//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)

import java.util.HashSet;

public class Que6 {
    public static void main(String[] args) {
       number();
    }
    public static void number(){
        HashSet<Integer>num=new HashSet<Integer>();
        num.add(4);
        num.add(7);
        num.add(8);
        for (int i=0; i<=10; i++){
           if(num.contains(i))
               System.out.println( i  + " Number is in the  Set ");
           else{
               System.out.println( i  + " Number isn't in the set ");
           }

        }


    }
}
