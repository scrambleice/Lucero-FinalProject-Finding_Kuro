package Finding_Kuro;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Finding_Kuro.Game.ChoiceHandler;

/**
 * Method for showing the graphical components in the GUI
 * @author Icyl Kate C. Lucero
 *
 */
public class GUI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("MonoSpaced", Font.BOLD, 60);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
    
    /**
     * @param cHandler handles the choice of the player
     */
    public void createGUI(ChoiceHandler cHandler){
        //window//
    		window = new JFrame();
    		window.setSize(800,600);
    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		window.getContentPane().setBackground(Color.white);
    		window.setLocationRelativeTo(null);
    		window.setLayout(null);      
        //title screen//
    			titleNamePanel = new JPanel();
    			titleNamePanel.setBounds(100, 100, 600, 500);
    			titleNamePanel.setBackground(Color.white);
    			titleNameLabel = new JLabel("FINDING KURO");
    			titleNameLabel.setForeground(Color.black);
    			titleNameLabel.setFont(titleFont);
    			titleNamePanel.add(titleNameLabel);
        //start button//
    			startButtonPanel = new JPanel();
    			startButtonPanel.setBounds(300, 400, 200, 100);
    			startButtonPanel.setBackground(Color.white);
    			startButton = new JButton("START");
    			startButton.setBackground(Color.white);
    			startButton.setForeground(Color.black);
    			startButton.setFont(normalFont);
    			startButton.setFocusPainted(false);
    			startButton.addActionListener(cHandler);
    			startButton.setActionCommand("start");
    			startButtonPanel.add(startButton);
    			
    			window.add(titleNamePanel);
    			window.add(startButtonPanel);
       //game screen//
    			mainTextPanel = new JPanel();
    			mainTextPanel.setBounds(100, 100, 600, 250);
    			mainTextPanel.setBackground(Color.white);
    			window.add(mainTextPanel);
    			mainTextArea = new JTextArea("This is the main text area");
    			mainTextArea.setBounds(200, 200, 500, 300);
    			mainTextArea.setBackground(Color.white);
    			mainTextArea.setForeground(Color.black);
    			mainTextArea.setFont(normalFont);
    			mainTextArea.setLineWrap(true);
    			mainTextArea.setWrapStyleWord(true);
    			mainTextArea.setEditable(false);
    			mainTextPanel.add(mainTextArea);
       //choice buttons//
    				choiceButtonPanel = new JPanel();
    				choiceButtonPanel.setBounds(150, 350, 400, 150);
    				choiceButtonPanel.setBackground(Color.white);
    				choiceButtonPanel.setLayout(new GridLayout(4,1));
    				
    				window.add(choiceButtonPanel);
       //choice button 1//
    				choice1 = new JButton("choice1");
    				choice1.setBackground(Color.white);
    				choice1.setForeground(Color.black);
    				choice1.setFont(normalFont);
    				choice1.setFocusPainted(false);
    				choice1.addActionListener(cHandler);
    				choice1.setActionCommand("c1");
    				
    				choiceButtonPanel.add(choice1);
       //choice button 2//
    				choice2 = new JButton("choice2");
    				choice2.setBackground(Color.white);
    				choice2.setForeground(Color.black);
    				choice2.setFont(normalFont);
    				choice2.setFocusPainted(false);
    				choice2.addActionListener(cHandler);
    				choice2.setActionCommand("c2");
    				
    				choiceButtonPanel.add(choice2);
       //choice button 3//
    				choice3 = new JButton("choice3");
    				choice3.setBackground(Color.white);
    				choice3.setForeground(Color.black);
    				choice3.setFont(normalFont);
    				choice3.setFocusPainted(false);
    				choice3.addActionListener(cHandler);
    				choice3.setActionCommand("c3");
    				
    				choiceButtonPanel.add(choice3);
       //choice button 4//
    				choice4 = new JButton("choice4");
    				choice4.setBackground(Color.white);
    				choice4.setForeground(Color.black);
    				choice4.setFont(normalFont);
    				choice4.setFocusPainted(false);
    				choice4.addActionListener(cHandler);
    				choice4.setActionCommand("c4");
    				
    				choiceButtonPanel.add(choice4);
       //player status//
    		playerPanel = new JPanel();
    		playerPanel.setBounds(100, 15, 600, 50);
    		playerPanel.setBackground(Color.white);
    		playerPanel.setLayout(new GridLayout(1,4));
    		
    		window.add(playerPanel);
       //hp label//
    		hpLabel = new JLabel("HP: ");
    		hpLabel.setFont(normalFont);
    		hpLabel.setForeground(Color.black);
    		
    		playerPanel.add(hpLabel);
    		
    		hpNumberLabel = new JLabel();
    		hpNumberLabel.setForeground(Color.black);
    		hpNumberLabel.setFont(normalFont);
    		playerPanel.add(hpNumberLabel);
       //weapon label//
    		weaponLabel = new JLabel("Weapon: ");
    		weaponLabel.setForeground(Color.black);
    		weaponLabel.setFont(normalFont);
    		playerPanel.add(weaponLabel);
    		weaponNameLabel = new JLabel();
    		weaponNameLabel.setForeground(Color.black);
    		weaponNameLabel.setFont(normalFont);
    		playerPanel.add(weaponNameLabel);
       
       window.setVisible(true);
    }
}
