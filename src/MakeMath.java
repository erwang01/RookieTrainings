
public class MakeMath {
	public static void main(String []args) {
		// create an array with 4 indexes
		int [] array = {0,1,2,3};
		// create a for loop that while i is less than the 
		// yourArray.length, then it will set the element to i at 
		// the index of yourArray that is equal to i
		// During this, print your array
		for(int i=0;i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("onto next");
		
		// for each in yourArray, add 1
		// During this, print yourArray
		for(int i=0;i < array.length; i++)
		{
			array[i] += 1;
			System.out.println(array[i]);
		}
		
		System.out.println("onto next");
		
		// create an integer x with value 0
		// while x is less than yourArray, add one to x
		// during this, print x
		for(int x = 0; x < array.length; x++)
		{
			System.out.println(x);
		}
		
		System.out.println("onto next");
		
		// for each element in yourArray
		// if each is less than 0 print blah
		// else if each is less than 1 print bleh
		// else if each is less than 2 print blooh
		// else print raaaaawr
		for(int i=0;i < array.length; i++)
		{
			if(array[i]<0)
				System.out.println("blah");
			else if(array[i]<1)
				System.out.println("bleh");
			else if(array[i]<2)
				System.out.println("blooh");
			else
				System.out.println("raaaaawr");
		}

		System.out.println("Done!");
		
		// after running, it should look something like:
		// 0
		// 1
		// 2
		// 3
		// onto next
		// 1
		// 2
		// 3
		// 4
		// onto next
		// 0
		// 1
		// 2
		// 3
		// onto next
		// bleh
		// blooh
		// raaaaawr
		// raaaaawr
		// Done!
	}
}
