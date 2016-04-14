package test;

import javax.swing.JOptionPane;

public class CompoundAccount {
	private double rate ;
 	private double principal ;
 	private int time ;
 	private int count ;
 	
 	public CompoundAccount(String Rate, String Principal, String Time, String Count) {
 		this.rate = Double.valueOf(Rate);
 		this.principal = Double.valueOf(Principal);
 		this.time = Integer.valueOf(Time);
 		this.count = Integer.valueOf(Count);
 	}
 	
 	@SuppressWarnings("static-access")
	public double Account () {
 		double f = 0 ;
   		if (principal > 0  || time > 0 || count > 0|| rate > 0&&rate<1) {
 				rate = Math.pow(1+rate/count, count)-1;
 				f = principal*Math.pow((rate+1), time);
     		} else {
     			
     		}
 		
 		return f;
 	}
}
