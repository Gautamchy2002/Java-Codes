public class ArrayEx6 {
	public static void main(String[] args) {
		int a[]=new int[]{8,3,10,5,7,2,4,5,1,5};
		
		System.out.println(a[5]);
		
		show(a);
		
		System.out.println(a[5]);
	}
	static void show(int a[]) {
		a[5]=9000;
		for(int x:a) {
			System.out.println(x);
		}
	}
}