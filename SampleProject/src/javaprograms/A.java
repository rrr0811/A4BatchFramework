package javaprograms;

public class A {
	
	public static int sumInRange(int start, int end)
	{
		if(start>end)
			return 0;
		else
			return start+sumInRange(start+1,end);
	}
	public static void main(String[] args) {
		System.out.println(sumInRange(1,5));
	}
}
