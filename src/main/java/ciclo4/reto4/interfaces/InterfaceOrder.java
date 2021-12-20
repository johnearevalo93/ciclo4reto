package ciclo4.reto4.interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import ciclo4.reto4.modelo.Order;

public interface InterfaceOrder extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(int id);
    List<Order> findBySalesManIdAndStatus(int id, String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);
    
}
