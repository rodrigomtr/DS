package base;

public class MainNyse {

	public static void main(String[] args) {
		String name = "NYSE";
		String[] stocks = new String[] { "APPLE", "HP", "MSFT" };
		System.out.println("Negotiating at " + name);
		StockExchange exchange = new SimpleStockExchange(name, stocks);
		TickerDisplay ticker = new SimpleTickerDisplay();
		new ApplicationSystem(exchange, ticker);
		IOUtils.waitEnter();
		System.exit(0);
	}

}
