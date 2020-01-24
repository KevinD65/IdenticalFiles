package duongLab24;
import java.io.File; // import File class
import java.io.FileNotFoundException; // import FileNotFoundException class
import java.util.Scanner; // import Scaner class
public class DuongIdenticalFilesClient extends DuongIdenticalFiles // class declaration which extends DuongIdenticalFiles
{
	public static void main(String[]args) // main method
	{
		Scanner input = new Scanner(System.in); // new Scanner object which takes input from the user
		try { // try...
			System.out.println("Please enter the name of the first file: "); // prompts user for the name of the first file
			File a1 = new File(input.next()); // creates a new File object with the name that the user entered
			System.out.println("Please enter the name of the second file: "); // prompts user for the name of the second file
			File a2 = new File(input.next()); // creates a new File object with the name that the user entered
			input.close(); // close input
			if(checkLines(a1, a2) == 0) // if checkLines(a1, a2) method call is equal to 0...
			{
				System.out.println("The files are identical!"); // prints out the statement
			}
			else // otherwise (if the checkLines(a1, a2) method call is not equal to 0)...
			{
				System.out.println("The files differ by " + checkLines(a1, a2) + " lines!"); // prints out the statement which calls the checkLines method
			}
		}
		catch(FileNotFoundException ex) // catch FileNotFoundException
		{
			System.out.println("File(s) are missing!"); // prints out statement
		}
	}
}
