import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("=================================================");
        System.out.println("OPERACIONES DE AGREGACION");
        System.out.println("=================================================");
        System.out.println("Introducir 10 numeros a continuacion:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("- Numero %2d: ", i + 1);
            numeros[i] = (int)sc.nextLong();
        }
        System.out.println("=================================================");
        System.out.println("Gracias, a continuacion los resultados");
        System.out.printf("Contar...........: %8d\n", Agregations.contar(numeros));
        System.out.printf("Contar distinto..: %8d\n", Agregations.contarDistinto(numeros));
        System.out.printf("Suma.............: %8d\n", Agregations.sumar(numeros));
        System.out.printf("Maximo...........: %8d\n", Agregations.maximo(numeros));
        System.out.printf("Minimo...........: %8d\n", Agregations.minimo(numeros));
        System.out.printf("Primero..........: %8d\n", Agregations.primero(numeros));
        System.out.printf("Último...........: %8d\n", Agregations.ultimo(numeros));
        System.out.printf("Promedio.........: %15.6f\n", Agregations.promedio(numeros));
        System.out.println("=================================================");

    }
}