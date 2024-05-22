public class Fibonacci{
	public void meth1(int num){
	int n1=0,n2=1,n3;
	System.out.println(n1);
	System.out.println(n2);
	for(int i=0;i<=num;++i){
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	
	}
	}
	public static void main(String []args){
		new Fibonacci().meth1(10);
	}
}
