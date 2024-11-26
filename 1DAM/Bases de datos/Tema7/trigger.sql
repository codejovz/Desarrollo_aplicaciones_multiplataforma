DROP TRIGGER IF EXISTS antes_de_insertar_movimiento;

DELIMITER $$

CREATE TRIGGER antes_de_insertar_movimiento 
BEFORE INSERT ON movimiento FOR EACH ROW
BEGIN 
	SET @sum= @sum + new.cantidad;
	SET @momento = now();
END$$

DELIMITER ;