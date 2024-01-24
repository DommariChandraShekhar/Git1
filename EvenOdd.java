class EvenOdd
{
	public static void main(String args[])
	{
		int num=10,sum=0;
		int result=(int)Math.pow(num,2);
		for(;result>0;result/=10)
		{
			int rem=result%10;
			sum+=rem;
		}
		if(sum==num)
			System.out.println("Evil number");
		else
			System.out.println("Not an Evil number");
	}
}