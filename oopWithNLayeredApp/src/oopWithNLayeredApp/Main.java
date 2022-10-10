package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JDBCProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		Product product1 = new Product(1, "iphone", 10000);
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
