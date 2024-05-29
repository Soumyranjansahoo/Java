//Write a program to count total number of notes in given amount
import java.util.Scanner;
public class Prog3{
	void meth1(int amount){
		int n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
		n2000=n500=n200=n100=n50=n20=n10=n5=n2=n1=0;
		if(amount>=2000){
			n2000=amount/2000;
			amount=amount%2000;
			//amount-=n2000*2000;
		}
		if(amount>=500){
                        n500=amount/500;
			amount=amount%500;
                        //amount-=n500*500;
                }
		if(amount>=200){
                        n200=amount/200;
                        amount=amount%200;
			//amount-=n200*200;
                }
		if(amount>=100){
                        n100=amount/100;
                  	amount=amount%100;
			//amount-=n100*100;
                }
		if(amount>=50){
                        n50=amount/50;
                  	amount=amount%50;
		  	//amount-=n50*50;
                }
		if(amount>=20){
                        n20=amount/20;
                        amount=amount%20;
			//amount-=n20*20;
                }
		if(amount>=10){
                        n10=amount/10;
                        amount=amount%10;
			//amount-=n10*10;
                }
		if(amount>=5){
                        n5=amount/5;
                   	amount=amount%5;
		  	//amount-=n5*5;
                }
		if(amount>=2){
                        n2=amount/2;
                        amount=amount%2;
		      //amount-=n2*2;
                }
		if(amount>=1){
                        n1=amount/1;
			amount=amount%1;
                     //   amount-=n1*1;
                }
		System.out.println("Total Number of Notes");
	       	System.out.println("2000 = "+ n2000);
		System.out.println("500 = "+ n500);
		System.out.println("200 = "+ n200);
		System.out.println("100 = "+ n100);
		System.out.println("50 = "+ n50);
		System.out.println("20 = "+ n20);
		System.out.println("10 = "+ n10);
		System.out.println("5 = "+ n5);
		System.out.println("2 = "+ n2);
		System.out.println("1 = "+ n1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an amount");
		int amount=sc.nextInt();
		new Prog3().meth1(amount);
}
}
