package udem.edu.co.Heroes.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.Heroes.entities.Heroes;
import udem.edu.co.Heroes.entities.Poderes;
import udem.edu.co.Heroes.service.HeroesService;
import udem.edu.co.Heroes.service.PoderesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class PoderesControllerImpl {

    @Autowired
    PoderesService poderesService;


    @GetMapping("/poderes/")
    public List<Poderes> findAllPoderes() {
        return poderesService.findAllPoderes();
    }

    @GetMapping("/poderes/{name}")
    public Optional<Poderes> findPoderesById(@RequestParam("nombre") String name) {
        return poderesService.findByIdPoderes(name);
    }

    @PostMapping("/poderes")
    public Poderes updatePoderes(@RequestBody() Poderes poderes){
        return poderesService.createPoderes(poderes);
    }


    @PutMapping("/poderes/{name}")
    public ResponseEntity<Poderes> updatePoderes(@RequestParam("name") String name ){
        return null;
    }

    @DeleteMapping("/Heroes/{name}")
    public Heroes deleteHeroes(@PathVariable("name") String name) {
        return poderesService.deletePoderes(name);
    }
}
