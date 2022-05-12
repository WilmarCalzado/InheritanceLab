public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Storm (Damage - 50)");
        int damagePoints = 50;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void moonlight(Character enemyCharacter){
        System.out.println(super.characterName + " use moonlight (Hp +30)(Mana +20)");
        int recover = 30;
        int mana = 20;
        Recovery(enemyCharacter, recover, mana);
    };
    public void IncreaseLevel(Character Winner){
        int levelIncrease = 10;
        Level(Winner, levelIncrease);
    };
}
