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
@RequestMapping(path = "/poderes")
public class PoderesControllerImpl {

    PoderesService poderesService;

    @GetMapping("/poderes/")
    public List<Poderes> findAllPoderes() {
        return this.poderesService.findAllPoderes();
    }

    @GetMapping("/poderes/{name}")
    public Optional<Poderes> findPoderesById(@RequestParam("name") String name) {
        return this.poderesService.findByIdPoderes(name);
    }

    @PostMapping("/poderes")
    public Poderes createPoderes(@RequestBody() Poderes poderes)  {
        return this.poderesService.createPoderes(poderes);
    }

    @PutMapping("/poderes/{name}")
    public Poderes updatePoderes(@RequestParam("name") String name, @RequestBody() Poderes poderes){
        return this.poderesService.updatePoderes(name, poderes);
    }

    @DeleteMapping("/poderes/{name}")
    public void deletePoderes(@PathVariable("name") String name) {
        this.poderesService.deletePoderes(name);
    }
}
