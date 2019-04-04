class MyProgram implements AutoCloseable
{
	@Override
	public void close() throws Exception {
		System.out.println("Resource Closed");
	}
}
public class Program2 {
	public static void main(String[] args) {
		try(MyProgram mp = new MyProgram()) {
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Out of the Block");
	}
}