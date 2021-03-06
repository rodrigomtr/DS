package base;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

public class EuronextModule extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(StockExchange.class).to(ComplexStockExchange.class);
		bind(TickerDisplay.class).to(TimeTickerDisplay.class);
		
		bindConstant().annotatedWith(Names.named("name")).to("Euronext");
		System.out.println("Negotiating at " + "Euronext");//TODO:Estava no main com + "name", pode ficar assim
		TypeLiteral<String[]> stocks = new TypeLiteral<String[]>(){};
		bind(stocks).annotatedWith(Names.named("stocks")).toInstance(new String[]{ "EDP", "BCP", "SONAE" });
	}

}
