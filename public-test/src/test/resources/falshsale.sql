--
-- Dumping data for table `flash_sale`
--

LOCK TABLES `flash_sale` WRITE;
/*!40000 ALTER TABLE `flash_sale` DISABLE KEYS */;
INSERT INTO `flash_sale` VALUES (1,addDate(now(), interval 1 day),0,'2020-12-11 00:00:00','2020-12-11 00:00:00'),(2,addDate(now(), interval 1 day),1,'2020-12-11 00:00:00','2020-12-11 00:00:00'),(3,now(),0,'2020-12-11 00:00:00','2020-12-11 00:00:00'),(4,now(),1,'2020-12-11 00:00:00','2020-12-11 00:00:00');
/*!40000 ALTER TABLE `flash_sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `flash_sale_item`
--

LOCK TABLES `flash_sale_item` WRITE;
/*!40000 ALTER TABLE `flash_sale_item` DISABLE KEYS */;
INSERT INTO `flash_sale_item` VALUES (1,1,290,305,30,'2020-12-11 00:00:00',NULL),(2,1,240,3050,20,'2020-12-11 00:00:00',NULL),(3,2,290,305,30,'2020-12-11 00:00:00',NULL),(4,2,240,3050,30,'2020-12-11 00:00:00',NULL),(5,3,290,305,30,'2020-12-11 00:00:00',NULL),(6,3,240,3050,30,'2020-12-11 00:00:00',NULL),(7,4,290,305,30,'2020-12-11 00:00:00',NULL),(8,4,240,3050,30,'2020-12-11 00:00:00',NULL);
/*!40000 ALTER TABLE `flash_sale_item` ENABLE KEYS */;
UNLOCK TABLES;