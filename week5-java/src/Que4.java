import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class Que4 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();// Declare the ArrayList
        colours.add("Red");                         // make a collection
        colours.add("Blue");
        colours.add("Black");
        colours.add("White");
        colours.add("Yellow");
        Iterator<String> it = colours.iterator(); // get the iterator

        //System.out.println(it.next());// to print the first name of array
        // line 16 - I remove from the comment, it doesn't print the first colour two times..why?

        while (it.hasNext()){ // through loop get whole array collection
            System.out.println(it.next());
        }
    }
}
