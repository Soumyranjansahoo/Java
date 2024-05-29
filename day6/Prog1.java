//Write a program to count total number of notes in given amount
import java.util.Scanner;
public class Prog1{
	public static void main(String []args){
		System.out.println("enter any amount to view the notes");
		 Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		int n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
		n2000=n500=n200=n100=n50=n20=n10=n5=n2=n1=0;
		if(amount>=2000){
			n2000=amount/2000;
			amount=amount%2000;
			System.out.println("2000 note = "+n2000);
		}
		if (amount>=500)
		{
			n500=amount/500;
                        amount=amount%500;
                        System.out.println("500 note = "+n500);
		}
		 if(amount>=200){
                        n200=amount/200;
                        amount=amount%200;
                        System.out.println("200 note = "+n200);
                }
		 if(amount>=100){
                        n100=amount/100;
                        amount=amount%100;
                        System.out.println("100 note = "+n100);
                }
		 if(amount>=50){
                        n50=amount/50;
                        amount=amount%50;
                        System.out.println("50 note = "+n50);
                }
		 if(amount>=20){
                        n20=amount/20;
                        amount=amount%20;
                        System.out.println("20 note = "+n20);
                }
		 if(amount>=10){
                        n10=amount/10;
                        amount=amount%10;
                        System.out.println("10 note = "+n10);
                }

		 if(amount>=5){
                        n5=amount/5;
                        amount=amount%5;
                        System.out.println("5 note = "+n5);
                }
		 if(amount>=2){
                        n2=amount/2;
                        amount=amount%2;
                        System.out.println("2 note = "+n2);
                }
		 if(amount>=1){
                        n1=amount/1;
                        amount=amount%2000;
                        System.out.println("1 note = "+n1);
                }
		else 
			System.out.println("You are entered a invalid number!!");
	}
}


