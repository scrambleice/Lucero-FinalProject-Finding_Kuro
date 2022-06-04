package Finding_Kuro;

import Weapons.SuperWeapon;

/**
 * @author Icyl Kate C. Lucero
 * This class shows the status of the player's hit points and current weapon being used
 */
public class Player {
	
    private int hp;
	private SuperWeapon currentWeapon;
	
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	/**
	 * @return the currentWeapon
	 */
	public SuperWeapon getCurrentWeapon() {
		return currentWeapon;
	}
	
	/**
	 * @param currentWeapon the currentWeapon to set
	 */
	public void setCurrentWeapon(SuperWeapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}
    
}
