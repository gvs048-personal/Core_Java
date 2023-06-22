package variables;

public class InstanceVariablesDemo {
	public int i=10;
	private int j;
	Integer I; 
	String s;
	float f;
	boolean b;

	public InstanceVariablesDemo() {
		j=100;
	}
	public static void main(String[] args) {
		//System.out.println(i);//CT - without creating the object we can't use instance variables
		InstanceVariablesDemo iv=new InstanceVariablesDemo();
		System.out.println(iv.i);
		System.out.println(iv.b);
		System.out.println(iv.f);
		System.out.println(iv.s);
		System.out.println(iv.I);
		System.out.println(iv.j);
	}

	
}
