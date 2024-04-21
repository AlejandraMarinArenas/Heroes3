package udem.edu.co.Heroes.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import udem.edu.co.Heroes.entities.Heroes;
import udem.edu.co.Heroes.repository.HeroesRepository;
import udem.edu.co.Heroes.service.Impl.HeroesServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HeroesServiceImplTest {

    @InjectMocks
    private HeroesServiceImpl heroesService;

    @Mock
    private HeroesRepository heroesRepository;

    @BeforeEach
    void setUp(){
        //heroesService = new HeroesServiceImpl();
    }

    @Test
    void findAllHeroes() {
        List<Heroes> heroes =new  ArrayList<>();
        heroes.add(new Heroes());
        when(heroesRepository.findAll()).thenReturn(heroes);

        List<Heroes> a = heroesService.findAllHeroes();
        assertEquals(heroes,a );
    }
    @Test
    void createHeroes(){
        List<Heroes> heroes = new ArrayList<>();
        heroes.add(new Heroes());
        when(heroesRepositoryli alejitah.save(heroes));
    }
}
