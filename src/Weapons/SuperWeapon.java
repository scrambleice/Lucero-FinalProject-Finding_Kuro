package Weapons;

/**
 * @author Icyl Kate Lucero
 * superclass of all weapons
 * @param name is the name of the weapon
 * @param damage is the attack damage of the weapon
 */
public abstract class SuperWeapon {
    protected String name;
    protected int damage;
    
	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	abstract void setName();
	
	abstract void setDamage();
	
	
}
