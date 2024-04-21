package udem.edu.co.Heroes.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Heroes")

public class Heroes {

    @Id
    private String name;
    private List<Poderes> poderes;

}
