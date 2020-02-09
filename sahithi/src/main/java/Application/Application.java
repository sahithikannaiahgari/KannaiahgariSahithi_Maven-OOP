package Application;

import Sweets.*;
import Task.*;
public class Application
{
	private static final int START = 20;
	private static final int END = 45;

	// Creating objects
	private static final Kajubarfi kajubarfi1 = new Kajubarfi("kajubarfi1", 10, 8);
	private static final Kajubarfi kajubarfi2 = new Kajubarfi("kajubarfi2", 15, 13);
	private static final Kajubarfi kajubarfi3 = new Kajubarfi("kajubarfi3", 24, 22);
	private static final Rasmalai rasmalai1 = new Rasmalai("rasmalai1", 10, 45);
	private static final Rasmalai rasmalai2 = new Rasmalai("rasmalai2", 20, 47);
	private static final Rasgulla rasgulla1 = new Rasgulla("rasgulla1", 20, 15);
	private static final Rasgulla rasgulla2 = new Rasgulla("rasgulla2", 27, 22);

	// Creating container
	private static final  Task GIFT = new Task();

	public static Task getGift() {
		return GIFT;
	}



	public static void createGift() {
		getGift().add(kajubarfi1, 7);
		getGift().add(kajubarfi2, 8);
		getGift().add(kajubarfi3, 4);
		getGift().add(rasmalai1, 6);
		getGift().add(rasmalai2, 5);
		getGift().add(rasgulla1, 3);
		getGift().add(kajubarfi3, 2);
		getGift().add(rasgulla2, 8);
		getGift().add(rasgulla2, 4);
		getGift().add(kajubarfi1, 12);
		getGift().add(kajubarfi2, 17);
		getGift().add(kajubarfi3, 14);
		getGift().add(rasmalai1, 1);
		getGift().add(rasmalai2, 1);
		getGift().add(rasgulla1, 3);
		getGift().add(rasgulla2, 1);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println("displaying all the sweets with properties:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("sorting sweets based on sugarvalues");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("total weight ");
		System.out.println(getGift().calculateTotalWeight() + " gm");
		System.out.println();
		System.out
				.println("All sweets with selected range of sugar value(from "
						+ START + "% to " + END + "%) :");
		for (Total sweet : getGift().receiveBySugarValue(START, END)) {
			System.out.print(sweet.printAllValues());
		}
	}
}