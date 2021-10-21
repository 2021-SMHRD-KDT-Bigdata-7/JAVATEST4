
public class Salon extends Store{

	double technology;
	double kindness;
	
	public Salon(String name, String event, double price, double technology, double kindness) {
		super(name, event, price);
		this.technology = technology;
		this.kindness = kindness;
	}

	@Override
	public double grade() {
		double result = ((technology + kindness + getPrice())*100/100.0)/3;
		return result;
	}
	
	
	
}