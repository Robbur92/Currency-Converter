package application;

public class Converter {
	
	public double Calculate(double currency, String from, String to) {
		
		if(from=="USD") {
			if(to=="EURO") {
				return currency * 0.8498;
			}
			else if(to=="GBP")
			{
				return currency * 0.7581;
			}
			else if(to=="INR") {
				return currency * 72.685;
			}
			else if(to=="AUD") {
				return currency * 1.3789;
			}
			else if(to=="CAD") {
				return currency * 1.2953;
			}
			else if(to=="NOK") {
				return currency * 8.12942;
			}
		}
		
		if(from=="EURO") {
			if(to=="USD") {
				return currency * 1.176651;
			}
			else if(to=="GBP")
			{
				return currency * 0.8920;
			}
			else if(to=="INR") {
				return currency * 85.5248;
			}
			else if(to=="AUD") {
				return currency * 1.62251;
			}
			else if(to=="CAD") {
				return currency * 1.52411;
			}
			else if(to=="NOK") {
				return currency * 9.56549;
			}
					
		}
		
		if(from=="GBP") {
			if(to=="USD") {
				return currency * 1.3190;
			}
			else if(to=="EURO")
			{
				return currency * 1.1210;
			}
			else if(to=="INR") {
				return currency * 95.877;
			}
			else if(to=="AUD") {
				return currency * 1.81892;
			}
			else if(to=="CAD") {
				return currency * 1.7086;
			}
			else if(to=="NOK") {
				return currency * 10.7234;
			}
			
		}
		
		if(from=="INR") {
			if(to=="USD") {
				return currency * 0.013758;
			}
			else if(to=="EURO")
			{
				return currency * 0.0116925;
			}
			else if(to=="GBP") {
				return currency * 0.0104299413;
			}
			else if(to=="AUD") {
				return currency * 0.0189713;
			}
			else if(to=="CAD") {
				return currency * 0.0178207;
			}
			else if(to=="NOK") {
				return currency * 0.111844565;
			}
			
		}
		
		if(from=="AUD") {
			if(to=="USD") {
				return currency * 0.7252;
			}
			else if(to=="EURO")
			{
				return currency * 0.61632;
			}
			else if(to=="GBP") {
				return currency * 0.54977;
			}
			else if(to=="INR") {
				return currency * 52.711;
			}
			else if(to=="CAD") {
				return currency * 0.9393;
			}
			else if(to=="NOK") {
				return currency * 5.89545565;
			}
			
		}
		
		if(from=="CAD") {
			if(to=="USD") {
				return currency * 0.772022;
			}
			else if(to=="EURO")
			{return currency * 0.65611;
				
			}
			else if(to=="GBP") {
				return currency * 0.585269;
			}
			else if(to=="INR") {
				return currency * 56.1144;
			}
			else if(to=="AUD") {
				return currency * 1.064564;
			}
			else if(to=="NOK") {
				return currency * 6.27609;
			}
			
		}
		
		if(from=="NOK") {
			if(to=="USD") {
				return currency * 0.12301;
			}
			else if(to=="EURO")
			{
				return currency * 0.104542468;
			}
			else if(to=="GBP") {
				return currency * 0.093253;
			}
			else if(to=="INR") {
				return currency * 8.94097;
			}
			else if(to=="AUD") {
				return currency * 0.16969;
			}
			else if(to=="CAD") {
				return currency * 0.159334;
			}
			
		}
		return 0.0;
	}
}