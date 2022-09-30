import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.Stream;
public class Array
{

public static void main(String[] args){
     try (Scanner input = new Scanner(System.in)) {
     ArrayList<String> myfavoriteSingers = new ArrayList<>();
     System.out.println("Enter your 6 Favorite Singers:");
     myfavoriteSingers.add(input.nextLine());
     myfavoriteSingers.add(input.nextLine());
     myfavoriteSingers.add(input.nextLine());
     myfavoriteSingers.add(input.nextLine());
     myfavoriteSingers.add(input.nextLine());
     myfavoriteSingers.add(input.nextLine());


     System.out.println(myfavoriteSingers);

     for (String singers : myfavoriteSingers){
     System.out.println(" Lala~, You can listen to their songs anytime! " + singers);
     }


 Iterator<String> it = myfavoriteSingers.iterator();
     while(it.hasNext()){

    System.out.println( it.next());
     }
    Stream<String> str = myfavoriteSingers.stream();
     str.forEach(singer -> {
    System.out.println(" Lala~, You can listen to their songs anytime! " + singer );
    });
 }
 }
}
