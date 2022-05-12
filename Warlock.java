public class Warlock extends Character{
    Warlock (String inpName, int inpHealthpoints, int inpLevel, int inpMana){
        super(inpName, inpHealthpoints, inpLevel, inpMana);
    }

    public void demonSlash(Character enemyCharacter){   // Attack of the Warlock
        if (super.manaPoints >= 20){                    // Condition to check if enough manapoints
            System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Demon Slash (Damage - 35)");
            int damagePoints = 35;                      
            super.manaPoints -= 20;                     // Manapoints Deduction
            damageTarget(enemyCharacter, damagePoints); // Call a function from Superclass
        } else {
            System.out.println("Not enough Mana Points");
        }
    };
    
    public void energize(){                             // Recovery spell 
        System.out.println(super.characterName + " used Energize (+25 Manapoints)");
        super.manaPoints += 25;
        super.showChar();                               // Invoke a function from superclass
    };
}
