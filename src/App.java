
public class App {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 3.49;
		double moneyInWallet = 153.20;
		int thirstLevel = 8;
		
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk * 2);

	}

}
