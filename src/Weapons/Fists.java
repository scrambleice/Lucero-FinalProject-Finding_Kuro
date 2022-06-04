package Weapons;

/**
 * @author Icyl Kate C. Lucero
 * This class inherits members in SuperWeapon superclass 
 * This is the default 'weapon' of the player
 */
public class Fists extends SuperWeapon{
    public Fists(){
        setName();
        setDamage();
    }

	@Override
	void setName() {
		this.name = "Fists";
		
	}

	@Override
	void setDamage() {
		this.damage = 3;
		
	}
}
