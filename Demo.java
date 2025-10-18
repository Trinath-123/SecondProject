class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=2; i<100; i++)
		{
			for(int j=2; j<100; j++)
			{
				if(i%j==0 && i!=0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i + "is a prime number");
			}
		}

	}

}