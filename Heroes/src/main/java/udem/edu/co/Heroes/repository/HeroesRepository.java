package udem.edu.co.Heroes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udem.edu.co.Heroes.entities.Heroes;

public interface HeroesRepository extends JpaRepository<Heroes, String> {
}
