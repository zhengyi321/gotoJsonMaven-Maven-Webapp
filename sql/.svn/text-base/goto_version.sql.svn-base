/*
Navicat MySQL Data Transfer

Source Server         : 天浩国际
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : tckd

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-05-14 17:33:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goto_version
-- ----------------------------
DROP TABLE IF EXISTS `goto_version`;
CREATE TABLE `goto_version` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `guid` char(64) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `version` char(10) DEFAULT NULL,
  `describ` char(255) DEFAULT NULL,
  `url` char(255) DEFAULT NULL,
  `is_new` bit(1) DEFAULT NULL,
  PRIMARY KEY (`guid`),
  KEY `AK_unique` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goto_version
-- ----------------------------
INSERT INTO `goto_version` VALUES ('1', 'sdfgsfgsdf', null, null, null, null, null, '');
