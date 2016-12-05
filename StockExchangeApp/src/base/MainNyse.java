package base;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainNyse {

	public static void main(String[] args) {
		//String name = "NYSE";
		//String[] stocks = new String[] { "APPLE", "HP", "MSFT" };
		//System.out.println("Negotiating at " + name);
		
		NyseModule configuration = new NyseModule();
		Injector injector = Guice.createInjector(configuration);
		
		StockExchange exchange = injector.getInstance(StockExchange.class);//new SimpleStockExchange(name, stocks);
		TickerDisplay ticker = injector.getInstance(TickerDisplay.class);//new SimpleTickerDisplay();
		
		new ApplicationSystem(exchange, ticker);
		IOUtils.waitEnter();
		System.exit(0);
	}

}
