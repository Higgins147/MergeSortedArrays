import java.util.Arrays;
public class MergingSortedArrays {

	public static void main(String[] args) {
		
		String [] names1 = {"Alan", "Jim", "Tony"};
		String [] names2 = {"Tom", "Dick", "Harry"};
		
		String [] names3 = new String [names1.length + names2.length];
		int i = 0;
		
		for (i = 0; i <names1.length; i++)
		{
			names3[i] = names1[i];
		}
		
		for (int z = 0; z <names2.length; z++)
		{
			names3[i] = names2[z];
			i++;
		}
		
		Arrays.sort(names3);
		
		for(int t = 0; t < names3.length; t++)
		System.out.println(names3[t]);
	}
}