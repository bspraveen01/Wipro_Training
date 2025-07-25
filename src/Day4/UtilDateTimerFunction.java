package Day4;

//Import required Java time classes
import java.time.LocalTime;                    // For representing time (hours & minutes)
import java.time.format.DateTimeFormatter;     // For formatting time into a human-readable format

public class UtilDateTimerFunction {

 // Main method – entry point of the program
 public static void main(String[] args) {

     // Array of tasks (To-Do list)
     String[] list = new String[]{
         "Attend Sprint meeting",
         "Discuss about today story points",
         "Coding",
         "Lunch",
         "Debug the code",
         "KT session",
         "Scrum Meeting"
     };

     // Array of corresponding times for each task
     LocalTime[] time = new LocalTime[]{
         LocalTime.of(10, 0), // 10:00 AM
         LocalTime.of(11, 0), // 11:00 AM
         LocalTime.of(12, 0), // 12:00 PM
         LocalTime.of(13, 0), // 1:00 PM
         LocalTime.of(14, 0), // 2:00 PM
         LocalTime.of(15, 0), // 3:00 PM
         LocalTime.of(16, 0)  // 4:00 PM
     };

     // Get the length of task list and time array
     int n = list.length;
     int k = time.length;

     // Loop through both arrays simultaneously
     for (int i = 0; i < n && i < k; i++) {
         // Print formatted time and corresponding task
         // Pattern(time[i]) will convert time to format like "10:00 AM"
         System.out.println(Pattern(time[i]) + " - " + list[i]);
     }
 }

 // Static method to format LocalTime into a string like "10 : 00 AM"
 public static String Pattern(LocalTime time) {
     // Define a time format pattern (12-hour format with AM/PM)
     DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("hh : mm  a");

     // Return the time formatted as string
     return time.format(ofPattern);
 }
}
