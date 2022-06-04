package Finding_Kuro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Game class is the main class for the game
 * @author Icyl Kate Lucero
 *
 */
public class Game {
    
    ChoiceHandler cHandler = new ChoiceHandler();
    GUI gui = new GUI();
    Transition t = new Transition(gui);
    Story story = new Story(this, gui, t);
    
    private String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
       new Game();
    }
    
    public Game(){
        
        gui.createGUI(cHandler);
        story.defaultSetup();
        t.showTitleScreen();
        
   }
    
    /**
	 * @return the nextPosition1
	 */
	public String getNextPosition1() {
		return nextPosition1;
	}

	/**
	 * @param nextPosition1 the nextPosition1 to set
	 */
	public void setNextPosition1(String nextPosition1) {
		this.nextPosition1 = nextPosition1;
	}

	/**
	 * @return the nextPosition2
	 */
	public String getNextPosition2() {
		return nextPosition2;
	}

	/**
	 * @param nextPosition2 the nextPosition2 to set
	 */
	public void setNextPosition2(String nextPosition2) {
		this.nextPosition2 = nextPosition2;
	}

	/**
	 * @return the nextPosition3
	 */
	public String getNextPosition3() {
		return nextPosition3;
	}

	/**
	 * @param nextPosition3 the nextPosition3 to set
	 */
	public void setNextPosition3(String nextPosition3) {
		this.nextPosition3 = nextPosition3;
	}

	/**
	 * @return the nextPosition4
	 */
	public String getNextPosition4() {
		return nextPosition4;
	}

	/**
	 * @param nextPosition4 the nextPosition4 to set
	 */
	public void setNextPosition4(String nextPosition4) {
		this.nextPosition4 = nextPosition4;
	}

	/**
     * This method helps implement the action to be done on which choice the player picks
     * @author Icyl Kate Lucero
     */
    public class ChoiceHandler implements ActionListener{
   
        public void actionPerformed(ActionEvent event){
            
            String yourChoice = event.getActionCommand();
            
            	switch(yourChoice){
                case "start": t.titleToCatVillage(); story.catVillage();break;
                case "c1": story.selectPosition(getNextPosition1());break;
                case "c2": story.selectPosition(getNextPosition2());break;
                case "c3": story.selectPosition(getNextPosition3());break;
                case "c4": story.selectPosition(getNextPosition4());break;
            }
        }
    }
}
    