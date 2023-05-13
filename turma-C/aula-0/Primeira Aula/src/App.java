import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char inicial = 'w';
        int idade = 15;
        boolean tomeiCafe = true;

        double laranja = 0.50;
        double uva = 2.50;
        double soma = laranja + uva;
        
        double tresLaranjas = laranja * 3;
        System.out.println(soma);
        double valorUvas = uva * 2;
        
        double compraTotal = (laranja * 3) + (uva * 2);


        Scanner sc = new Scanner(System.in);
       
        System.out.print("informe o vavor da maçã ");

        double maca = sc.nextDouble();

        double valor10Macas = maca * 27;

        System.out.println("o valor de 10 maçãs é  " + valor10Macas);





}
}