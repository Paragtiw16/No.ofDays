package pack1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DaysBetween 
{
	public static void main(String args[])
	   {
	 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	 String dateBeforeString = "01 02 2018";
	 String dateAfterString = "20 02 2018";

	 try {
	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
            
	       System.out.println("Number of Days between dates: "+daysBetween);
	 } catch (Exception e) {
	       e.printStackTrace();
	 }
}
}
