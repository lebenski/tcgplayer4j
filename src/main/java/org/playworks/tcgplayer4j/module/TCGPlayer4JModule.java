package org.playworks.tcgplayer4j.module;

import java.util.HashMap;
import java.util.Map;

import org.playworks.tcgplayer4j.service.TCGPlayerCardPriceService;
import org.playworks.tcgplayer4j.service.TCGPlayerCardPriceServiceImpl;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TCGPlayer4JModule extends AbstractModule  {

	private String apiKey;

	public TCGPlayer4JModule(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	protected void configure() {
		bindProperties();
	    bind(TCGPlayerCardPriceService.class).to(TCGPlayerCardPriceServiceImpl.class);
	}

	private void bindProperties() {
		Map<String, String> properties = new HashMap<String, String>();
	    properties.put("api.key", apiKey);
		Names.bindProperties(binder(), properties);
	}
}