package ProyectoFinal.Entities;

import ProyectoFinal.Enums.Estado;
import ProyectoFinal.Enums.FormaPago;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode (callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Pedido extends Base implements ICalculable {

    @Builder.Default
    private LocalDate fecha = LocalDate.now();
    @Builder.Default
    private Estado estado  = Estado.PENDIENTE;
    private Double total;
    private FormaPago formaPago;
    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    @Override
    public void Calculable() {
        for (DetallePedido detallePedido : detallePedidos) {
            this.total += detallePedido.getSubtotal();
        }
        System.out.println("Total de la compra = " + this.total);
    }


    //Agrega un nuevo producto al pedido
    public void addDetallePedido(Long id,int cantidad, Producto producto){
        DetallePedido detallePedido = new DetallePedido(id,cantidad,producto);
        this.detallePedidos.add(detallePedido);
    }

    //Busca en el Set el Producto y devuelve el producto
    public DetallePedido findDetallePedido(Producto producto){
        for(DetallePedido det : detallePedidos){
            if(det.getProducto().equals(producto)){
                return det;
            }
        }
        return null;
    }

    //Elimina el producto
    public void deleteDtePedido(Producto producto){
        DetallePedido detallePedido1 =  findDetallePedido(producto);
        if(detallePedido1 != null){
            this.detallePedidos.remove(detallePedido1);
            System.out.println("Detalle de pedido eliminado");
        }else{
            System.out.println("No se encontro el detalle de pedido");
        }
    }




}
