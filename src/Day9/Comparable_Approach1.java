package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Approach1 implements Comparable<Student> {

	public static void main(String[] args) {
		Comparator<Integer> c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if(i > j) 
					return 1;
				else
					return -1;
			}
			
		};
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(98);
		list1.add(26);
		list1.add(76);
		list1.add(33);
		list1.add(12);
		System.out.println(list1);
		
		Collections.sort(list1, c1);
		
		System.out.println(list1);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
