package utilitats;

public class OrdenacioCerca {

    public static void main(String[] args) {

      //  int[] a = new int[20];
        // int esquerra=0;
        //  int dreta= a.length -1;
        OrdenacioCerca m = new OrdenacioCerca();
        Comparable[] a = new Comparable[2];
        m.generar(a);
        m.Bimbolla(a);
        m.MostraArray(a);

    }

    public void Bimbolla(Comparable[] a) {
        for (int i = 2; i <= a.length; i++) {
            for (int j = 0; j <= a.length - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    Comparable aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }

        }

    }
    /*public void Bimbolla(int[] a ) {
     for (int i = 2; i < a.length; i++) {
     for (int j = 0; j < a.length - i; j++) {
     if (a[j] > a[j + 1]) {
     int aux = a[j];
     a[j] = a[j + 1];
     a[j + 1] = aux;
     }

     }

     }

     }*/

    public void quickSort(int[] a, int esquerra, int dreta) {

        int i = esquerra;
        int j = dreta;
        int vPivot = a[(i + j) / 2];

        do {
            while (a[i] < vPivot) {
                i++;
            }
            while (a[j] > vPivot) {
                j--;
            }
            if (i <= j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;

            }

        } while (i < j);
        if (esquerra < j) {
            quickSort(a, esquerra, j);

        }
        if (i < dreta) {
            quickSort(a, i, dreta);
        }

    }

    public void generar(int[] a) {

        /* System.out.println("Valors generats: ");
         for (Comparable i = 0; i < a.length; i++) {

         a[i] = (int) (Math.random() * 20) + 1;

         System.out.println(a[i]);*/
    }
}

public void MostraArray(int[] a) {
        System.out.println("Valors ordenats: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
