package udem.edu.co.Heroes.controller.Impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.Heroes.entities.Poderes;
import udem.edu.co.Heroes.service.PoderesService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class PoderesControllerImpl {

    PoderesService poderesService;

    public PoderesControllerImpl(PoderesService heroesService) {
        this.poderesService = poderesService;
    }

    @GetMapping("/Poderes/")
    public List<Poderes> findAllPoderes() {
        return this.poderesService.findAllPoder();
    }

    @GetMapping("/poderes/{name}")
    public Poderes findPoderesById(@RequestParam("name") int name) {
        return this.poderesService.findByIdPoderes();
    }

    @PostMapping("/poderes")
    public Poderes updatePoderes(@RequestBody() Poderes poderes) {
        return null;
    }

    @PutMapping("/poderes/{idPoderes}")
    public ResponseEntity<Poderes> updatePoderes(@RequestParam("idPoderes") int idPoderes ){
        return null;
    }

    @DeleteMapping("/poderes/{idPoderes}")
    public ResponseEntity<Poderes> deletePoderes(@PathVariable("idPoderes") int idPoderes) {
        return null;
    }
}
