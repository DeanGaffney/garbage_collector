import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class Panel extends JPanel{

	private static final long serialVersionUID = 5509155261502497671L;
	private JLabel handlePoolLabel;
	private JLabel objectPoolLabel;
	
	private JTextField handleText1;
	private JTextField handleText2;
	private JTextField handleText3;
	private JTextField handleText4;
	private JTextField handleText5;
	private JTextField handleText6;
	private JTextField handleText7;
	private JTextField handleText8;
	private JTextField handleText9;
	private JTextField handleText10;

	private JTextField objectText1;
	private JTextField objectText2;
	private JTextField objectText3;
	private JTextField objectText4;
	private JTextField objectText5;
	private JTextField objectText6;
	private JTextField objectText7;
	private JTextField objectText8;
	private JTextField objectText9;
	private JTextField objectText10;

	private JButton makeRedFish;
	private JButton makeBlueFish;
	private JButton makeYellowFish;
	
	private GridBagConstraints handlePoolLabelConstraints;
	private GridBagConstraints objectPoolLabelConstraints;
	private GridBagConstraints handleText1Constraints;
	private GridBagConstraints handleText2Constraints;
	private GridBagConstraints handleText3Constraints;
	private GridBagConstraints handleText4Constraints;
	private GridBagConstraints handleText5Constraints;
	private GridBagConstraints handleText6Constraints;
	private GridBagConstraints handleText7Constraints;
	private GridBagConstraints handleText8Constraints;
	private GridBagConstraints handleText9Constraints;
	private GridBagConstraints handleText10Constraints;

	private GridBagConstraints objectText1Constraints;
	private GridBagConstraints objectText2Constraints;
	private GridBagConstraints objectText3Constraints;
	private GridBagConstraints objectText4Constraints;
	private GridBagConstraints objectText5Constraints;
	private GridBagConstraints objectText6Constraints;
	private GridBagConstraints objectText7Constraints;
	private GridBagConstraints objectText8Constraints;
	private GridBagConstraints objectText9Constraints;	
	private GridBagConstraints objectText10Constraints;


	private GridBagConstraints redFishButtonConstraints;
	private GridBagConstraints blueFishButtonConstraints;
	private GridBagConstraints yellowFishButtonConstraints;

	
	
	public Panel(){
		init();
	}

	private void init() {
		setLayout(new GridBagLayout());
		add(getHandlePoolLabel(),getHandlePoolLabelConstraints());
		add(getObjectPoolLabel(),getObjectPoolLabelConstraints());
		
		add(getHandleText1(),getHandleText1Constraints());
		add(getHandleText2(),getHandleText2Constraints());
		add(getHandleText3(),getHandleText3Constraints());
		add(getHandleText4(),getHandleText4Constraints());
		add(getHandleText5(),getHandleText5Constraints());
		add(getHandleText6(),getHandleText6Constraints());
		add(getHandleText7(),getHandleText7Constraints());
		add(getHandleText8(),getHandleText8Constraints());
		add(getHandleText9(),getHandleText9Constraints());
		add(getHandleText10(),getHandleText10Constraints());

		add(getObjectText1(),getObjectText1Constraints());
		add(getObjectText2(),getObjectText2Constraints());
		add(getObjectText3(),getObjectText3Constraints());
		add(getObjectText4(),getObjectText4Constraints());
		add(getObjectText5(),getObjectText5Constraints());
		add(getObjectText6(),getObjectText6Constraints());
		add(getObjectText7(),getObjectText7Constraints());
		add(getObjectText8(),getObjectText8Constraints());
		add(getObjectText9(),getObjectText9Constraints());
		add(getObjectText10(),getObjectText10Constraints());

		add(getRedFishButton(),getRedFishButtonConstraints());
		add(getBlueFishButton(),getBlueFishButtonConstraints());
		add(getYellowFishButton(),getYellowFishButtonConstraints());

	}

	public JButton getBlueFishButton() {
		if( makeBlueFish == null){
			makeBlueFish= new JButton("Make a Blue Fish");
			makeBlueFish.setBackground(Color.BLUE);
			makeBlueFish.setForeground(Color.WHITE);
		}
		return makeBlueFish;
	}

	public JButton getYellowFishButton() {
		if( makeYellowFish == null){
			makeYellowFish= new JButton("Make a Yellow Fish");
			makeYellowFish.setBackground(Color.YELLOW);
		}
		return makeYellowFish;
	}

	public JTextField getHandleText2() {
		if(handleText2 == null){
			handleText2 = new JTextField(5);
		}
		return handleText2;
	}

	public JTextField getHandleText3() {
		if(handleText3 == null){
			handleText3 = new JTextField(5);
		}
		return handleText3;
	}

	public JTextField getHandleText4() {
		if(handleText4 == null){
			handleText4 = new JTextField(5);
		}
		return handleText4;
	}

	public JTextField getHandleText5() {
		if(handleText5 == null){
			handleText5 = new JTextField(5);
		}
		return handleText5;
	}

	public JTextField getHandleText6() {
		if(handleText6 == null){
			handleText6 = new JTextField(5);
		}
		return handleText6;
	}

	public JTextField getHandleText7() {
		if(handleText7 == null){
			handleText7 = new JTextField(5);
		}
		return handleText7;
	}

	public JTextField getHandleText8() {
		if(handleText8 == null){
			handleText8 = new JTextField(5);
		}
		return handleText8;
	}

	public JTextField getHandleText9() {
		if(handleText9 == null){
			handleText9 = new JTextField(5);
		}
		return handleText9;
	}

	public JTextField getHandleText10() {
		if(handleText10 == null){
			handleText10 = new JTextField(5);
		}
		return handleText10;
	}

	public JTextField getObjectText2() {
		if(objectText2 == null){
			objectText2 = new JTextField(5);
		}
		return objectText2;
	}

	public JTextField getObjectText3() {
		if(objectText3 == null){
			objectText3 = new JTextField(5);
		}
		return objectText3;
	}

	public JTextField getObjectText4() {
		if(objectText4 == null){
			objectText4 = new JTextField(5);
		}
		return objectText4;
	}

	public JTextField getObjectText5() {
		if(objectText5 == null){
			objectText5 = new JTextField(5);
		}
		return objectText5;
	}

	public JTextField getObjectText6() {
		if(objectText6 == null){
			objectText6 = new JTextField(5);
		}
		return objectText6;
	}

	public JTextField getObjectText7() {
		if(objectText7 == null){
			objectText7 = new JTextField(5);
		}
		return objectText7;
	}

	public JTextField getObjectText8() {
		if(objectText8 == null){
			objectText8 = new JTextField(5);
		}
		return objectText8;
	}

	public JTextField getObjectText9() {
		if(objectText9 == null){
			objectText9 = new JTextField(5);
		}
		return objectText9;
	}

	public JTextField getObjectText10() {
		if(objectText10 == null){
			objectText10 = new JTextField(5);
		}
		return objectText10;
	}

	public GridBagConstraints getHandleText2Constraints() {
		if(handleText2Constraints == null){
			handleText2Constraints = new GridBagConstraints();
			handleText2Constraints.gridx = 1;
			handleText2Constraints.gridy = 2;
			handleText2Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText2Constraints;
	}

	public GridBagConstraints getHandleText3Constraints() {
		if(handleText3Constraints == null){
			handleText3Constraints = new GridBagConstraints();
			handleText3Constraints.gridx = 1;
			handleText3Constraints.gridy = 3;
			handleText3Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText3Constraints;
	}

	public GridBagConstraints getHandleText4Constraints() {
		if(handleText4Constraints == null){
			handleText4Constraints = new GridBagConstraints();
			handleText4Constraints.gridx = 1;
			handleText4Constraints.gridy = 4;
			handleText4Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText4Constraints;
	}

	public GridBagConstraints getHandleText5Constraints() {
		if(handleText5Constraints == null){
			handleText5Constraints = new GridBagConstraints();
			handleText5Constraints.gridx = 1;
			handleText5Constraints.gridy = 5;
			handleText5Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText5Constraints;
	}

	public GridBagConstraints getHandleText6Constraints() {
		if(handleText6Constraints == null){
			handleText6Constraints = new GridBagConstraints();
			handleText6Constraints.gridx = 1;
			handleText6Constraints.gridy = 6;
			handleText6Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText6Constraints;
	}

	public GridBagConstraints getHandleText7Constraints() {
		if(handleText7Constraints == null){
			handleText7Constraints = new GridBagConstraints();
			handleText7Constraints.gridx = 1;
			handleText7Constraints.gridy = 7;
			handleText7Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText7Constraints;
	}

	public GridBagConstraints getHandleText8Constraints() {
		if(handleText8Constraints == null){
			handleText8Constraints = new GridBagConstraints();
			handleText8Constraints.gridx = 1;
			handleText8Constraints.gridy = 8;
			handleText8Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText8Constraints;
	}

	public GridBagConstraints getHandleText9Constraints() {
		if(handleText9Constraints == null){
			handleText9Constraints = new GridBagConstraints();
			handleText9Constraints.gridx = 1;
			handleText9Constraints.gridy = 9;
			handleText9Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText9Constraints;
	}

	public GridBagConstraints getHandleText10Constraints() {
		if(handleText10Constraints == null){
			handleText10Constraints = new GridBagConstraints();
			handleText10Constraints.gridx = 1;
			handleText10Constraints.gridy = 10;
			handleText10Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText10Constraints;
	}

	public GridBagConstraints getObjectText2Constraints() {
		if(objectText2Constraints == null){
			objectText2Constraints = new GridBagConstraints();
			objectText2Constraints.gridx = 2;
			objectText2Constraints.gridy = 2;
			objectText2Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText2Constraints;
	}

	public GridBagConstraints getObjectText3Constraints() {
		if(objectText3Constraints == null){
			objectText3Constraints = new GridBagConstraints();
			objectText3Constraints.gridx = 2;
			objectText3Constraints.gridy = 3;
			objectText3Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText3Constraints;
	}

	public GridBagConstraints getObjectText4Constraints() {
		if(objectText4Constraints == null){
			objectText4Constraints = new GridBagConstraints();
			objectText4Constraints.gridx = 2;
			objectText4Constraints.gridy = 4;
			objectText4Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText4Constraints;
	}

	public GridBagConstraints getObjectText5Constraints() {
		if(objectText5Constraints == null){
			objectText5Constraints = new GridBagConstraints();
			objectText5Constraints.gridx = 2;
			objectText5Constraints.gridy = 5;
			objectText5Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText5Constraints;
	}

	public GridBagConstraints getObjectText6Constraints() {
		if(objectText6Constraints == null){
			objectText6Constraints = new GridBagConstraints();
			objectText6Constraints.gridx = 2;
			objectText6Constraints.gridy = 6;
			objectText6Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText6Constraints;
	}

	public GridBagConstraints getObjectText7Constraints() {
		if(objectText7Constraints == null){
			objectText7Constraints = new GridBagConstraints();
			objectText7Constraints.gridx = 2;
			objectText7Constraints.gridy = 7;
			objectText7Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText7Constraints;
	}

	public GridBagConstraints getObjectText8Constraints() {
		if(objectText8Constraints == null){
			objectText8Constraints = new GridBagConstraints();
			objectText8Constraints.gridx = 2;
			objectText8Constraints.gridy = 8;
			objectText8Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText8Constraints;
	}

	public GridBagConstraints getObjectText9Constraints() {
		if(objectText9Constraints == null){
			objectText9Constraints = new GridBagConstraints();
			objectText9Constraints.gridx = 2;
			objectText9Constraints.gridy = 9;
			objectText9Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText9Constraints;
	}

	public GridBagConstraints getObjectText10Constraints() {
		if(objectText10Constraints == null){
			objectText10Constraints = new GridBagConstraints();
			objectText10Constraints.gridx = 2;
			objectText10Constraints.gridy = 10;
			objectText10Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText10Constraints;
	}

	public JLabel getHandlePoolLabel() {
		if(handlePoolLabel == null){
			handlePoolLabel = new JLabel("Handle Pool");
		}
		return handlePoolLabel;
	}

	public JLabel getObjectPoolLabel() {
		if(objectPoolLabel == null){
			objectPoolLabel = new JLabel("Object Pool");
		}
		return objectPoolLabel;
	}

	public JTextField getHandleText1() {
		if(handleText1 == null){
			handleText1 = new JTextField(5);
		}
		return handleText1;
	}

	public JTextField getObjectText1() {
		if(objectText1 == null){
			objectText1 = new JTextField(5);
		}
		return objectText1;
	}

	public JButton getRedFishButton() {
		if(makeRedFish == null){
			makeRedFish= new JButton("Create Red Fish");
			makeRedFish.setBackground(Color.RED);
		}
		return makeRedFish;
	}

	public GridBagConstraints getHandlePoolLabelConstraints() {
		if(handlePoolLabelConstraints == null){
			handlePoolLabelConstraints = new GridBagConstraints();
			handlePoolLabelConstraints.gridx = 1;
			handlePoolLabelConstraints.gridy = 0;
			handlePoolLabelConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return handlePoolLabelConstraints;
	}

	public GridBagConstraints getObjectPoolLabelConstraints() {
		if(objectPoolLabelConstraints == null){
			objectPoolLabelConstraints = new GridBagConstraints();
			objectPoolLabelConstraints.gridx = 2;
			objectPoolLabelConstraints.gridy = 0;
			objectPoolLabelConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectPoolLabelConstraints;
	}

	public GridBagConstraints getHandleText1Constraints() {
		if(handleText1Constraints == null){
			handleText1Constraints = new GridBagConstraints();
			handleText1Constraints.gridx = 1;
			handleText1Constraints.gridy = 1;
			handleText1Constraints.insets = new Insets(8, 20, 20, 20);
		}
		return handleText1Constraints;
	}

	public GridBagConstraints getObjectText1Constraints() {
		if(objectText1Constraints == null){
			objectText1Constraints = new GridBagConstraints();
			objectText1Constraints.gridx = 2;
			objectText1Constraints.gridy = 1;
			objectText1Constraints.insets = new Insets(8, 20, 20, 8);
		}
		return objectText1Constraints;
	}

	public GridBagConstraints getRedFishButtonConstraints() {
		if(redFishButtonConstraints == null){
			redFishButtonConstraints = new GridBagConstraints();
			redFishButtonConstraints.gridx = 0;
			redFishButtonConstraints.gridy = 2;
			redFishButtonConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return redFishButtonConstraints;
	}

	public GridBagConstraints getYellowFishButtonConstraints() {
		if(yellowFishButtonConstraints == null){
			yellowFishButtonConstraints = new GridBagConstraints();
			yellowFishButtonConstraints.gridx = 0;
			yellowFishButtonConstraints.gridy = 3;
			yellowFishButtonConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return yellowFishButtonConstraints;
	}

	public GridBagConstraints getBlueFishButtonConstraints() {
		if(blueFishButtonConstraints == null){
			blueFishButtonConstraints = new GridBagConstraints();
			blueFishButtonConstraints.gridx = 0;
			blueFishButtonConstraints.gridy = 4;
			blueFishButtonConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return blueFishButtonConstraints;
	}
}
