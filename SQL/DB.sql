drop database if exists akito;
create database if not exists akito;

use akito;

CREATE TABLE carrito(
    carrito_id INTEGER AUTO_INCREMENT NOT NULL,
    cliente_id INTEGER NOT NULL,
    PRIMARY KEY(carrito_id)
);
ALTER TABLE
    carrito ADD CONSTRAINT carrito_cliente_id_unique UNIQUE(cliente_id);
CREATE TABLE categoria(
    categoria_id INTEGER AUTO_INCREMENT NOT NULL,
    nombre_categoria VARCHAR(50) NOT NULL,
    PRIMARY KEY(categoria_id)
);
CREATE TABLE producto_carrito(
    producto_carrito_id INTEGER AUTO_INCREMENT NOT NULL,
    carrito_id INTEGER NOT NULL,
    producto_id INTEGER NOT NULL,
    cantidad_producto INTEGER NOT NULL,
    PRIMARY KEY(producto_carrito_id)
);
CREATE TABLE producto(
    producto_id INTEGER AUTO_INCREMENT NOT NULL,
    nombre_producto VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    stock_disponible INTEGER NOT NULL,
    categoria_id INTEGER NOT NULL,
    PRIMARY KEY(producto_id)
);
CREATE TABLE factura(
    factura_id INTEGER AUTO_INCREMENT NOT NULL,
    cliente_id INTEGER NOT NULL,
    fecha_factura DATE NOT NULL,
    total_factura DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY(factura_id)
);
CREATE TABLE detalle_factura(
    detalle_factura_id INTEGER AUTO_INCREMENT NOT NULL,
    factura_id INTEGER NOT NULL,
    producto_id INTEGER NOT NULL,
    cantidad_producto INTEGER NOT NULL,
    precio_unitario DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY(detalle_factura_id)
);
CREATE TABLE cliente(
    cliente_id INTEGER AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    correo_electronico VARCHAR(50) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    PRIMARY KEY(cliente_id)
);
ALTER TABLE
    factura ADD CONSTRAINT factura_cliente_id_foreign FOREIGN KEY(cliente_id) REFERENCES cliente(cliente_id);
ALTER TABLE
    producto ADD CONSTRAINT producto_categoria_id_foreign FOREIGN KEY(categoria_id) REFERENCES categoria(categoria_id);
ALTER TABLE
    producto_carrito ADD CONSTRAINT producto_carrito_carrito_id_foreign FOREIGN KEY(carrito_id) REFERENCES carrito(carrito_id);
ALTER TABLE
    detalle_factura ADD CONSTRAINT detalle_factura_factura_id_foreign FOREIGN KEY(factura_id) REFERENCES factura(factura_id);
ALTER TABLE
    carrito ADD CONSTRAINT carrito_cliente_id_foreign FOREIGN KEY(cliente_id) REFERENCES cliente(cliente_id);
ALTER TABLE
    producto_carrito ADD CONSTRAINT producto_carrito_producto_id_foreign FOREIGN KEY(producto_id) REFERENCES producto(producto_id);
ALTER TABLE
    detalle_factura ADD CONSTRAINT detalle_factura_producto_id_foreign FOREIGN KEY(producto_id) REFERENCES producto(producto_id);