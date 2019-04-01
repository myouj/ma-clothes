/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50643
Source Host           : localhost:3306
Source Database       : clothes

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-04-01 20:03:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for allocation_info
-- ----------------------------
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

-- ----------------------------
-- Records of allocation_info
-- ----------------------------

-- ----------------------------
-- Table structure for depot
-- ----------------------------
DROP TABLE IF EXISTS `depot`;
CREATE TABLE `depot` (
  `id` varchar(32) NOT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `capacity` int(20) DEFAULT '0',
  `curr_count` int(20) DEFAULT '0',
  `manager` varchar(16) DEFAULT NULL,
  `manager_tel` varchar(16) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of depot
-- ----------------------------
INSERT INTO `depot` VALUES ('06dc34b55343453c9b4035ed91dbe285', '11', 'fdsafdsafd', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('274b673917e4400482e4c64b19d7748e', '6', '北京', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('29611df22d914bcc9d3358dfccc918cf', '4', '信息枢纽楼', '199999', '0', '马宇坚', '18565544225', '存钱');
INSERT INTO `depot` VALUES ('527a8c224a974a73a3b7f6faa1f71fa5', '8', '', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('9b1a896a27cb4a18a8c40d31e6cc6643', '9', 'sdsfd', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('a19bde619e0f4c31b5966cc3c4ed749a', '7', '', '0', '0', 'Jack', '', '');
INSERT INTO `depot` VALUES ('c1a48773d63c43fc99d752f94a666fe5', '10', 'fdsafdsafd', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('d0ee252ea4e649fab2b245a778077cb1', '5', '南亭村', '22222', '0', 'ma', '12123456789', '');
INSERT INTO `depot` VALUES ('dfdafdsa', null, '四川', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('eb11c9a10ea946c6a8244582b8f1aa13', '3', '海大', '0', '0', 'liuguangmin', '11111111111', null);
INSERT INTO `depot` VALUES ('ef963b5024b54a6888ad2ea8f36b4d7f', null, '', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('fb46e6ace6574f20b48ca3d619f5eb9a', null, '', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('fdsafds', null, '111111', '0', '0', '', '', '');
INSERT INTO `depot` VALUES ('ffewfafafwfdsa', '2', '海的中间', '200000', '0', '李四', '18888888888', null);

-- ----------------------------
-- Table structure for depot_goods
-- ----------------------------
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

-- ----------------------------
-- Records of depot_goods
-- ----------------------------

-- ----------------------------
-- Table structure for depot_info
-- ----------------------------
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

-- ----------------------------
-- Records of depot_info
-- ----------------------------

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` varchar(32) NOT NULL,
  `number` int(11) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `price` double DEFAULT '0',
  `unit` varchar(8) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('2547e4df9eb7447db948d48b2d5aeedb', '6', '螺丝刀', '0', '', '');
INSERT INTO `goods` VALUES ('60f4157c4be4452390e7bb62e7f15515', '8', '键盘', '0', '', '');
INSERT INTO `goods` VALUES ('61b932b3b2f6464e8a11f3cd58445d70', '7', '螺丝钉', '0', '', '');
INSERT INTO `goods` VALUES ('688394cb056a4469bf0954a87934efad', '9', '鼠标', '0', '', '');
INSERT INTO `goods` VALUES ('6d216f2760b042aca1ca2ba10c7b0109', '3', '雪梨', '0', '', '');
INSERT INTO `goods` VALUES ('c9e7db2d4fbb435e9a41b7aa0f2a177f', '2', '西瓜', '0', '', '');
INSERT INTO `goods` VALUES ('d071c42fdadf4df9972ff6655cc9cd90', '5', '哈密瓜', '0', '', '');
INSERT INTO `goods` VALUES ('dfdsafdsa', '1', '锤子', '0', null, null);
INSERT INTO `goods` VALUES ('ebdc91c48bf64a7694688436609a99cc', '4', '木瓜', '0', '', '');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
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

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('afdsafdafdsafd', '111', '222', 'da', null, null, '0');
INSERT INTO `manager` VALUES ('fdafdafdsafds', '123', '456', 'ma', '18565544225', null, '1');
