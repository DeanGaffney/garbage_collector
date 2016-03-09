import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame{


	private static final long serialVersionUID = -5151041547543472432L;
	private Panel panel;
	private ObjectPool objectPool = new ObjectPool();
	private HandlePool handlePool = new HandlePool(objectPool);

	private JTextField objectPoolSize = getPanel().getObjectPoolSize();
	
	JTextField[] objectTextFields = { getPanel().getObjectText1(),
			getPanel().getObjectText2(),
			getPanel().getObjectText3(),
			getPanel().getObjectText4(),
			getPanel().getObjectText5(),
			getPanel().getObjectText6(),
			getPanel().getObjectText7(),
			getPanel().getObjectText8(),
			getPanel().getObjectText9(),
			getPanel().getObjectText10()};

	JTextField[] objectTextLinkFields = { getPanel().getObjectLinkText1(),
			getPanel().getObjectLinkText2(),
			getPanel().getObjectLinkText3(),
			getPanel().getObjectLinkText4(),
			getPanel().getObjectLinkText5(),
			getPanel().getObjectLinkText6(),
			getPanel().getObjectLinkText7(),
			getPanel().getObjectLinkText8(),
			getPanel().getObjectLinkText9(),
			getPanel().getObjectLinkText10()};

	JTextField[] handleTextFields = {getPanel().getHandleText1(),
			getPanel().getHandleText2(),
			getPanel().getHandleText3(),
			getPanel().getHandleText4(),
			getPanel().getHandleText5(),
			getPanel().getHandleText6(),
			getPanel().getHandleText7(),
			getPanel().getHandleText8(),
			getPanel().getHandleText9(),
			getPanel().getHandleText10()};

	JTextField[] handleTextLinkFields = {getPanel().getHandleLinkText1(),
			getPanel().getHandleLinkText2(),
			getPanel().getHandleLinkText3(),
			getPanel().getHandleLinkText4(),
			getPanel().getHandleLinkText5(),
			getPanel().getHandleLinkText6(),
			getPanel().getHandleLinkText7(),
			getPanel().getHandleLinkText8(),
			getPanel().getHandleLinkText9(),
			getPanel().getHandleLinkText10()};

	public Frame(){
		init();
		pack();
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		handlePool.setHandlePoolToEmpty();
		handlePool.objectPool.setObjectPoolToEmpty();
		objectPoolSize.setText(Integer.toString(handlePool.getPoolByteSize()));
	}

	private void init() {
		add(getPanel());

	}

	private Panel getPanel() {
		if(panel == null){
			panel = new Panel();
			panel.getRedFishButton().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					clickRedFish();
				}
			});

			panel.getBlueFishButton().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					clickBlueFish();
				}
			});

			panel.getYellowFishButton().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					clickYellowFish();
				}
			});

			panel.getMarkAndSweepButton().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					markAndSweep();
				}
			});
		}
		return panel;
	}

	public void clickRedFish(){
		handlePool.addToPools(handlePool.fish.RED_FISH);

		objectTextFields[handlePool.getCurrentPositionObject()].setBackground(Color.RED);
		objectTextFields[handlePool.getCurrentPositionObject()].setText("Red Fish");
		objectTextFields[handlePool.getCurrentPositionObject()].setEditable(false);

		objectTextFields[handlePool.getCurrentPositionObject()+1].setBackground(Color.BLUE);
		objectTextFields[handlePool.getCurrentPositionObject()+1].setText("Blue Fish");
		objectTextFields[handlePool.getCurrentPositionObject()+1].setForeground(Color.WHITE);
		objectTextFields[handlePool.getCurrentPositionObject()+1].setEditable(false);

		objectTextFields[handlePool.getCurrentPositionObject()+2].setBackground(Color.YELLOW);
		objectTextFields[handlePool.getCurrentPositionObject()+2].setText("Yellow Fish");
		objectTextFields[handlePool.getCurrentPositionObject()+2].setEditable(false);

		handleTextFields[handlePool.getCurrentPositionHandle()].setBackground(Color.RED);
		handleTextFields[handlePool.getCurrentPositionHandle()].setText("Red Fish");
		handleTextFields[handlePool.getCurrentPositionHandle()].setEditable(false);

		handlePool.setCurrentPositionObject(3);
		handlePool.setCurrentPositionHandle(1);
		
		handlePool.setPoolByteSize(handlePool.redFishByteSize);
		objectPoolSize.setText(Integer.toString(handlePool.getPoolByteSize()));
	}

	public void clickBlueFish(){
		handlePool.addToPools(handlePool.fish.BLUE_FISH);

		objectTextFields[handlePool.getCurrentPositionObject()].setBackground(Color.BLUE);
		objectTextFields[handlePool.getCurrentPositionObject()].setText("Blue Fish");
		objectTextFields[handlePool.getCurrentPositionObject()].setForeground(Color.WHITE);
		objectTextFields[handlePool.getCurrentPositionObject()].setEditable(false);

		objectTextFields[handlePool.getCurrentPositionObject()+1].setBackground(Color.YELLOW);
		objectTextFields[handlePool.getCurrentPositionObject()+1].setText("Yellow Fish");
		objectTextFields[handlePool.getCurrentPositionObject()+1].setEditable(false);

		handleTextFields[handlePool.getCurrentPositionHandle()].setBackground(Color.BLUE);
		handleTextFields[handlePool.getCurrentPositionHandle()].setText("Blue Fish");
		handleTextFields[handlePool.getCurrentPositionHandle()].setForeground(Color.WHITE);
		handleTextFields[handlePool.getCurrentPositionHandle()].setEditable(false);

		handlePool.setCurrentPositionObject(2);
		handlePool.setCurrentPositionHandle(1);
		
		handlePool.setPoolByteSize(handlePool.blueFishByteSize);
		objectPoolSize.setText(Integer.toString(handlePool.getPoolByteSize()));
	}

	public void clickYellowFish(){
		handlePool.addToPools(handlePool.fish.YELLOW_FISH);

		objectTextFields[handlePool.getCurrentPositionObject()].setBackground(Color.YELLOW);
		objectTextFields[handlePool.getCurrentPositionObject()].setText("Yellow Fish");
		objectTextFields[handlePool.getCurrentPositionObject()].setEditable(false);

		handleTextFields[handlePool.getCurrentPositionHandle()].setBackground(Color.YELLOW);
		handleTextFields[handlePool.getCurrentPositionHandle()].setText("Yellow Fish");
		handleTextFields[handlePool.getCurrentPositionHandle()].setEditable(false);

		handlePool.setCurrentPositionObject(1);
		handlePool.setCurrentPositionHandle(1);
		
		handlePool.setPoolByteSize(4);
		objectPoolSize.setText(Integer.toString(handlePool.getPoolByteSize()));
	}

	public void markAndSweep(){
		handlePool.setLinksEmpty();
		System.out.println(handlePool.links[0]);
		for(int i = 0; i < handleTextLinkFields.length;i++){
			if(!handleTextLinkFields[i].getText().equals("")){
				int objectPoolReference = Integer.parseInt(handleTextLinkFields[i].getText());
				System.out.println(objectPoolReference);
				handlePool.links[objectPoolReference] = true;
				System.out.println(handlePool.links);
			}else continue;
		}
		sweep();
	}

	public void sweep(){
		for(int i = 0; i < handlePool.objectPool.objectPool.length; i ++){
			if(!handlePool.links[i]){
				if(objectTextFields[i].getText().equals("")){
					System.out.println("Empty so space was skipped");
				}
				else{
					objectTextFields[i].setText("Collected!");
					objectTextFields[i].setBackground(Color.BLACK);
					objectTextFields[i].setForeground(Color.WHITE);
				}
			}
		}
	}
}
