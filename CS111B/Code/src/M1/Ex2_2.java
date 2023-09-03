package M1;

/*Program to take the input of two numbers, then find and display their sum*/


public class Ex2_2 {
	public static void main(String[] args) {
		int num1=10, num2; //data type, varname1, varname2, initial val,...;
		num2=25; //assignment statement variable name-value;
		System.out.println("Number 1 = " + num1); // + is concatenation operator
		System.out.println("Number 2 = " + num2); //implicit conversion
		num1=100;
		num2=num1+10; //+ addition operator
		System.out.println("Number 1 = " + num1); // concatenation with +
		System.out.println("Number 2 = " + num2); // implicit conversion
		int sum=num1+num2;
		System.out.println("Sum= " + sum);
	}
}