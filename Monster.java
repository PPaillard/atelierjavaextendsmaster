abstract class Monster {

    private String name;
    private int attack;
    private int life = 40;
    private String type;

    public Monster(String name, int attack, String type) {
        this.name = name;
        this.attack = attack;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Méthode qui permet à monster, d'en attaquer un autre.
     * 
     * @param opponent Instance de la classe monster qui est attaqué
     * @return Si l'opposant est ko ou pas.
     */
    public abstract boolean attack(Monster opponent);

    public boolean isKO() {
        if (this.life <= 0) {
            System.out.println(this.name + " is KO!");
            return true;
        }
        System.out.println(this.name + " has " + this.life + " points remaining.");
        return false;
    }
}