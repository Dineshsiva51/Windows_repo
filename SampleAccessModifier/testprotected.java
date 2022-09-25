package SampleAccessModifier;

import accessModifiers.DefaultExample;
import accessModifiers.ProtectedExample;

public class testprotected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtectedExample pe =new ProtectedExample();
	   	 pe.add();
	   	 
	   	DefaultExample de = new DefaultExample();
	   	de.defaultprint();

	}

}
