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
		
		bindConstant().annotatedWith(Names.named("nome")).to("Euronext");
		
		TypeLiteral<String[]> stocks = new TypeLiteral<String[]>(){};
		bind(stocks).annotatedWith(Names.named("stocks")).toInstance(new String[]{ "EDP", "BCP", "SONAE" });
	}

}
