
public class HandlePool {

	private int [] handlePool;
	public int [] objectPoolLinks;
	public boolean [] links;
	public ObjectPool objectPool;
	private int currentPositionObject;
	private int currentPositionHandle;
	private int poolByteSize;
	public final int redFishByteSize = 12;
	public final int blueFishByteSize = 8;
	public final int yellowFishByteSize = 4;
	private final int redFish = 3;
	private final int blueFish = 2;
	private final int yellowFish = 1;

	public enum FISH{
		RED_FISH,BLUE_FISH,YELLOW_FISH
	}

	FISH	fish;

	public HandlePool(ObjectPool objectPool){
		handlePool = new int [10];
		objectPoolLinks = new int [10];
		links = new boolean [10];
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
			}else System.out.println("No space");
			break;
		case BLUE_FISH:
			if(hasEnoughSpaceObject(blueFish) && hasEnoughSpaceHandle(1)){
				setPoolByteSize(blueFishByteSize);
			}else System.out.println("No space");
			break;
		case YELLOW_FISH:
			if(hasEnoughSpaceObject(yellowFish) && hasEnoughSpaceHandle(1)){
				//setPoolByteSize(yellowFishByteSize);
			}
			break;
		default:
			System.out.println("You should'nt be here");
			break;
		}
	}
	
	public void setLinksEmpty(){
		for(int i = 0;i < links.length;i++) links[i] = false;
	}
	public void setHandlePoolToEmpty(){
		for(int i = 0;i < handlePool.length;i++) handlePool[i] = 0;
		System.out.println(handlePool);
	}
	
	public void setObjectPoolLinksToEmpty(){
		for(int i = 0;i < objectPoolLinks.length;i++) objectPoolLinks[i] = 0;
	}

	public boolean hasEnoughSpaceObject(int objectSize){
		boolean hasSpace = false;
		if(currentPositionObject + objectSize < objectPool.objectPool.length){
			for(int i = currentPositionObject + 1; i == currentPositionObject + objectSize;i++){
				 hasSpace = (objectPool.objectPool[i] == 0) ? true : false;
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
