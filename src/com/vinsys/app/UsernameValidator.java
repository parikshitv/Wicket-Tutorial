package com.vinsys.app;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;
import org.apache.wicket.validation.ValidationError;

public class UsernameValidator implements IValidator {

	@Override
	public void validate(IValidatable validatable) {
	
		System.out.println(validatable.getValue());
		ValidationError error = new ValidationError();
		error.setMessage("Validation is taken place.");
		validatable.error(error);

	}

}
