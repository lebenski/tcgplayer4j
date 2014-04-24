package org.playworks.tcgplayer4j.module;

import com.google.inject.AbstractModule;

public class TCGPlayer4JModule extends AbstractModule  {

	private String apiKey;

	public TCGPlayer4JModule(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		
	}
}