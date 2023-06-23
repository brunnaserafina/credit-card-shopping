import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limitCreditCard = scanner.nextDouble();
        CreditCard creditCard = new CreditCard(limitCreditCard);

        int response = 1;
        while (response == 1) {
            System.out.println("Digite a descrição da compra: ");
            String product = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double valueProduct = scanner.nextDouble();

            Shop shop = new Shop(product, valueProduct);
            boolean shopper = creditCard.shopper(shop);


            if (shopper == false) {
                System.out.println("Saldo insuficiente!");
                break;
            } else if (creditCard.getBalanceCount() == 0) {
                System.out.println("Compra realizada! Agora você não possui mais limite em seu cartão.");
                break;
            } else {
                System.out.println("Compra realizada!");
                System.out.println("Deseja continuar? Digite 1 para 'sim' e 2 para 'não'");
                response = scanner.nextInt();
            }
        }

        Collections.sort(creditCard.getShopList());

        System.out.println("*********************");
        System.out.println("COMPRAS REALIZADAS: ");
        for (Shop item :
                creditCard.getShopList()) {
            System.out.println(item);
        }
        System.out.println("*********************");
        System.out.println("Saldo do cartão: " + creditCard.getBalanceCount());

    }
}