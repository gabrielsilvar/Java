public class testes {   // Classe - o que for declarado aqui, fica disponível para todos os métodos dentro da classe
    static int age = 27;
    public static void main(String[] args) {    // Método - o que é declarado aqui, fica somente aqui
        //int age = 27;
        //age = 28;
        //System.out.println("I am " + age + " years old.");

        /* int number1 = 12;
        int number2 = 8;

        // Adição
        System.out.println("Adc: " + (number1 + number2));

        // Subtração
        System.out.println("Sub: " + (number1 - number2));

        // Multiplicação
        System.out.println("Mul: " + number1 * number2);

        // Divisão
        System.out.println("Div: " + number1 / number2);

        // Módulo
        System.out.println("Mod: " + number1 % number2); */

        int numero = 12;
        numero += 5;

        System.out.println(numero);

        int numero2 = 12;
        numero2 %= 6;

        System.out.println(numero2);
    }
}
