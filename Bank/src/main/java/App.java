public class App {

    public static void main(String[] args) {

        Account account = new Account("0001", "1234", "Gustavo");

        boolean succeed = account.withDraw(200.0);
        if (!succeed){
            System.out.println("Você não tem saldo suficiente para sacar.");
        }
    }
}
