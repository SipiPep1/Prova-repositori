package proves;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Proves {

    public static void main(String[] args) {
        Proves m = new Proves();
        //m.provaOrdenacio();
        //m.provaBimbollaComparable();
        m.provaCoaArrayDeque();
        //m.provaCollections();
        //m.provaHashset2();
       // m.provaHashmap();
    }

    public void provaCapsa() {

        Capsa<String> prova = new Capsa<>();
        Capsa<Preferencia> prova2 = new Capsa<>();
        prova.setNom("Hola");
    }

    public void provaCollections() {
        ArrayList<Preferencia2> prefe = new ArrayList<>();
        prefe.add(0, new Preferencia2(1, "kebab"));
        prefe.add(1, new Preferencia2(2, "pollo"));
        prefe.add(2, new Preferencia2(3, "pizza"));

        Collections.shuffle(prefe);
        System.out.println("shuffle: " + prefe);

        Collections.reverse(prefe);
        System.out.println("reverse: " + prefe);
        Collections.sort(prefe);
        System.out.println("sort: " + prefe);

        System.out.println("max : " + Collections.max(prefe));
        System.out.println("min : " + Collections.min(prefe));
        Collections.swap(prefe, 0, 1);
        System.out.println("swap: " + prefe);
    }

    public void provaHashset() {

        HashSet<Preferencia> plat1 = new HashSet<>();

        Preferencia pollo = new Preferencia(1, "pollo");
        Preferencia pollo2 = new Preferencia(1, "pollo");
        Preferencia paella = new Preferencia(1, "paella");

        plat1.add(pollo);
        plat1.add(pollo2);
        plat1.add(paella);
        System.out.println(plat1);
        System.out.println(plat1.contains(paella));
        System.out.println(plat1.size());
        System.out.println(plat1.remove(pollo));
        System.out.println(plat1);
        System.out.println(plat1.isEmpty());

    }

    /*public void provaHashset2() {

     HashSet<Preferencia2> plat1 = new HashSet<>();

     Preferencia2 pollo = new Preferencia(1, "pollo");
     Preferencia2 pollo2 = new Preferencia(1, "pollo");
     Preferencia2 paella = new Preferencia(1, "paella

     plat1.add(pollo);
     plat1.add(pollo2);
     plat1.add(paella);
     System.out.println(plat1);
     System.out.println(plat1.contains(paella));
     System.out.println(plat1.size());
     System.out.println(plat1.remove(pollo));
     System.out.println(plat1);
     System.out.println(plat1.isEmpty());

     }*/
    public void provaHashmap() {
        HashMap<Integer, Preferencia> map = new HashMap<>();

        Preferencia plat3 = new Preferencia(1, "pep");
        Preferencia plat4 = new Preferencia(2, "pizza");
        Preferencia plat5 = new Preferencia(3, "sopa");

        map.put(100, plat3);
        map.put(101, plat4);
        map.put(102, plat5);

        System.out.println("Conté la clau: " + map.containsKey(100));
        System.out.println("Conté el valor : " + map.containsValue(plat5));
        System.out.println("Valor asociat a la clau: " + map.get(100));
        System.out.println(map);
        System.out.println(map.size());

        map.remove(101);
        if (map.containsKey(101) == false) {
            System.out.println("S'ha pogut llevar");

        } else {
            System.out.println("No s'ha pogut llevar");
        }

        System.out.println(map);
        
        System.out.println(map.isEmpty());
    }

    public void mostrarArray(int[] a) {
        System.out.println("Valors generats: ");

        for (int i = 0; i < a.length; i++) {

            a[i] = i;

            System.out.println(a[i]);

        }

    }

    public void provaOrdenacio() {

        int[] a = new int[20];
        System.out.println("Valors generats: ");

        for (int i = 0; i < a.length; i++) {

            a[i] = (int) Math.random() * 20 + 0;

            System.out.println(a[i]);

        }

        for (int i = 2; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }

        }

        for (int i = 0; i < a.length; i++) {

            a[i] = i;

            System.out.println(a[i]);

        }

    }

    public void provaBimbollaComparable() {

        Preferencia[] Array = new Preferencia[3];

        Preferencia objecte0 = new Preferencia(3, "Paella");
        Preferencia objecte1 = new Preferencia(1, "Sopa");
        Preferencia objecte2 = new Preferencia(2, "Fideus");

        Array[0] = objecte2;
        Array[1] = objecte0;
        Array[2] = objecte1;
        System.out.println("Sense ordenar:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        utilitats.OrdenacioCerca m = new utilitats.OrdenacioCerca();
        m.Bimbolla(Array);

        System.out.println("Ordenat:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }

    public void provaCoaArrayDeque() {
        ArrayDeque coa = new ArrayDeque();

        ArrayDeque pep= new ArrayDeque();
        
        coa.add(1);
        coa.add(2);
        coa.add(3);

        System.out.println(coa.size());
    }

}
