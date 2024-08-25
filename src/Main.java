import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
     public String getStockSymbol() {
         return stockSymbol;
     }

     public int getNumberOfShares() {
         return numberOfShares;
     }

     public LocalDateTime getTransactionDateTime() {
         return transactionDateTime;
     }

     public void setNumberOfShares(int numberOfShares) {
         this.numberOfShares = numberOfShares;
     }

     public String toString() {
         return "Stock Symbol: " + stockSymbol +
                 ", Number of Shares: " + numberOfShares +
                 ", Transaction Date/Time: " + transactionDateTime;
     }
}
class StockAccount {
    private List<CompanyShares> sharesList;

    public StockAccount() {
        this.sharesList = new ArrayList<>();
    }

    private CompanyShares findSharesBySymbol(String stockSymbol) {
        for (CompanyShares shares : sharesList) {
            if (shares.getStockSymbol().equals(stockSymbol)) {
                return shares;
            }
        }
        return null;
    }
}