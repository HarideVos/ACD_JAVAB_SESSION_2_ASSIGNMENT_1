
public class MaxofThree {
	public static void main(String[] args) {
    int num1 = 35;
    int num2 = -36;
    int num3 = 24;
    if (num1 >= num2 && num1 >= num3)
       System.out.println( num1 + " is the highest number.");
    else if (num2 >= num1 && num2 >= num3)
       System.out.println( num2 + " is the highest number.");
    else
       System.out.println( num3 + " is the highest number.");
	}
}
