package app.uiharuneko.java;

public class PVZ {
    public static void main(String[] args) {
        Line line = new Line(36);
        plants peaShooter = new plants("PeaShooter",120,10);
        zombies zombie = new zombies("zombie",200,20);
        zombie.setHp(peaShooter.hit(zombie.getHp(),peaShooter.getAttack()));
        System.out.println(zombie.getHp());
    }
}
class plants{
    private String name;
    private int hp;
    private int attack;

    public plants(){}

    public plants(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int hit(int zHp,int pAck){
        zHp -= pAck;
        return zHp;
    }
}

class zombies{
    private String name;
    private int hp;
    private int attack;

    public zombies(){}

    public zombies(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int hit(int pHp,int zAck){
        pHp -= zAck;
        return pHp;
    }
}
class Line{
    private int line;
    public Line(){}

    public Line(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
class Sun{
    private int sun;

    public Sun(int sun) {
        this.sun = sun;
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }
}