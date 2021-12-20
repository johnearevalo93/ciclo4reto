package ciclo4.reto4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


import ciclo4.reto4.interfaces.InterfaceCookware;
import ciclo4.reto4.interfaces.InterfaceOrder;
import ciclo4.reto4.interfaces.InterfaceUser;

@Component
@SpringBootApplication
public class Reto4Application implements CommandLineRunner {
	@Autowired
    private InterfaceCookware interfaceCookware;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder;

	public static void main(String[] args) {
		SpringApplication.run(Reto4Application.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        interfaceCookware.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }
}
