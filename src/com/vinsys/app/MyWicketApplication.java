package com.vinsys.app;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class MyWicketApplication extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
