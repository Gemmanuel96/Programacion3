package ProyectoFinal;

import ProyectoFinal.DTOs.UsuarioDTO;
import ProyectoFinal.Entities.*;
import ProyectoFinal.Enums.FormaPago;
import ProyectoFinal.Enums.Rol;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        Categoria categoria1 = Categoria.builder()
                .nombre("Computadoras")
                .descripcion("Equipos portátiles y de escritorio, notebooks, tablets y accesorios.")
                .id(1L)
                .build();

        Categoria categoria2 = Categoria.builder()
                .nombre("Audio y Video")
                .descripcion("Auriculares, parlantes, televisores y dispositivos multimedia.")
                .id(2L)
                .build();

        Categoria categoria3 = Categoria.builder()
                .nombre("Gaming")
                .descripcion("Consolas, perifericos y accesorios para videojuegos.")
                .id(3L)
                .build();

        //---------- Productos ----------

        Producto producto1 = Producto.builder()
                .id(1L)
                .nombre("Smartphone Samsung Galaxy A54")
                .precio(250000.0)
                .descripcion("Pantalla AMOLED 6.4'', 128GB, cámara triple")
                .stock(10)
                .categoria(categoria1)
                .disponible(true)
                .build();

        Producto producto2 = Producto.builder()
                .id(2L)
                .nombre("Notebook Lenovo IdeaPad 3")
                .precio(480000.0)
                .descripcion("Intel i5, 8GB RAM, SSD 512GB, 15.6''")
                .stock(7)
                .categoria(categoria1)
                .disponible(false)
                .build();

        Producto producto3 = Producto.builder()
                .id(3L)
                .nombre("Auriculares Bluetooth JBL Tune 510BT")
                .precio(45000.0)
                .descripcion("Sonido Pure Bass, batería 40h, micrófono integrado")
                .stock(20)
                .categoria(categoria2)
                .disponible(false)
                .build();

        Producto producto4 = Producto.builder()
                .id(4L)
                .nombre("Smart TV LG 43'' 4K UHD")
                .precio(390000.0)
                .descripcion("WebOS, HDR10, Wi-Fi, Bluetooth")
                .stock(7)
                .categoria(categoria2)
                .disponible(false)
                .build();

        Producto producto5 = Producto.builder()
                .id(5L)
                .nombre("Consola PlayStation 5")
                .precio(850000.0)
                .descripcion("SSD ultrarrápido, mando DualSense, 4K HDR")
                .stock(2)
                .categoria(categoria3)
                .disponible(false)
                .build();

        Producto producto6 = Producto.builder()
                .id(6L)
                .nombre("Tablet Apple iPad 10.2''")
                .precio(420000.0)
                .descripcion("Chip A13 Bionic, Wi-Fi, 64GB")
                .stock(2)
                .categoria(categoria1)
                .disponible(true)
                .build();

        Producto producto7 = Producto.builder()
                .id(7L)
                .nombre("Monitor Gamer Samsung Odyssey G5 27''")
                .precio(310000.0)
                .descripcion("Curvo QHD, 144Hz, 1ms, FreeSync Premium")
                .stock(1)
                .categoria(categoria3)
                .disponible(true)
                .build();

        Producto producto8 = Producto.builder()
                .id(8L)
                .nombre("Mouse Logitech G502 HERO")
                .precio(35000.0)
                .descripcion("Sensor 25K DPI, 11 botones programables")
                .stock(15)
                .categoria(categoria3)
                .disponible(true)
                .build();

        Producto producto9 = Producto.builder()
                .id(9L)
                .nombre("Parlante portátil Sony SRS-XB23")
                .precio(70000.0)
                .descripcion("Resistente al agua, Bluetooth, Extra Bass")
                .stock(12)
                .categoria(categoria2)
                .disponible(true)
                .build();

        Producto producto10 = Producto.builder()
                .id(10L)
                .nombre("Smartwatch Xiaomi Redmi Watch 3")
                .precio(95000.0)
                .descripcion("Pantalla AMOLED, GPS, resistencia al agua 5ATM")
                .stock(9)
                .categoria(categoria2)
                .disponible(true)
                .build();


        //------- Usuarios ---------

        Usuario user1 = Usuario.builder()
                .nombre("Juan")
                .apellido("Lopez")
                .email("JuanLopez@gmail.com")
                .telefono("1215185151")
                .contrasenia("Gato123")
                .rol(Rol.USUARIO)
                .id(1L)
                .build();

        Usuario user2 = Usuario.builder()
                .nombre("Lorenzo")
                .apellido("Perez")
                .email("LorenzoP@gmail.com")
                .telefono("123481851")
                .contrasenia("Perro123")
                .rol(Rol.ADMIN)
                .id(2L)
                .build();


        // ------- Creamos los pedidos -----

        Pedido pedido1 = Pedido.builder()
                .total(0.0)
                .formaPago(FormaPago.EFECTIVO)
                .id(1L)
                .build();

        pedido1.addDetallePedido(1L, 2, producto2);
        pedido1.addDetallePedido(2L, 3, producto3);
        pedido1.addDetallePedido(3L, 4, producto4);

        Pedido pedido2 = Pedido.builder()
                .total(0.0)
                .formaPago(FormaPago.TARJETA)
                .id(2L)
                .build();

        pedido2.addDetallePedido(3L, 5, producto5);
        pedido2.addDetallePedido(5L, 7, producto7);

        Pedido pedido3 = Pedido.builder()
                .total(0.0)
                .formaPago(FormaPago.TRANSFERENCIA)
                .id(3L)
                .build();

        pedido3.addDetallePedido(6L, 8, producto8);
        pedido3.addDetallePedido(7L, 9, producto9);
        pedido3.addDetallePedido(8L, 10, producto10);
        pedido3.addDetallePedido(9L, 11, producto10);
        pedido3.addDetallePedido(10L, 12, producto10);

        //------- Agregamos los pedidos a los usuarios
        user1.agregarPedido(pedido1);
        user1.agregarPedido(pedido2);
        user2.agregarPedido(pedido3);

        //Lista de productos
        List <Producto> listaProducto = new ArrayList<>();
        listaProducto.add(producto1);
        listaProducto.add(producto2);
        listaProducto.add(producto3);
        listaProducto.add(producto4);
        listaProducto.add(producto5);
        listaProducto.add(producto6);
        listaProducto.add(producto7);
        listaProducto.add(producto8);
        listaProducto.add(producto9);

        //-------------------------------------------------------------------

        //--------  Programacion funcional

        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(user1);
        listaUsuario.add(user2);


        // Aplicamos Stream + map + reduce para calcular el total del pedido
        //  this.total = detallePedidos.stream().map(DetallePedido::getSubtotal).reduce(0.0, Double::sum);
        pedido1.Calculable();


        //Parte aplicando programacion funcional en productos y mostramos los que estan disponibles

        System.out.println("\nLista de productos: ");
        listaProducto.stream()
                .filter(Producto::isDisponible)
                .forEach(System.out::println);

        //Mostramos la cantidad de productos que tiene un pedido todo mediante un stream
        System.out.println("\nCantidad de productos: ");
        // Map<String, Long> porProducto = detallePedidos.stream()
        // .collect(Collectors.groupingBy(d -> d.getProducto().getNombre(), Collectors.counting()));
        // porProducto.forEach((nombre, cantidad) -> System.out.println(nombre + ": " + cantidad));

        pedido3.mostrarCantidadProductos();

        //Mostramos por consola lo productos que tengan >5 en stock

        System.out.println("\nProductos con poco stock: ");
        List <Producto> pocoStock = new ArrayList<>();
        pocoStock = listaProducto.stream()
                .filter( p -> p.getStock() < 5)
                .collect(Collectors.toList());

        pocoStock.forEach(System.out::println);


    }

    public static void mostrarUsuarioMaxPedido(List<Usuario> listaUsuario) {
        Usuario userMaxPedidos = null;
        int maxPedidos = 0;

        for (Usuario usuario : listaUsuario) {
            if(usuario.getPedidos().size() > maxPedidos){
                maxPedidos = usuario.getPedidos().size();
                userMaxPedidos = usuario;
            }
        }

        System.out.println("\nUsuario con mas pedido " + userMaxPedidos.getNombre() +" " +userMaxPedidos.getApellido() + " con " + maxPedidos + " pedidos" );

    }

    public static void  mostrarCoincidencia(Set<Producto> listaProducto, Producto producto) {
        boolean encontrado = false;
        Producto productoEncontrado = null;

        for (Producto p : listaProducto) {
            if (p.equals(producto)) {
                encontrado = true;
                productoEncontrado = p;
            }
        }

        if (encontrado) {
            System.out.println("Coincidencia encontrada con: " + productoEncontrado.toString());
        }else{
            System.out.println("No existe ninguna coincidencia con: " + producto.toString());
        }
    }

}