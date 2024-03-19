    CREATE TABLE IF NOT EXISTS `categorias`(
      `idcategoria` int NOT NULL AUTO_INCREMENT,
      `nombre` varchar(100) NOT NULL,
      PRIMARY KEY (`idcategoria`)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

    CREATE TABLE IF NOT EXISTS `proveedores`(
        `idproveedor` int NOt NULL AUTO_INCREMENT,
        `nombre` varchar(100) NOT NULL,
        `telefono` long NOT NULL,
         PRIMARY KEY (`idproveedor`)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

    CREATE TABLE IF NOT EXISTS `productos` (
      `idproducto` int NOT NULL AUTO_INCREMENT,
      `nombre` varchar(100) NOT NULL,
      `precio` long NOT NULL,
      `idcategoria` int NOT NULL,
      `idproveedor` int NOT NULL,
      PRIMARY KEY (`idproducto`),
      FOREIGN KEY (`idcategoria`) REFERENCES `categorias` (`idcategoria`),
      FOREIGN KEY (`idproveedor`) REFERENCES `proveedores` (`idproveedor`)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;