class Arena {

    public static void main(String[] args) {

        WaterMonster wm = new WaterMonster("Toto", 10);
        FireMonster fm = new FireMonster("Tata", 5);

        do {
            wm.attack(fm);
            if (!fm.isKO())
                fm.attack(wm);
        } while (!fm.isKO() && !wm.isKO());
    }

}