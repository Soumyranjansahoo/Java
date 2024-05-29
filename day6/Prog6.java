//Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
import java.util.Scanner;
public class Prog6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your unit for know your bill amount");
		int unit=sc.nextInt();
		double amount;
		if(unit<=50){
			amount=unit*0.50;
			amount+=(amount*20)/100;

			System.out.println("the Total electricity bill = "+amount);
		}
		else if(unit>50 && unit<=200)
		{
			unit=unit-50;
			amount=(50*0.50)+(unit*0.75);

			amount+=(amount*20)/100;
			System.out.println("the Total electricity bill = "+amount);
		}
		 else if(unit>=200 && unit<=450)
                {
                        unit=unit-200;
                        amount=(50*0.50)+(0.75*150)+(unit*1.20);
			amount+=(amount*20)/100;

                        System.out.println("the Total electricity bill = "+amount);
                }
		else if(unit>=450)
                {
                        unit=unit-450;
                        amount=(50*0.50)+(0.75*150)+(250*1.20)+(unit*1.50);
			amount+=(amount*20)/100;	
                        System.out.println("the Total electricity bill = "+amount);
                }
		else 
			System.out.println("this is not a valid entry");
	}
}

		
