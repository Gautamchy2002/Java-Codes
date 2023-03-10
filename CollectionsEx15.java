import java.util.*;

public class CollectionsEx15 {

	public static void main(String[] args) {
		int a[]= {2,8,4,5,2,1,5,1,5,245,5,5,7};
		
		//only sorting
//		Arrays.sort(a);
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
		
		//sorting and remove duplicates
		TreeSet<Integer> t=new TreeSet();
		for (int i : a) {
			t.add(i);
		}
		System.out.println(t);
		
		//converting TreeSet Collection to int Array
		a=new int[t.size()];
		Iterator<Integer> i=t.iterator();
		for(int x=0;i.hasNext();x++) {
			a[x]=i.next();
		}
		for(int x:a) {
			System.out.println(x);
		}
	}

}