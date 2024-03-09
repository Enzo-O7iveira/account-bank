import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu CPF ! ");
            long getCpf = scanner.nextLong();

        System.out.println("Por favor, digite o seu nome !");
            String getName = scanner.next();

            System.out.println("Por favor, digite o seu sobrenome !");
            String getFirstName = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
            String getAgency = scanner.next();
        
        System.out.println("Por favor, digite a quantidade de saque !");
            double getWithdraw = scanner.nextDouble();



        System.out.println("Olá " + getName + getFirstName + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgency + ", criada no CPF: "+ getCpf + " e seu saque de:" + getWithdraw + " já está disponível para saque");
    }
}
