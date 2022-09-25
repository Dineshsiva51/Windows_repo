package accessModifiers;

public class testrunAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProtectedExample pe=new ProtectedExample();
	   	 pe.add();
	   	 
	   	DefaultExample de = new DefaultExample();
	   	de.defaultprint();
	   	
	   	privateExample pe1= new privateExample();
		pe1.privateprint();


	}

}
