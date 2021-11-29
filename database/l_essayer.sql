-- MySQL dump 10.13  Distrib 8.0.27, for Linux (x86_64)
--
-- Host: localhost    Database: l_essayer
-- ------------------------------------------------------
-- Server version	8.0.27-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `IndexTable`
--

DROP TABLE IF EXISTS `IndexTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `IndexTable` (
  `word` varchar(30) NOT NULL,
  `type` varchar(15) NOT NULL,
  `property` varchar(15) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `example` varchar(200) DEFAULT NULL,
  `generate_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`word`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `IndexTable`
--

LOCK TABLES `IndexTable` WRITE;
/*!40000 ALTER TABLE `IndexTable` DISABLE KEYS */;
INSERT INTO `IndexTable` VALUES ('canard','noun','masculin','duck','Ils eurent pour compagnons une demi- douzaine de canards, habitués des bords du lac.','2021-11-22 08:01:21'),('cerf','noun','masculin','stag','A cheval pour attraper cerf, chevreuil ou sanglier, à pied pour terrasser le lièvre, guidé par la meute.','2021-11-22 07:03:16'),('chat','noun','masculin','cat','En fait, il répond à mes questions en jouant au chat et à la souris.','2021-11-22 07:05:18'),('cheval','noun','masculin','horse','Ce qui ne vous empêche nullement de faire du cheval pour votre plaisir.','2021-11-22 07:08:48'),('chien','noun','masculin','dog','Ce qu\'il y a de meilleur dans l\'homme, c\'est le chien.','2021-11-22 07:51:49'),('cochon','noun','masculin','pig','Le premier est un cochon nommé Porky Pig.','2021-11-22 07:52:56'),('coq','noun','masculin','cock','Et on se lève tellement tôt qu\'on est obligés de réveiller le coq.','2021-11-22 07:53:35'),('lapin','noun','masculin','rabbit','Le lapin est un animal de terrier, stressé à découvert.','2021-11-22 07:54:06'),('loup','noun','masculin','wolf','On n\'est pas encore sorti du bois et le loup rôde toujours.','2021-11-22 07:54:49'),('mer','noun','féminin','sea','Le vent s\'est engouffré dans le ballon et le pousse vers la mer.','2021-11-26 07:30:09'),('pigeon','noun','masculin','pigeon','Et puis ce pigeon qui s\'est posé sur sa tête.','2021-11-25 09:45:02'),('renard','noun','masculin','fox','Elle a un visage de renard et de serpent.','2021-11-22 07:55:25'),('serpent','noun','masculin','snake','Il pêche et capture des serpents venimeux pour les vendre.','2021-11-22 07:55:50'),('souris','noun','féminin','mouse','Une chambre sans fenetre, obscure et froide, ou régnaient les souris et la peur.','2021-11-22 07:56:18'),('vache','noun','féminin','cow','La vache est un animal qui produit du lait.','2021-11-22 07:56:56');
/*!40000 ALTER TABLE `IndexTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-29  9:47:24
