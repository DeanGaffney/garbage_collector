import java.util.ArrayList;

public class HandlePool {

	private int [] handlePool;
	private ObjectPool objectPool;
	private int currentPositionObject;
	private int currentPositionHandle;
	private int poolByteSize;
	private final int redFishByteSize = 12;
	private final int blueFishByteSize = 8;
	private final int yellowFishByteSize = 4;
	private final int redFish = 3;
	private final int blueFish = 2;
	private final int yellowFish = 1;

	public enum FISH{
		RED_FISH,BLUE_FISH,YELLOW_FISH
	}

	FISH	fish;

	public HandlePool(ObjectPool objectPool){
		handlePool = new int [10];
		this.objectPool = objectPool;
		currentPositionObject = 0;
		currentPositionHandle = 0;
		fish = null;
	}

	public void addToPools(FISH fish){
		switch(fish){
		case RED_FISH:
			if(hasEnoughSpaceObject(redFish) && hasEnoughSpaceHandle(1)){
				setPoolByteSize(redFishByteSize);
			}
			break;
		case BLUE_FISH:
			if(hasEnoughSpaceObject(blueFish) && hasEnoughSpaceHandle(1)){
				setPoolByteSize(blueFishByteSize);
			}
			break;
		case YELLOW_FISH:
			if(hasEnoughSpaceObject(yellowFish) && hasEnoughSpaceHandle(1)){
				setPoolByteSize(yellowFishByteSize);
			}
			break;
		default:
			System.out.println("You should'nt be here");
			break;
		}
	}


	public boolean hasEnoughSpaceObject(int objectSize){
		boolean hasSpace = false;
		if(currentPositionObject + objectSize < objectPool.objectPool.length){
			for(int i = currentPositionObject + 1; i == currentPositionObject + objectSize;i++){
				if(objectPool.objectPool[i] == 0) hasSpace = true;
				else hasSpace = false;
			}
		}
		return hasSpace;
	}
	
	public boolean hasEnoughSpaceHandle(int size){
		boolean hasSpace = (currentPositionHandle + size < handlePool.length) ? true:false;
		return hasSpace;
	}

	public void setPoolByteSize(int byteSize){
		poolByteSize += byteSize;
	}

	public int getPoolByteSize(){
		return poolByteSize;
	}
	
	public int getCurrentPositionObject(){
		return currentPositionObject;
	}
	
	public void setCurrentPositionObject(int increase){
		currentPositionObject += increase;
	}
	
	public void setCurrentPositionHandle(int increase){
		currentPositionHandle += increase;
	}
	
	public int getCurrentPositionHandle(){
		return currentPositionHandle;
	}
}
