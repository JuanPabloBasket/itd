INSERT INTO itd_cliente (dni, nombre, apellido, direccion, fechanac) VALUES (1, 'Cliente Nombre 1', 'Cliente Apellido 1', 'Cliente Direccion 1', '1980-01-01');
INSERT INTO itd_cliente (dni, nombre, apellido, direccion, fechanac) VALUES (2, 'Cliente Nombre 2', 'Cliente Apellido 2', 'Cliente Direccion 2', '1980-01-01');
INSERT INTO itd_cliente (dni, nombre, apellido, direccion, fechanac) VALUES (3, 'Cliente Nombre 3', 'Cliente Apellido 3', 'Cliente Direccion 3', '1980-01-01');
INSERT INTO itd_cliente (dni, nombre, apellido, direccion, fechanac) VALUES (4, 'Cliente Nombre 4', 'Cliente Apellido 4', 'Cliente Direccion 4', '1980-01-01');
INSERT INTO itd_cliente (dni, nombre, apellido, direccion, fechanac) VALUES (5, 'Cliente Nombre 5', 'Cliente Apellido 5', 'Cliente Direccion 5', '1980-01-01');

INSERT INTO itd_proveedor (nif, nombre, direccion) VALUES (1, 'Proveedor Nombre 1', 'Proveedor Direccion 1');
INSERT INTO itd_proveedor (nif, nombre, direccion) VALUES (2, 'Proveedor Nombre 2', 'Proveedor Direccion 2');
INSERT INTO itd_proveedor (nif, nombre, direccion) VALUES (3, 'Proveedor Nombre 3', 'Proveedor Direccion 3');
INSERT INTO itd_proveedor (nif, nombre, direccion) VALUES (4, 'Proveedor Nombre 4', 'Proveedor Direccion 4');
INSERT INTO itd_proveedor (nif, nombre, direccion) VALUES (5, 'Proveedor Nombre 5', 'Proveedor Direccion 5');

INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (1, 'Producto Nombre 1', 100, 1);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (2, 'Producto Nombre 2', 200, 1);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (3, 'Producto Nombre 3', 300, 2);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (4, 'Producto Nombre 4', 400, 2);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (5, 'Producto Nombre 5', 500, 3);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (6, 'Producto Nombre 6', 600, 3);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (7, 'Producto Nombre 7', 700, 4);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (8, 'Producto Nombre 8', 800, 4);
INSERT INTO itd_producto (codigo, nombre, precio, proveedor_nif) VALUES (9, 'Producto Nombre 9', 900, 5);

INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (1, 1);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (1, 2);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (1, 3);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (2, 1);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (2, 2);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (3, 4);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (4, 5);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (5, 8);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (5, 9);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (5, 5);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (4, 8);
INSERT INTO itd_cliente_productos (cliente_dni, productos_codigo) VALUES (3, 9);