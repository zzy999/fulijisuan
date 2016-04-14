package test;

public class YearAccount {
	private double rate ;
 	private double num ;
 	private int time ;
 	
 	public YearAccount(String Rate, String Investment, String Time) {
 		this.rate = Double.valueOf(Rate);
 		this.num = Double.valueOf(Investment);
 		this.time = Integer.valueOf(Time);
 
 	}
 	public double Account () {
 		double f = 0 ;
   		if (num > 0 && rate > 0 && time > 0) {
   			f = num * (1.0 + rate) * (-1 + Math.pow(1.0 + rate, time)) / rate;
     		} else {
     			
     		}
 		
 		return f;
 	}

}
