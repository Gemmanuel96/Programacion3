package ProyectoFinal.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "descripcion")
@EqualsAndHashCode(callSuper = true)

public class Categoria extends Base {
    private String nombre;
    private String descripcion;
}
