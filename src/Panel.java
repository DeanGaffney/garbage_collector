import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class Panel extends JPanel{

	private static final long serialVersionUID = 5509155261502497671L;
	private JLabel handlePoolLabel;
	private JLabel objectPoolLabel;
	private JLabel objectIndex;
	private JLabel handleIndex;
	private JLabel localVariables;
	private JLabel redFishLocalVariableLabel;
	private JLabel blueFishLocalVariableLabel;
	private JLabel yellowFishLocalVariableLabel;



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

	private JTextField handleLinkText1;
	private JTextField handleLinkText2;
	private JTextField handleLinkText3;
	private JTextField handleLinkText4;
	private JTextField handleLinkText5;
	private JTextField handleLinkText6;
	private JTextField handleLinkText7;
	private JTextField handleLinkText8;
	private JTextField handleLinkText9;
	private JTextField handleLinkText10;

	private JTextField objectLinkText1;
	private JTextField objectLinkText2;
	private JTextField objectLinkText3;
	private JTextField objectLinkText4;
	private JTextField objectLinkText5;
	private JTextField objectLinkText6;
	private JTextField objectLinkText7;
	private JTextField objectLinkText8;
	private JTextField objectLinkText9;
	private JTextField objectLinkText10;

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
	private JButton markAndSweep;

	private GridBagConstraints handlePoolLabelConstraints;
	private GridBagConstraints objectPoolLabelConstraints;
	private GridBagConstraints localVariablesLabelConstraints;
	private GridBagConstraints redFishLocalVariablesLabelConstraints;
	private GridBagConstraints blueFishLocalVariablesLabelConstraints;
	private GridBagConstraints yellowFishLocalVariablesLabelConstraints;


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

	private GridBagConstraints handleTextLink1Constraints;
	private GridBagConstraints handleTextLink2Constraints;
	private GridBagConstraints handleTextLink3Constraints;
	private GridBagConstraints handleTextLink4Constraints;
	private GridBagConstraints handleTextLink5Constraints;
	private GridBagConstraints handleTextLink6Constraints;
	private GridBagConstraints handleTextLink7Constraints;
	private GridBagConstraints handleTextLink8Constraints;
	private GridBagConstraints handleTextLink9Constraints;
	private GridBagConstraints handleTextLink10Constraints;

	private GridBagConstraints objectTextLink1Constraints;
	private GridBagConstraints objectTextLink2Constraints;
	private GridBagConstraints objectTextLink3Constraints;
	private GridBagConstraints objectTextLink4Constraints;
	private GridBagConstraints objectTextLink5Constraints;
	private GridBagConstraints objectTextLink6Constraints;
	private GridBagConstraints objectTextLink7Constraints;
	private GridBagConstraints objectTextLink8Constraints;
	private GridBagConstraints objectTextLink9Constraints;	
	private GridBagConstraints objectTextLink10Constraints;

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
	private GridBagConstraints markAndSweepButtonConstraints;



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

		add(getHandleLinkText1(),getHandleTextLink1Constraints());
		add(getHandleLinkText2(),getHandleTextLink2Constraints());
		add(getHandleLinkText3(),getHandleTextLink3Constraints());
		add(getHandleLinkText4(),getHandleTextLink4Constraints());
		add(getHandleLinkText5(),getHandleTextLink5Constraints());
		add(getHandleLinkText6(),getHandleTextLink6Constraints());
		add(getHandleLinkText7(),getHandleTextLink7Constraints());
		add(getHandleLinkText8(),getHandleTextLink8Constraints());
		add(getHandleLinkText9(),getHandleTextLink9Constraints());
		add(getHandleLinkText10(),getHandleTextLink10Constraints());

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

		add(getObjectLinkText1(),getObjectTextLink1Constraints());
		add(getObjectLinkText2(),getObjectTextLink2Constraints());
		add(getObjectLinkText3(),getObjectTextLink3Constraints());
		add(getObjectLinkText4(),getObjectTextLink4Constraints());
		add(getObjectLinkText5(),getObjectTextLink5Constraints());
		add(getObjectLinkText6(),getObjectTextLink6Constraints());
		add(getObjectLinkText7(),getObjectTextLink7Constraints());
		add(getObjectLinkText8(),getObjectTextLink8Constraints());
		add(getObjectLinkText9(),getObjectTextLink9Constraints());
		add(getObjectLinkText10(),getObjectTextLink10Constraints());

		add(getRedFishButton(),getRedFishButtonConstraints());
		add(getBlueFishButton(),getBlueFishButtonConstraints());
		add(getYellowFishButton(),getYellowFishButtonConstraints());

		add(getLocalVariables(),getLocalVariablesLabelConstraints());
		add(getRedFishLocalVariableLabel(),getRedFishLocalVariablesLabelConstraints());
		add(getBlueFishLocalVariableLabel(),getBlueFishLocalVariablesLabelConstraints());
		add(getYellowFishLocalVariableLabel(),getYellowFishLocalVariablesLabelConstraints());
		add(getMarkAndSweepButton(),getMarkAndSweepButtonConstraints());
	}


	public JLabel getRedFishLocalVariableLabel() {
		if(redFishLocalVariableLabel == null){
			redFishLocalVariableLabel = new JLabel("Red Fish = 0");
			redFishLocalVariableLabel.setOpaque(true);
			redFishLocalVariableLabel.setBackground(Color.RED);
		}
		return redFishLocalVariableLabel;
	}

	public JLabel getBlueFishLocalVariableLabel() {
		if(blueFishLocalVariableLabel == null){
			blueFishLocalVariableLabel = new JLabel("Blue Fish = 1");
			blueFishLocalVariableLabel.setOpaque(true);
			blueFishLocalVariableLabel.setBackground(Color.BLUE);
			blueFishLocalVariableLabel.setForeground(Color.WHITE);
		}
		return blueFishLocalVariableLabel;
	}

	public JLabel getYellowFishLocalVariableLabel() {
		if(yellowFishLocalVariableLabel == null){
			yellowFishLocalVariableLabel = new JLabel("Yellow Fish = 2");
			yellowFishLocalVariableLabel.setOpaque(true);
			yellowFishLocalVariableLabel.setBackground(Color.YELLOW);
		}
		return yellowFishLocalVariableLabel;
	}

	public GridBagConstraints getRedFishLocalVariablesLabelConstraints() {
		if(redFishLocalVariablesLabelConstraints == null){
			redFishLocalVariablesLabelConstraints = new GridBagConstraints();
			redFishLocalVariablesLabelConstraints.gridx = 0;
			redFishLocalVariablesLabelConstraints.gridy = 6;
			redFishLocalVariablesLabelConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return redFishLocalVariablesLabelConstraints;
	}

	public GridBagConstraints getBlueFishLocalVariablesLabelConstraints() {
		if(blueFishLocalVariablesLabelConstraints == null){
			blueFishLocalVariablesLabelConstraints = new GridBagConstraints();
			blueFishLocalVariablesLabelConstraints.gridx = 0;
			blueFishLocalVariablesLabelConstraints.gridy = 7;
			blueFishLocalVariablesLabelConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return blueFishLocalVariablesLabelConstraints;
	}

	public GridBagConstraints getYellowFishLocalVariablesLabelConstraints() {
		if(yellowFishLocalVariablesLabelConstraints == null){
			yellowFishLocalVariablesLabelConstraints = new GridBagConstraints();
			yellowFishLocalVariablesLabelConstraints.gridx = 0;
			yellowFishLocalVariablesLabelConstraints.gridy = 8;
			yellowFishLocalVariablesLabelConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return yellowFishLocalVariablesLabelConstraints;
	}

	public JLabel getLocalVariables() {
		if(localVariables == null){
			localVariables = new JLabel("Local Variables");
		}
		return localVariables;
	}

	public GridBagConstraints getLocalVariablesLabelConstraints() {
		if(localVariablesLabelConstraints == null){
			localVariablesLabelConstraints = new GridBagConstraints();
			localVariablesLabelConstraints.gridx = 0;
			localVariablesLabelConstraints.gridy = 5;
			localVariablesLabelConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return localVariablesLabelConstraints;
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
			objectText2Constraints.gridx = 4;
			objectText2Constraints.gridy = 2;
			objectText2Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText2Constraints;
	}

	public GridBagConstraints getObjectText3Constraints() {
		if(objectText3Constraints == null){
			objectText3Constraints = new GridBagConstraints();
			objectText3Constraints.gridx = 4;
			objectText3Constraints.gridy = 3;
			objectText3Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText3Constraints;
	}

	public GridBagConstraints getObjectText4Constraints() {
		if(objectText4Constraints == null){
			objectText4Constraints = new GridBagConstraints();
			objectText4Constraints.gridx = 4;
			objectText4Constraints.gridy = 4;
			objectText4Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText4Constraints;
	}

	public GridBagConstraints getObjectText5Constraints() {
		if(objectText5Constraints == null){
			objectText5Constraints = new GridBagConstraints();
			objectText5Constraints.gridx = 4;
			objectText5Constraints.gridy = 5;
			objectText5Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText5Constraints;
	}

	public GridBagConstraints getObjectText6Constraints() {
		if(objectText6Constraints == null){
			objectText6Constraints = new GridBagConstraints();
			objectText6Constraints.gridx = 4;
			objectText6Constraints.gridy = 6;
			objectText6Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText6Constraints;
	}

	public GridBagConstraints getObjectText7Constraints() {
		if(objectText7Constraints == null){
			objectText7Constraints = new GridBagConstraints();
			objectText7Constraints.gridx = 4;
			objectText7Constraints.gridy = 7;
			objectText7Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText7Constraints;
	}

	public GridBagConstraints getObjectText8Constraints() {
		if(objectText8Constraints == null){
			objectText8Constraints = new GridBagConstraints();
			objectText8Constraints.gridx = 4;
			objectText8Constraints.gridy = 8;
			objectText8Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText8Constraints;
	}

	public GridBagConstraints getObjectText9Constraints() {
		if(objectText9Constraints == null){
			objectText9Constraints = new GridBagConstraints();
			objectText9Constraints.gridx = 4;
			objectText9Constraints.gridy = 9;
			objectText9Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText9Constraints;
	}

	public GridBagConstraints getObjectText10Constraints() {
		if(objectText10Constraints == null){
			objectText10Constraints = new GridBagConstraints();
			objectText10Constraints.gridx = 4;
			objectText10Constraints.gridy = 10;
			objectText10Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectText10Constraints;
	}


	public GridBagConstraints getHandleTextLink1Constraints() {
		if(handleTextLink1Constraints == null){
			handleTextLink1Constraints = new GridBagConstraints();
			handleTextLink1Constraints.gridx = 3;
			handleTextLink1Constraints.gridy = 1;
			handleTextLink1Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink1Constraints;
	}

	public GridBagConstraints getHandleTextLink2Constraints() {
		if(handleTextLink2Constraints == null){
			handleTextLink2Constraints = new GridBagConstraints();
			handleTextLink2Constraints.gridx = 3;
			handleTextLink2Constraints.gridy = 2;
			handleTextLink2Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink2Constraints;
	}

	public GridBagConstraints getHandleTextLink3Constraints() {
		if(handleTextLink3Constraints == null){
			handleTextLink3Constraints = new GridBagConstraints();
			handleTextLink3Constraints.gridx = 3;
			handleTextLink3Constraints.gridy = 3;
			handleTextLink3Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink3Constraints;
	}

	public GridBagConstraints getHandleTextLink4Constraints() {
		if(handleTextLink4Constraints == null){
			handleTextLink4Constraints = new GridBagConstraints();
			handleTextLink4Constraints.gridx = 3;
			handleTextLink4Constraints.gridy = 4;
			handleTextLink4Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink4Constraints;
	}

	public GridBagConstraints getHandleTextLink5Constraints() {
		if(handleTextLink5Constraints == null){
			handleTextLink5Constraints = new GridBagConstraints();
			handleTextLink5Constraints.gridx = 3;
			handleTextLink5Constraints.gridy = 5;
			handleTextLink5Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink5Constraints;
	}

	public GridBagConstraints getHandleTextLink6Constraints() {
		if(handleTextLink6Constraints == null){
			handleTextLink6Constraints = new GridBagConstraints();
			handleTextLink6Constraints.gridx = 3;
			handleTextLink6Constraints.gridy = 6;
			handleTextLink6Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink6Constraints;
	}

	public GridBagConstraints getHandleTextLink7Constraints() {
		if(handleTextLink7Constraints == null){
			handleTextLink7Constraints = new GridBagConstraints();
			handleTextLink7Constraints.gridx = 3;
			handleTextLink7Constraints.gridy = 7;
			handleTextLink7Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink7Constraints;
	}

	public GridBagConstraints getHandleTextLink8Constraints() {
		if(handleTextLink8Constraints == null){
			handleTextLink8Constraints = new GridBagConstraints();
			handleTextLink8Constraints.gridx = 3;
			handleTextLink8Constraints.gridy = 8;
			handleTextLink8Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink8Constraints;
	}

	public GridBagConstraints getHandleTextLink9Constraints() {
		if(handleTextLink9Constraints == null){
			handleTextLink9Constraints = new GridBagConstraints();
			handleTextLink9Constraints.gridx = 3;
			handleTextLink9Constraints.gridy = 9;
			handleTextLink9Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink9Constraints;
	}

	public GridBagConstraints getHandleTextLink10Constraints() {
		if(handleTextLink10Constraints == null){
			handleTextLink10Constraints = new GridBagConstraints();
			handleTextLink10Constraints.gridx = 3;
			handleTextLink10Constraints.gridy = 10;
			handleTextLink10Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleTextLink10Constraints;
	}

	public GridBagConstraints getObjectTextLink1Constraints() {
		if(objectTextLink1Constraints == null){
			objectTextLink1Constraints = new GridBagConstraints();
			objectTextLink1Constraints.gridx = 5;
			objectTextLink1Constraints.gridy = 1;
			objectTextLink1Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink1Constraints;
	}

	public GridBagConstraints getObjectTextLink2Constraints() {
		if(objectTextLink2Constraints == null){
			objectTextLink2Constraints = new GridBagConstraints();
			objectTextLink2Constraints.gridx = 5;
			objectTextLink2Constraints.gridy = 2;
			objectTextLink2Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink2Constraints;
	}

	public GridBagConstraints getObjectTextLink3Constraints() {
		if(objectTextLink3Constraints == null){
			objectTextLink3Constraints = new GridBagConstraints();
			objectTextLink3Constraints.gridx = 5;
			objectTextLink3Constraints.gridy = 3;
			objectTextLink3Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink3Constraints;
	}

	public GridBagConstraints getObjectTextLink4Constraints() {
		if(objectTextLink4Constraints == null){
			objectTextLink4Constraints = new GridBagConstraints();
			objectTextLink4Constraints.gridx = 5;
			objectTextLink4Constraints.gridy = 4;
			objectTextLink4Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink4Constraints;
	}

	public GridBagConstraints getObjectTextLink5Constraints() {
		if(objectTextLink5Constraints == null){
			objectTextLink5Constraints = new GridBagConstraints();
			objectTextLink5Constraints.gridx = 5;
			objectTextLink5Constraints.gridy = 5;
			objectTextLink5Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink5Constraints;
	}

	public GridBagConstraints getObjectTextLink6Constraints() {
		if(objectTextLink6Constraints == null){
			objectTextLink6Constraints = new GridBagConstraints();
			objectTextLink6Constraints.gridx = 5;
			objectTextLink6Constraints.gridy = 6;
			objectTextLink6Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink6Constraints;
	}

	public GridBagConstraints getObjectTextLink7Constraints() {
		if(objectTextLink7Constraints == null){
			objectTextLink7Constraints = new GridBagConstraints();
			objectTextLink7Constraints.gridx = 5;
			objectTextLink7Constraints.gridy = 7;
			objectTextLink7Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink7Constraints;
	}

	public GridBagConstraints getObjectTextLink8Constraints() {
		if(objectTextLink8Constraints == null){
			objectTextLink8Constraints = new GridBagConstraints();
			objectTextLink8Constraints.gridx = 5;
			objectTextLink8Constraints.gridy = 8;
			objectTextLink8Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink8Constraints;
	}

	public GridBagConstraints getObjectTextLink9Constraints() {
		if(objectTextLink9Constraints == null){
			objectTextLink9Constraints = new GridBagConstraints();
			objectTextLink9Constraints.gridx = 5;
			objectTextLink9Constraints.gridy = 9;
			objectTextLink9Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink9Constraints;
	}

	public GridBagConstraints getObjectTextLink10Constraints() {
		if(objectTextLink10Constraints == null){
			objectTextLink10Constraints = new GridBagConstraints();
			objectTextLink10Constraints.gridx = 5;
			objectTextLink10Constraints.gridy = 10;
			objectTextLink10Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return objectTextLink10Constraints;
	}

	public JTextField getHandleLinkText1() {
		if(handleLinkText1 == null){
			handleLinkText1 = new JTextField(2);
		}
		return handleLinkText1;
	}

	public JTextField getHandleLinkText2() {
		if(handleLinkText2 == null){
			handleLinkText2 = new JTextField(2);
		}
		return handleLinkText2;
	}

	public JTextField getHandleLinkText3() {
		if(handleLinkText3 == null){
			handleLinkText3 = new JTextField(2);
		}
		return handleLinkText3;
	}

	public JTextField getHandleLinkText4() {
		if(handleLinkText4 == null){
			handleLinkText4 = new JTextField(2);
		}
		return handleLinkText4;
	}

	public JTextField getHandleLinkText5() {
		if(handleLinkText5 == null){
			handleLinkText5 = new JTextField(2);
		}
		return handleLinkText5;
	}

	public JTextField getHandleLinkText6() {
		if(handleLinkText6 == null){
			handleLinkText6 = new JTextField(2);
		}
		return handleLinkText6;
	}

	public JTextField getHandleLinkText7() {
		if(handleLinkText7 == null){
			handleLinkText7 = new JTextField(2);
		}
		return handleLinkText7;
	}

	public JTextField getHandleLinkText8() {
		if(handleLinkText8 == null){
			handleLinkText8 = new JTextField(2);
		}
		return handleLinkText8;
	}

	public JTextField getHandleLinkText9() {
		if(handleLinkText9 == null){
			handleLinkText9 = new JTextField(2);
		}
		return handleLinkText9;
	}

	public JTextField getHandleLinkText10() {
		if(handleLinkText10 == null){
			handleLinkText10 = new JTextField(2);
		}
		return handleLinkText10;
	}

	public JTextField getObjectLinkText1() {
		if(objectLinkText1 == null){
			objectLinkText1 = new JTextField(2);
		}
		return objectLinkText1;
	}

	public JTextField getObjectLinkText2() {
		if(objectLinkText2 == null){
			objectLinkText2 = new JTextField(2);
		}
		return objectLinkText2;
	}

	public JTextField getObjectLinkText3() {
		if(objectLinkText3 == null){
			objectLinkText3 = new JTextField(2);
		}
		return objectLinkText3;
	}

	public JTextField getObjectLinkText4() {
		if(objectLinkText4 == null){
			objectLinkText4 = new JTextField(2);
		}
		return objectLinkText4;
	}

	public JTextField getObjectLinkText5() {
		if(objectLinkText5 == null){
			objectLinkText5 = new JTextField(2);
		}
		return objectLinkText5;
	}

	public JTextField getObjectLinkText6() {
		if(objectLinkText6 == null){
			objectLinkText6 = new JTextField(2);
		}
		return objectLinkText6;
	}

	public JTextField getObjectLinkText7() {
		if(objectLinkText7 == null){
			objectLinkText7 = new JTextField(2);
		}
		return objectLinkText7;
	}

	public JTextField getObjectLinkText8() {
		if(objectLinkText8 == null){
			objectLinkText8 = new JTextField(2);
		}
		return objectLinkText8;
	}

	public JTextField getObjectLinkText9() {
		if(objectLinkText9 == null){
			objectLinkText9 = new JTextField(2);
		}
		return objectLinkText9;
	}

	public JTextField getObjectLinkText10() {
		if(objectLinkText10 == null){
			objectLinkText10 = new JTextField(2);
		}
		return objectLinkText10;
	}

	public JLabel getObjectIndexLabel() {
		if(objectIndex == null){
			objectIndex = new JLabel("Index");
		}
		return objectIndex;
	}

	public JLabel getHandleIndexLabel() {
		if(handleIndex == null){
			handleIndex = new JLabel("Index");
		}
		return handleIndex;
	}

	public JButton getMakeRedFish() {
		return makeRedFish;
	}

	public JButton getMakeBlueFish() {
		return makeBlueFish;
	}

	public JButton getMakeYellowFish() {
		return makeYellowFish;
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

	public JButton getMarkAndSweepButton(){
		if(markAndSweep == null){
			markAndSweep= new JButton("Mark and Sweep");
		}
		return markAndSweep;
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
			objectPoolLabelConstraints.gridx = 4;
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
			handleText1Constraints.insets = new Insets(8, 8, 8, 8);
		}
		return handleText1Constraints;
	}

	public GridBagConstraints getObjectText1Constraints() {
		if(objectText1Constraints == null){
			objectText1Constraints = new GridBagConstraints();
			objectText1Constraints.gridx = 4;
			objectText1Constraints.gridy = 1;
			objectText1Constraints.insets = new Insets(8, 8, 8, 8);
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
			yellowFishButtonConstraints.gridy = 4;
			yellowFishButtonConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return yellowFishButtonConstraints;
	}

	public GridBagConstraints getBlueFishButtonConstraints() {
		if(blueFishButtonConstraints == null){
			blueFishButtonConstraints = new GridBagConstraints();
			blueFishButtonConstraints.gridx = 0;
			blueFishButtonConstraints.gridy = 3;
			blueFishButtonConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return blueFishButtonConstraints;
	}

	public GridBagConstraints getMarkAndSweepButtonConstraints() {
		if(markAndSweepButtonConstraints == null){
			markAndSweepButtonConstraints = new GridBagConstraints();
			markAndSweepButtonConstraints.gridx = 0;
			markAndSweepButtonConstraints.gridy = 9;
			markAndSweepButtonConstraints.insets = new Insets(8, 8, 8, 8);
		}
		return markAndSweepButtonConstraints;
	}
}
