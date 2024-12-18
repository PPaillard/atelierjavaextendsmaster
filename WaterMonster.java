class WaterMonster extends Monster {
    public WaterMonster(String name, int attack) {
        super(name, attack, "water");
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage = this.getAttack();
        // Si le type de l'opposant est fire, on double l'attaque
        if ("fire".equals(opponent.getType())) {
            damage *= 2;
        }
        // on réduit la vie de l'opposant
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
}