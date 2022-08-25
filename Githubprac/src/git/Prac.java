package git;

//import test.Nonstatictest;

public class Prac {
	public void m1()
	{
		System.out.println("method 1 is here");
		
	}
	public void m2()
	{
		m1();
		System.out.println("method 2 is here");
	}
	public static void main(String[] args)
	{
		Prac obj=new Prac();
		obj.m2();
	}

}
