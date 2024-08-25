import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stock Account Program");

    }

}
 class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDateTime;

    public CompanyShares(String stockSymbol, int numberOfShares, LocalDateTime transactionDateTime) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDateTime = transactionDateTime;
    }
}