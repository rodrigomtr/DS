package base;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

public class NyseModule extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bindConstant().annotatedWith(Names.named("name")).to("NYSE");
		
		System.out.println("Negotiating at " + "NYSE");//TODO: pode ser assim??
		
		TypeLiteral<String[]> stocks = new TypeLiteral<String[]>(){};
		bind(stocks).annotatedWith(Names.named("stocks")).toInstance(new String[]{ "APPLE", "HP", "MSFT" });
	}
}
