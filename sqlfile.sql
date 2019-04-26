/*
SQLyog - Free MySQL GUI v5.17
Host - 5.5.27 : Database - mysoft
*********************************************************************
Server version : 5.5.27
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `mysoft`;

USE `mysoft`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `fstructure` */

DROP TABLE IF EXISTS `fstructure`;

CREATE TABLE `fstructure` (
  `Module` varchar(100) DEFAULT NULL,
  `Fees` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fstructure` */

insert into `fstructure` (`Module`,`Fees`) values ('C','3500');
insert into `fstructure` (`Module`,`Fees`) values ('C++','3500');
insert into `fstructure` (`Module`,`Fees`) values ('Core Java','3500');
insert into `fstructure` (`Module`,`Fees`) values ('Adv/Java','7500');
insert into `fstructure` (`Module`,`Fees`) values ('Android','8000');
insert into `fstructure` (`Module`,`Fees`) values ('Python','7500');
insert into `fstructure` (`Module`,`Fees`) values ('PHP','7000');
insert into `fstructure` (`Module`,`Fees`) values ('ASP.net','7500');
insert into `fstructure` (`Module`,`Fees`) values ('Web Devlopment','7500');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `user_name` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert into `login` (`user_name`,`password`) values ('admin','12345');
insert into `login` (`user_name`,`password`) values ('gaurav','123456');
insert into `login` (`user_name`,`password`) values ('rahul','123');
insert into `login` (`user_name`,`password`) values ('sonu','1234');

/*Table structure for table `soft` */

DROP TABLE IF EXISTS `soft`;

CREATE TABLE `soft` (
  `StudentName` varchar(100) DEFAULT NULL,
  `CollegeName` varchar(100) DEFAULT NULL,
  `FatherName` varchar(100) DEFAULT NULL,
  `MobileNumber` varchar(100) NOT NULL,
  `PermanentAddress` varchar(100) DEFAULT NULL,
  `EmailID` varchar(100) DEFAULT NULL,
  `Gender` varchar(100) DEFAULT NULL,
  `DateOfBirth` varchar(100) DEFAULT NULL,
  `QualificationPursuing` varchar(100) DEFAULT NULL,
  `ModuleEnrolledIn` varchar(100) DEFAULT NULL,
  `FeeOptionSelected` varchar(100) DEFAULT NULL,
  `FeeAmount` varchar(100) DEFAULT NULL,
  `DueFees` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`MobileNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `soft` */

insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Vivek Mathur','IIT,kharagpur','Rajesh Mathur','7458962315','Kota','vivek.mathur@gmail.com','Male','25/09/1998','M.tech','C','Full Payment','3500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Sanjeet Solanki','IIT,Roorkee','Rajender Solanki','7856982353','Jaipur','snjeet.solanki@gmail.com','Male','02/05/1996','B.tech','C++','Full Payment','3500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Shahzeb','IITD,Delhi','Riyazuddin','7859364246','Tonk','shahzeb.56@gmail.com','Male','17/05/1991','B.tech','PHP','Two Instalments','4500','2500');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Pardeep Singh','IFHE,Hyderabad','Daljeet Singh','7877526423','Jaipur','pardeep.singh@yahoo.com','Female','02/05/1995','B.tech','C++','Full Payment','3500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Mandeep Singh','IIT,Roorkee','Gurmeet Singh','9414123568','Ajmer','mandeep.singh45@gmail.com','Male','06/06/1994','B.tech','Android','Two Instalments','4000','4000');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Mohd. Moosa','IIT,Kanpur','Akhlaquddin','9653254125','Kota','moosa.98@gmail.com','Male','03/05/1996','B.tech','C','Full Payment','3500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Ravi Singh','MNIT,Kota','Tirlok Singh','9685622422','Jaipur','ravi.ri76@yahoo.com','Male','06/08/1993','B.tech','Core Java','Full Payment','3500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Anjali Saini','Gurukul,Kota','Vinay Kumar','9754123557','Bundi','anjali.saini45@gmail.com','Female','02/06/1991','B.tech','Core Java','Full Payment','3500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Karan Veer Singh','MIT,Kota','Hemraj Singh','9772576147','Kota','karanveer7866@gmail.com','Male','07/10/1993','M.tech','Adv/Java','Full Payment','7500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Gaurav Nagar','MACET,Kota','Ramgopal Nagar','9785255135','Kota','gaurav.nagar17@gmail.com','Male','17/06/1995','B.tech','Python','Full Payment','7500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Harsh Nagar','MACET,Kota','Ishwar Singh','9856325412','Jaipur','harsh.nagar56@gmail.com','Male','18/05/1995','B.tech','Python','Two Instalments','3200','4300');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Aayushi Verma','Gurukul,jaipur','Dhanwant Verma','9856445534','Kota','ayushi.aa@Yahoo.com','Female','24/04/1995','B.tech','ASP.net','Full Payment','7500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Rahul','MACET,Kota','Yugal Kishore','9875422165','Kota','rahul.rr@gmail.com','Male','19/06/1995','B.tech','Web Devlopment','Full Payment','8500','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Ram Sharma','MIT,Kota','HariLal Sharma','9885642312','Jaipur','ram.sa@gmail.com','Male','18/03/1880','B.tech','Android','Full Payment','8000','0.0');
insert into `soft` (`StudentName`,`CollegeName`,`FatherName`,`MobileNumber`,`PermanentAddress`,`EmailID`,`Gender`,`DateOfBirth`,`QualificationPursuing`,`ModuleEnrolledIn`,`FeeOptionSelected`,`FeeAmount`,`DueFees`) values ('Nikhil Saini','IIIT,Hyderabad','Vinay Kumar','9894213542','Kota','nikhil.saini23@gmail.com','Male','13/07/1992','M.tech','Adv/Java','Two Instalments','3500','4000');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
