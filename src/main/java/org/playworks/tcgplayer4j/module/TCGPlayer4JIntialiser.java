package org.playworks.tcgplayer4j.module;

import org.playworks.tcgplayer4j.service.CardPriceService;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TCGPlayer4JIntialiser {

	private Injector injector;
	
	public TCGPlayer4JIntialiser(String apiKey) {
	    injector = Guice.createInjector(new TCGPlayer4JModule(apiKey));
	}
	
	public CardPriceService getCardPriceService() {
		return injector.getInstance(CardPriceService.class);
	}
	
}
