package uk.co.planetbeyond.service.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.planetbeyond.rest.server.RestServer;
import uk.co.planetbeyond.util.mail.EmailServer;
public class Stopper
{
	private static final Logger log = LoggerFactory.getLogger(Stopper.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		stop();
	}

	public static void stop()
	{
		RestServer.stopServer();

		EmailServer.getInstance().stopEmailSendingThread();
	}

}
