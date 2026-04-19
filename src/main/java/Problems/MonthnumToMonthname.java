package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MonthnumToMonthname {

	/* i/p = 10-05-1998 -> o/p = 10-may-1998 */
	public static void main(String[] args) {
		//String str = "10-05-1998";
		HashMap<String,String> map = new HashMap<>();
		map.put("01", "jan");
		map.put("02", "feb");
		map.put("03", "mar");
		map.put("04", "apr");
		map.put("05", "may");
		map.put("06", "jun");
		map.put("07", "jul");
		map.put("08", "aug");
		map.put("09", "sep");
		map.put("10", "oct");
		map.put("11", "nov");
		map.put("12", "dec");
		
		List<String> list = Arrays.asList("10-05-1998","10-05-1998","10-05-1998","10-05-1998");
		
//		String date[] = str.split("-");
//		String day = date[0];
//		//int month = Integer.parseInt(date[1]);
//		String month = date[1];
//		String year = date[2];
		
		for(String d : list) {
		String date[] = d.split("-");
		String day = date[0];
		//int month = Integer.parseInt(date[1]);
		String month = date[1];
		String year = date[2];
		
		
		
		//String month_abb = map.get(month);
		System.out.println(day+"-"+map.get(month)+"-"+year);
	}
	
	}
}
