//printing 1 to 100 without using loop
public class ClassB{
	static int meth1(int i){
		System.out.println(i);
		i++;
		if(i<=100){
			meth1(i);
		}
		return 0;
	}
	public static void main(String[] args){
		int i=0;
		meth1(i);
		
	}
	}
