package duongLab24;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class DuongIdenticalFiles 
{
	public static int checkLines(File a, File b) throws FileNotFoundException
	{
		ArrayList <String> file1 = new ArrayList<>();
		ArrayList <String> file2 = new ArrayList<>();
		int countDifference = 0;
		Scanner A = new Scanner(a);
		Scanner B = new Scanner(b);
		while(A.hasNextLine())
		{
			file1.add(A.nextLine());
		}
		while(B.hasNextLine())
		{
			file2.add(B.nextLine());
		}
		A.close();
		B.close();
		if(file1.size() != file2.size())
		{
			countDifference += (Math.abs((file1.size() - file2.size())));
		}
		for(int i = 0; i < file1.size(); i++)
		{
			if(file1.get(i).equals(file2.get(i)) == false)
			{
				countDifference++;
			}
		}
		return(countDifference);
	}
}
