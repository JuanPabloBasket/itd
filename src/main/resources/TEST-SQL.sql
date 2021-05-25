-- 1
SELECT c.NOMBRE, c.APELLIDO, pr.NOMBRE AS NOMBRE_PROVEEDOR
FROM itd_producto p
INNER JOIN itd_proveedor pr ON p.proveedor_nif = pr.NIF
INNER JOIN itd_cliente_productos cp ON p.CODIGO = cp.productos_codigo  
INNER JOIN itd_cliente c ON cp.cliente_dni = c.DNI    
WHERE p.NOMBRE LIKE '%X%';

-- 2
SELECT p.*
FROM itd_producto p
WHERE p.precio IN (
	SELECT MAX(p.precio)
	FROM itd_producto p);

-- 3
SELECT p.*
FROM itd_producto p
WHERE p.precio IN (
	SELECT MIN(p.precio)
	FROM itd_producto p);


-- 4
	
SELECT DISTINCT(p.NOMBRE)
FROM itd_producto p
INNER JOIN itd_proveedor pr ON p.proveedor_nif = pr.NIF
WHERE pr.NOMBRE LIKE '%X%'
LIMIT 5;