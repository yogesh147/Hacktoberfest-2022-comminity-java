import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item {
	int id;
	String name;
	float price;

	public Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamSample {

	public static void main(String[] args) {
		List<Item> productsList = new ArrayList<Item>();
		// Adding Products
		productsList.add(new Item(1, "HP Laptop", 25000f));
		productsList.add(new Item(2, "Dell Laptop", 30000f));
		productsList.add(new Item(3, "Lenevo Laptop", 28000f));
		productsList.add(new Item(4, "Sony Laptop", 28000f));
		productsList.add(new Item(5, "Apple Laptop", 90000f));
		List<Float> item = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(item);
	}

}
