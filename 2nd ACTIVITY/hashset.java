import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class hashset{
     /**
     * @param args
     */
    public static void main (String []args){
     Scanner input = new Scanner(System.in);
     final Set<Integer> integers = new HashSet<Integer>();
    while(true){
    System.out.println("");
    System.out.println("==================HASHSETS===========");
    System.out.println("\nCHOOSE ANY FROM THE FOLLOWING:");
    System.out.println("1. Add");
    System.out.println("2. Remove");
    System.out.println("3. Display");
    System.out.println("4. Clear");
    System.out.println("5. Exit");  System.out.println();
    System.out.println("Your choice");

    int choice = input.nextInt();

    if(choice==1){ 
     // Adding
    int InputtedNumber;
    System.out.println("Enter an integer: ");
     InputtedNumber = input.nextInt();
     if (InputtedNumber >= 0){
    integers.add(InputtedNumber);
     System.out.println("Added!");
     }
     }
    else if(choice==2){
    // Removing

     System.out.println("Enter the number to remove: ");
     int elementToRemove = input.nextInt();
     if(integers.contains(elementToRemove)){
     integers.remove(Integer.valueOf(elementToRemove));
    System.out.println("Removed!");
     } else{
    System.out.println("Elements not found!");
     }
    }
    else if(choice==3){
     System.out.println("Your List: " + integers);
     } 

     else if (choice==4) {
     System.out.println("");
     System.out.println("Cleared!");
     integers.clear();
     }
     else if(choice==5){
     System.out.println("Thank you for using ArrayList!");
     break;
     } else{
    System.out.println("Invalid input. Try again!");
     }

}
input.close();
}
}


