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
-- Table structure for table `tbl_movie`
--

DROP TABLE IF EXISTS `tbl_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_movie` (
  `movieId` int NOT NULL,
  `movieName` varchar(255) DEFAULT NULL,
  `MovieRelease` varchar(255) DEFAULT NULL,
  `movieRating` int DEFAULT NULL,
  `movieType` varchar(255) DEFAULT NULL,
  `movieInfo` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`movieId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_movie`
--

LOCK TABLES `tbl_movie` WRITE;
/*!40000 ALTER TABLE `tbl_movie` DISABLE KEYS */;
INSERT INTO `tbl_movie` VALUES (5,'포룸','1996-04-13',6,'범죄,코미디','새해 전날 밤, LA 몽시뇰 호텔에서 첫근무를 하게 된 괴짜 벨보이 테드는 상상조차 할 수 없는 최악의 밤을 맞이한다. 허니문 스위트룸에 투숙한 마녀들의 부활의식에 야릇한 제물로 걸려드는가 하면, 얼음 배달차 들른 룸 404호의 악당 지그프리드는 아내의 정부라고 오해를 한다. 5백 달러를 받고 돌봐주기로 한 룸 309호 갱스터 부부의 꼬마 악동들은 시끌벅적한 소란을 벌이며 방 한 칸을 홀라당 날려버린다. 마지막 펜트하우스 특실 룸에는 할리우드 최고의 코미디언 체스터 러쉬와 그의 친구들이 벌이는 잔인한 내기에 엉겁결에 끼어들게 된 테드는 피할 수 없는 희생양이 될 판이 된다.'),(6,'킬러 나이트','1993-10-15',6,'액션,범죄,스릴러','어느날 프랭크(Frank Wyatt: 에밀리오 에스테베즈 분)와 마이크(Mike Peterson: 쿠바 구딩 주니어 분), 그리고 레이(Ray Cochran: 제레미 피번 분)와 프랭크의 동생 존(John Wyatt: 스티븐 도프 분)은 권투시합을 구경하기 위해 레이가 빌린 이동주택차를 몰고 시합장으로 간다. 그러나 꽉 막힌 교통에 지친 레이는 지름길로 간다며 빈민가로 들어간다. 긴장했던 탓에 그들은 차옆에 쓰러져 있는 사람을 자신들이 친줄 알고 차안으로 끌어들인다. 그리고 그 남자가 총상을 입은 것을 보고 놀란다. 갑자기 나타난 필론(Fallon: 데니스 레리 분)이란 악당들은 총상을 입은 사람이 필론으로부터 돈을 훔쳤다며 그 자리에서 그를 죽인다. 이를 목격한 프랭크와 친구들은 증인마저 없애려 드는 그들에게서 도망친다. 그러나 전화조차 없고 도와주는 이 조차 없는 그들에게 상황은 점점 악화되어 간다. 가까스로 도움을 받아 경찰에 전화를 걸지만 경찰은 오지 않고 레이는 악당들의 손에 죽고 만다. 슈퍼마켓을 발견한 그들은 경찰을 오게 하려고 일부러 유리창을 깨지만 그곳까지 일당이 따라와 존과 마이크는 부상을 입게 되고 마지막까지 무사했던 프랭크는 도움을 청하겠다며 나갔다가 악당 일행 중 유일하게 살아남은 두목 필론과 정면으로 대결하게 되는데...'),(11,'스타워즈 에피소드 4: 새로운 희망','1978-06-01',8,'모험,액션,SF','공화국이 붕괴하고 제국이 수립된 뒤 20년, 제다이 기사단은 전멸하고 강력한 제국군의 횡포에 은하계는 공포에 휩싸여 있다. 그러던 중 공화국 재건을 노리는 반란군이 제국군의 비밀병기 데스스타 설계도를 훔쳐 달아나고 제국군은 이를 쫓는다. 하지만 결국 제국의 손에 붙잡히게 된 그들은 드로이드 R2-D2에 설계도를 넣어서 R2의 친구 C-3PO와 탈출시키는 데 성공하고, 두 드로이드 콤비는 타투인의 시골 마을에서 숙부와 함께 살고 있던 청년 루크 스카이워커에게 오게 되는데...'),(12,'니모를 찾아서','2003-06-06',15,'애니메이션,가족','광대어 말린은 아내 코랄과 2세들의 부화를 기다리던 중 상어의 습격을 받는다. 알을 보호하려던 아내는 행방불명되고, 유일하게 살아남은 아기에게 말린은 니모라는 이름을 붙인다. 사건 이후 큰 바다를 무조건 겁내게 된 말린은 니모를 과보호한다. 하지만 니모는 등교 첫날 잠수부에게 납치돼 시드니에 있는 치과의사의 수족관에 끌려가고, 슬픔으로 혼비백산한 아빠 말린은 평소의 심약함을 잊고니모를 찾아나선다. 단기기억상실증을 지닌 명랑한 물고기 도리의 도움으로 상어, 심해어, 해파리의 위협을 뚫고 동호주 해류로 향하는 동안, 니모는 수족관의 새 친구들과 탈출을 모의한다.'),(13,'포레스트 검프','1994-10-15',8,'코미디,드라마,로맨스','불편한 다리, 남들보다 조금 떨어지는 지능을 가진 포레스트 검프는 헌신적인 어머니의 보살핌과 첫사랑 제니와의 만남으로 편견과 괴롭힘 속에서도 따뜻한 마음을 지니고 성장한다. 또래들의 괴롭힘을 피해 도망치던 포레스트는 누구보다 빠르게 달릴 수 있는 자신의 재능을 깨닫는다. 그의 재능을 알아 본 대학에서 그를 미식축구 선수로 발탁하고, 졸업 후에도 뛰어난 신체능력으로 군에 들어가 무공훈장을 수여받는 등 탄탄한 인생 가도에 오르게 된 포레스트. 하지만 어머니가 병에 걸려 죽음을 맞이하고, 첫사랑 제니 역시 그의 곁을 떠나가며 다시 한 번 인생의 전환점을 맞이하게 되는데...'),(14,'아메리칸 뷰티','2000-02-26',8,'드라마','레스터 번햄은 좌절감으로 가득 찬 잡지사 직원으로 하루하루를 무기력 속에서 살아간다. 부동산 소개업자로 일하는 아내 케롤린은 수완가로 자처하고 완벽주의를 외치며 물질만능의 길을 추구한다. 둘의 결혼생활은 단지 남들에게 과시하기 위한 형식뿐이고, 외동딸 제인은 아버지가 사라져 주길 바랄 정도로 미워한다. 제인의 학교를 방문한 레스터는 딸의 되바라진 친구 안젤라를 보는 순간 한 눈에 욕정을 품게 된다. 레스터는 기억 속에서 이미 사라진 자신의 소년기를 회복하려는 듯이 자유를 추구하는데...'),(15,'시민 케인','2007-06-16',8,'미스터리,드라마','1940년 뉴욕 인콰이어러지를 비롯, 수 많은 신문들의 발행인이었던 찰스 포스터 케인이 죽는다. 그는 당시 70세로 �