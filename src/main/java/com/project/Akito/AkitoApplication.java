package com.project.Akito;

import com.project.Akito.domain.repository.ClienteRepository;
import com.project.Akito.domain.service.*;
import com.project.Akito.persintence.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AkitoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext contexto = SpringApplication.run(AkitoApplication.class, args);
        CarritoService carritoService = contexto.getBean(CarritoService.class);
        CategoriaService categoriaService = contexto.getBean(CategoriaService.class);
        ClienteService clienteService = contexto.getBean(ClienteService.class);
        DetalleFacturaService detalleFacturaService = contexto.getBean(DetalleFacturaService.class);
        FacturaService facturaService = contexto.getBean(FacturaService.class);
        ProductoService productoService = contexto.getBean(ProductoService.class);

        // Clientes XD
//        Cliente cli = new Cliente();
//        cli.setNombre("Andys");
//        cli.setApellido("Cosrzos");
//        cli.setDireccion("Campus");
//        cli.setCorreoElectronico("MiCorreo@CorreoMio.correo.mio");
//        cli.setTelefono("3213203002");
//
//
//        clienteService.saveCliente(cli);
//        // clienteService.findByNombre("Andys");
//
////		Categoria :)
//        Categoria cate1 = new Categoria();
//        cate1.setNombreCategoria("Anime");
//        categoriaService.saveCategoria(cate1);
//
////		Producto :(
//        Producto pro = new Producto();
//        pro.setNombreProducto("JJT Kaisen");
//        pro.setPrecio(5000);
//        pro.setStockDisponible(100);
//        pro.setCategoriaId(1);
//
//        productoService.saveProducto(pro);
//
////		Carrito :V  	REVISAR
//        Carrito carr = new Carrito();
//        carr.setClienteId(1);
//
//        carritoService.saveCarrito(carr);
//
////		Factura :/
//        Factura fac = new Factura();
//        fac.setClienteId(1);
//        fac.setFechaFactura(LocalDate.parse("2023-03-03"));
//        fac.setTotalFactura(5000);
//
//        facturaService.saveFactura(fac);
//
////		Detalle Facura :|
//        DetalleFactura detFac = new DetalleFactura();
//        detFac.setFacturaId(1);
//        detFac.setProductoId(1);
//        detFac.setCantidadProducto(1);
//        detFac.setPrecioUnitario(5000);
//
//        detalleFacturaService.saveDetalleFactura(detFac);
//
////	    Producto Carrito :!
//        ProductoCarrito proCarr = new ProductoCarrito();
//        proCarr.setCarritoId(4);
//        proCarr.setProductoId(1);
//        proCarr.setCantidadProducto(5);
//
//        productoCarritoService.saveProducto(proCarr);
//        List<Cliente>  lista = new ArrayList<>();
//        lista = clienteService.findByNombre("Nicolas");
//        System.out.printf(lista.toString());
    }

}
