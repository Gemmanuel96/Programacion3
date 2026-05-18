package ProyectoFinal.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@EqualsAndHashCode (callSuper = true)
@NoArgsConstructor

public class DetallePedido extends Base{
    private int cantidad;
    private Double subtotal;
    private Producto producto;

    public DetallePedido(Long id, int cantidad, Producto producto) {
        super(id);
        this.cantidad = cantidad;
        this.subtotal = cantidad* producto.getPrecio();
        this.producto = producto;
    }

}
