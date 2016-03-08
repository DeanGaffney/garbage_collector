import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		ObjectPool objectPool = new ObjectPool();
		HandlePool handlePool = new HandlePool(objectPool);

		Frame frame = new Frame();
		frame.setTitle("Garbage Collector");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objectPool.setObjectPoolToEmpty();
	}
}
