class FireMonster extends Monster {

    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage = this.getAttack();
        // Si le type de l'opposant est air, on double l'attaque
        if ("air".equals(opponent.getType())) {
            damage *= 2;
        }
        // on réduit la vie de l'opposant
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
}