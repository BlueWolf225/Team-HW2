import java.util.Scanner;

public class TempConversion {
	
	public static void main(String[] args)
	{
		
		double[] fahrList = new double[6];
		double[] celsList = new double[6];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter fahrenheit temperature: ");
		fahrList[0] = input.nextDouble();
		
		for(int i = 1; i<6; i++)
		{
			fahrList[i] = fahrList[i-1] + 5;
			
		}
		for (int i = 0; i<5; i++)
		{
			System.out.print(fahrList[i] + " ");
		}
		System.out.println();
		System.out.println("Enter celsius temperature: ");
		celsList[0] = input.nextDouble();
		
		for (int i = 1; i<6; i++)
		{
		celsList[i] = celsList[i-1] + 5;
		System.out.print(celsList[i] + " ");
		}
		
	}

}
