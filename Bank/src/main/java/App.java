public class App {

    public static void main(String[] args) {

        Account account = new Account("0001", "1234", "Gustavo");

        boolean succeed = account.withDraw(200.0);
        if (!succeed){
            System.out.println("Você não tem saldo suficiente para sacar.");
        }

        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar.");
        }

        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar.");
        }
    }
}
