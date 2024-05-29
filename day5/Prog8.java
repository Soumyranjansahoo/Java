// Wrapper class auto boxing and auto unboxing concept

import java.util.Scanner;
public class Prog8{
		Scanner sc=new Scanner(System.in);
	void autoboxing(){
	        System.out.println("Enter An integer for auto boxing");
	        int a=sc.nextInt();
	        System.out.println("Enter A Character for auto boxing");
	        char c=sc.next().charAt(0);
		System.out.println("Enter A short value for auto boxing");
	        short s=sc.nextShort();
		System.out.println("Enter Byte valuefor auto boxing");
	        byte b=sc.nextByte();
		System.out.println("Enter Long for auto boxing");
	        long l=sc.nextLong();
		System.out.println("Enter Float value for auto boxing");
	        float F=sc.nextFloat();
		System.out.println("Enter Double value for auto boxing");
	        double d=sc.nextDouble();
		System.out.println("Enter Boolean Value for auto boxing");
		boolean bool=sc.nextBoolean();
	//autoboxing for all inputs
		System.out.println("============================================================================"+'\n');
		Integer ival=Integer.valueOf(a);
		System.out.println("value of ival= "+ival);
		Character charval=Character.valueOf(c);
		System.out.println("value of charval= "+charval);
		Short sval=Short.valueOf(s);
		System.out.println("value of sval= "+sval);
		Byte bval=Byte.valueOf(b);
		System.out.println("value of bval= "+bval);
		Long lval=Long.valueOf(l);
		System.out.println("value of lval= "+lval);
		Float fval=Float.valueOf(F);
		System.out.println("value of fval= "+fval);
		Double dval=Double.valueOf(d);
		System.out.println("value of dval= "+dval);
		Boolean boolval=Boolean.valueOf(bool);
                System.out.println("value of boolval= "+boolval);
//Auto unboxing

                System.out.println("============================================================================"+'\n');
		int anew=ival.intValue();
		char cnew=charval.charValue();
		short snew=sval.shortValue();
		byte bnew=bval.byteValue();
		long lnew=lval.longValue();
		float fnew=fval.floatValue();
		double dnew=dval.doubleValue();
		boolean boolnew=boolval.booleanValue();

		System.out.println("value after auto unboxing anew= "+anew);
		System.out.println("value after auto unboxing cnew= "+cnew);
		System.out.println("value after auto unboxing snew= "+snew);
		System.out.println("value after auto unboxing bnew= "+bnew);
		System.out.println("value after auto unboxing lnew= "+lnew);
		System.out.println("value after auto unboxing fnew= "+fnew);
		System.out.println("value after auto unboxing dnew= "+dnew);
		System.out.println("value after auto unboxing boolnew= "+boolnew);

	}
	public static void main(String[] args){
	System.out.println("*******Welcome to Wrapper class program**********");
	Prog8 obj=new Prog8();
	obj.autoboxing();// calling method

	}
}

