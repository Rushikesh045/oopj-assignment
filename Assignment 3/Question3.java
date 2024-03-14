package Assignment_3;

public class Question3 {

	public static void main(String[] args) {
		int iValue = 24;
        double dValue = 19.5;
        float fValue = 23.14f;

        double result1 = iValue + dValue; 
        float result2 = fValue + iValue; 
        double result3 = dValue + fValue; 

        double result4 = dValue - iValue; 

        double result5 = iValue * fValue; 
        double result6 = dValue * fValue; 

        double result7 = dValue / iValue; 
        float result8 = fValue / iValue; 
        double result9 = dValue / fValue; 

        System.out.println("Addition Results:");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("\nSubtraction Result:");
        System.out.println(result4);

        System.out.println("\nMultiplication Results:");
        System.out.println(result5);
        System.out.println(result6);

        System.out.println("\nDivision Results:");
        System.out.println( result7);
        System.out.println(result8);
        System.out.println(result9);
	}

}
