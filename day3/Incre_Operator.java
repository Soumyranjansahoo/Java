public class Incre_Operator{
	public static void main(String [] args){
	int a=34,b=21;//a=34 b=21
	int c=a++ + ++b;//c=34+22=56,a=35,b=22,c=56
	int d=--a + --b + c--;//d=34+21+56=111, a=34,b=21,c=55
	int e=a + +b +d--;//e=34+21+111=167,d=110,b=22,a=34
	int f=-a + b-- + -c - d++;//33+22+54-110=109-110=-1,b=21,d=109,f=-1
	int sum=a+b+c+d+e+f;//33+21+54+109+167+-1
	System.out.println(sum);

}
}
