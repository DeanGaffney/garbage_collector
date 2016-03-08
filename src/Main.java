
public class Main {

	public static void main(String[] args) {
		GUI gui				  = new GUI();
		ObjectPool objectPool = new ObjectPool();
		HandlePool handlePool = new HandlePool(objectPool);

		
		objectPool.setObjectPoolToEmpty();
		
		
	}
}
