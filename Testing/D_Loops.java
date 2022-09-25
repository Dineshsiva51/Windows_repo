package Testing;

public class D_Loops {
	public static void main(String[] args) {
		
		//Loops: same action multiple times 
		
		//1.for loop
		/*1.Initialization
		 * 2.Condition
		 * 3.Increment/Decrement:
		 * 4.Statement
		 * eg: syntax
		 * for(initialization; condition; increment/decrement){    
				//statement or code to be executed    
				}    
		 * 
		 */
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			System.out.println("Increment");
			}
		
		for(int i =10;i>0;i--)
		{
			System.out.println(i);
			System.out.println("decrement");
		}
		
		
		//NESTED FOR LOOP:
		
		//loop of i  
		for(int i=1;i<=3;i++){  
		//loop of j  
		for(int j=1;j<=3;j++){  
		        System.out.println(i+" "+j);  
		}//end of i  
		}//end of j  
		
		
		
		
	}
}
