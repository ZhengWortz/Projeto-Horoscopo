import java.util.Scanner;

public class signo {
    
    public static void main(String[] args) {
        Scanner dma = new Scanner(System.in);
        System.out.println("Descubra seu signo");
        System.out.println("Qual o dia que você nasceu");
        int d = dma.nextInt();
        System.out.println("Qual o mês que você nasceu");
        int m = dma.nextInt();
        System.out.println("Qual o ano que você nasceu");
        int a = dma.nextInt();
        if((m == 12 && d >= 22)||(m == 1 && d <= 20))
        System.out.println("Seu signo será capricórnio");
         else if ((m == 1 && d >= 21)||(m == 2 && d <= 19))
        System.out.println("Seu signo será aquário");
         else if ((m == 2 && d >= 19)||(m == 3 && d <= 20))
        System.out.println("Seu signo será peixes");
         else if ((m == 3 && d >= 21)||(m == 4 && d <= 20))
        System.out.println("Seu signo será áries");
         else if ((m == 4 && d >= 21)||(m == 5 && d <= 20))
        System.out.println("Seu signo será touro");
         else if ((m == 5 && d >= 21)||(m == 6 && d <= 20))
        System.out.println("Seu signo será gêmeos");
         else if ((m == 6 && d >= 21)||(m == 7 && d <= 22))
        System.out.println("Seu signo será câncer");
         else if ((m == 7 && d >= 23)||(m == 8 && d <= 22))
        System.out.println("Seu signo será leão");
         else if ((m == 8 && d >= 23)||(m == 9 && d <= 22))
        System.out.println("Seu signo será virgem");
         else if ((m == 9 && d >= 23)||(m == 10 && d <= 22))
        System.out.println("Seu signo será libra");
         else if ((m == 10 && d >= 23)||(m == 11 && d <= 21))
        System.out.println("Seu signo será escorpião");
         else if ((m == 11 && d >= 22)||(m == 12 && d <= 21))
        System.out.println("Seu signo será sargitário");
        }
}