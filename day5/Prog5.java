//Auto boxing concept in Wraper Class
public class Prog5{
	public static void main(String []args){
		int i=10;
		System.out.println("The value of i== "+i);
		Integer ival=Integer.valueOf(i);
		System.out.println("The Wrapper class ival is==="+ival);
		Integer ival2=Integer.valueOf("200");
                System.out.println("The Wrapper class ival is=="+ival2);//we can write string as a parameter but it should be number only 
		char c='A';
		System.out.println("The Value of c ="+c);
		Character cval=Character.valueOf(c);//we can not give a string value as parameter on Char wrapper class
		System.out.println("the Wrapper class cval= "+cval); 
	}
}
