/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : image-sex-version01

Target Server Type    : MYSQL
Target Server Version : 50699
File Encoding         : 65001

Date: 2017-08-24 21:17:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for img_library
-- ----------------------------
DROP TABLE IF EXISTS `img_library`;
CREATE TABLE `img_library` (
`img_library_id`  int(11) NOT NULL ,
`img_library_name`  varchar(1000) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_library_name_uuid`  varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of img_library
-- ----------------------------
BEGIN;
INSERT DELAYED INTO `img_library` (`img_library_id`, `img_library_name`, `img_library_name_uuid`) VALUES ('1', 'http://thethao.vnexpress.net/tin-tuc/sea-games-2017', '11111111111111111'), ('1', 'http://thethao.vnexpress.net/tin-tuc/sea-games-2017', '22222222222222222');
COMMIT;

-- ----------------------------
-- Table structure for img_thub
-- ----------------------------
DROP TABLE IF EXISTS `img_thub`;
CREATE TABLE `img_thub` (
`img_thub_id`  int(11) NOT NULL ,
`img_thub_name`  varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_thub_name_uuid`  varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of img_thub
-- ----------------------------
BEGIN;
INSERT INTO `img_thub` (`img_thub_id`, `img_thub_name`, `img_thub_name_uuid`) VALUES ('1', 'bangnx', 'tm-img-01.jpg'), ('1', 'banngx1', 'tm-img-02.jpg');
COMMIT;

-- ----------------------------
-- Table structure for img_viewer
-- ----------------------------
DROP TABLE IF EXISTS `img_viewer`;
CREATE TABLE `img_viewer` (
`img_id`  int(11) NOT NULL AUTO_INCREMENT ,
`img_name`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_link_avata`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_description`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_status`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_name_avata`  varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_name_avata_uuid`  varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`img_id_thumbnail`  int(11) NOT NULL ,
`img_id_library`  int(11) NOT NULL ,
`img_date_create`  date NOT NULL ,
`img_money`  double NOT NULL ,
PRIMARY KEY (`img_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
AUTO_INCREMENT=2

;

-- ----------------------------
-- Records of img_viewer
-- ----------------------------
BEGIN;
INSERT INTO `img_viewer` (`img_id`, `img_name`, `img_link_avata`, `img_description`, `img_status`, `img_name_avata`, `img_name_avata_uuid`, `img_id_thumbnail`, `img_id_library`, `img_date_create`, `img_money`) VALUES ('1', 'xuanbang', 'tm-img-03.jpg', 'hanoidansolon', 'ACTIVE', 'Full HD', '11111111111111111', '1', '1', '2017-08-24', '100000');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`acc_id`  int(255) NOT NULL AUTO_INCREMENT ,
`acc_user`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_pass`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_first_fName`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_first_lName`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_email`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_phone`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_address`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_money`  double NOT NULL ,
`acc_status`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`acc_create`  date NOT NULL ,
PRIMARY KEY (`acc_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Auto increment value for img_viewer
-- ----------------------------
ALTER TABLE `img_viewer` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for user
-- ----------------------------
ALTER TABLE `user` AUTO_INCREMENT=1;
