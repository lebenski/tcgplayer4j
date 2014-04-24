package org.playworks.tcgplayer4j.service;

import java.io.IOException;

import org.playworks.tcgplayer4j.model.CardPrice;
import org.playworks.tcgplayer4j.model.Products;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.xml.XmlNamespaceDictionary;
import com.google.api.client.xml.XmlObjectParser;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CardPriceServiceImpl implements CardPriceService {

	private String apiKey;
	private HttpRequestFactory requestFactory;
	
	@Inject
	public CardPriceServiceImpl(@Named("api.key") String apiKey) {
		this.apiKey = apiKey;
		this.requestFactory = new NetHttpTransport().createRequestFactory();
	}
	
	public CardPrice getCardPrice(String cardName, String setName) {
		try {
			HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(buildUrl(cardName, setName)));
			XmlNamespaceDictionary dictionary = new XmlNamespaceDictionary();
			dictionary.set("", "");
			request.setParser(new XmlObjectParser(dictionary));
			
			HttpResponse response = request.execute();
			Products products = response.parseAs(Products.class);
			CardPrice cardPrice = products.getCardPrice();
			cardPrice.setCardName(cardName);
			cardPrice.setCardSet(setName);
			return cardPrice;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String buildUrl(String cardName, String setName) {
		return String.format("http://partner.tcgplayer.com/x3/phl.asmx/p?pk=%S&s=%S&p=%S", apiKey, setName, cardName);
	}

}
