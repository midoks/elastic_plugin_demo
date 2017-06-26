package com.org.elasticsearch;


import org.elasticsearch.common.inject.AbstractModule;


public class DemoModule extends AbstractModule {


	@Override protected void configure(){
		bind(DemoRestHandler.class).asEagerSingleton();
	}


}