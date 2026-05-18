package ProyectoFinal.Entities;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(exclude = {"disponible","imagen","descripcion","stock","categoria"})
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class Producto extends Base{
    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponible;
    private Categoria categoria;
}
