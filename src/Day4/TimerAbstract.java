package Day4;

import java.util.ArrayList;

abstract class TimerAbstract11 {
     abstract void remindTask();
}
class Schedule1 extends TimerAbstract11{

	@Override
	void remindTask() {
		ArrayList<String> tasks = new ArrayList<>();
		tasks.add("wakeup");
		tasks.add("freshup");
        tasks.add("joining into class");
        tasks.add("lunch break");
        tasks.add("pratice java programs");
        
        double[] times = {7.00,8.00,9.00,12.00,3.00};
        for(int i=0;i<tasks.size();i++) {
        	 String period = (times[i] >= 1 && times[i] <= 9) || times[i] > 12 ? "AM" : "PM";
             
 			System.out.printf("Time: %.2f %s\n", times[i], period);
            System.out.println(" Task: " + tasks.get(i));
        }
        
	}
	
}
public class TimerAbstract{
	public static void main(String[] args) {
		TimerAbstract11 abst = new Schedule1();
		abst.remindTask();
	}
}