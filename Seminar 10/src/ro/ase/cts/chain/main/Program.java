package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.Client;
import ro.ase.cts.chain.clase.NotificatorEmail;
import ro.ase.cts.chain.clase.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Ion", null, null);
		Client client2 = new Client("Maria", "0722222222", null);
		Client client3 = new Client("Ana", null, "ana@gmail.com");
		
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client3, "Mesaj1");
		notificatorSMS.trimiteNotificare(client2, "Mesaj2");
	}
}
