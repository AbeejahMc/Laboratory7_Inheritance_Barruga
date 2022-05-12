public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;
    public int damagePoints;
    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("A new character is created");
    }

    Character(String inpName, int inpHealthpoints, int inpLevel, int inpMana){
        characterName = inpName;
        level = inpLevel;
        healthPoints = inpHealthpoints;
        manaPoints = inpMana;
    }

    public void showChar(){
        System.out.println("Character: " + characterName + "\nLevel: " + level + "\nHP: " + healthPoints + " \nMP: " + manaPoints + "\n");
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */

    /**
     * Create a method to Damage Target Character
     */
    public void checkStatus(Character enemyCharacter) {
        if(enemyCharacter.healthPoints<=0){
            System.out.println( enemyCharacter.characterName + " is defeated");
            this.level += 10;
            System.out.println(this.characterName + " leveled up to " + this.level);
        }
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println( enemyCharacter.characterName + " is damaged");
        enemyCharacter.showChar();
        checkStatus(enemyCharacter);
        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
    }

}