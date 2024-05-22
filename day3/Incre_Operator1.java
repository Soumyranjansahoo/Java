public class Incre_Operator1{
	public static void main(String []args){
		int a=56;
		int b=10;
		int c=++b - --a+20;//c=11-55+20=34;a=55,b=11,c=-24
		System.out.println("A= "+a+'\n'+"B = "+b+'\n'+"C= "+c);
		int d=--c + --b+ ++c+10;//-25+10-24+10;d=-29,c=-24,b=10,a=55
		System.out.println("A= "+a+'\n'+"B = "+b+'\n'+"C= "+c+'\n'+"D= "+d);
		int e=d+ -a + -c+ --d +100;//-29-55+24-30+100=10
		System.out.println("A= "+a+'\n'+"B = "+b+'\n'+"C= "+c+'\n'+"D= "+d+'\n'+"E= "+e);
		int f=++d+ --c+ ++a - --d + --a + -b + --c + -a + -b - -c;//d-29-25+56+30+55-10-26-55-10-26=-40
		System.out.println("A= "+a+'\n'+"B = "+b+'\n'+"C= "+c+'\n'+"D= "+d+'\n'+"E= "+e+'\n'+"F= "+f);//55,10,32,85,218,135
	}
}

//A= 55
//B = 10
//C= -24
//D= -30
//E= 10

