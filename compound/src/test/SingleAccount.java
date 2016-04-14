package test;

public class SingleAccount {
	private double rate ;
 	private double principal ;
 	private int time ;
 	@SuppressWarnings("unused")
	private int sum ;
 	public SingleAccount(String Rate, String Principal, String Time) {
 		this.rate = Double.valueOf(Rate);
 		this.principal = Double.valueOf(Principal);
 		this.time = Integer.valueOf(Time);
 	}
 	
 	public double Account () {
 		double f = 0;
 		if(rate > 0 && principal > 0 && time > 0) {
 		double nlx = principal*rate;
 		f = nlx*time + principal;
 		} else {
 			//彈出窗口，提示用戶輸入錯誤；
 		}
 		return f ;
 		
 	}

}
