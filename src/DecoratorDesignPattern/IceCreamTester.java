package DecoratorDesignPattern;

public class IceCreamTester {
	public static void main(String[] args) {
		//Order one mango ice cream in cone
		IceCream mango = new MangoIceCream();
		mango = new Cone(mango);
		System.out.println("Your order is ready: " + mango.getDescription());
		System.out.println("Please pay: $" + mango.getCost());
		
		//order strawberry ice cream with double scoop and chocolate sauce and in cone
		IceCream sb = new StrawberryIceCream();
		sb = new DoubleScoop(sb);
		sb = new ChocolateSauce(sb);
		sb = new Cone(sb);
		System.out.println("Your order is ready: " + sb.getDescription());
		System.out.println("Please pay: $" + sb.getCost());

	}
}
