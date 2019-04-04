class FirstCloseable implements AutoCloseable	{
	public FirstCloseable()	{
		System.out.println("First Constructor");
	}
	@Override
		public void close() throws Exception {
			System.out.println("First  Resource Closed");
	}
}
class SecondCloseable implements AutoCloseable	{
	public SecondCloseable()	{
		System.out.println("Second Constructor");
	}
	@Override
		public void close() throws Exception {
			System.out.println("Second  Resource Closed");
	}
}
public class Program4 {
	public static void main(String[] args) {
	    try(FirstCloseable fc = new FirstCloseable();SecondCloseable sc = new SecondCloseable()) {
		}
		catch(Exception e) {	}
	}
}