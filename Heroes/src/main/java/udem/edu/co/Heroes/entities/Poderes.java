package udem.edu.co.Heroes.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Poderes")
public class Poderes {

    @Id
    private String name;
    private String descripcion;
}
