import java.util.ArrayList;

public class ObjectPool {
	private int [] objectPool;
	private int currentPosition;
	private int poolByteSize;
	
	public enum FISH{
		RED_FISH,BLUE_FISH,YELLOW_FISH
	}
	
	FISH	fish;
	
	public ObjectPool(){
		objectPool = new int[20];
		currentPosition = -1;
		fish = null;
		poolByteSize = 0;
	}
	
	public void setObjectPoolToEmpty(){
		for(int i = 0;i < objectPool.length;i++) objectPool[i] = 0;
	}
	
	public void addToObjectPool(FISH fish){
		switch(fish){
		case RED_FISH:
			/*
			 * Check and make sure the array can take 3 more spaces.
			 * If it can then add them to the objectPool if it can't throw an exception.
			 */
			break;
		case BLUE_FISH:
			/*
			 * Check and make sure the array can take 2 more spaces if it can then
			 * add them into the object pool, if it can't throw an exception.
			 */
			break;
		case YELLOW_FISH:
			/*
			 * Check and make sure the array can take 1 more space
			 * if it can add it ot the object pool, otherwise throw exception.
			 */
			break;
		default:
			//throw exception you shouldn't be here
			break;
			
		}
	}
	
	public void setPoolByteSize(int byteSize){
		poolByteSize += byteSize;
	}
	
	public int getPoolByteSize(){
		return poolByteSize;
	}
	
	public void defragmentPool(){
		/*
		 * defragment the pool and reshape the memory function chunks.
		 */
	}
}
