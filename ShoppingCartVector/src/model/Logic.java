package model;

import java.util.Vector;

public class Logic {
	Vector<Item> itemsVector = new Vector<>();
	
	public void addItem(Item item){
		itemsVector.add(item);
	}
	
	public Vector<Item> showItems() {
		return itemsVector;
	}
	
	public double price() {
		double price = 0;
		for (Item item : itemsVector) {
			price += item.getPrice();
		}
		return price;
	}

}
