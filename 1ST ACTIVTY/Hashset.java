import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Hashset {

    /**
     * @param args
     */
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        
     Set<String> set = new HashSet<String>();
     System.out.println("Enter the 5 places you wanted to visit:");
    set.add(input.nextLine());
    set.add(input.nextLine());
    set.add(input.nextLine());
    set.add(input.nextLine());
    set.add(input.nextLine());


    System.out.println(set);
    Iterator<String> it = set.iterator();
     while(it.hasNext()){
         System.out.println("That is nice! Let us travel to" + " " + it.next() + " soon!");
 }
}
    }
}