public class Medic extends Hero {
    private int healPoints = 5;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }


    public void increaseExperience() {
        healPoints = healPoints + ((healPoints / 100) * 10);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Medic" + " budet lechit na " + healPoints);
    }


}
