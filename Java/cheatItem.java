
/*you have an array of items that a store has for sale
String[] items
and their corresponding prices
float[] price
ok?
now, a particular employee sold some of the items from the store
but the problem is, the employee might have cheated and changed the prices
String[] origItems, float[] origPrices -> original items and their corresponding prices set by the store
String[] items, float[] prices -> the items and their corresponding prices that the employee sold
you need to find how many items the employee "cheated on"
in other words, on how many items he sold them for a price that is different from the store's price*/

import java.util.Arrays;

public class cheatItem {
	static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			String item = items[i];
			float price = prices[i];

			int index = Arrays.asList(origItems).indexOf(item);
			float origPrice = origPrices[index];

			if (price != origPrice) {
				count++;
				
			}

		}
		return count;
	}

	public static void main(String[] args) {
		String origItems[] = { "apple", "banana", "orange" };
		String items[] = { "apple", "orange" };
		float origPrices[] = { 4, 3, 2 };
		float prices[] = { 5, 1 };
		int count = verifyItems(origItems, origPrices, items, prices);
		System.out.println(count);

	}
}
