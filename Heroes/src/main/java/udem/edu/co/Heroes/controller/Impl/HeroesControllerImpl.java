package udem.edu.co.Heroes.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.Heroes.entities.Heroes;
import udem.edu.co.Heroes.service.HeroesService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/heroes")
public class HeroesControllerImpl {

    @Autowired
    HeroesService heroesService;

    @GetMapping("/heroes")
    public List<Heroes> findAllHeroes() {
        return this.heroesService.findAllHeroes();
    }

    @GetMapping("/heroes/{name}")
    public Optional<Heroes> findHeroeById(@PathVariable("name") String name) {
        return this.heroesService.findByIdHeroes(name);
    }

    @PostMapping("/heroes")
    public Heroes createHeroes(@RequestBody() Heroes heroe) {
        return this.heroesService.createHeroes(heroe);
    }

    @PutMapping("/heroes/{name}")
    public Heroes updateHeroes(@PathVariable("name") String name , @RequestBody() Heroes heroe) {
        return this.heroesService.updateHeroes(heroe);
    }

    @DeleteMapping("/heroes/{name}")
    public void deleteHeroes(@PathVariable("name") String name) {
        this.heroesService.deleteHeroes(name);
    }
}
