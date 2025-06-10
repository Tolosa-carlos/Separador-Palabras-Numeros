package demo;


import java.util.*;

/*
Se tienen varias palabras que ingresan a través de la clase PalabraUtils.
Las palabras están atravesadas por un número entero. Por ejemplo:

Pala25bra, 5Teléfono, Anteojo36, etc.

(1) Se pide mostrar un listado de todos los números escondidos entre las palabras, seguidos
de todas las palabras que los esconden.

Por ejemplo:

5: Teléfono, Casa, ...
25: Palabra, Computadora, ...
26: Anteojo, Servilleta, Mantel, ...

(2)
Informar también cúantas palabras tenían el número al inicio, cuántas por el medio
y cuántas lo tenían al final.

Ayuda:

La clase PalabraUtils tiene el método:
public static Object[] splitPalabra(String p) que toma una palabra (p) retorna un array
con dos elementos: la palabra (sin el número) y el número.

Funciones que podrían ser útiles:
String s = Integer.toString(5); // retorna "5"
int i = Integer.parseInt("5"); // returna 5
int x = s.length(); // retorna la longitud de la cadena s
char c = s.charAt(0); // retorna el primer carácter del String s
boolean b = Character.isDigit(c); // retorna true o false si el carácter c está entre '0' y '9'
 */
public class Main {
    public static void main(String[] args) {
        List<String> Listapalabras = new ArrayList<>();

        System.out.println("-------------- Lista de palabras --------------");
        while (PalabraUtils.hasNext()){
            String palabra = PalabraUtils.nextPalabra();
            Listapalabras.add(palabra);
            System.out.println(palabra);
        }

        System.out.println();
        Map<String, List<String>> MapaPalabraPorNumero = new HashMap<>();
        List<String> ListaPalabrasSinNumeros = new ArrayList<>();

        for (String palabra : Listapalabras){

            String numeroPalabra = "";
            String palabraSinNumeros = "";
            for (int i = 0; i < palabra.length(); i++){
                if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90 || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122 ){
                    palabraSinNumeros += palabra.charAt(i);
                } else {
                    numeroPalabra += palabra.charAt(i);
                }
            }

            ListaPalabrasSinNumeros.add(palabraSinNumeros);
            MapaPalabraPorNumero.putIfAbsent(numeroPalabra, new ArrayList<>());
            MapaPalabraPorNumero.get(numeroPalabra).add(palabraSinNumeros);
        }

        System.out.println("-------------- Lista de palabras sin numeros --------------");
        System.out.println(ListaPalabrasSinNumeros);
        System.out.println();

        System.out.println("-------------- Lista de palabras sin numeros por numero--------------");
        System.out.println(MapaPalabraPorNumero);

    }
}
