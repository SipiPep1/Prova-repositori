package utilitats;

public class CercaBinaria {

    public static void main(String[] args) {

        int[] a = new int[20];
        int cercat = 15;
        CercaBinaria m = new CercaBinaria();
        m.generar(a);
        int recerca = m.CercaBinaria(a, cercat);
        System.out.println("El nombre està en la posició :  " + recerca);

    }

    public int CercaBinaria(int[] a, int cercat) {

        int inici = 0;
        int fi = a.length - 1;
        int mig = -1;
        while (inici <= fi) {
            mig = (inici + fi) / 2;
            if (cercat == a[mig]) {
                return mig;

            } else if (a[mig] > cercat) {
                fi = mig - 1;
            } else {
                inici = mig + 1;
            }

        }
        return -1;

    }

    public void generar(int[] a) {
        System.out.println("Valors generats: ");

        for (int i = 0; i < a.length; i++) {

            a[i] = i;

            System.out.println(a[i]);

        }

    }
}
