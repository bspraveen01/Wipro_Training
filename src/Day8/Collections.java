package Day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
    	Collection<Integer> ct = new ArrayList<Integer>();
    	ct.add(10);
    	ct.add(11);
    	ct.add(12);
    	ct.add(13);
    	
    	for(Object i :ct) {
    		int data = (Integer)i; // i object is integer.
    		System.out.println(data);
    	}
    	System.out.println();
    	
    	// list  : it accepts duplictaes. it implements the list  classes.
    	List<Integer> dt = new ArrayList<>();
    	dt.add(23);
    	dt.add(25);
    	dt.add(50);
    	dt.add(34);
    	System.out.println(dt.get(0));
    	System.out.println(dt.indexOf(50)); 
    	
    	// set : 
    	Set setdata = new HashSet<>();
    	setdata.add(10);
    	setdata.add("hello");
    	setdata.add(10);
    	setdata.add(98);
    	setdata.add("hello");
    	setdata.add(16);
    	System.out.println(setdata);
    	Iterator<Integer> iterator = setdata.iterator();
    	while(iterator.hasNext()) {
    		System.out.println(iterator.next());
    	}
    	
    	System.out.println();
    	
    	//Map
    	Map<Character, Integer> mapdata = new HashMap();
    	mapdata.put('A', 65);
    	mapdata.put('B', 57);
    	mapdata.put('C', 68);
    	mapdata.put('D', 69);
    	mapdata.put('E', 70);
    	System.out.println(mapdata.keySet());
    	System.out.println(mapdata.values());
    	for(Object key : mapdata.keySet()) { // data it has to develop an object.
    		System.out.println(key+":"+mapdata.get(key));
    	}
    	
    	
    	
    }

	public static void sortList(List<Comparable_Ex> a) {
		// TODO Auto-generated method stub
		
	}

	

}
