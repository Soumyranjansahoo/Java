public class Prog4{
	static int x=m1();
	public static void main(String []args){
		System.out.println(Prog4.x);//120
	}
	static{
		System.out.println(x);//100
		Prog4.x=x+20;//120
	}
	static int m1(){
		Prog4.x=50;//50
		return m2();
	}
	static int m2(){
		System.out.println(Prog4.x);//50
		return 100;
	}
}

