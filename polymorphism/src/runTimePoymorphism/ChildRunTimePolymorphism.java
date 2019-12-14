package runTimePoymorphism;

public class ChildRunTimePolymorphism  extends ParentRunTimePolymorphismClass  {
	
	public void myMethod()
	{System.out.println("i am a method from parent class");
}
	
	

	public static void main(String[] args) {
		
		ParentRunTimePolymorphismClass obj = new ChildRunTimePolymorphism  ();
		
		obj.myMethod1();
		
		
		
		

	}

}
