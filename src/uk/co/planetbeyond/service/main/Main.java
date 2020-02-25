package uk.co.planetbeyond.service.main;

import java.text.ParseException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.planetbeyond.rest.server.RestServer;
import uk.co.planetbeyond.service.rest.RestWebservice;
import uk.co.planetbeyond.util.mail.EmailServer;

public class Main
{

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException
	{
		initialize();
	}

	public static void initialize()
	{
		
		try {
			// starting the email server
			EmailServer.getInstance().startEmailSendingThread();

			// start REST server
			HashSet<Class<?>> classes = new HashSet<Class<?>>();
			classes.add(RestWebservice.class);
				RestServer.startServer(classes);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
