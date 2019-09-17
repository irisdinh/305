import java.util.HashMap;
import java.util.Map;
public class Catagory {
	private HashMap<Integer, String> map;

	public Catagory() {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(0, "Food&Drink");
		map.put(1, "Transportation");
		map.put(2, "Study");
		map.put(3, "Rent");
		map.put(4, "Utilities");
		map.put(5, "Entertainment");
		map.put(6, "Health&Fitness");
		map.put(7, "Other");
		map.put(8, "Travel");
	}
	
	
}
