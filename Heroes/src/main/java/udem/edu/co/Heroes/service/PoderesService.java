package udem.edu.co.Heroes.service;

import udem.edu.co.Heroes.entities.Poderes;

import java.util.List;
import java.util.Optional;

public interface PoderesService {
    List<Poderes> findAllHeroes();

    Optional<Poderes> findByIdPoderes(String id);

    public List<Poderes> findAllPoderes();
    public Poderes findByIdPoderes();

    Poderes UpdatePoderes(Poderes updatePoderes);

    Poderes DeletePoderes(String poderesId);

    public Poderes createPoderes();
    public Poderes UpdatePoderes();

    public Poderes deletePoderes();

    List<Poderes> findAllPoder();
}
