package Day4;

public class Timeprogram {
  public static void main(String[] args) {
	  String[] tasks = {
			  "do tasks",
			  "pratice java problems",
			  "lunch break",
			  "pratice problems",
			   "movies"
	  };
	  
	  double[] time= {11.00,12.00,13.00,15.00,18.00};
	  String period="";
	  for(int i=0;i<time.length;i++) {
		  int hour = (int)time[i]; // Convert 24-hour time to 12-hour format with AM/PM
		  if(hour>=12) {
			  period="pm";
			  if(hour>12) {
				  hour-=12;
			  }
		  }else {
			  period ="am";
			  if(hour==0) {
				  hour=12;
			  }
		  }
		  
		  System.out.println("tasks  :"+tasks[i]);
		  System.out.println("tasks time:"+time[i]);
		  System.out.println();
	  }
  }
}
