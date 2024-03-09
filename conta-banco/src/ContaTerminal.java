import java.util.Locale;
import java.util.Scanner;

/** <h1>Conta Terminal</h1>
 * A conta terminal terá a funcionalidade de após inserir os dados de usúario,emitir a mensagem proposta
 * @author Enzo Oliveira
 * @since 09/03/2024
 */

public class ContaTerminal {


    /**
     * @param getCpf este parametro tem a funccionalidade de pegar o CPF do Usuario;
     * @param getName este parametro tem a funcionalidade de pegar o primeiro nome do Usuario;
     * @param getFirstName este parametro tem a funcionalidade de pegar o ultimo nome do Usuario;
     * @param getAgency este parametro tem a funcionalidade de pegar a Agencia do Usuario;
     * @param getWithdraw este parametro tem a funcionalida de o Usuario inserir a quantidade desejavel de saque;
     * @return irá retornar uma mensagem automatica contendo as informações inseridas pelo usuario:a
     */
    public static void main(String[] args)  {
        /**
         * Este objeto foi criado com a função de chamar um novo scanner "Scanner"
         */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /** Aqui está a funcionalidade de saída do usuario no terminal 
        */
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
