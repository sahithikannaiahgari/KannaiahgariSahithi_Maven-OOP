package Task;

import Sweets.*;
import java.io.*;
import java.util.*;

public class Task {
	private List<Total> list = new ArrayList<Total>();

	public List<Total> getList()
	{
		return list;
	}

	

	public void add(Total absCandy, int count)
	{
		for (Total candy : getList()) 
		{
			if (candy.getName().equals(absCandy.getName()))
			{
				candy.setCount(candy.getCount() + count);
				return;
			}
		}
		getList().add(absCandy);
		absCandy.setCount(count);
	}

	
	public int calculateTotalWeight() {
		int value = 0;
		for (Total candy : getList()) {
			value += candy.getCount() * candy.getWeight();
		}
		return value;
	}

	public void getAllCandy() {
		for (Total candy : getList()) {
			System.out.print(candy.printAllValues());
		}
	}

	     
	

	public List<Total> receiveBySugarValue(int start, int end) {
		ArrayList<Total> list2 = new ArrayList<Total>();
		sortBySugarValue(list2);
		for (Total candy : getList()) {
			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {
				list2.add(candy);
			}
		}
		return list2;
	}

	
	public void sortBySugarValue(List<Total> list) {
		Collections.sort(list, new CompareBySugarValue());
	}

	static class CompareBySugarValue implements Comparator<Total>,
			Serializable {

		private static final long serialVersionUID = -6923839843945617223L;

		public int compare(Total o1, Total o2) {
			return o1.getSugarValue() - o2.getSugarValue();
		}

	}
}


