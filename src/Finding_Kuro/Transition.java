package Finding_Kuro;

/**
 * @author Icyl Kate Lucero
 * This class helps switch from the title screen to game screen
 *
 */
public class Transition {
    
    GUI gui;
    
    /**
     * @param userinterface shows the GUI
     */
    public Transition(GUI userinterface){
        
        gui = userinterface;
        
    }
    
    /**
     * Method that shows and hides the title screen
     */
    public void showTitleScreen(){
        
        // shows title screen //
        gui.titleNamePanel.setVisible(true);
        gui.startButtonPanel.setVisible(true);
        
        // hide the game screen //
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);
        }
        
        /**
         * Method for transition from title screen to Cat Village
         */
        public void titleToCatVillage(){
            
        	// hides title screen //
            gui.titleNamePanel.setVisible(false);
            gui.startButtonPanel.setVisible(false);
            
            // shows the game screen //
            gui.mainTextPanel.setVisible(true);
            gui.choiceButtonPanel.setVisible(true);
            gui.playerPanel.setVisible(true);
        }
    }

