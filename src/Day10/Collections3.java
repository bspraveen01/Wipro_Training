package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections3 {
    public static void main(String[] args) {
    	ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4000,2500,8000,1000));
    	a.add(1233);
    	a.add(6500);
    	System.out.println(a);
    	Collections.sort(a);
    	System.out.println(a);
    	
    	int b = Collections.binarySearch(a, 6500);
    	System.out.println("Index of 6500 in sorted list:"+b);
    	
    	Collections.reverse(a);
    	System.out.println(a);
    }
}
