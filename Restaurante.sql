create database DBRestaurante;
use DBRestaurante;
create table cliente(
idcliente int not null auto_increment,
nombre varchar(45) not null,
apellido varchar(45) not null,
nit int not null,
primary key pk_idempleado(idcliente)
);
create table cocinero(
idcocinero int not null auto_increment,
nombre varchar(45) not null,
apellido varchar(45) not null,  
primary key pk_idcocinero(idcocinero)
);
create table mesero(
idmesero int not null auto_increment,
nombre varchar(45) not null,
apellido varchar(45) not null, 
primary key pk_idmesero(idmesero)
);
create table area (
idarea int not null auto_increment,
descripcion varchar(50) not null,
primary key pk_idarea(idarea)
);
create table mesa(
idmesa int not null auto_increment,
nomesa double,
idarea int not null,
primary key pk_idmesa(idmesa),
foreign key fk_idarea(idarea) references area(idarea)
);
Create table platillos(
idplatillos int not null auto_increment,
descripcion varchar(100)not null,
precio double,
primary key pk_idplatillos(idplatillos)
);
create table factura(
idfactura int not null auto_increment,
idcliente int,
totalapagar double,
idmesero int not null,
idmesa int not null,
primary key pk_idfactura(idfactura),
foreign key fk_idcliente(idcliente)references cliente (idcliente),
foreign key fk_idmesero(idmesero) references mesero (idmesero),
foreign key fk_idmesa(idmesa) references mesa(idmesa)
);
create table detalleFactura(
iddetalleFactura int not null auto_increment,
idcocinero int not null,
idmenu int not null,
idplatillos int not null,
idfactura int not null,
primary key pk_iddetalleFactura(iddetallefactura),
foreign key fk_idcocinero(idcocinero) references cocinero(idcocinero),
foreign key fk_idplatillos(idplatillos) references platillos (idplatillos),
foreign key fk_idfactura(idfactura) references factura(idfactura)
);
