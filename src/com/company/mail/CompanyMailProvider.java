package com.company.mail;

import com.company.mail.interfaces.MailProvider;

public class CompanyMailProvider implements MailProvider {

	@Override
	public void sendMail(String location, String weatherDatum, String temp) {
		String message = "Weather in " + location + " is " + weatherDatum + " temperature is " + temp;
		System.out.println("The \"" + message + "\" message was send");
	}

}
