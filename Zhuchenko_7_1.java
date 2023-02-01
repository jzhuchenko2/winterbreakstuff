public class Zhuchenko_7_1{
   private int hours;
   private int minutes;
   public Zhuchenko_7_1() {
       this.hours = 0;
       this.minutes = 0;
   }
   public Zhuchenko_7_1(int hours, int minutes) {
       super();
       if (isValid(hours, minutes))
       this.hours = hours;
       this.minutes = minutes;
   }
   public boolean isValid(int hour, int minute) {
       if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
           return true;}
         else {
           return false;
       }
   }
   public int getHours() {
       return hours;
   }
   public int getMinutes() {
       return minutes;
   }
   public void setTime(int hour, int minute) {
       if (isValid(hour, minute)) {
           this.hours = hour;
           this.minutes = minute;
       }
   }
   public String getTime24() {
       String time24 = "";
       if (hours < 10 && minutes < 10) {
           time24 = "0" + hours + ":" + "0" + minutes;
       } else if (hours > 10 && minutes < 10) {
           time24 = hours + ":" + "0" + minutes;
       }
       if (hours < 10 && minutes > 10) {
           time24 = "0" + hours + ":" + minutes;
       } else {
           time24 = "" + hours + ":" + minutes;
       }
       return time24;
   }
   public String getTime12() {
       String time12 = "";
       if (hours == 0 && minutes < 10) {
           time12 = 12 + ":" + "0" + minutes + " am";
       } else if (hours == 0 && minutes > 10) {
           time12 = 12 + ":" + minutes + " am";
       } else if (hours > 12 && minutes < 10) {
           time12 = (hours - 12) + ":0" + minutes + " pm";
       } else if (hours > 12 && minutes > 10) {
           time12 = (hours - 12) + ":" + minutes + " pm";
       } else if (hours < 12 && minutes < 10) {
           time12 = "0" + hours + ":" + "0" + minutes + " am";
       } else if (hours < 12 && minutes > 10) {
           time12 = "0" + hours + ":" + minutes + " am";
       }
       return time12;
   }
}