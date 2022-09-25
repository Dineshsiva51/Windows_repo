package Testing;

public class F1_Functionwithreturntype {
	
	public static void main(String[] args) {
		
		F1_Functionwithreturntype fun = new F1_Functionwithreturntype();
		int res=fun.add(10,20);
		System.out.println(res);
		
	}
	
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}

}
