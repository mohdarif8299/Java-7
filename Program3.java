import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.File;
public class Program3 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"));PrintWriter pw = new PrintWriter(new File("java7.txt"))) {
			System.out.println("Reading from file");
			String s = br.readLine();
			while (s!=null)	{
				System.out.println(s);
				s = br.readLine();
			}
			System.out.println("Writing to File");
			pw.println("Try with Mutiple Resources");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}