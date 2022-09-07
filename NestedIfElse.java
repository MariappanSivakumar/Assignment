class NestedIfElse
{
	public static int get()throws java.io.IOException
	{
		return Integer.parseInt((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
	}
	public static void main(String ar[])throws java.io.IOException
	{
		System.out.print("Enter the Age...");
		int age=get();
		if(18<=age&&age<=65)
		{
			System.out.println("Enter the weight");
			if(get()>=48)
			{
				System.out.println("Say Yes(select 1) (or) No(select 0), Should NOT have had any tattoo in last 12 months ");
				if(get()==1)
				{
					System.out.println("Do you have any heart disease. Say yes(select 1) (or) no(select 0)");
					if(get()==0)
					{
						System.out.println("You Are eligible to donate boold.");
					}
					else 
					{
						System.out.println("Sorry, you are not eligible donate boold");
					}
				}else 
				{
					System.out.println("Sorry, You are not Eligible donate Boold.");
				}
			}
			else 
			{
				System.out.println("Sorry, You are not Eligible donate Boold.");
			}
		}
		else 
		{
			System.out.println("Sorry, You are not Eligible donate Boold.");
		}
	}
}
