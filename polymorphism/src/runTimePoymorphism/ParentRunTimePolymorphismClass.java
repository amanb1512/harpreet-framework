package runTimePoymorphism;

public class ParentRunTimePolymorphismClass {
	
	public void myMethod()
	{System.out.println("i am a method from parent class");
}
	
	public void myMethod1()
	{System.out.println("print this method in child class");
	
	}
	 public static void main (String args[]) {
	
	 ParentRunTimePolymorphismClass obj1 = new  ParentRunTimePolymorphismClass();
	 
	 obj1.myMethod();
	
}
}