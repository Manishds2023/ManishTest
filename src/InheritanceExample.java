
public class InheritanceExample {

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.Add(3,6);
		B obj2= new B();
		obj2.Subtract(8,6);

	}

}

class A
{
	public void Add(int n1,int n2)
	{
		int num1=n1,num2=n2,Result;
		Result = num1+num2;
		System.out.println(Result);
	}
}

class B extends A
{
	public void Subtract(int t1,int t2)
	{
		int num1 =t1,num2=t2;
		int Result = num1-num2;
		System.out.println(Result);
	}
}
