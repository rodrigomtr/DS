package base;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainEuronext {

	public static void main(String[] args) {
		//String name = "Euronext";
		//String[] stocks = new String[] { "EDP", "BCP", "SONAE" };
		//System.out.println("Negotiating at " + name);
		
		EuronextModule configuration = new EuronextModule();
		Injector injector = Guice.createInjector(configuration);
		
		StockExchange exchange = injector.getInstance(StockExchange.class);//new ComplexStockExchange(name, stocks);
		TickerDisplay ticker = injector.getInstance(TickerDisplay.class);//new TimeTickerDisplay();
		
		new ApplicationSystem(exchange, ticker);
		IOUtils.waitEnter();
		System.exit(0);
	}

}
