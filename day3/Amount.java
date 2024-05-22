public class Amount{
	int cash=500;
	public Amount(){
	System.out.println("the initial cash is "+cash);
	}
	public Amount(int a){
	System.out.println("the addition value is"+a);
	System.out.println("the final value is "+(cash+a));
	}
	public static void main(String args[]){
		new Amount();
		new Amount(300);

	}
}
