
package utilitats;


public class Bombolla {
    
        public void Bimbolla(int[] a) {
        for (int i = 2; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }

        }

    }
}
