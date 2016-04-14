package test;

public class PrincipalAccount {
	private double rare ;
 	private double sum ;
 	private int time ;
 	private int count ;
 	
 	public PrincipalAccount (String Rare, String Profit, String Time, String Count) {
 		this.rare = Double.valueOf(Rare);
 		this.sum = Double.valueOf(Profit);
 		this.time = Integer.valueOf(Time);
 		this.count = Integer.valueOf(Count);
 	}
 	
 	public double Account () {
 		double f = 0 ;
    		if (sum > 0 || rare > 0 || time > 0 || count > 0) {
 				rare = Math.pow(1+rare/count, count)-1;
 				f = sum/Math.pow((rare+1), time);
 
     		} else {
     			
     		}
 		return f ;
 	}

}
