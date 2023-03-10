import java.util.*;

public class CollectionsEx14 {

	public static void main(String[] args) {
		HashSet<String> a=new HashSet();
		a.add("ram");
		a.add("suresh");
		a.add("rohan");
		a.add("sohan");
		a.add("mohan");
		System.out.println(a);
		Iterator<String> i=a.iterator();
		while (i.hasNext()) {
			String b=i.next();
			if(b.startsWith("s")) {
				i.remove();
			}
		}
		System.out.println(a);
	}

}