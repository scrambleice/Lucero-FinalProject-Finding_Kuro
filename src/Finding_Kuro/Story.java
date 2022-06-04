package Finding_Kuro;
import Enemies.Bandits;
import Enemies.Demon;
import Enemies.SuperEnemy;
import Weapons.Claymore;
import Weapons.Sword;
import Weapons.Fists;

/**
 * This class stores the dialogues and the possible choices in the game
 * @author Icyl Kate Lucero
 */

public class Story implements Events {
    Game game;
    GUI gui;
    Transition t;
    Player player = new Player();
    SuperEnemy enemy;
    
    /**
     * @param g moves the player from current position to the selected position
     * @param userinterface shows the GUI
     * @param transition helps transition from title screen to game screen
     */
    public Story(Game g, GUI userinterface, Transition transition){
        game = g;
        gui = userinterface;
        t = transition;
      }
    
    /**
     * This is the default status of the player at the start of the game
     * @param player.hp is the default hit points of the player
     * @param player.currentWeapon is the default weapon of the player
     */
    
    public void defaultSetup(){
    	player.setHp(50);
        gui.hpNumberLabel.setText("" + player.getHp());
        player.setCurrentWeapon(new Fists());
        gui.weaponNameLabel.setText(player.getCurrentWeapon().getName());
     }
   
    /**
     * @param nextPosition helps switch to the location the player chooses
     * Note that there is a break after each case so that it does not loop in the current position
     */
    public void selectPosition(String nextPosition){	
    	switch(nextPosition) {
    	case "catVillage": catVillage();break;
    	case "talkElder": talkElder();break;
    	case "crossroad": crossroad();break;
    	case "spiritForest": spiritForest();break;
    	case "riverside": riverside();break;
    	case "gooeySwamp": gooeySwamp();break;
    	case "abandonedCabin": abandonedCabin();break;
    	case "doomMountains": doomMountains();break;
    	case "blockTown": blockTown();break;
    	case "encounterBandits": encounterBandits();break;
    	case "fightBandits": fightBandits();break;
    	case "banditsAttack": banditsAttack();break;
    	case "winBandits": winBandits();break;
    	case "loseGame": loseGame();break;
    	case "openTown": openTown();break;
    	case "hutWitch": hutWitch();break;
    	case "talkWitch": talkWitch();break;
    	case "healWitch": healWitch();break;
    	case "demonLair": demonLair(); break;
    	case "fightDemon": fightDemon();break;
    	case "demonAttack": demonAttack();break;
    	case "winGame": winGame();break;
    	case "toTitle": toTitle();break;
    	}
    }
    
    @Override
    public void catVillage() {
    	gui.mainTextArea.setText("You seem to have lost your cat, Kuro, and tried to find him in the Cat Village. \nHe is not in this place. \nYou see the Cat Elder of the village infront of you. \n\n(What will you do?)");
    	gui.choice1.setText("Talk to the Cat Elder");
    	gui.choice2.setText("Leave the Cat Village");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	game.setNextPosition1("talkElder");
    	game.setNextPosition2("crossroad");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void talkElder() {
    	gui.mainTextArea.setText("Cat Elder: Hello, stranger. I'm sorry but your cat is not here in our humble village. He seems to have been kidnapped by the Evil Demon in the Demon Lair. Safe travels.");
    	gui.choice1.setText("Back");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("catVillage");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void crossroad() {
    	gui.mainTextArea.setText("You are at the crossroad. \nIf you go south, you will go back to the Cat Village again. \nTo the north, you see a swamp. \nYou see a riverside not far away on your east. \nOn your west, you see an abandoned cabin. \n\n(What will you do?)");
    	gui.choice1.setText("Go North (Gooey Swamp)");
    	gui.choice2.setText("Go East (Riverside)");
    	gui.choice3.setText("Go South (Cat Village)");
    	gui.choice4.setText("Go West (Abandoned Cabin)");
    	game.setNextPosition1("gooeySwamp");
    	game.setNextPosition2("riverside");
    	game.setNextPosition3("catVillage");
    	game.setNextPosition4("abandonedCabin");
    }
    
    @Override
    public void gooeySwamp() {
    	gui.mainTextArea.setText("You are at the gooey swamp \nThe nasty smell of the swamp makes you woozy. \n\nTo the south of the swamp is the Doom Mountains. \nTo the west of the swamp is back to the crossroad. \n\n(What will you do?)");
    	gui.choice1.setText("Go South (Mountains of Doom)");
    	gui.choice2.setText("Go West (Crossroad)");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	game.setNextPosition1("doomMountains");
    	game.setNextPosition2("crossroad");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void spiritForest() {
    	gui.mainTextArea.setText("You entered the Spirit Forest. \nIt seems like a very peaceful forest without any monsters lurking. \nYou wasted your time by walking in circles in the forest. \nIt's best to go to another path.");
    	gui.choice1.setText("Back");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("riverside");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void riverside() {
    	gui.mainTextArea.setText("You walked into the riverside and drank water. You felt sleepy and took a nap. \n\n(Your HP is recovered by 5) \n\nNorth from the riverside is the crossroad, while west is the Spirit Forest. \n\n(What will you do?)");
    	player.setHp(player.getHp() + 5);
    	gui.hpNumberLabel.setText("" + player.getHp());
    	gui.choice1.setText("Go North (Crossroad)");
    	gui.choice2.setText("Go West (Spirit Forest)");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("crossroad");
    	game.setNextPosition2("spiritForest");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void abandonedCabin() {
    	gui.mainTextArea.setText("You walked into the Abandoned Cabin and found a Sword! \n\n(You obtained Sword)");
    	player.setCurrentWeapon(new Sword());
    	gui.weaponNameLabel.setText(player.getCurrentWeapon().getName());
    	gui.choice1.setText("Back");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("crossroad");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void doomMountains() {
    	gui.mainTextArea.setText("You are at the Doom Mountains. \nSouth of the mountains is the path to the Evergreen Town. \nNorth of the mountains is the path back to the swamp. \n\n(What will you do?)");
    	gui.choice1.setText("Go South (Evergreen Town)");
    	gui.choice2.setText("Go North (Gooey Swamp)");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("blockTown");
    	game.setNextPosition2("gooeySwamp");
    	game.setNextPosition3("");
    	game.setNextPosition4("");	
    }
    
    @Override
    public void blockTown() {
		gui.mainTextArea.setText("You have arrived in Evergreen Town. \nIt seems that the mood of the place is frightened due to the presence of the bandits near. \nThe townspeople are scared of going in and out as they might be attacked by them, resulting on them agreeing to block the gates. \nYou see that there is a man guarding the entrance of the town. \nThe guard asks you to help them eradicate the bandits. \n\n(What will you do?)");
		gui.choice1.setText("Help town defeat the Bandits");
    	gui.choice2.setText("Go to another path");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	game.setNextPosition1("encounterBandits");
    	game.setNextPosition2("hutWitch");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
	}
    
    @Override
    public void encounterBandits() {
    	
    	enemy = new Bandits();
    	gui.mainTextArea.setText(enemy.getName() + "' HP: " + enemy.getHp() + "\n\n(What will you do?)");
		gui.choice1.setText("Fight Bandits");
    	gui.choice2.setText("Run");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	game.setNextPosition1("fightBandits");
    	game.setNextPosition2("hutWitch");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
	}
    
    @Override
    public void fightBandits() {
    	int playerDamage = new java.util.Random().nextInt(player.getCurrentWeapon().getDamage());
    	gui.mainTextArea.setText("You attacked " + enemy.getName() + " and gave " + playerDamage + " damage!");
    	enemy.setHp(enemy.getHp() - playerDamage);
    	gui.choice1.setText("Next");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	if(enemy.getHp()>0) {
    		game.setNextPosition1("banditsAttack");
        	game.setNextPosition2("hutWitch");
        	game.setNextPosition3("");
        	game.setNextPosition4("");
    	}
    	else if(enemy.getHp()<1) {
    		game.setNextPosition1("winBandits");
        	game.setNextPosition2("");
        	game.setNextPosition3("");
        	game.setNextPosition4("");
    	}
    }
    
    @Override
    public void banditsAttack() {
    	int banditDamage = new java.util.Random().nextInt(enemy.getAttack());
    		gui.mainTextArea.setText("The " + enemy.getName() + " attacked you and gave " + banditDamage + " damage!");
    		player.setHp(player.getHp() - banditDamage);
    		gui.hpNumberLabel.setText("" + player.getHp());
    		gui.choice1.setText("Next");
        	gui.choice2.setText("");
        	gui.choice3.setText("");
        	gui.choice4.setText("");
        	
        	if(player.getHp()>0) {
        		game.setNextPosition1("fightBandits");
            	game.setNextPosition2("");
            	game.setNextPosition3("");
            	game.setNextPosition4("");
        	}
        	else if(player.getHp()<1) {
        		game.setNextPosition1("lose");
            	game.setNextPosition2("");
            	game.setNextPosition3("");
            	game.setNextPosition4("");
        	}
    	}
    
    @Override
    public void winBandits() {
    	gui.mainTextArea.setText("You defeated the Bandits! \nYou better tell the Evergreen Town of the good news!");
		gui.choice1.setText("Go to Evergreen Town");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("openTown");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void loseGame() {
    	gui.mainTextArea.setText("You are dead! \n\nGAME OVER! \n\nTHANK YOU FOR PLAYING!");
    	gui.choice1.setText("Title Screen");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("toTitle");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
    public void openTown() {
		gui.mainTextArea.setText("Guard: Thanks for the help, traveller! As a token of gratitude from us, we present you this Claymore as thanks. \n\n(You obtained Claymore) \n\nGuard: Since the gates are now opened, you can proceed to the shortcut to the Witch's Hut. Stay safe, traveller.");
		player.setCurrentWeapon(new Claymore());
    	gui.weaponNameLabel.setText(player.getCurrentWeapon().getName());
		gui.choice1.setText("Go to Witch's Hut");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("hutWitch");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
    
    @Override
	public void hutWitch() {
		gui.mainTextArea.setText("You have arrived at the Witch's Hut. \nYou see the witch inside the hut chanting some sort of magical spell. \nNear the Witch's Hut is a path filled with vines that somehow looks like a way to the Demon's Lair.");
		gui.choice1.setText("Talk to the Witch");
    	gui.choice2.setText("Go to the Demon's Lair");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("talkWitch");
    	game.setNextPosition2("demonLair");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
    }
	
    @Override
	public void talkWitch() {
		gui.mainTextArea.setText("Witch: Oh hello there! Don't worry, I don't bite. Although I may look scary, I'm actually quite friendly and knowledgable about a lot of things. So, you're here to defeat the Demon, aye? I say it's quite a frightening creature. \n\n(What will you do?)");
		gui.choice1.setText("Be healed by the Witch");
    	gui.choice2.setText("Back");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	game.setNextPosition1("healWitch");
    	game.setNextPosition2("hutWitch");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
	}
	
    @Override
	public void healWitch() {
		gui.mainTextArea.setText("You were healed by the witch's casted healing spell. \n\n(Your HP recovered by 5)");
		player.setHp(player.getHp() + 5);
    	gui.hpNumberLabel.setText("" + player.getHp());
		gui.choice1.setText("Back");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("talkWitch");
    	game.setNextPosition2("");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
	}
	
    @Override
	public void demonLair() {
		enemy = new Demon();
		gui.mainTextArea.setText("Demon: Oh, so you've come to take your pet cat, huh? Well, too bad. I locked him away in my spatial inventory. The only way to get him is to defeat me, the Almighty Demon Lord! Be prepared, traveller!\n"
				+ enemy.getName() + "'s HP: " + enemy.getHp() + "\n\n(What will you do?)");
		gui.choice1.setText("Fight Demon");
    	gui.choice2.setText("Run");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	game.setNextPosition1("fightDemon");
    	game.setNextPosition2("hutWitch");
    	game.setNextPosition3("");
    	game.setNextPosition4("");
	}
	
    @Override
	public void fightDemon() {
		int playerDamage = new java.util.Random().nextInt(player.getCurrentWeapon().getDamage());
    	gui.mainTextArea.setText("You attacked " + enemy.getName() + " and gave " + playerDamage + " damage!");
    	enemy.setHp(enemy.getHp() - playerDamage);
    	gui.choice1.setText("Next");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	if(enemy.getHp()>0) {
    		game.setNextPosition1("demonAttack");
        	game.setNextPosition2("hutWitch");
        	game.setNextPosition3("");
        	game.setNextPosition4("");
    	}
    	else if(enemy.getHp()<1) {
    		game.setNextPosition1("winGame");
        	game.setNextPosition2("");
        	game.setNextPosition3("");
        	game.setNextPosition4("");
    	}
	}
	
    @Override
	public void demonAttack() {
		int demonDamage = new java.util.Random().nextInt(enemy.getAttack());
		gui.mainTextArea.setText("The " + enemy.getName() + " attacked you and gave " + demonDamage + " damage!");
		player.setHp(player.getHp() - demonDamage);
		gui.hpNumberLabel.setText("" + player.getHp());
		gui.choice1.setText("Next");
    	gui.choice2.setText("");
    	gui.choice3.setText("");
    	gui.choice4.setText("");
    	
    	if(player.getHp()>0) {
    		game.setNextPosition1("fightDemon");
        	game.setNextPosition2("");
        	game.setNextPosition3("");
        	game.setNextPosition4("");
    	}
    	else if(player.getHp()<1) {
    		game.setNextPosition1("loseGame");
        	game.setNextPosition2("");
        	game.setNextPosition3("");
        	game.setNextPosition4("");
    	}
	}
	
    @Override
	public void winGame() {
	 gui.mainTextArea.setText("Demon: NO! I won't accept being defeated by a puny human like you!!! \nThe demon disappeared with the last slash of your blade. You see your cat, Kuro, magically appearing as the last ashes of the demon disappeared into nothing. \nYou hug Kuro tightly in your arms, finally thinking that it was all just a nightmare. \nTHE END \nThank you for playing!");
	 	gui.choice1.setText("Title Screen");
 		gui.choice2.setText("");
 		gui.choice3.setText("");
 		gui.choice4.setText("");
 		game.setNextPosition1("toTitle");
 		game.setNextPosition2("");
 		game.setNextPosition3("");
 		game.setNextPosition4("");
	}
	
	/**
	 * Method that takes care after player wins the game
	 * This changes the GUI from game screen to title screen
	 */
	public void toTitle() {
		defaultSetup();
		t.showTitleScreen();
	}
}
