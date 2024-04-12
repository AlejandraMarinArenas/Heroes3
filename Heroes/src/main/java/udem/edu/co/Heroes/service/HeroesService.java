package udem.edu.co.Heroes.service;

import udem.edu.co.Heroes.entities.Heroes;

import java.util.List;
import java.util.Optional;

public interface HeroesService {
    public List<Heroes> findAllHeroes();
    public Heroes findByIdHeroes();
    public Heroes createHeroes();
    public Heroes UpdateHeroes();
    public Heroes deleteHerores();
}