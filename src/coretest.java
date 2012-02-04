
public class coretest {
	public static void main (String [] args)
	{
		int numberofcores = 0;
		numberofcores = Runtime.getRuntime().availableProcessors();
		System.out.println(numberofcores);
		int num = 0, counter = 0;
		for (int i = 0; i <= 100; i++)
		{
			num += i;
			counter++;
		}
		double avg = num /counter;
		System.out.println(avg);
	}

}
