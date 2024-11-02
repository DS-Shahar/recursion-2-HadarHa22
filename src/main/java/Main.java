import java.util.*;
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] arr = {1,2,-5,12};
		//System.out.println(q14(arr,arr.length-1));
		
		//System.out.println(q15(arr,arr.length-1));
		
		//System.out.println(q16(arr,-5,arr.length-1));
		
		//System.out.println(q17(arr,arr.length-2));
		
		System.out.println(q18(arr,arr.length-1));
	}
    // Q8 again so i can use it in q18
	public static boolean q8(int n, int d) {
		if (n < 2 || n%d==0) {
			return false;
		}
		if (d>=Math.sqrt(n)) {
			return true;
		}
		return q8(n,d+1);
	}
	// =====================================
	
	
	public static int q14(int [] a, int i) {
		if (i==-1) {
			return 0;
		}
		return q14(a, i-1)+a[i];
	}
	
	public static int q15(int [] a, int i) {
		if (i==-1) {
			return 0;
		}
		if (a[i]>0) {
			return 1+q15(a, i-1);
		}
		return q15(a, i-1);
	}
	
	public static int q16(int [] a, int n, int i) {
		if (i==-1) {
			return -1;
		}
		if (a[i] == n) {
			return i;
		}
		return q16(a, n, i-1);
	}
	
	public static boolean q17(int [] a, int i) {
		if (i==-1) {
			return true;
		}
		if (a[i]>a[i+1]) {
			return false;
		}
		return q17(a,i-1);
	}
	
	public static boolean q18(int [] a, int i) {
		if (i==-1) {
			return true;
		}
		if (q8(a[i],2)) {
			return false;
		}
		return q18(a,i-1);
	}
	
	
}