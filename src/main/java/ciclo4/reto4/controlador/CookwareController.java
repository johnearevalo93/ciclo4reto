package ciclo4.reto4.controlador;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ciclo4.reto4.modelo.Cookware;
import ciclo4.reto4.servicio.CookwareService;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cookware")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CookwareController {
    @Autowired
    private CookwareService accessoryService;
    
    @GetMapping("/all")
    public List<Cookware> getAll() {
        return accessoryService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Cookware> getClothe(@PathVariable("reference") String reference) {
        return accessoryService.getClothe(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Cookware create(@RequestBody Cookware gadget) {
        return accessoryService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cookware update(@RequestBody Cookware gadget) {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accessoryService.delete(reference);
    } 

    //reto 5
    @GetMapping("/price/{price}")
    public List<Cookware> getByPriceLessThanEqual(@PathVariable("price") double price){
        return accessoryService.getByPriceLessThanEqual(price);
    }

    @GetMapping("/description/{description}")
    public List<Cookware> getByDescriptionContains(@PathVariable("description") String description){
        return accessoryService.getByDescriptionContains(description);
    }
}
