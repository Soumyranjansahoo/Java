public class ClassF{
	public static void main(String[] args){
	int a=10,b=20,c=30;
	System.out.println(a>b||a<c);//false || true = true  
	System.out.println(a>b|a<c);//false | true = true  
	//|| vs |  
	System.out.println(a<b||a++<c);//true || true = true
        System.out.println(a);//11 because second condition is not  checked
	System.out.println(a>b||a++<c);//false || true = true  
	System.out.println(a);//11 because second condition is  checked  
	System.out.println(a<b|a++<c);//true | true = true  
	System.out.println(a);//12 because second condition is checked	
	
	
	}
}
