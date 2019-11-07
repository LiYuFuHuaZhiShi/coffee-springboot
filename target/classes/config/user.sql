/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50532
 Source Host           : localhost:3306
 Source Schema         : coffee

 Target Server Type    : MySQL
 Target Server Version : 50532
 File Encoding         : 65001

 Date: 14/05/2019 16:41:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户姓名',
  `user_pwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户密码',
  `user_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户手机号（最多11位）',
  `user_email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户邮箱',
  `user_level` int(1) DEFAULT NULL COMMENT '用户级别（0：管理员；1：普通用户）',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Lucy', '123', '15203669874', '569874123@qq.com', 0);
INSERT INTO `user` VALUES (2, 'Tom', '123', '12356478965', '541236987@qq.com', 1);
INSERT INTO `user` VALUES (3, 'Limy', '123', '12356478961', '541236917@qq.com', 1);
INSERT INTO `user` VALUES (4, 'User', '123', '12356478962', '1@q1.com', 1);
INSERT INTO `user` VALUES (5, 'Admin', '123', '12356478963', '1@q2.com', 0);

SET FOREIGN_KEY_CHECKS = 1;
