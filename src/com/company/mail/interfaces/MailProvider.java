package com.company.mail.interfaces;

public interface MailProvider {

	void sendMail(final String location, final String weatherDatum, final String datum);

}
