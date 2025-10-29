public class Monster {
    private int arms;
    private int legs;
    private int eyes;
    private int buttons;
    private String name;
    public Monster() {
        this.arms = 0;
        this.legs = 0;
        this.eyes = 0;
        this.buttons = 0;
        this.name = "";
    }
    public Monster(int arms, int eyes, int legs, int buttons, String name) {
        this.arms = arms;
        this.legs = legs;
        this.eyes = eyes;
        this.buttons = buttons;
        this.name = name;
    }
    public int getArms() {
        return this.arms;
    }
    public void setArms(int arms) {
        this.arms = arms;
    }
    public int getLegs() {
        return this.legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public int getEyes() {
        return this.eyes;
    }
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public int getButtons() {
        return this.buttons;
    }
    public void setButtons(int buttons) {
        this.buttons = buttons;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "";
    }
}