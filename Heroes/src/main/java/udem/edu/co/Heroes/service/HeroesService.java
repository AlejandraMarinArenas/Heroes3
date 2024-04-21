package udem.edu.co.Heroes.service;

import udem.edu.co.Heroes.entities.Heroes;

import java.util.List;
import java.util.Optional;

public interface HeroesService {
    public List<Heroes> findAllHeroes();
    public Optional<Heroes> findByIdHeroes(String name);
    public Heroes createHeroes(Heroes heroes);
    public Heroes updateHeroes(Heroes heroes);
    public void deleteHeroes(String name);
}