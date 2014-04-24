package org.playworks.tcgplayer4j.model;

import com.google.api.client.util.Key;

public class Products {

	@Key("product")
	private CardPrice cardPrice;

	public CardPrice getCardPrice() {
		return cardPrice;
	}

	public void setCardPrice(CardPrice cardPrice) {
		this.cardPrice = cardPrice;
	}

	@Override
	public String toString() {
		return cardPrice.toString();
	}
	
	
	
}
