class ChessBoard
{
	public static void main(String ar[])throws java.io.IOException
	{
		java.math.BigInteger number=new java.math.BigInteger("1");
		java.math.BigInteger sumofthenumber=new java.math.BigInteger("1");
		int decre=64;
		for (; (decre--)!=1; number=number.add(number),sumofthenumber=number.add(sumofthenumber));
        System.out.println(sumofthenumber);
	}
}
