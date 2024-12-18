class AirMonster extends Monster {

    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    /**
     * Méthode qui permet à monster, d'en attaquer un autre.
     * 
     * @param opponent Instance de la classe monster qui est attaqué
     * @return Si l'opposant est ko ou pas.
     */
    @Override
    public boolean attack(Monster opponent) {
        int damage = this.getAttack();
        // Si le type de l'opposant est water, on double l'attaque
        if ("water".equals(opponent.getType())) {
            damage *= 2;
        }
        // on réduit la vie de l'opposant
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
}