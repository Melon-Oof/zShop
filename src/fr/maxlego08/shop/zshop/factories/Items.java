package fr.maxlego08.shop.zshop.factories;

import java.util.List;

import fr.maxlego08.shop.zshop.items.ShopItem;

public interface Items {

	List<ShopItem> getItems(int category);

	void setItems(List<ShopItem> items, int id);
	
	void load();
	
	void save();

}
