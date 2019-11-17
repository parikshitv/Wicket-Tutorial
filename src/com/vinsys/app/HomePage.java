package com.vinsys.app;

import org.apache.wicket.Page;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;


public class HomePage extends WebPage{

	public HomePage(PageParameters parameters) {
		super(parameters);
	}
	public HomePage(){
		
		CompressedResourceReference jsRef = new CompressedResourceReference(HomePage.class, "default.js");
		CompressedResourceReference cssRef = new CompressedResourceReference(HomePage.class, "default.css");
		Label label = new Label("lower_heading","Basic wicket app development.");
		
		Link loginInLink = new Link("loginLink"){
			public void onClick() {
				setResponsePage(SignIn.class);
			};
		};
		add(JavascriptPackageResource.getHeaderContribution(jsRef));
		add(CSSPackageResource.getHeaderContribution(cssRef));
		add(label);
		add(loginInLink);
	}


}
