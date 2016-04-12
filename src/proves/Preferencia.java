package proves;

public class Preferencia implements Comparable<Preferencia> {

    public int ordre;
    public String plat;

    public Preferencia(int ordre, String plat) {
        this.ordre = ordre;
        this.plat = plat;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getPlat() {
        return plat;
    }

    @Override
    public String toString() {
        return "Preferencia{" + "ordre=" + ordre + ", plat=" + plat + '}';
    }

    @Override
    public int compareTo(Preferencia o) {
        if (this.ordre > o.ordre) {
            return 1;
        } else if (this.ordre < o.ordre) {
            return -1;
        } else {
            return 0;
        }
    }
}
