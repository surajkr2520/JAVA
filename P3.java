package Problem3;
import java.util.*;
class test{
	int countSundays(String startDay, int n ) {
		Map <String,Integer> dayIndex =new HashMap<String,Integer>();
		dayIndex.put("sun",0);
		dayIndex.put("mon", 6);
		dayIndex.put("tue", 5);
		dayIndex.put("wed", 4);
		dayIndex.put("thu",3);
		dayIndex.put("fri",2);
		dayIndex.put("sat",1);
		int daysToFirstsSunday= dayIndex.get(startDay);
		int remainingDay= n-daysToFirstsSunday;
		if(remainingDay<daysToFirstsSunday)
			return 0;
		else {
			int totalSunday=1 +(remainingDay/7);
			return totalSunday;
		}
		
	}
}
public class P3 {

	public static void main(String[] args) {
		
		test t1=new test();
		
		System.out.println(t1.countSundays("mon",40));
        
        //System.out.println(m);

	}

}
