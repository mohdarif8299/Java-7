import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Program1
{
	public static void main(String[] args)  {
	try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
		String s = br.readLine();
		while (s!=null)
		{
			System.out.println(s);
			s = br.readLine();
		}
	}
	catch(FileNotFoundException f) {
		f.printStackTrace();
	}
	catch(IOException io) {
		io.printStackTrace();
	}
	}
}