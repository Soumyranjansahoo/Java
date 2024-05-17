public class ClassD{
	void  meth1(){
	System.out.println("this is meth1");
	System.out.println(new ClassD("java is awesome").meth2(20,30)+50);
	}
	int meth2(int a, int b){
		System.out.println("this is the integer parameter meth called & the addition of a and b= "+(a+b));
		new ClassD(20);
		return a+b+a;

	}
	public ClassD(){
	System.out.println("this is non parameter const called");

	}
	public ClassD(String s){
		System.out.println(s);
	}
	public ClassD(int x){
	System.out.println("the integer parameter const called & the value of X= "+x);
	}
	public static void main(String []args){
	System.out.println("Welcome to Java Constructor Class");
	new ClassD().meth1();	
	}

	


}

