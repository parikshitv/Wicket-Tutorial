package com.vinsys.app;

import org.apache.wicket.IPageMap;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class SignIn extends WebPage {

	public SignIn() {
		CompressedResourceReference cssRef = new CompressedResourceReference(SignIn.class, "default.css");
		Form loginForm = new Form("loginForm");
		Model usernameModel = new Model();
		FeedbackPanel feedback = new FeedbackPanel("feedback-error");
		TextField username = new TextField("uName",usernameModel);
		username.add(new UsernameValidator());
		Button button = new Button("submit"){
			
		@Override
		public void onSubmit() {
			System.out.println("Form submitted successfully... UserName: "+usernameModel.getObject());
			setResponsePage(SuccessPage.class);
		};
		
		};
		
		loginForm.add(username);
		loginForm.add(button);
		add(loginForm);
		add(feedback);
		add(CSSPackageResource.getHeaderContribution(cssRef));
	}

}
