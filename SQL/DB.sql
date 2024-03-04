drop database if exists akito;
create database if not exists akito;

use akito;

CREATE TABLE factura (
    pedido_id INT AUTO_INCREMENT NOT NULL,
    cliente_id INT NULL,
    fecha_pedido DATE NULL,
    total_pedido DECIMAL(10, 2) NULL,
    PRIMARY KEY (pedido_id)
);

CREATE TABLE categoria (
    categoria_id INT AUTO_INCREMENT NOT NULL,
    nombre_categoria VARCHAR(50) NULL,
    PRIMARY KEY (categoria_id)
);

CREATE TABLE cliente (
    cliente_id INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) NULL,
    apellido VARCHAR(50) NULL,
    direccion VARCHAR(100) NULL,
    correo_electronico VARCHAR(50) NULL,
    telefono VARCHAR(15) NULL,
    PRIMARY KEY (cliente_id)
);

CREATE TABLE producto (
    producto_id INT AUTO_INCREMENT NOT NULL,
    nombre_producto VARCHAR(100) NULL,
    tipo VARCHAR(10) NULL,
    precio DECIMAL(10, 2) NULL,
    stock_disponible INT NULL,
    categoria_id INT NULL,
    PRIMARY KEY (producto_id),
    FOREIGN KEY (categoria_id) REFERENCES categoria(categoria_id)
);

CREATE TABLE carrito (
    carrito_id INT AUTO_INCREMENT NOT NULL,
    cliente_id INT NULL,
    PRIMARY KEY (carrito_id),
    UNIQUE KEY carrito_cliente_id_unique (cliente_id),
    FOREIGN KEY (cliente_id) REFERENCES cliente(cliente_id)
);

CREATE TABLE producto_carrito (
	producto_carrito_id INT AUTO_INCREMENT NOT NULL,
    carrito_id INT NULL,
    producto_id INT NULL,
    cantidad_producto INT NULL,
    PRIMARY KEY (producto_carrito_id),
    FOREIGN KEY (carrito_id) REFERENCES carrito(carrito_id),
    FOREIGN KEY (producto_id) REFERENCES producto(producto_id)
);



CREATE TABLE detalle_factura (
    detalle_pedido_id INT AUTO_INCREMENT NOT NULL,
    pedido_id INT NULL,
    producto_id INT NULL,
    cantidad_producto INT NULL,
    precio_unitario DECIMAL(10, 2) NULL,
    PRIMARY KEY (detalle_pedido_id),
    FOREIGN KEY (pedido_id) REFERENCES factura(pedido_id),
    FOREIGN KEY (producto_id) REFERENCES producto(producto_id)
);