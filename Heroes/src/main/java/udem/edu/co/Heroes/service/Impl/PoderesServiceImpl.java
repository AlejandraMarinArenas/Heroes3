package udem.edu.co.Heroes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import udem.edu.co.Heroes.entities.Poderes;
import udem.edu.co.Heroes.repository.PoderesRepository;
import udem.edu.co.Heroes.service.PoderesService;

import java.util.List;
import java.util.Optional;

public class PoderesServiceImpl implements PoderesService {

    @Autowired
    PoderesRepository poderesRepository;

    @Override
    public List<Poderes> findAllHeroes(){

        return (List<Poderes>) poderesRepository.findAll();
    }

    @Override
    public Optional<Poderes> findByIdPoderes(String name){
        return poderesRepository.findById(name);
    }

    @Override
    public List<Poderes> findAllPoderes() {
        return null;
    }

    @Override
    public Poderes findByIdPoderes() {
        return null;
    }

    @Override
    public Poderes createPoderes(){
        poderesRepository.setPoderes();
        return poderesRepository.getPoderes();
    }
    @Override
    public Poderes UpdatePoderes(Poderes updatePoderes){
        poderesRepository.updatePoderes(updatePoderes);
        return updatePoderes;
    }
    @Override
    public Poderes DeletePoderes(String poderesId){
        Poderes poderesToDelete = poderesRepository.findByPoderesId(poderesId);
        if (poderesToDelete !=null){
            poderesRepository.delete(poderesToDelete);

        }
        else{
            throw new PoderesNotFoundException("No se encontraron poderes en el ID especificado: " + poderesId);

        }
        return poderesToDelete;
    }

    @Override
    public Poderes UpdatePoderes(){
        return null;
    }

    @Override
    public Poderes deletePoderes(){
        return null;
    }
}
