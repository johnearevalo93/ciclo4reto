package ciclo4.reto4.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import ciclo4.reto4.modelo.Cookware;

import java.util.List;

public interface InterfaceCookware extends MongoRepository<Cookware, String> {
    // reto 5
    //public List<Cookware> findByPrice(double price);
    public List<Cookware> findByPriceLessThanEqual(double price);
    public List<Cookware> findByDescriptionContainingIgnoreCase(String description);
    
}
