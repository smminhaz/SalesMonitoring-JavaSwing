-- phpMyAdmin SQL Dump
-- version 2.10.0.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Jun 02, 2014 at 12:55 PM
-- Server version: 5.0.37
-- PHP Version: 5.2.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `mall`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `customer`
-- 

CREATE TABLE `customer` (
  `c_id` int(11) NOT NULL auto_increment,
  `c_name` varchar(255) collate latin1_general_ci NOT NULL,
  `c_address` varchar(255) collate latin1_general_ci NOT NULL,
  `c_phone` int(11) NOT NULL,
  PRIMARY KEY  (`c_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `customer`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `goods`
-- 

CREATE TABLE `goods` (
  `g_id` int(11) NOT NULL,
  `g_name` varchar(255) collate latin1_general_ci NOT NULL,
  `size` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `rate` double NOT NULL,
  `detail` varchar(255) collate latin1_general_ci NOT NULL,
  PRIMARY KEY  (`g_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- 
-- Dumping data for table `goods`
-- 

INSERT INTO `goods` VALUES (88, 'lungiii', 6, 20, 200, 'atm brand');
INSERT INTO `goods` VALUES (71, 'shoe', 5, 20, 500, '0');
INSERT INTO `goods` VALUES (74, 'shemij', 5, 10, 0, '200');
INSERT INTO `goods` VALUES (15, 'soyabin oil', 3, 5, 0, '300');
INSERT INTO `goods` VALUES (51, 'under ware', 0, 5, 0, '80');
INSERT INTO `goods` VALUES (55, 'under ware', 0, 5, 0, '80');
INSERT INTO `goods` VALUES (5, 'bag', 0, 5, 20, 'nike');

-- --------------------------------------------------------

-- 
-- Table structure for table `log_in`
-- 

CREATE TABLE `log_in` (
  `user_name` varchar(250) collate latin1_general_ci NOT NULL,
  `password` varchar(250) collate latin1_general_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- 
-- Dumping data for table `log_in`
-- 

INSERT INTO `log_in` VALUES ('sm', 'm');

-- --------------------------------------------------------

-- 
-- Table structure for table `sell`
-- 

CREATE TABLE `sell` (
  `date` date NOT NULL,
  `g_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `s_id` int(11) NOT NULL,
  `price` double NOT NULL,
  `c_quantity` int(11) NOT NULL,
  `g_name` varchar(255) collate latin1_general_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- 
-- Dumping data for table `sell`
-- 

INSERT INTO `sell` VALUES ('2014-05-29', 10, 11, 12, 50, 5, 'lungi');
INSERT INTO `sell` VALUES ('2014-05-29', 5, 6, 7, 70, 2, 'lungi');
INSERT INTO `sell` VALUES ('2014-05-29', 10, 9, 11, 100, 3, 'oil');
INSERT INTO `sell` VALUES ('2014-05-28', 20, 21, 22, 60, 2, 'underware');

-- --------------------------------------------------------

-- 
-- Table structure for table `seller`
-- 

CREATE TABLE `seller` (
  `s_id` int(11) NOT NULL auto_increment,
  `s_name` varchar(55) collate latin1_general_ci NOT NULL,
  `s_address` varchar(255) collate latin1_general_ci NOT NULL,
  `s_type` varchar(255) collate latin1_general_ci NOT NULL,
  `password` varchar(5) collate latin1_general_ci NOT NULL,
  `s_phone` int(11) NOT NULL,
  PRIMARY KEY  (`s_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=100 ;

-- 
-- Dumping data for table `seller`
-- 

INSERT INTO `seller` VALUES (1, 'murad', 'gazipur', 'full tyme', 'm', 1420420420);
INSERT INTO `seller` VALUES (7, 'kkaaaaa', '', '', '', 0);
INSERT INTO `seller` VALUES (99, 'eyyyyyyy', '', 'g', '', 0);
