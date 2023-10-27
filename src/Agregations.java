import java.util.HashSet;
import java.util.Set;

public class Agregations
{
    public static long sumar(int[] numeros)
    {
        int suma = 0;
        for(int n : numeros) {
            suma += n;
        }
        return suma;
    }

    public static int contar(int[] numeros)
    {
        return numeros.length;
    }

    public static int contarDistinto(int[] numeros)
    {
        if (numeros == null || numeros.length < 0) {
            return 0;
        }

        Set<Integer> values = new HashSet<>();
        for (int n : numeros) {
            values.add(n);
        }
        int size = values.size();

        return size > 1 ? size : 0;
    }

    public static int maximo(int[] numeros)
    {
        int max = numeros[0];
        for (int i = numeros.length - 1; i > 1; i--) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static int minimo(int[] numeros)
    {
        int min = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    public static int primero(int[] numeros)
    {
        return numeros[0];
    }

    public static int ultimo (int[] numeros)
    {
        return numeros[numeros.length - 1];
    }

    public static double promedio(int[] numeros)
    {
        return Agregations.sumar(numeros) / Agregations.contar(numeros);
    }
}