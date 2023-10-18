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
  `cinemaId` int DEFAULT NULL,
  `theaterName` varchar(255) DEFAULT NULL,
  `totalSeats` int DEFAULT NULL,
  PRIMARY KEY (`theaterId`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_theater`
--

LOCK TABLES `tbl_theater` WRITE;
/*!40000 ALTER TABLE `tbl_theater` DISABLE KEYS */;
INSERT INTO `tbl_theater` VALUES (1,1,'1',50),(2,1,'2',45),(3,1,'3',45),(4,2,'1',50),(5,2,'2',45),(6,2,'3',40),(7,3,'1',45),(8,3,'2',50),(9,3,'3',40),(10,4,'1',50),(11,4,'2',45),(12,4,'3',40),(13,5,'1',50),(14,5,'2',45),(15,5,'3',50),(16,6,'1',40),(17,6,'2',40),(18,6,'3',50),(19,7,'1',50),(20,7,'2',45),(21,7,'3',40),(22,8,'1',45),(23,8,'2',40),(24,8,'3',50),(25,9,'1',45),(26,9,'2',50),(27,9,'3',50),(28,10,'1',40),(29,10,'2',45),(30,10,'3',50),(31,11,'1',45),(32,11,'2',45),(33,11,'3',40),(34,12,'1',40),(35,12,'2',50),(36,12,'3',45);
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

-- Dump completed on 2023-10-18 16:20:01
