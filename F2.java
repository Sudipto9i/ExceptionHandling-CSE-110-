//Welcome to Exception Handling in OOP
//An exception is an event that disrupts the normal flow of a program.
//It occurs when something unexpected happes(Ex-Divided by zero , File not found).
//Keyword(Try-Code that might throw an exception , Catch - Handles the exception , Finally - Executes Always , Throw - Throws a single exception manually , Throws - Decleare exceptions in method signature)
//try(ArithmeticException , NullPointerException )
//Ex-1(ArithmeticException)
/*
public class F2{
	public static void main(String[]args){
		try{
			int a = 25 ;
			int b = 5;
			int result = a / b;
			System.out.println("Result : "+result);
		}
		catch(ArithmeticException e ){
			System.out.println("Divided by zero .");
		}
	}
}
//EX-2(NullPointerException)
public class F2{
	public static void main(String[]args){
		try{
			String text = "Alone in Space";
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println("You didn't submit any kind of text.");
		}
	}
}

//KeyWord(finally-Executes Always)
public class F2{
	public static void main(String[]args){
		try{
			int a = 36 ;
			int b = 6;
			int result = a/b;
			System.out.println("Result :"+result);
		}
		catch(ArithmeticException e ){
			System.out.println("U handles the exception.");
		}
		finally{
			System.out.println("Finally u done .");
		}
	}
}

//KeyWord(throw-Throws an exception manually)
public class F2{
	public static void main(String[]args){
		int age = 19;
		if(age<18){
			throw new ArithmeticException("U are too young .");
		}
		System.out.println("Access Granted.");
	}
}
*/
//KeyWord(throws- Declare exception in method signature)
import java.io.*;
public class F2{
	static void readFile() throws IOException{
		FileReader fr = new FileReader("file.txt");
		fr.read();
	}
	public static void main(String[]args){
		try{
			readFile();
		}
		catch(IOException e){
			System.out.println("File error happened."+e);
		}
	}
}















