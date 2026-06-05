package ar.edu.tup.programacion3.Entities;

import ar.edu.tup.programacion3.Enums.Rol;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true,exclude = {"contrasenia","telefono"})
@SuperBuilder
@Entity
@Table(name = "Usuario")
public class Usuario extends Base {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String contrasenia;
    private Rol rol;

    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();


    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }


}
