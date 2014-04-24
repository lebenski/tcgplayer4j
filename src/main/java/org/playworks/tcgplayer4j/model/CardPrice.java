package org.playworks.tcgplayer4j.model;

import com.google.api.client.util.Key;

public class CardPrice {
	
	private String cardName;
	private String cardSet;
	
	@Key("id")
	private long id;
	@Key("lowprice")
	private Double lowPrice;
	@Key("avgprice")
	private Double avgPrice;
	@Key("hiprice")
	private Double hiPrice;
	@Key("foilavgprice")
	private Double foilAvgPrice;

	@Key("link")
	private String link;

	public CardPrice() {
		
	}
	
	public CardPrice(String cardName, String cardSet, long id, Double lowPrice, Double avgPrice, Double hiPrice, Double foilAvgPrice, String link) {
		this.cardName = cardName;
		this.cardSet = cardSet;
		this.id = id;
		this.lowPrice = lowPrice;
		this.avgPrice = avgPrice;
		this.hiPrice = hiPrice;
		this.foilAvgPrice = foilAvgPrice;
		this.link = link;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardSet() {
		return cardSet;
	}

	public void setCardSet(String cardSet) {
		this.cardSet = cardSet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	public Double getHiPrice() {
		return hiPrice;
	}

	public void setHiPrice(Double hiPrice) {
		this.hiPrice = hiPrice;
	}

	public Double getFoilAvgPrice() {
		return foilAvgPrice;
	}

	public void setFoilAvgPrice(Double foilAvgPrice) {
		this.foilAvgPrice = foilAvgPrice;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "CardPrice [cardName=" + cardName + ", cardSet=" + cardSet + ", id=" + id + ", lowPrice=" + lowPrice + ", avgPrice=" + avgPrice + ", hiPrice=" + hiPrice + ", foilAvgPrice="
				+ foilAvgPrice + ", link=" + link + "]";
	}
}
