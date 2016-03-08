import java.util.ArrayList;

public class ObjectPool {
	private int [] objectPool;
	private int currentPosition;
	private int poolByteSize;
	private final int redFish = 3;
	private final int blueFish = 2;
	private final int yellowFish = 1;

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
			int redByteSize = 12;
			if(hasEnoughSpace(redFish)){
				addRequiredSpace(redFish);
				setPoolByteSize(redByteSize);
			}
			break;
		case BLUE_FISH:
			/*
			 * Check and make sure the array can take 2 more spaces if it can then
			 * add them into the object pool, if it can't throw an exception.
			 */
			int blueByteSize = 8;
			if(hasEnoughSpace(blueFish)){
				addRequiredSpace(blueFish);
				setPoolByteSize(blueByteSize);
			}
			break;
		case YELLOW_FISH:
			/*
			 * Check and make sure the array can take 1 more space
			 * if it can add it ot the object pool, otherwise throw exception.
			 */
			int yellowByteSize = 4;
			if(hasEnoughSpace(yellowFish)){
				addRequiredSpace(yellowFish);
				setPoolByteSize(yellowByteSize);
			}
			break;
		default:
			System.out.println("You should'nt be here");
			break;
		}
	}

	public boolean hasEnoughSpace(int objectSize){
		boolean hasSpace = false;
		if(currentPosition + objectSize < objectPool.length){
			for(int i = currentPosition + 1; i == currentPosition + objectSize;i++){
				if(objectPool[i] == 0) hasSpace = true;
				else hasSpace = false;
			}
		}
		return hasSpace;
	}

	public void addRequiredSpace(int requiredSpace){
		for(int i = 0; i < requiredSpace; i++)
			objectPool[++currentPosition] = requiredSpace;
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
