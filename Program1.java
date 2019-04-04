import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Program1	{
	public static void main(String[] args)	{
		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt")))	{
			System.out.println(10/0);
		}
		catch(ArithmeticException|Exception ie) {
			ie.printStackTrace();
		}
	}
}