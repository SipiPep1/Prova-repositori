package proves;

import java.util.ArrayList;
import java.util.Objects;

public class Preferencia2 implements Comparable<Preferencia2> {

    public int ordre;
    public String plat;

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Preferencia2 other = (Preferencia2) obj;
        if (this.ordre != other.ordre) {
            return false;
        }
        if (!Objects.equals(this.plat, other.plat)) {
            return false;
        }
        return true;
    }


    public Preferencia2(int ordre, String plat) {
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
        return "Preferencia2{" + "ordre=" + ordre + ", plat=" + plat + '}';
    }

    @Override
    public int compareTo(Preferencia2 o) {
        if (this.ordre > o.ordre) {
            return 1;
        } else if (this.ordre < o.ordre) {
            return -1;
        } else {
            return 0;
        }
    }
}
