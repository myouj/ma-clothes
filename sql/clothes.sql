/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.6.39-log : Database - clothes_city
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`clothes_city` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `clothes_city`;

/*Table structure for table `clo_account` */

DROP TABLE IF EXISTS `clo_account`;

CREATE TABLE `clo_account` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `serial_no` varchar(32) DEFAULT NULL,
  `initial_amount` bigint(20) DEFAULT NULL,
  `current_amount` bigint(20) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `is_default` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_account` */

/*Table structure for table `clo_account_head` */

DROP TABLE IF EXISTS `clo_account_head`;

CREATE TABLE `clo_account_head` (
  `id` varchar(32) NOT NULL,
  `type` varchar(32) DEFAULT NULL,
  `organization_id` varchar(32) DEFAULT NULL,
  `handler_id` varchar(32) DEFAULT NULL,
  `change_amount` bigint(20) DEFAULT NULL,
  `total_price` bigint(20) DEFAULT NULL,
  `account_id` varchar(32) DEFAULT NULL,
  `bill_no` varchar(32) DEFAULT NULL,
  `bill_time` datetime DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_account_head` */

/*Table structure for table `clo_account_item` */

DROP TABLE IF EXISTS `clo_account_item`;

CREATE TABLE `clo_account_item` (
  `id` varchar(32) NOT NULL,
  `header_id` varchar(32) NOT NULL,
  `account_id` varchar(32) DEFAULT NULL,
  `ioitem_id` varchar(32) DEFAULT NULL,
  `each_amount` bigint(20) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_account_item` */

/*Table structure for table `clo_application` */

DROP TABLE IF EXISTS `clo_application`;

CREATE TABLE `clo_application` (
  `id` varchar(32) NOT NULL,
  `number` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `type` varchar(32) DEFAULT NULL,
  `icon` varchar(64) DEFAULT NULL,
  `url` varchar(128) DEFAULT NULL,
  `width` varchar(32) DEFAULT NULL,
  `height` varchar(32) DEFAULT NULL,
  `resize` bit(1) DEFAULT NULL,
  `open_max` bit(1) DEFAULT NULL,
  `flash` bit(1) DEFAULT NULL,
  `category` varchar(32) DEFAULT NULL,
  `sort` varchar(32) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_application` */

/*Table structure for table `clo_asset` */

DROP TABLE IF EXISTS `clo_asset`;

CREATE TABLE `clo_asset` (
  `id` varchar(32) NOT NULL,
  `asset_name_id` varchar(32) NOT NULL,
  `location` varchar(128) DEFAULT NULL,
  `labels` varchar(128) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `purchase_date` datetime DEFAULT NULL,
  `valid_date` datetime DEFAULT NULL,
  `warranty_date` datetime DEFAULT NULL,
  `asset_number` varchar(64) DEFAULT NULL,
  `serial_number` varchar(64) DEFAULT NULL,
  `supplier_id` varchar(32) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updator` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_asset` */

/*Table structure for table `clo_asset_category` */

DROP TABLE IF EXISTS `clo_asset_category`;

CREATE TABLE `clo_asset_category` (
  `id` varchar(32) NOT NULL,
  `asset_name` varchar(32) NOT NULL,
  `is_system` bit(1) NOT NULL DEFAULT b'1',
  `description` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_asset_category` */

/*Table structure for table `clo_asset_info` */

DROP TABLE IF EXISTS `clo_asset_info`;

CREATE TABLE `clo_asset_info` (
  `id` varchar(32) NOT NULL,
  `asset_name` varchar(32) NOT NULL,
  `asset_category_id` varchar(32) NOT NULL,
  `is_system` bit(1) NOT NULL DEFAULT b'1',
  `description` varchar(512) DEFAULT NULL,
  `is_consumables` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_asset_info` */

/*Table structure for table `clo_depot` */

DROP TABLE IF EXISTS `clo_depot`;

CREATE TABLE `clo_depot` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `storage_charge` bigint(20) DEFAULT NULL,
  `truckage` bigint(20) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `principal` varchar(32) NOT NULL,
  `sort` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_depot` */

/*Table structure for table `clo_document_head` */

DROP TABLE IF EXISTS `clo_document_head`;

CREATE TABLE `clo_document_head` (
  `id` varchar(32) NOT NULL,
  `type` varchar(8) DEFAULT NULL,
  `sub_type` varchar(32) DEFAULT NULL,
  `project_id` varchar(32) DEFAULT NULL,
  `inital_number` varchar(64) DEFAULT NULL,
  `number` varchar(64) DEFAULT NULL,
  `operator_name` varchar(16) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `operator_time` datetime DEFAULT NULL,
  `organization_id` varchar(32) DEFAULT NULL,
  `handle_id` varchar(32) DEFAULT NULL,
  `account_id` varchar(32) DEFAULT NULL,
  `change_amount` bigint(20) DEFAULT NULL,
  `allocation_project_id` varchar(32) DEFAULT NULL,
  `total_price` bigint(20) DEFAULT NULL,
  `pay_type` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `salesman` varchar(64) DEFAULT NULL,
  `account_id_list` varchar(256) DEFAULT NULL,
  `account_money_list` varchar(256) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `discount_money` bigint(20) DEFAULT NULL,
  `discount_last_money` bigint(20) DEFAULT NULL,
  `other_money` bigint(20) DEFAULT NULL,
  `other_money_list` varchar(256) DEFAULT NULL,
  `other_money_item` varchar(256) DEFAULT NULL,
  `account_date` int(11) DEFAULT NULL,
  `status` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_document_head` */

/*Table structure for table `clo_document_item` */

DROP TABLE IF EXISTS `clo_document_item`;

CREATE TABLE `clo_document_item` (
  `id` varchar(32) NOT NULL,
  `header_id` varchar(32) NOT NULL,
  `material_id` varchar(32) NOT NULL,
  `measuring_unit` varchar(8) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `basic_number` int(11) DEFAULT NULL,
  `unit_price` int(11) DEFAULT NULL,
  `tax_unit_price` int(11) DEFAULT NULL,
  `all_price` bigint(20) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `icon` varchar(128) DEFAULT NULL,
  `incidentals` bigint(20) DEFAULT NULL,
  `depot_id` varchar(32) DEFAULT NULL,
  `another_depot_id` varchar(32) DEFAULT NULL,
  `tax_rate` double DEFAULT NULL,
  `tax_money` bigint(20) DEFAULT NULL,
  `tax_last_money` bigint(20) DEFAULT NULL,
  `other_field1` varchar(64) DEFAULT NULL,
  `other_field2` varchar(64) DEFAULT NULL,
  `other_field3` varchar(64) DEFAULT NULL,
  `other_field4` varchar(64) DEFAULT NULL,
  `other_field5` varchar(64) DEFAULT NULL,
  `material_type` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_document_item` */

/*Table structure for table `clo_functions` */

DROP TABLE IF EXISTS `clo_functions`;

CREATE TABLE `clo_functions` (
  `id` varchar(32) NOT NULL,
  `number` varchar(64) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `parent_number` varchar(64) DEFAULT NULL,
  `url` varchar(128) DEFAULT NULL,
  `state` bit(1) DEFAULT NULL,
  `sort` varchar(16) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `push_button` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_functions` */

/*Table structure for table `clo_inout_item` */

DROP TABLE IF EXISTS `clo_inout_item`;

CREATE TABLE `clo_inout_item` (
  `id` varchar(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_inout_item` */

/*Table structure for table `clo_log` */

DROP TABLE IF EXISTS `clo_log`;

CREATE TABLE `clo_log` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(32) NOT NULL,
  `operation` varchar(32) DEFAULT NULL,
  `client_ip` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `content_details` varchar(512) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_log` */

/*Table structure for table `clo_material` */

DROP TABLE IF EXISTS `clo_material`;

CREATE TABLE `clo_material` (
  `id` varchar(32) NOT NULL,
  `category_id` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `manufacturer` varchar(32) DEFAULT NULL,
  `packing` int(11) DEFAULT NULL,
  `safety_stock` int(11) DEFAULT NULL,
  `model` varchar(32) DEFAULT NULL,
  `standard` varchar(64) DEFAULT NULL,
  `color` varchar(8) DEFAULT NULL,
  `unit` varchar(8) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `retail_rrice` int(11) DEFAULT NULL,
  `low_price` int(11) DEFAULT NULL,
  `preset_price_one` int(11) DEFAULT NULL,
  `preset_price_two` int(11) DEFAULT NULL,
  `unit_id` varchar(32) DEFAULT NULL,
  `first_out_unit` varchar(64) DEFAULT NULL,
  `first_in_unit` varchar(64) DEFAULT NULL,
  `price_strategy` varchar(256) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `other_field1` varchar(64) DEFAULT NULL,
  `other_field2` varchar(64) DEFAULT NULL,
  `other_field3` varchar(64) DEFAULT NULL,
  `enabled_serial_number` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_material` */

/*Table structure for table `clo_material_category` */

DROP TABLE IF EXISTS `clo_material_category`;

CREATE TABLE `clo_material_category` (
  `id` varchar(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `category_level` int(11) DEFAULT NULL,
  `parent_id` varchar(32) DEFAULT NULL,
  `sort` varchar(16) DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `serial_no` varchar(64) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updator` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_material_category` */

/*Table structure for table `clo_material_property` */

DROP TABLE IF EXISTS `clo_material_property`;

CREATE TABLE `clo_material_property` (
  `id` varchar(32) NOT NULL,
  `native_name` varchar(64) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `sort` varchar(16) DEFAULT NULL,
  `another_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_material_property` */

/*Table structure for table `clo_organization` */

DROP TABLE IF EXISTS `clo_organization`;

CREATE TABLE `clo_organization` (
  `id` varchar(32) NOT NULL,
  `number` varchar(32) NOT NULL,
  `full_name` varchar(64) DEFAULT NULL,
  `abbreviation` varchar(16) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `parent_no` varchar(32) DEFAULT NULL,
  `sort` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `organization_create_time` datetime DEFAULT NULL,
  `organization_stop_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_organization` */

/*Table structure for table `clo_organization_user_relationship` */

DROP TABLE IF EXISTS `clo_organization_user_relationship`;

CREATE TABLE `clo_organization_user_relationship` (
  `id` varchar(32) NOT NULL,
  `organization_id` varchar(32) NOT NULL,
  `user_id` varchar(32) NOT NULL,
  `user_in_orga_sequence` varchar(16) DEFAULT NULL,
  `delete_flag` tinyint(4) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_organization_user_relationship` */

/*Table structure for table `clo_person` */

DROP TABLE IF EXISTS `clo_person`;

CREATE TABLE `clo_person` (
  `id` varchar(32) NOT NULL,
  `type` varchar(16) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_person` */

/*Table structure for table `clo_role` */

DROP TABLE IF EXISTS `clo_role`;

CREATE TABLE `clo_role` (
  `id` varchar(32) NOT NULL,
  `name` varchar(16) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `value` varchar(128) DEFAULT NULL,
  `description` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_role` */

/*Table structure for table `clo_sequence` */

DROP TABLE IF EXISTS `clo_sequence`;

CREATE TABLE `clo_sequence` (
  `id` varchar(32) NOT NULL,
  `min_value` int(11) NOT NULL,
  `max_value` bigint(20) NOT NULL,
  `current_value` bigint(20) NOT NULL,
  `increament_value` int(11) NOT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_sequence` */

/*Table structure for table `clo_serial_number` */

DROP TABLE IF EXISTS `clo_serial_number`;

CREATE TABLE `clo_serial_number` (
  `id` varchar(32) NOT NULL,
  `material_id` varchar(32) NOT NULL,
  `serial_number` varchar(64) DEFAULT NULL,
  `is_sell` bit(1) DEFAULT b'0',
  `remark` varchar(512) DEFAULT NULL,
  `delect_flag` bit(1) DEFAULT b'0',
  `create_time` datetime DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updator` varchar(32) DEFAULT NULL,
  `document_head_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_serial_number` */

/*Table structure for table `clo_supplier` */

DROP TABLE IF EXISTS `clo_supplier`;

CREATE TABLE `clo_supplier` (
  `id` varchar(32) NOT NULL,
  `supplier` varchar(32) NOT NULL,
  `contacts` varchar(32) NOT NULL,
  `phone_number` varchar(16) NOT NULL,
  `email` varchar(32) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `is_system` bit(1) DEFAULT b'1',
  `type` varchar(16) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  `advance_in` bigint(20) DEFAULT '0',
  `begin_need_get` bigint(20) DEFAULT NULL,
  `begin_need_pay` bigint(20) DEFAULT NULL,
  `all_need_get` bigint(20) DEFAULT NULL,
  `all_need_pay` bigint(20) DEFAULT NULL,
  `fax` varchar(16) DEFAULT NULL,
  `telephone` varchar(16) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `tax_number` varchar(64) DEFAULT NULL,
  `bank_name` varchar(64) DEFAULT NULL,
  `account_number` varchar(32) DEFAULT NULL,
  `tax_rate` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_supplier` */

/*Table structure for table `clo_system_config` */

DROP TABLE IF EXISTS `clo_system_config`;

CREATE TABLE `clo_system_config` (
  `id` varchar(32) NOT NULL,
  `type` varchar(16) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `value` varchar(256) DEFAULT NULL,
  `description` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_system_config` */

/*Table structure for table `clo_unit` */

DROP TABLE IF EXISTS `clo_unit`;

CREATE TABLE `clo_unit` (
  `id` varchar(32) NOT NULL,
  `unit_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_unit` */

/*Table structure for table `clo_user` */

DROP TABLE IF EXISTS `clo_user`;

CREATE TABLE `clo_user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `login_name` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `position` varchar(16) DEFAULT NULL,
  `department` varchar(16) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `phone_number` varchar(16) DEFAULT NULL,
  `is_manager` bit(1) NOT NULL DEFAULT b'1',
  `is_system` bit(1) NOT NULL DEFAULT b'1',
  `status` tinyint(4) DEFAULT NULL,
  `description` varchar(128) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_user` */

/*Table structure for table `clo_user_business` */

DROP TABLE IF EXISTS `clo_user_business`;

CREATE TABLE `clo_user_business` (
  `id` varchar(32) NOT NULL,
  `type` varchar(32) DEFAULT NULL,
  `key_id` varchar(32) DEFAULT NULL,
  `value` varchar(512) DEFAULT NULL,
  `button_authorith` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clo_user_business` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
