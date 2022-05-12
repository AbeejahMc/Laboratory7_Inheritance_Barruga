public class Character {
    public String characterName;    // Character Name
    public int level;               // Level of character
    public int healthPoints;        // HP of character
    public int manaPoints;          // Amount of mana
    public int damagePoints;        // Amount of damage to be dealt

    Character(){
        System.out.println("A new character is created");
    }

    Character(String inpName, int inpHealthpoints, int inpLevel, int inpMana){
        characterName = inpName;
        level = inpLevel;
        healthPoints = inpHealthpoints;
        manaPoints = inpMana;
    }

    public void showChar(){                             // Presents character status
        System.out.println("Character: " + characterName + "\nLevel: " + level + "\nHP: " + healthPoints + " \nMP: " + manaPoints + "\n");
    }

    public void checkStatus(Character enemyCharacter) {
        if(enemyCharacter.healthPoints<=0){             // Condition if enemy hp is 0
            System.out.println( enemyCharacter.characterName + " is defeated");
            this.level += 10;                           // Increase level by 10
            System.out.println(this.characterName + " leveled up to " + this.level);
        }
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){
        enemyCharacter.healthPoints -= damagePoints;    // Deduct healthpoints
        System.out.println(enemyCharacter.characterName + " is damaged");
        enemyCharacter.showChar();                      // Check enemy status
        checkStatus(enemyCharacter);                    // Call function to check if defeated
    }

}