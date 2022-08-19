public abstract class Hero implements HavingSuperAbility {
    private int zdorovie;
    private int uron;
    private String tipSupersposobnost;

    public int getZdorovie() {
        return zdorovie;
    }

    public void setZdorovie(int zdorovie) {
        this.zdorovie = zdorovie;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }

    public String getTipSupersposobnost() {
        return tipSupersposobnost;
    }

    public void setTipSupersposobnost(String tipSupersposobnost) {
        this.tipSupersposobnost = tipSupersposobnost;
    }
}
