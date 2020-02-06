-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: attendancemarking
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_details`
--

DROP TABLE IF EXISTS `admin_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin_details` (
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `contact_number` bigint(20) NOT NULL,
  `admin_id` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_details`
--

LOCK TABLES `admin_details` WRITE;
/*!40000 ALTER TABLE `admin_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `attendance` (
  `session_id` varchar(50) NOT NULL,
  `employee_id` varchar(10) NOT NULL,
  `attendance` varchar(7) NOT NULL,
  KEY `session_id` (`session_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`session_id`) REFERENCES `session_details` (`session_id`),
  CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `user_details` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollment`
--

DROP TABLE IF EXISTS `enrollment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `enrollment` (
  `session_id` varchar(50) NOT NULL,
  `employee_id` varchar(10) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  KEY `session_id` (`session_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `enrollment_ibfk_1` FOREIGN KEY (`session_id`) REFERENCES `session_details` (`session_id`),
  CONSTRAINT `enrollment_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `user_details` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollment`
--

LOCK TABLES `enrollment` WRITE;
/*!40000 ALTER TABLE `enrollment` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session_details`
--

DROP TABLE IF EXISTS `session_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `session_details` (
  `session_id` varchar(50) NOT NULL,
  `session_description` varchar(100) NOT NULL,
  `skill_id` varchar(100) NOT NULL,
  `session_date` date NOT NULL,
  `session_time` time DEFAULT NULL,
  `available_slots` int(10) NOT NULL,
  PRIMARY KEY (`session_id`),
  KEY `skill_id` (`skill_id`),
  CONSTRAINT `session_details_ibfk_1` FOREIGN KEY (`skill_id`) REFERENCES `skill_set` (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session_details`
--

LOCK TABLES `session_details` WRITE;
/*!40000 ALTER TABLE `session_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `session_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skill_set`
--

DROP TABLE IF EXISTS `skill_set`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `skill_set` (
  `skill_id` varchar(50) NOT NULL,
  `skill_type` int(10) NOT NULL,
  `skill_description` varchar(100) NOT NULL,
  PRIMARY KEY (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skill_set`
--

LOCK TABLES `skill_set` WRITE;
/*!40000 ALTER TABLE `skill_set` DISABLE KEYS */;
/*!40000 ALTER TABLE `skill_set` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trainer_details`
--

DROP TABLE IF EXISTS `trainer_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `trainer_details` (
  `trainer_id` varchar(50) NOT NULL,
  `trainer_name` varchar(50) NOT NULL,
  `contact_number` bigint(20) NOT NULL,
  `email` varchar(70) NOT NULL,
  `skill_id` varchar(100) NOT NULL,
  PRIMARY KEY (`trainer_id`),
  KEY `skill_id` (`skill_id`),
  CONSTRAINT `trainer_details_ibfk_1` FOREIGN KEY (`skill_id`) REFERENCES `skill_set` (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainer_details`
--

LOCK TABLES `trainer_details` WRITE;
/*!40000 ALTER TABLE `trainer_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `trainer_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_details` (
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `employee_id` varchar(10) NOT NULL,
  `email` varchar(70) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-04 12:45:30
