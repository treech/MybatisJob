# 本地数据库初始化

account表
```sql
CREATE TABLE `account` (
  `id` int(11) NOT NULL COMMENT '编号',
  `uid` int(11) DEFAULT NULL COMMENT '用户编号',
  `money` double DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `FK_Reference_8` (`uid`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`account`(`id`, `uid`, `money`) VALUES (1, 45, 1000);
INSERT INTO `test`.`account`(`id`, `uid`, `money`) VALUES (2, 46, 2000);
INSERT INTO `test`.`account`(`id`, `uid`, `money`) VALUES (3, 47, 3000);

```

user表
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `birthday` date DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`user`(`id`, `userName`, `sex`, `address`, `birthday`) VALUES (45, '安琪拉', '女', '武汉市洪山区', '2020-12-15');
INSERT INTO `test`.`user`(`id`, `userName`, `sex`, `address`, `birthday`) VALUES (46, '梁静茹', '女', '武汉市青山区', '2020-12-22');
INSERT INTO `test`.`user`(`id`, `userName`, `sex`, `address`, `birthday`) VALUES (47, '风清扬', '男', '武汉市武昌区', '2020-12-01');

```

# 联表查询
```sql
SELECT u.*,a.id as aId,a.money FROM account a,user u WHERE u.id = a.uid
```