
public class Student{
	public Student(){
	System.out.println("Unknown user");
	}
	public Student(String s){
	System.out.println("The user name in "+s);
	}
	public static void main(String []args){
	new Student();
	new Student("rama");
	}
}
