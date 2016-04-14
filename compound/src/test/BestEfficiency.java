package test;

public class BestEfficiency {
	private double earnings ;
 	private double principal ;
 	private int time ;
 	private int count ;
 	
 	public BestEfficiency (String Earnings, String Principal, String Time, String Count) {
 		this.earnings = Double.valueOf(Earnings);
 		this.principal = Double.valueOf(Principal);
 		this.time = Integer.valueOf(Time);
 		this.count = Integer.valueOf(Count);
 	}
	public double Account() {
		double f = 0 ;
 		if (earnings > 0 || time > 0 || principal > 0 || count > 0) {
 			f = count*(Math.pow(Math.pow(earnings/principal, 1.0/time),1.0/count)-1.0);
 
 		} else {
 
 		}
 		return f ;
	}

}
