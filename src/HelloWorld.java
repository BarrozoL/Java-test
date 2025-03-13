import java.util.Arrays;

public class HelloWorld {

public static void main(String [] args){
    System.out.println("Hello, world!");



    byte oitoBits = 100;

    char letra = 'a';

    int[] numbers = {1, 2, 3};

    String teste = "teststststs";

    int[] numeros = new int[5];

    numeros[0] = 10;
    numeros[1] = 21;
    numeros[2] = 89;
    numeros[3] = 11;
    numeros[4] = 91;

for(int i = 0; i < numeros.length; i++) {
    System.out.println("Número atual:"+ numeros[i]);
}


    System.out.println(oitoBits);
    System.out.println(letra);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(numeros));
    System.out.println(teste);
}


}
