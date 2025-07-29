package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNames {
    public static void main(String[] args) {
    	ArrayList<String> sorlist = new ArrayList<>(); 
    	sorlist.add("Praveen");
    	sorlist.add("Likhitha");
    	sorlist.add("Ganesh");
    	sorlist.add("Shruthika");
    	sorlist.add("Sravani");
    	
    	System.out.println("before sort :"+sorlist);
    	
    	Collections.sort(sorlist);
    	
    	System.out.println("After sort : "+sorlist);
    	
    }
}
