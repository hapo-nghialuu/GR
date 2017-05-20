-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2017 at 07:49 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gr`
--

-- --------------------------------------------------------

--
-- Table structure for table `lesson`
--

CREATE TABLE `lesson` (
  `id` int(11) NOT NULL,
  `image` varchar(256) NOT NULL,
  `title` varchar(256) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lesson`
--

INSERT INTO `lesson` (`id`, `image`, `title`) VALUES
(1, 'http://images.all-free-download.com/images/graphiclarge/harry_potter_icon_6825007.jpg', 'Alphabet'),
(2, 'http://images.all-free-download.com/images/graphiclarge/harry_potter_icon_6825007.jpg', 'Car'),
(3, 'http://images.all-free-download.com/images/graphiclarge/harry_potter_icon_6825007.jpg', 'Next');

-- --------------------------------------------------------

--
-- Table structure for table `lesson_content`
--

CREATE TABLE `lesson_content` (
  `id` int(11) NOT NULL,
  `image_link` varchar(256) NOT NULL,
  `audio_link` varchar(256) NOT NULL,
  `text` varchar(256) NOT NULL,
  `lesson_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lesson_content`
--

INSERT INTO `lesson_content` (`id`, `image_link`, `audio_link`, `text`, `lesson_id`) VALUES
(1, 'http://imgur.com/Re3LOP5', 'https://soundcloud.com/user-732740596/amp3', 'A', 1),
(2, 'http://imgur.com/Re3LOP5', 'https://soundcloud.com/user-732740596/amp3', 'B', 1),
(3, 'http://imgur.com/Re3LOP5', 'https://soundcloud.com/user-732740596/amp3', 'C', 1),
(4, 'http://imgur.com/Re3LOP5', 'https://soundcloud.com/user-732740596/amp3', 'D', 1),
(5, 'http://imgur.com/Re3LOP5', '', 'ihjfhgfhg', 2);

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `id` int(11) NOT NULL,
  `link` varchar(256) NOT NULL,
  `type` smallint(1) NOT NULL,
  `catagory` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`id`, `link`, `type`, `catagory`) VALUES
(1, 'http://www.androidhive.info/wp-content/uploads/2011/10/list_view_single_item1.png', 1, 'Alphabet'),
(2, 'http://www.androidhive.info/wp-content/uploads/2011/10/list_view_single_item1.png', 1, 'Alphabet'),
(3, 'http://www.androidhive.info/wp-content/uploads/2011/10/list_view_single_item1.png', 1, 'Alphabet'),
(4, 'http://www.androidhive.info/wp-content/uploads/2011/10/list_view_single_item1.png', 1, 'Car'),
(5, 'http://www.androidhive.info/wp-content/uploads/2011/10/list_view_single_item1.png', 1, 'Car');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `answer_1` text NOT NULL,
  `answer_2` text NOT NULL,
  `answer_3` text NOT NULL,
  `correct_answers` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `youtube`
--

CREATE TABLE `youtube` (
  `id` int(11) NOT NULL,
  `link` varchar(256) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lesson`
--
ALTER TABLE `lesson`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lesson_content`
--
ALTER TABLE `lesson_content`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `youtube`
--
ALTER TABLE `youtube`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lesson`
--
ALTER TABLE `lesson`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `lesson_content`
--
ALTER TABLE `lesson_content`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `youtube`
--
ALTER TABLE `youtube`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
