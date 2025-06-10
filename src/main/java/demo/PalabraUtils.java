package demo;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;

public class PalabraUtils {
    private static final List<String> palabras = new ArrayList();
    private static int index = 0;

    static {
        palabras.add("Ca12sa");
        palabras.add("5Celular");
        palabras.add("Perro3");
        palabras.add("Compu6tadora");
        palabras.add("Tele7visor");
        palabras.add("Moto4cicleta");
        palabras.add("13Avión");
        palabras.add("2Baño");
        palabras.add("Cama10");
        palabras.add("Sil9la");
        palabras.add("Mesa8");
        palabras.add("Lámpara11");
        palabras.add("Espejo15");
        palabras.add("Puerta1");
        palabras.add("Ventana5");
        palabras.add("Auto14");
        palabras.add("Computadora6");
        palabras.add("Bicicle9ta");
        palabras.add("Coche3");
        palabras.add("Hel7adera");
        palabras.add("Microon2das");
        palabras.add("8Libro");
        palabras.add("Revist4a");
        palabras.add("Teclado12");
        palabras.add("Mouse1");
        palabras.add("Mo11nitor");
        palabras.add("Par10ed");
        palabras.add("Te5cho");
        palabras.add("S6uelo");
        palabras.add("13Celular");
        palabras.add("Audífono2s");
        palabras.add("7Parlante");
        palabras.add("Cl4ontro");
        palabras.add("Remoto15");
        palabras.add("Bo9lsa");
        palabras.add("Ca3ja");
        palabras.add("6Botella");
        palabras.add("Vaso8");
        palabras.add("T5aza");
        palabras.add("Plat12o");
        palabras.add("1Cuchara");
        palabras.add("Tenedor14");
        palabras.add("Cu11chillo");
        palabras.add("O7lla");
        palabras.add("Sartén9");
        palabras.add("Colado2r");
        palabras.add("Camp3ana");
        palabras.add("Horno13");
        palabras.add("Cafetera10");
    }

    public static String nextPalabra() {
        return hasNext() ? (String)palabras.get(index++) : null;
    }

    public static boolean hasNext() {
        return index < palabras.size();
    }

    public static void reset() {
        index = 0;
    }

    public static Object[] splitPalabra(String p)
    {
        // desde
        int p0=0;
        while(!Character.isDigit(p.charAt(p0++)));
        p0--;

        // hasta
        int p1=p.length()-1;
        while(!Character.isDigit(p.charAt(p1--)));
        p1++;
        String s=p.substring(0,p0)+p.substring(p1+1);
        int n = Integer.parseInt(p.substring(p0,p1+1));

        return new Object[] {s,n};
    }
}
