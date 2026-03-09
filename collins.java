import java.util.ArrayList;

public class collins {
    private String weapon;
    private int health;
    private int curHealth;
    private ArrayList<String> spells;
    private int MP;
    private int curMP; 
    private int speed; 

    public collins(){
        weapon = "Wooden Drumsticks";
        health = 47;
        curHealth = 47;
        spells = new ArrayList<String>();
        MP = 5;
        curMP = 5;
        speed = 46;
    }

    public void gainHealth(){
        health += 1;
        curHealth += 1;
    }

    public void gainHealth(int health){
        this.health += health;
        this.curHealth += health;
    }

    public void heal(){
        curHealth = health;
        curMP = MP;
    }

    public void gainMP(){
        MP += 1;
        curMP += 1;
    }

    public void gainMP(int MP){
        this.MP += MP;
        this.curMP += MP;
    }

    public void gainSpeed(){
        speed += 1;
    }

    public void gainSpped(int speed){
        this.speed += speed;
    }

    public void gainSpell(){
        String[] potentialSpells = {"In The Air Tonight","I Don't Care Anymore","Easy Lover","One More Night","Take Me Home","I Can't Dance","Sussudio","In Too Deep"};
    }
}
