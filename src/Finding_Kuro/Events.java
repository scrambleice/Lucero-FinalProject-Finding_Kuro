package Finding_Kuro;

public interface Events {
	
	/**
	 * Method that takes care if the player chooses to go to Cat Village
	 */
	void catVillage();
	/**
	 * Method that takes care if the player chooses to talk to Cat Elder
	 */
	void talkElder();

	/**
	 * Method that takes care if player chooses to go to the Crossroad
	 */
	void crossroad();

	/**
	 * Method that takes care if player chooses to go to the Gooey Swamp
	 */
	void gooeySwamp();

	/**
	 * Method that takes care if player chooses to go to Spirit Forest
	 */
	void spiritForest();

	/**
	 * Method that takes care if player chooses to go to Riverside
	 */
	void riverside();

	/**
	 * Method that takes care if player chooses to go to Abandoned Cabin
	 */
	void abandonedCabin();

	/**
	 * Method that takes care if player chooses to go to Doom Mountains
	 */
	void doomMountains();

	/**
	 * Method that takes care if player chooses to go to Evergreen Town
	 * Note that it is blocked by bandits therefore player cannot enter the town without defeating them
	 */
	void blockTown();

	/**
	 * Method that takes care if player chooses to encounter the bandits
	 */
	void encounterBandits();

	/**
	 * Method that takes care if it is player's turn to attack the bandits
	 */
	void fightBandits();

	/**
	 * Method that takes care if it it bandits' turn to attack the player
	 */
	void banditsAttack();

	/**
	 * Method that takes care if the player defeats the bandits
	 */
	void winBandits();

	/**
	 * Method that takes care if player dies from fighting the enemies
	 */
	void loseGame();

	/**
	 * Method that takes care after defeating the bandits
	 */
	void openTown();

	/**
	 * Method that takes care if player chooses to go to Witch's Hut
	 */
	void hutWitch();

	/**
	 * Method that takes care if player chooses to talk to the Witch
	 */
	void talkWitch();

	/**
	 * Method that takes care if player chooses to be healed by the Witch
	 */
	void healWitch();

	/**
	 * Method that takes care if player chooses to go to Demon Lair and fight the Demon
	 */
	void demonLair();

	/**
	 * Method that takes care if it's players turn to attack the Demon
	 */
	void fightDemon();

	/**
	 * Method that takes care if it's Demon's turn to attack the player
	 */
	void demonAttack();

	/**
	 * Method that takes care if player wins against the Demon
	 */
	void winGame();
	
}
