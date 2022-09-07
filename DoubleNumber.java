class DoubleNumber
{
	public static void main(String ar[])throws java.io.IOException
	{
		System.out.println("Enter the Starting Number and How many time loop can excuted...:");
		long doublesestnumber=Integer.parseInt((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		long indexnumber=Integer.parseInt((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		for(;(--indexnumber)!=0;doublesestnumber*=2);
			System.out.println("The Answer is...: "+doublesestnumber);
	}
}
