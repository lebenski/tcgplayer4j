package org.playworks.tcgplayer4j.service;

import org.playworks.tcgplayer4j.model.CardPrice;

public interface CardPriceService {

	public CardPrice getCardPrice(String cardName, String setName);
	
}
