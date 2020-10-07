import java.util.Scanner;
/**
 *This program will show the pattern of the number.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask for a positive integer 
    System.out.println("Please enter a positive integer");
    // declare a variable to store userInteger
    int n = input.nextInt();
    int count = n;
   
  
   while( count != 1){
   int number =  count % 2;
    if ( number == 0){
     count = (count / 2);
    System.out.println(count);
    }
   
    if ( number > 0){
     count = (3 * count + 1);
    System.out.println(count);
    }
    }
   
    }
  }

  

      
      
    
       
      
        
        
  

       
       

        
      

    
      
  
  

