public class Wizard extends Character{
    Wizard (String inpName, int inpHealthpoints, int inpLevel, int inpMana){
        super(inpName, inpHealthpoints, inpLevel, inpMana);
    }
    
    public void fireStorm(Character enemyCharacter){    // Firestorm Attack with 50 Damage
        if (super.manaPoints >= 30){                    // Condition to check if enough manapoints
            System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
            int damagePoints = 50;
            super.manaPoints -= 30;                     // Manapoints deduction 
            damageTarget(enemyCharacter, damagePoints); // Call a function from Superclass
        } else {
            System.out.println("Not enough Mana Points");
        }
    };

    public void iceSpikes(Character enemyCharacter){    // Ice Spikes Attack with 50 Damage
        if (super.manaPoints>=25){                      // Condition to check if enough manapoints
            System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Ice Spikes (Damage - 50)");
            int damagePoints = 50;
            super.manaPoints -= 25;                     // Manapoints deduction 
            damageTarget(enemyCharacter, damagePoints); // Call a function from Superclass
        } else {
            System.out.println("Not enough Mana Points");
        }
    };
    
    public void revitalize(){   // Recovery Spell of Wizard
        System.out.println(super.characterName + " used Revitalize (+50 Manapoints)\n");   
        super.manaPoints += 50;
        super.showChar();       // Invoke Super Class to show Stats
    };
}
