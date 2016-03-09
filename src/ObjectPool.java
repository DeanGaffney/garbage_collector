import java.util.ArrayList;

public class ObjectPool {
	public int [] objectPool;
	private int [] handlePoolLinks;
	private int currentPosition;
	private int poolByteSize;

	public enum FISH{
		RED_FISH,BLUE_FISH,YELLOW_FISH
	}

	FISH	fish;

	public ObjectPool(){
		objectPool = new int[10];
		handlePoolLinks = new int[10];
		currentPosition = -1;
		fish = null;
		poolByteSize = 0;
	}

	public void setObjectPoolToEmpty(){
		for(int i = 0;i < objectPool.length;i++) objectPool[i] = 0;
		System.out.println(objectPool);
	}
	
	public void setHandlePoolLinkToEmpty(){
		for(int i = 0; i < handlePoolLinks.length;i++) handlePoolLinks[i] = 0;
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
		
	}
}
