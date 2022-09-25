package Testing;

public class G_StaticAndNonStatic {
	
	public static void main(String[] args) {
		// cannot call a non-static with object creation
		//static method can be directly called using
		add();
		G_StaticAndNonStatic.add();
		G_StaticAndNonStatic nonsta= new G_StaticAndNonStatic();
		nonsta.sub();
	}

	public static void add()
	{
		System.out.println("testing add");
	}
	
	public void sub()
	{
		System.out.println("testing sub");
	}
	

}
