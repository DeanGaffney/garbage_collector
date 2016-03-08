import java.util.ArrayList;


public class HandlePool {

	private ArrayList<Integer> handlePool;
	private ObjectPool objectPool;
	
	public HandlePool(ObjectPool objectPool){
		handlePool = new ArrayList<Integer>();
		this.objectPool = objectPool;
	}
	
	public void addToHandlePool(int object){
		handlePool.add(object);
	}
	
	public void removeFromHandlePool(int object){ //may not need this method
		handlePool.remove(object);
	}
	
	public int getFromHandlePool(int object){
		return handlePool.get(object);
	}
}
