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
@RequestMapping(path = "/api/v1")
public class HeroesControllerImpl {

    @Autowired
    HeroesService heroesService;


    @GetMapping("/heroes/")
    public List<Heroes> findAllHeroes() {
        return heroesService.findAllHeroes();
    }

    @GetMapping("/heroes/{name}")
    public Optional<Heroes> findHeroesById(@RequestParam("nombre") String name) {
        return heroesService.findByIdHeroes(name);
    }

    @PostMapping("/heroes")
    public Heroes updateHeroes(@RequestBody() Heroes heroes){
        return heroesService.createHeroes(heroes);
    }


    @PutMapping("/heroes/{name}")
    public ResponseEntity<Heroes> updateHeroes(@RequestParam("name") String name ){
        return null;
    }

    @DeleteMapping("/Heroes/{name}")
    public Heroes deleteHeroes(@PathVariable("name") String name) {
        return heroesService.deleteHeroes(name);
    }
}
