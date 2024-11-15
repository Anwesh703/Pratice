package AutomationTestingTraining.ProgramsAndCollections;

public class ContinuesMaxChar {
	public static void main(String[] args) {
		String str = "ggggggjjjjjjjjggkkkkkffkkkffffff";
		maxContinuesChar(str);
		double[] prices = {3.4,2.5,1.2,3.2,7.5,2.2};
		stockExchange(prices);
	}
	public static void maxContinuesChar(String str) {
		char maxChar = str.charAt(0);
		int maxCount = 1;
		int currentCount = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				currentCount++;
			}else {if(currentCount>maxCount){
				maxCount = currentCount;
				maxChar = str.charAt(i-1);			
			}currentCount = 1; 
			}				
		}
		if(currentCount>maxCount) {
			maxCount = currentCount;
			maxChar = str.charAt(str.length()-1);
		}
		System.out.println(maxChar + " "+ maxCount);
		}
	public static void stockExchange(double[] prices) {
		if(prices == null || prices.length<2) {
			System.out.println("given data is not valid for stock ");
		}
		double maxProfit = 0;
		double minPrice = prices[0];
		int buyDay = 0;
		int sellDay = 0;
		int minIndex =0;
	for(int i=1;i<prices.length;i++) {
		if(prices[i]<minPrice) {
			minPrice = prices[i];
			//3.4,2.5,1.2,3.2,7.5,2.2
			minIndex = i;
		}
		else {
			double profit = prices[i]-minPrice;
			if(profit>maxProfit) {
				maxProfit = profit;	
				buyDay = minIndex;
				sellDay = i;
			}
		}
	}
	System.out.println("the stock bought day is "+buyDay+" at price of "+prices[buyDay]+
			" and sold at day "+sellDay+" at price of "+prices[sellDay]+" for profit of "+maxProfit);
	}
}
