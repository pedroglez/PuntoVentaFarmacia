-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 03-06-2014 a las 04:27:39
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `farmacia`
--
CREATE DATABASE `farmacia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `farmacia`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bodega`
--

CREATE TABLE IF NOT EXISTS `bodega` (
  `id_bodega` int(15) NOT NULL AUTO_INCREMENT,
  `id_medicamento` int(15) NOT NULL,
  `cantidad` int(20) NOT NULL,
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_bodega`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `bodega`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id_cliente` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido_paterno` varchar(20) NOT NULL,
  `apellido_materno` varchar(20) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fechs_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre`, `apellido_paterno`, `apellido_materno`, `telefono`, `email`, `direccion`, `status`, `fecha_alta`, `fechs_modificado`) VALUES
(1, 'jose', 'castan', 'lopez', 'jolo@hotmail.co', '9848544', 'fovisste jabalies', 2, '2014-05-04 14:28:12', '0000-00-00 00:00:00'),
(2, 'jose', 'lopez', 'perez', '9848544', 'jolo@hotmail.com', 'fovisste jabalies', 1, '2014-05-04 15:03:46', '0000-00-00 00:00:00'),
(3, 'marcos', 'lizarraga', 'marquez', '9645371', 'marcos@hotmail.com', 'villa galaxia', 1, '2014-05-04 15:04:39', '0000-00-00 00:00:00'),
(4, 'martin', 'corona', 'campillo', '9345621', 'martin@hotmail.com', 'zapata', 1, '2014-05-28 19:33:37', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_entrada`
--

CREATE TABLE IF NOT EXISTS `detalle_entrada` (
  `id_detalle_entrada` int(15) NOT NULL AUTO_INCREMENT,
  `id_entrada` int(15) NOT NULL,
  `id_producto` int(15) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int(15) NOT NULL,
  `total` double NOT NULL,
  `status` int(10) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_detalle_entrada`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `detalle_entrada`
--

INSERT INTO `detalle_entrada` (`id_detalle_entrada`, `id_entrada`, `id_producto`, `precio`, `cantidad`, `total`, `status`, `fecha_alta`, `fecha_modificado`) VALUES
(1, 1, 2, 50.25, 30, 1507.5, 1, '2014-05-27 22:11:52', '0000-00-00 00:00:00'),
(2, 2, 2, 50.25, 20, 1005, 1, '2014-05-28 16:49:31', '0000-00-00 00:00:00'),
(3, 2, 1, 35.5, 15, 532.5, 1, '2014-05-28 16:49:31', '0000-00-00 00:00:00'),
(4, 3, 7, 35, 30, 1050, 1, '2014-06-02 19:54:00', '0000-00-00 00:00:00'),
(5, 3, 7, 35, 20, 700, 1, '2014-06-02 19:54:00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_salida`
--

CREATE TABLE IF NOT EXISTS `detalle_salida` (
  `id_detalle_salida` int(15) NOT NULL AUTO_INCREMENT,
  `id_salida` int(15) NOT NULL,
  `id_producto` int(15) NOT NULL,
  `cantidad` int(15) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_detalle_salida`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `detalle_salida`
--

INSERT INTO `detalle_salida` (`id_detalle_salida`, `id_salida`, `id_producto`, `cantidad`, `status`, `fecha_alta`, `fecha_modificado`) VALUES
(1, 2, 9, 4, 1, '2014-06-02 20:20:04', '0000-00-00 00:00:00'),
(2, 3, 7, 6, 1, '2014-06-02 20:21:09', '0000-00-00 00:00:00'),
(3, 4, 9, 4, 1, '2014-06-02 20:26:32', '0000-00-00 00:00:00'),
(4, 4, 7, 6, 1, '2014-06-02 20:26:32', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `id_detalle_venta` int(10) NOT NULL AUTO_INCREMENT,
  `id_venta` int(10) NOT NULL,
  `id_producto` int(10) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int(10) NOT NULL,
  `total` double NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_detalle_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcar la base de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`id_detalle_venta`, `id_venta`, `id_producto`, `precio`, `cantidad`, `total`, `status`, `fecha_alta`, `fecha_modificado`) VALUES
(1, 3, 1, 35.5, 1, 35.5, 1, '2014-05-19 10:55:00', '0000-00-00 00:00:00'),
(2, 4, 2, 50.25, 1, 50.25, 1, '2014-05-19 11:03:40', '0000-00-00 00:00:00'),
(3, 4, 1, 35.5, 2, 71, 1, '2014-05-19 11:03:42', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE IF NOT EXISTS `entrada` (
  `id_entrada` int(15) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  `id_proveedor` int(15) NOT NULL,
  `cantidad` int(20) NOT NULL,
  `total` double NOT NULL,
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_entrada`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcar la base de datos para la tabla `entrada`
--

INSERT INTO `entrada` (`id_entrada`, `id_usuario`, `id_proveedor`, `cantidad`, `total`, `fecha_alta`, `fecha_modificado`) VALUES
(1, 0, 2, 0, 0, '2014-05-27 22:11:52', '0000-00-00 00:00:00'),
(2, 1, 2, 0, 0, '2014-05-28 16:49:31', '0000-00-00 00:00:00'),
(3, 1, 4, 0, 0, '2014-06-02 19:54:00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE IF NOT EXISTS `medicamento` (
  `id_medicamento` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `precio` varchar(20) NOT NULL,
  `cantidad` int(20) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_medicamento`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcar la base de datos para la tabla `medicamento`
--

INSERT INTO `medicamento` (`id_medicamento`, `nombre`, `precio`, `cantidad`, `status`) VALUES
(7, 'asparinas', '35', 0, 1),
(8, 'paracetamol', '40', 0, 1),
(9, 'loratadina', '37.50', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimientos`
--

CREATE TABLE IF NOT EXISTS `movimientos` (
  `id_movimiento` int(11) NOT NULL AUTO_INCREMENT,
  `entrada_existencia` int(11) NOT NULL,
  `salida_bodega` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_movimiento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `movimientos`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `id_proveedor` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_proveedor` varchar(50) NOT NULL,
  `apellido_paterno` varchar(50) NOT NULL,
  `apellido_materno` varchar(50) NOT NULL,
  `empresa` varchar(50) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcar la base de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `nombre_proveedor`, `apellido_paterno`, `apellido_materno`, `empresa`, `status`, `fecha_alta`, `fecha_modificado`) VALUES
(4, 'martin', 'corona ', 'campillo', 'farmaceutica especializada', 1, '2014-06-02 19:26:52', '0000-00-00 00:00:00'),
(5, 'alfredo', 'paez', 'ramirez', 'farmacon', 1, '2014-06-02 19:29:50', '0000-00-00 00:00:00'),
(6, 'jose', 'lopez', 'perez', 'imss', 2, '2014-06-02 19:30:14', '0000-00-00 00:00:00'),
(7, 'jose', ' lopez', 'perez', 'imss', 2, '2014-06-02 19:31:44', '0000-00-00 00:00:00'),
(8, 'jose ', 'lopez', 'perez', 'imss', 1, '2014-06-02 19:52:12', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salida`
--

CREATE TABLE IF NOT EXISTS `salida` (
  `id_salida` int(15) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(15) NOT NULL,
  `cantidad` int(20) NOT NULL,
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_salida`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `salida`
--

INSERT INTO `salida` (`id_salida`, `id_usuario`, `cantidad`, `fecha_alta`, `fecha_modificado`) VALUES
(1, 1, 1, '2014-06-02 20:18:13', '0000-00-00 00:00:00'),
(2, 1, 1, '2014-06-02 20:20:04', '0000-00-00 00:00:00'),
(3, 1, 1, '2014-06-02 20:21:09', '0000-00-00 00:00:00'),
(4, 1, 1, '2014-06-02 20:26:32', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido_paterno` varchar(20) NOT NULL,
  `apellido_materno` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre`, `apellido_paterno`, `apellido_materno`, `email`, `usuario`, `password`, `status`, `fecha_alta`, `fecha_modificado`) VALUES
(1, 'pedro', 'garcia', 'gonzalez', 'pedrule600@hotmail.com', 'pedro', '123', 1, '2014-05-07 22:36:04', '0000-00-00 00:00:00'),
(2, 'jose', 'lopez', 'perez', 'lopez@hotmaill.com', 'jose', '123', 2, '2014-04-27 18:14:42', '0000-00-00 00:00:00'),
(3, 'jose', 'lopez', 'perez', 'jolope@hotmail.com', 'jose', '123', 1, '2014-04-27 18:18:06', '0000-00-00 00:00:00'),
(4, 'luis', 'rodriguez', 'beltran', 'luis@hotmail.com', 'luis', '123', 2, '2014-04-28 21:32:32', '0000-00-00 00:00:00'),
(5, 'eduardo', 'garcia', 'acosta', 'eduardo@hotmail.com', 'eduardo', '123', 1, '2014-05-28 19:31:47', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `id_venta` int(10) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(10) NOT NULL,
  `id_cliente` int(10) NOT NULL,
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_modificado` datetime NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `total` int(20) NOT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `id_usuario`, `id_cliente`, `fecha_alta`, `fecha_modificado`, `status`, `total`) VALUES
(1, 1, 2, '2014-05-19 10:34:01', '0000-00-00 00:00:00', 1, 0),
(2, 1, 2, '2014-05-19 10:34:03', '0000-00-00 00:00:00', 1, 0),
(3, 1, 2, '2014-05-19 10:55:00', '0000-00-00 00:00:00', 1, 0),
(4, 1, 2, '2014-05-19 11:03:40', '0000-00-00 00:00:00', 1, 0);
