
public class StaticMethodExample {
	static 
	{
		System.out.println("Static Block-1");
	}

	public static void main(String[] args) {
		ABC.show();
		ABC.i=10;
		ABC.show();

	}

	static 
	{
		System.out.println("Static Block-2");
	}
}

class ABC
{	static int i=5;
	public static  void show()
	{
		System.out.println("Hello");
		System.out.println(i);
		System.out.println("Ufffffffff......");
	}
	}
