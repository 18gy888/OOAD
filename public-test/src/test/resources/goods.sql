
LOCK TABLES `goods_sku` WRITE;
/*!40000 ALTER TABLE `flash_sale_item` DISABLE KEYS */;
INSERT INTO `goods_sku` VALUES
(8989,9000,NULL,'1PB硬盘',7028,NULL,128,'http://47.52.88.176/file/images/201612/file_1132asdew26.jpg',500,NULL,0,'2020-12-15 22:55:00','2020-12-10 22:55:00',4);
INSERT INTO `goods_sku` VALUES
(8990,9000,NULL,'1GB硬盘',700,NULL,12,'http://47.52.88.176/file/images/201612/file_1132asdew26.jpg',50,NULL,0,'2020-12-15 22:55:00','2020-12-10 22:55:00',4);
INSERT INTO `goods_sku` VALUES
(8991,9001,NULL,'拖鞋',12,NULL,2,'http://47.52.88.176/file/images/201612/file_1132asdew26.jpg',50,NULL,0,'2020-12-15 22:55:00','2020-12-10 22:55:00',4);
/*!40000 ALTER TABLE `flash_sale_item` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `goods_spu` WRITE;
/*!40000 ALTER TABLE `flash_sale_item` DISABLE KEYS */;
INSERT INTO `goods_spu` VALUES
(9000,'阿瓦隆',71,123,11,1,'drh-d0001',NULL,'http://47.52.88.176/file/images/201612/file_file_1132asdew26.jpg','default',0,'2020-12-10 22:36:01','2020-12-10 22:36:01');

INSERT INTO `goods_spu` VALUES
(9001,'ysl',71,123,11,22,'ys-12245',NULL,'http://47.52.88.176/file/images/201412/file_file_1132asdew26.jpg','default',0,'2020-12-10 22:36:01','2020-12-10 22:36:01');

/*!40000 ALTER TABLE `flash_sale_item` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `float_price` WRITE;
/*!40000 ALTER TABLE `flash_sale_item` DISABLE KEYS */;
INSERT INTO `float_price` VALUES
(9000, 8990, 12, '2020-12-15 22:55:00', '2020-12-20 22:55:00', 10, 1, NULL, 1, '2020-12-15 17:04:58', '2020-12-15 17:04:58');
INSERT INTO `float_price` VALUES
(9001, 8991, 4, '2020-12-15 22:55:00', '2020-12-20 22:55:00', 10, 1, NULL, 1, '2020-12-15 17:04:58', '2020-12-15 17:04:58');
/*!40000 ALTER TABLE `flash_sale_item` ENABLE KEYS */;
UNLOCK TABLES;
