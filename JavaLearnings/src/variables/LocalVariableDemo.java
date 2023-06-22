package variables;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a=10; // local variable, scope limits to main() only and initialized before using it
		System.out.println(a);
		
		int b; //not initialized, so not allowed to use
		//System.out.println(b);//compile time error as "The local variable b may not have been initialized"
		b=0;//initialized so good to use it 
		System.out.println(b);
		if(1==1) {
			int x=0;
			System.out.println(x);
		}//x will destroy
		//System.out.println(x);//not able to use x in out of scope
		
	}//a,b will destroy

}
