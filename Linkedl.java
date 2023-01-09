package NewGitPra.NewGitPra;

import java.util.LinkedList;
import java.util.List;

public class Linkedl {

	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		LinkedList<Integer> list1=new LinkedList<>(list);
		list1.add(60);
		list1.add(40);
		list1.add(30);
		list1.add(20);
		list1.add(50);
		System.out.println(list1);
		
		list1.add(2, 100);
		System.out.println(list1);
		System.out.println(list1.contains(100));
		System.out.println(list1.get(2));
		System.out.println(list1.indexOf(100));
		System.out.println(list1.lastIndexOf(50));
		list1.remove(2);
		System.out.println(list1);
		System.out.println(list1.size());
		list1.set(2, 100);
		System.out.println(list1);
		list1.addFirst(200);
		System.out.println(list1);
		
	}

}
