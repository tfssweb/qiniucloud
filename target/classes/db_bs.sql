/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : db_bs

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-04-05 22:28:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `username` varchar(4000) NOT NULL COMMENT '管理员账号',
  `password` varchar(4000) NOT NULL COMMENT '管理员密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for t_mjmiaccttyp
-- ----------------------------
DROP TABLE IF EXISTS `t_mjmiaccttyp`;
CREATE TABLE `t_mjmiaccttyp` (
  `mjaccttypcd` varchar(100) NOT NULL COMMENT '商品大类',
  `mjaccttypdesc` varchar(4000) NOT NULL COMMENT '商品大类描述',
  `miaccttypcd` varchar(4000) NOT NULL COMMENT '产品小类',
  `miaccttypdesc` varchar(4000) NOT NULL COMMENT '商品小类描述',
  PRIMARY KEY (`mjaccttypcd`),
  CONSTRAINT `t_mjmiaccttyp_ibfk_1` FOREIGN KEY (`mjaccttypcd`) REFERENCES `t_product` (`mjaccttypcd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品大小类别表';

-- ----------------------------
-- Records of t_mjmiaccttyp
-- ----------------------------
INSERT INTO `t_mjmiaccttyp` VALUES ('JSP', 'JSP', 'OTHER', 'OTHER');

-- ----------------------------
-- Table structure for t_picture
-- ----------------------------
DROP TABLE IF EXISTS `t_picture`;
CREATE TABLE `t_picture` (
  `pictureid` int(11) NOT NULL AUTO_INCREMENT,
  `pictureurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pictureid`),
  CONSTRAINT `t_picture_ibfk_1` FOREIGN KEY (`pictureid`) REFERENCES `t_product` (`prodpictureid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_picture
-- ----------------------------

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `prodid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `mjaccttypcd` varchar(100) NOT NULL COMMENT '商品大类',
  `miaccttypcd` varchar(1000) NOT NULL COMMENT '商品小类',
  `prodname` varchar(1000) NOT NULL COMMENT '商品名称',
  `prodprice` double NOT NULL COMMENT '商品价格',
  `prodpictureid` int(255) DEFAULT NULL COMMENT '商品展示图片',
  `prodtitle` varchar(1000) DEFAULT NULL COMMENT '商品标题',
  `proddesc` varchar(1000) DEFAULT NULL COMMENT '商品描述',
  `proddetail` varchar(1000) DEFAULT NULL COMMENT '商品详细描述',
  `prodadddate` datetime DEFAULT NULL COMMENT '商品添加时间',
  `prodbuycnt` int(11) DEFAULT NULL COMMENT '商品被购买次数',
  `prod1` varchar(1000) DEFAULT NULL COMMENT '预留字段1',
  `prod2` varchar(1000) DEFAULT NULL COMMENT '预留字段2',
  `prod3` varchar(1000) DEFAULT NULL COMMENT '预留字段3',
  `prod4` varchar(1000) DEFAULT NULL COMMENT '预留字段4',
  `prod5` varchar(1000) DEFAULT NULL COMMENT '预留字段5',
  `datelastmaint` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`prodid`,`mjaccttypcd`),
  KEY `prodpictureid` (`prodpictureid`),
  KEY `mjaccttypcd` (`mjaccttypcd`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='商品属性表';

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1', 'JSP', 'OTHER', '测试', '1', null, null, null, null, null, null, null, null, null, null, null, '2017-04-05 17:19:11');
