package test;

public class TimeAccount {
	private double rate ;
 	private double principal ;
 	private double sum ;
 	private int count ;
 	
 	public TimeAccount(String Rate, String Principal, String Earnings, String Count) {
 		this.rate = Double.valueOf(Rate);
 		this.principal = Double.valueOf(Principal);
 		this.sum = Double.valueOf(Earnings);
 		this.count = Integer.valueOf(Count);
 	}
 
 	public int Account () {
 		int t = 0 ;
    		if (sum > 0 || rate > 0 || principal > 0 || count > 0) {
 				rate = Math.pow(1+rate/count, count)-1;
 				t = (int)(Math.log(sum/principal)/Math.log(1+rate));
     			
     		} else {
     			
     		}
 		return t ;
 	}
}
