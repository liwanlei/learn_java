/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : fangqq

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-07-04 17:20:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `friend`
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `id` int(255) NOT NULL,
  `user_id` int(255) NOT NULL,
  `friend_id` int(255) DEFAULT NULL,
  `addtime` datetime DEFAULT NULL,
  `status` int(8) NOT NULL DEFAULT '0' COMMENT '状态，0代表正常，1代表删除，2代表拉黑',
  `deletime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(255) NOT NULL,
  `user_id` int(255) DEFAULT NULL,
  `send_user` int(11) DEFAULT NULL,
  `message` longtext,
  `sendtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(255) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `username` varchar(128) DEFAULT NULL COMMENT '用户名',
  `password` varchar(128) DEFAULT NULL,
  `sex` varchar(8) DEFAULT NULL COMMENT '性别',
  `promble` varchar(255) DEFAULT NULL,
  `anwser` varchar(255) DEFAULT NULL COMMENT '安全问题答案',
  `status` int(8) DEFAULT NULL COMMENT '状态，0代表正常，1删除，2冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001', 'liwanlei', 'ba949872ab6bdd45e3e160a2e12db3a6', '1', 'okok', 'oko', '0');
INSERT INTO `user` VALUES ('000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006', 'liwanledsad', 'bd8a70b2012cbd7a08c9de6836db809c', '男', 'liwanledsad', 'liwanledsad', '0');
INSERT INTO `user` VALUES ('000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007', 'sdfsdliwanledsad', 'e10adc3949ba59abbe56e057f20f883e', '男', 'dsadsaffs', 'sdfsdfliwanledsad', '0');

-- ----------------------------
-- Table structure for `weidumessage`
-- ----------------------------
DROP TABLE IF EXISTS `weidumessage`;
CREATE TABLE `weidumessage` (
  `id` int(255) NOT NULL,
  `user_id` int(255) DEFAULT NULL,
  `message` longtext,
  `send_time` datetime DEFAULT NULL,
  `send_user` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weidumessage
-- ----------------------------
