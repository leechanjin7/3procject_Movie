CREATE DATABASE  IF NOT EXISTS `moviedb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `moviedb`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: moviedb
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_theater`
--

DROP TABLE IF EXISTS `tbl_theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_theater` (
  `theaterId` int NOT NULL AUTO_INCREMENT,
  `theaterName` varchar(255) DEFAULT NULL,
  `theaterLocation` varchar(255) DEFAULT NULL,
  `totalSeats` int DEFAULT NULL,
  PRIMARY KEY (`theaterId`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_theater`
--

LOCK TABLES `tbl_theater` WRITE;
/*!40000 ALTER TABLE `tbl_theater` DISABLE KEYS */;
INSERT INTO `tbl_theater` VALUES (1,'반월','대구',50),(2,'수성','대구',50),(3,'성서','대구',50),(4,'광장','대구',40),(5,'율하','대구',50),(6,'현풍','대구',45),(7,'가산디지털','서울',50),(8,'가양','서울',50),(9,'강동','서울',45),(10,'건대입구','서울',45),(11,'노원','서울',50),(12,'독산','서울',40),(13,'수유','서울',50),(14,'신도림','서울',45),(15,'영등포','서울',40),(16,'신림','서울',50),(17,'용산','서울',40),(18,'은평','서울',45),(19,'중랑','서울',50),(20,'광주터미널','경기',45),(21,'부천','경기',50),(22,'부평','경기',50),(23,'수지','경기',50),(24,'안산','경기',50),(25,'안성','경기',45),(26,'용인기흥','경기',50),(27,'서귀포','제주',45),(28,'제주삼화지구','제주',50),(29,'제주아라','제주',45),(30,'제주연동','제주',50),(31,'남원주','강원',45),(32,'동해','강원',40),(33,'원주무실','강원',50),(34,'춘천','강원',40),(35,'프리미엄구미센트럴','경북',50),(36,'프리미엄만경','대구',50),(37,'프리미엄안동','경북',50),(38,'프리미엄칠곡','경북',50),(39,'포항','경북',45),(40,'영천','경북',45),(41,'영주','경북',50),(42,'상주','경북 ',45),(43,'대전(백화점)','충청/대전',50),(44,'대전관저','충청/대전',45),(45,'대전둔산(월평동)','충청/대전',40),(46,'대전센트럴','충청/대전',50),(47,'서산','충청/대전',40),(48,'서청주(아울렛)','충청/대전',45),(49,'아산터미널','충청/대전',45),(50,'천안불당','충청/대전',50),(51,'천안청당','충청/대전',50),(52,'청주용암','충청/대전',50),(53,'충주(모다아울렛)','충청/대전',45);
/*!40000 ALTER TABLE `tbl_theater` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-16 12:36:36
