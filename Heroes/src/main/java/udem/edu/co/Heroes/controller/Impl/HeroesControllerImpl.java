package udem.edu.co.Heroes.controller.Impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.Heroes.entities.Heroes;
import udem.edu.co.Heroes.service.HeroesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class HeroesControllerImpl {

    HeroesService heroesService;

    public HeroesControllerImpl(HeroesService heroesService) {
        this.heroesService = heroesService;
    }

    @GetMapping("/heroes/")
    public List<Heroes> findAllHeroes() {
        return this.heroesService.findAllHeroes();
    }

    @GetMapping("/heroes/{name}")
    public Optional<Heroes> findHeroesById(@RequestParam("nombre") int name) {
        return this.heroesService.findByIdHeroes();
    }

    @PostMapping("/heroes")
    public Heroes updateHeroes(@RequestBody() Heroes heroes) {
        return null;
    }

    @PutMapping("/heroes/{idHeroes}")
    public ResponseEntity<Heroes> updateHeroes(@RequestParam("idHeroes") int idHeroes ){
        return null;
    }

    @DeleteMapping("/Heroes/{idHeroes}")
    public ResponseEntity<Heroes> deleteHeroes(@PathVariable("idHeroes") int idHeroes) {
        return null;
    }
}
