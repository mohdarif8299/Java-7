class MyProgram implements java.io.Closeable
{
	public void close() throws java.io.IOException {
	throw new RuntimeException("runtime");
	}
}
public class Program5	{
	public static void main(String... args)	{
			try(MyProgram p = new MyProgram();) {
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}