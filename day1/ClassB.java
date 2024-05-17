// arithmatic operation on java
public class ClassB{
	int a=20,b=4;
	int sum(){
		int sum=a+b;
		System.out.println("the given num is a="+a+" b="+b);
		return sum;

	}
	int sub(){
		int sub=a-b;
                System.out.println("the given num is a="+a+" b="+b);
		return sub;
	}
	int mul(){
		int mul=a*b;
                System.out.println("the given num is a="+a+" b="+b);
		return mul;
	}
	int div(){

		int div=a/b;
                System.out.println("the given num is a="+a+" b="+b);
		return div;
	}
	public static void main(String []args){
	ClassB bobj=new ClassB();
	System.out.println("the sum is "+bobj.sum());
	System.out.println("the sub is "+bobj.sub());
	System.out.println("the mul is "+bobj.mul());
	System.out.println("the div is "+bobj.div());

	}

}
