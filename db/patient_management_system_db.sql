-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2023 at 11:00 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `patient_management_system_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `email` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `name` varchar(250) NOT NULL,
  `specialization` varchar(250) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `role` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`email`, `password`, `name`, `specialization`, `gender`, `role`) VALUES
('aime@gmail.com', '123', 'Aime Cyuzuzo', 'kidney', 'Male', 'Doctor'),
('amini@gmail.com', '123', 'Ibeshaho Amini', 'Surgery', 'Female', ''),
('gadine@gmail.com', '1098', 'Niyibeshaho Godine', 'Heart ', 'Female', '');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `fullname` varchar(250) NOT NULL,
  `location` varchar(250) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `gender` varchar(250) NOT NULL,
  `role` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`fullname`, `location`, `email`, `password`, `gender`, `role`) VALUES
('Ineza Sandirine', 'Muhanga', 'sandrine@gmail.com', '12342222222222', 'Female', 'Patient'),
('Mahirwe Alliance', 'Musanze', 'alliance@gmail.com', '1234567890', 'Female', 'Patient'),
('Mahoro Elie', 'Nyanza', 'mahoro@gmail.com', '0987654321', 'Male', 'Patient'),
('Manishimwe Eric', 'Nyagatare', 'eric@gmail.com', '1234', 'Male', 'Patient'),
('Uwamahoro Yvette', 'Musanze', 'yvette@gmail.com', '1234', 'Female', ''),
('Uwase Liliane', 'Nyanza', 'liliane@gmail.com', '123', 'Female', 'Patient'),
('Wayo Moleni', 'Musanze', 'moleni@gmail.com', '0987654321', 'Female', 'Patient');

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `patname` varchar(250) NOT NULL,
  `appintdate` date NOT NULL,
  `status` varchar(255) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `description` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`patname`, `appintdate`, `status`, `gender`, `description`) VALUES
('Ibeshaho Amini', '2023-11-13', 'Your Appointment Was Approved', 'Female', 'I am having a Headache'),
('Ineza Sandrine', '2023-11-13', 'Your Appointment Was Denied', 'Female', 'Feeling low, having pain on my back'),
('Eric Manishimwe', '2023-11-07', 'Pending', 'Male', 'Heart attack'),
('Wayo Moleni', '2023-11-22', 'Pending', 'Female', '\n\nFeeling low ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`fullname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
