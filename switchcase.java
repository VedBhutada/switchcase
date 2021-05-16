import java.util.Scanner;
public class switchcase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE \n1. TO PRINT HII!!\n2. TO PRINT HELLO!!\n3. TO PRINT HEY!! ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("HII!!");
				   break;
			case 2:System.out.println("HELLO!!");
				   break;
			case 3:System.out.println("HEY!!");
			       break;
	        default:System.out.println("INCORRECT CHOICE");
		}

	}

}
