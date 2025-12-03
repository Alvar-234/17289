package mx.uv.listi.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class App {
    @Autowired
    Isaludadores isaludadores;
    
    //Consulta
    @RequestMapping(value = "/saludos", method = RequestMethod.GET)
    public Iterable<Saludadores> dameSaludos(){
        return isaludadores.findAll();
    }
    
    //Alta
    @RequestMapping(value = "/saludos", method = RequestMethod.POST)
    public void crearSaludos(@RequestBody Saludadores saludadores){
        isaludadores.save(saludadores);

    }
    
}
