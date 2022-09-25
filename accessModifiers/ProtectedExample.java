package accessModifiers;

import Testing.F0_FunctionCalculatorExample;

public class ProtectedExample {
	
	
	
	public static void main(String[] args) {
		
		ProtectedExample pe =new ProtectedExample();
		
		pe.add();
	}

	
	protected void add()
	{
		System.out.print("test");
	}
	
}
