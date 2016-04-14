package test;

public class FundAccount {
	private double rate ;
 	private double Principal ;
 	private int time ;
 	public FundAccount (String Rare, String Principal, String Time) {
 		this.rate = Double.valueOf(Rare);
 		this.Principal = Double.valueOf(Principal);
 		this.time = Integer.valueOf(Time);
 	}
 	
 	public double Account () {
 		double f = 0 ;
 		if (rate > 0 || Principal > 0 || time > 0) {
 			rate = rate/12.0;
 			int month = time*12;
 			f = Principal*rate*Math.pow((1.0+rate), month)/(Math.pow(1.0+rate, month)-1);
 
 		} else {
 
 		}
 		
 		return f ;
 	}

}
