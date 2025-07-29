package Day2;

public class Strings {
    public static void main(String[] args) {
    	String str = "Sriram Praveen";
    	System.out.println("Orginal String :"+str); 
    	System.out.println("length :"+str.length());
    	System.out.println("Upper case:"+str.toUpperCase());
    	System.out.println("Lower case :"+str.toLowerCase());
    	System.out.println("sub String(1 to 5 :"+str.substring(1,5));
    	System.out.println("contains :"+str.contains("vee")); // if it is present it returns true.
    	System.out.println("indexOf :"+str.indexOf("vee")); // to get the position of String.
    	
    	// String Comparison
    	String s1 = "Listen";
    	String s2 = "Listen";
    	String s3 = new String("Listen");
    	System.out.println("using equals opeartor :"+ (s1==s2)); // this operator checks hashcode.
    	System.out.println("using equals opeartor :"+ (s2==s3));
    	System.out.println("using equals opeartor :"+ (s1.equals(s2))); // this method checks content of the string.
    	System.out.println("using equals opeartor :"+ (s1.equals(s3)));
    	
    	// String buffer 
    	
    	StringBuffer sc = new StringBuffer("praveen");
    	sc.append(" BSRP"); // it will attach string at last.
    	
    	sc.insert(0, "Sriram "); // position number and text.
    	System.out.println(sc);
    	sc.replace(0, 6, "program"); //0-6 inplace replace this.
    	sc.reverse();
    	System.out.println(sc);
    	sc.delete(0, 8);
    	System.out.println(sc);
    	System.out.println();
    	
    	StringBuffer sb = new StringBuffer("this is praveen");
    	System.out.println("reverse :"+sb.reverse());
    	
    	
    	// Replace all spaces with --
    	String sr = "Sriram praveen B";
    	String res = sr.replace(" ", "-");
    	System.out.println("replaced:"+res);
    	
    	// Insert Text into a String using StringBuffer
    	StringBuffer sbs = new StringBuffer("learning java");
    	sbs.insert(9,"with chatGpt");
    	System.out.println(sbs);
    	
    	
    	
    }
}
