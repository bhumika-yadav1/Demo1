package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDateFormat {
	

	
		public static void main(String[] args) {
			
			Date d = new Date();
			System.out.println(d);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM");
			System.out.println(sdf.format(d));
			
			SimpleDateFormat a = new SimpleDateFormat("dd.MM.yy");
			System.out.println(a.format(d));
			
			SimpleDateFormat b = new SimpleDateFormat("h.mm a");
			System.out.println(b.format(d));
			
			SimpleDateFormat c = new SimpleDateFormat("H.mm");
			System.out.println(c.format(d));
			
			SimpleDateFormat e = new SimpleDateFormat("H.mm:ss:SSS");
			System.out.println(e.format(d));
			
			SimpleDateFormat f = new SimpleDateFormat("K:mm a,z");
			System.out.println(f.format(d));
			
			SimpleDateFormat g= new SimpleDateFormat("yyyy.MMMMM.dd GGGG hh:");
			System.out.println(f.format(d));
			
			
			
		
			Date d1 = sdf.parse(d);
			
			System.out.println(d1);			;
					
		}
		}


