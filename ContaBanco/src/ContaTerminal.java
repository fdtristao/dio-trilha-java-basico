    import java.util.Locale;
    import java.util.Scanner;
    
    public class ContaTerminal {
        public static void main(String[] args) throws Exception{

            String nomeCliente = ("Mario Andrade");
            double saldo = 237.48;

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Por favor, digite o número da sua Agência");
            int agencia = scanner.nextInt();
            
            System.out.println("Por favor, digite o número da sua Conta Corrente");
            String contaCorrente = scanner.next();
            
            System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta corrente é " + contaCorrente + " e seu saldo R$" + saldo + " já está disponível para saque");
        }
    }
