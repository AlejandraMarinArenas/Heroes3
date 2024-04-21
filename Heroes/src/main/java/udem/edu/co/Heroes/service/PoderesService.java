package udem.edu.co.Heroes.service;

import udem.edu.co.Heroes.entities.Heroes;
import udem.edu.co.Heroes.entities.Poderes;

import java.util.List;
import java.util.Optional;

public interface PoderesService {
    public List<Poderes> findAllPoderes();
    public Optional<Poderes> findByIdPoderes(String name);
    public Poderes createPoderes(Poderes poderes);
    public Poderes updatePoderes(String name,Poderes poderes);
    public void deletePoderes(String name);
}
