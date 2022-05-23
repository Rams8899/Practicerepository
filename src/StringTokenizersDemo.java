import java.util.*;
public class StringTokenizersDemo {
	public static int getsum(String s) {
		
		int sum=0;
		
		StringTokenizer obj=new StringTokenizer(s);
		while(obj.hasMoreTokens()) {
			
			int n=Integer.parseInt(obj.nextToken());
			sum+=n;
		}
		return sum;
	}
	public static void main(String[] args) {
		int result=getsum("2 3 4 6");
		System.out.println(result);
		
	}

}
