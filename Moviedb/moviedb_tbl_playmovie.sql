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
-- Table structure for table `tbl_playmovie`
--

DROP TABLE IF EXISTS `tbl_playmovie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_playmovie` (
  `playMovieId` int NOT NULL AUTO_INCREMENT,
  `imgId` int DEFAULT NULL,
  `imgLink` varchar(1000) DEFAULT NULL,
  `playMovie` varchar(255) DEFAULT NULL,
  `openDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  PRIMARY KEY (`playMovieId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_playmovie`
--

LOCK TABLES `tbl_playmovie` WRITE;
/*!40000 ALTER TABLE `tbl_playmovie` DISABLE KEYS */;
INSERT INTO `tbl_playmovie` VALUES (1,1028684,'/1cCi5Y4mBkpvtbxhDJPIRccCQrP.jpg','화란','2023-10-30','2023-11-10'),(2,955555,'/jbremGnsRR4XZMDj97YHt20isRP.jpg','범죄도시3','2023-10-30','2023-11-10'),(3,976573,'/1YYL1OcgjPLjAGi6n0iZe1gdl9i.jpg','엘리멘탈','2023-10-30','2023-11-10'),(4,122906,'/f9CQblm419ysGBS697WUfGN0FoI.jpg','어바웃타임','2023-10-30','2023-11-10'),(5,872585,'/kAYtsVpE7q6NhLz6vKYAxOM6LmN.jpg','오펜하이머','2023-10-30','2023-11-10'),(6,968051,'/hx4R7GqhiUP2LHJZJNrzCIqadd3.jpg','더 넌2','2023-10-30','2023-11-10'),(7,893723,'/62CEuwp287mbVarn3f2KcSAsrj1.jpg','퍼피 구조대:더 마이티 무비','2023-10-30','2023-11-10'),(8,609681,'/apHLuPvddLKpys8FqdBxJuPtQQ7.jpg','더 마블스','2023-10-30','2023-11-10'),(9,729854,'/9dENCKupUckoT1WgOohHMZfVl61.jpg','콘크리트 유토피아','2023-10-30','2023-11-10'),(10,581394,'/xlz4eg6sH0gukcJm67pZYT7UF8J.jpg','1947 보스톤','2023-10-30','2023-11-10');
/*!40000 ALTER TABLE `tbl_playmovie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-30  4:54:58
