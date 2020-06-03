package pl.p.lodz.zzpj2020.generics.zad1;

public class Step {
    private String descryption;

    public Step() {
    }

    public Step(String descryption) {
        this.descryption = descryption;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    @Override
    public String toString() {
        return "Step{" +
                "descryption='" + descryption + '\'' +
                '}';
    }
}
