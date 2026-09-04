import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18){
        System.out.println("Voçê é maior de idade!");
        }else{
        System.out.println("Voçê é menor de idade!");
        }
        entrada.close();
    }
}
