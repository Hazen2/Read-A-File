import java.io.*; 
import java.util.Scanner; 

/**
 * This simple program will read a line from within an opened file.
 * The Scanner hasNext method to determine if there is another line
 * of data to be read.
 */

public class ReadLine
{
  public static void main(String[] args) throws IOException
  {
 
    Scanner keyboard = new Scanner(System.in);
    
    // Prompt the user for the name of a file.
    System.out.println("Enter the name of your file.");
    String filename = keyboard.nextLine();
    
    // Open the file.
    File file = new File(filename);
    
    // Passing a reference of the file object to Scanner for reading.
    Scanner newFile = new Scanner(file);
    
    // Keep reading a line from the file until there is nothing left
    // to be read.
    
    while (newFile.hasNext())
       {
       // Reading a line.
       String line = newFile.nextLine();
    
       // Display the line.
       System.out.println(line);
       }
    
    
    // Close the file.
    newFile.close();
        
  }
}
