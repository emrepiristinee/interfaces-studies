package interfaces;

public class Main {

	public static void main(String[] args) { 
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer emre = new Customer(1,"Emre","Piriþtine");
		customerManager.add(emre);

	}

}
