public abstract class Restaurant extends Store{
	

	
	double service;
	double flavor;
	double clean;
	
	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		super(name, event, price);
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	@Override
	public double grade() {
		double result = 0;
		result = Math.round((service+flavor+clean+ getPrice())*100/100.0)/4;
		
		return result;
	}
}
