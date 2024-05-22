public class Relation_operator1{
	void meth1(int age){
		System.out.println("meth 1 called from main"+'\n');
		if(age<=18){

			System.out.println("you are not elegible for vote");
		}
		else
		{
			System.out.println("you are elegible for vote");
		}

	}
	void meth2(){// this meth for increment and decremet operator
	System.out.println("meth 2 called from main");
	int a=10,b=20;
	int c=++a-++b - --a+ ++b;//11-21-10+22=33-31=2; a=10,b=22, c=2
	int d=-a+ ++b - --c+ --a+ ++a - ++b -c-a-b+ ++a;//-10+23-1+9+10-24-1-10-24+11=-17 ;a=11,b=24,c=1
	int sum=a+b+c+d;//19
	System.out.println("the sum = "+sum);

	}
	public static void main(String args[]){
	new Relation_operator1().meth1(28);
	new Relation_operator1().meth2();
	int a = 1, b = 1, d = 1;
        System.out.println((++a + ++a+a++)+","+(a++ + ++b)+","+(++d + d++ + a++));
	System.out.println("java is awesome");

	}
}
