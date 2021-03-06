package DecoratorDesignPattern;

public class ChocolateSauce extends IceCreamDecorator {
	IceCream ic = null;
	
	public ChocolateSauce(IceCream i){
		ic =i;
	}
	
	@Override
	public String getDescription() {
		return ic.getDescription() + " with chocolate sauce";
	}
	
	@Override
	public double getCost() {
		return 1.0 + ic.getCost();
	}
}
