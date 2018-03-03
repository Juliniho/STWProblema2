import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class Catalog  {
	
	List<Item> items = new ArrayList<>();
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Catalog() {items.add(new Item("R1","Name 1","Desc 1", 1.1f));}

}
