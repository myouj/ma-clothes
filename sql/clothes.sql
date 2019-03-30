/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.6.39-log : Database - clothes
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`clothes` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `clothes`;

/*Table structure for table `allocation_info` */

DROP TABLE IF EXISTS `allocation_info`;

CREATE TABLE `allocation_info` (
  `id` varchar(32) NOT NULL,
  `curr_depot` tinyint(4) DEFAULT NULL,
  `to_depot` tinyint(4) DEFAULT NULL,
  `goods_info` varchar(512) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `operator_time` date DEFAULT NULL,
  `operator` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `allocation_info` */

/*Table structure for table `depot` */

DROP TABLE IF EXISTS `depot`;

CREATE TABLE `depot` (
  `id` varchar(32) NOT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `capacity` int(20) DEFAULT NULL,
  `curr_count` int(20) DEFAULT '0',
  `manager` varchar(16) DEFAULT NULL,
  `manager_tel` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `depot` */

insert  into `depot`(`id`,`num`,`address`,`capacity`,`curr_count`,`manager`,`manager_tel`,`remark`) values 
('dfdafdsa',NULL,NULL,NULL,0,NULL,NULL,NULL),
('dfsafdsafds',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsafds',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsafdsadfds',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsafdsafds',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsafdsafdsafds',1,'山的那边',10000,0,'张三','12345678901',NULL),
('fdsafdsafs',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsafdsfds',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsfadsaf',NULL,NULL,NULL,0,NULL,NULL,NULL),
('fdsfas',NULL,NULL,NULL,0,NULL,NULL,NULL),
('ffewfafafwfdsa',2,'海的中间',200000,0,'李四','18888888888',NULL);

/*Table structure for table `depot_goods` */

DROP TABLE IF EXISTS `depot_goods`;

CREATE TABLE `depot_goods` (
  `id` varchar(32) NOT NULL,
  `depot_id` varchar(32) DEFAULT NULL,
  `goods_id` varchar(32) DEFAULT NULL,
  `goods_name` varchar(64) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `depot_goods` */

/*Table structure for table `depot_info` */

DROP TABLE IF EXISTS `depot_info`;

CREATE TABLE `depot_info` (
  `id` varchar(32) NOT NULL,
  `document` varchar(32) DEFAULT NULL,
  `customer` varchar(32) DEFAULT NULL,
  `goods_info` varchar(512) DEFAULT NULL,
  `operator_time` date DEFAULT NULL,
  `operator` varchar(16) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `in_or_out` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `depot_info` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `id` varchar(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `unit` varchar(8) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

/*Table structure for table `manager` */

DROP TABLE IF EXISTS `manager`;

CREATE TABLE `manager` (
  `id` varchar(32) NOT NULL,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `name` varchar(16) DEFAULT NULL,
  `telephone` varchar(16) DEFAULT NULL,
  `department_id` varchar(32) DEFAULT NULL,
  `super_root` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manager` */

insert  into `manager`(`id`,`username`,`password`,`name`,`telephone`,`department_id`,`super_root`) values 
('afdsafdafdsafd','111','222','da',NULL,NULL,0),
('fdafdafdsafds','123','456','ma','18565544225',NULL,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
