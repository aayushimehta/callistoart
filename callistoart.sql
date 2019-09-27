-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2017 at 03:17 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `callistoart`
--

-- --------------------------------------------------------

--
-- Table structure for table `admintable`
--

CREATE TABLE IF NOT EXISTS `admintable` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(300) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admintable`
--

INSERT INTO `admintable` (`name`, `email`, `password`) VALUES
('Aayu', 'aayushimehta17@gmail.com', '0f84b5109bc821d08f1db185e1730e5c');

-- --------------------------------------------------------

--
-- Table structure for table `carttable`
--

CREATE TABLE IF NOT EXISTS `carttable` (
  `srno` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `pname` varchar(100) NOT NULL,
  `price` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `totalcost` int(11) NOT NULL,
  `pimage` varchar(100) NOT NULL,
  `sessionid` varchar(100) NOT NULL,
  PRIMARY KEY (`srno`),
  KEY `pid` (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=61 ;

--
-- Dumping data for table `carttable`
--

INSERT INTO `carttable` (`srno`, `pid`, `pname`, `price`, `qty`, `totalcost`, `pimage`, `sessionid`) VALUES
(14, 10, 'Caticorn iPhone 6/6S Phone Cover', 399, 1, 399, '1494168261861cati1.jpg', '389EECF2E26BAB05BAFF01830A2D7EE8'),
(15, 7, 'My Travels Notebook', 199, 1, 199, '1494158003383travels1.jpg', '389EECF2E26BAB05BAFF01830A2D7EE8'),
(16, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', 'E9ED901319E768137FDB95BC8E3CE81D'),
(17, 2, 'Watermelon Notebook', 199, 2, 398, '1494083826831watermelon notebook.jpg', 'E9ED901319E768137FDB95BC8E3CE81D'),
(18, 1, 'Constellation Notebook', 199, 2, 398, '1494083868020conste notebook.jpg', '880641E12984296F3E3297E13E4BA2EA'),
(19, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'E133734FA558D30FA6B2C55F5BDBC84A'),
(20, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'E697106AD4F0E4A19A2E686F23B43812'),
(21, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'E697106AD4F0E4A19A2E686F23B43812'),
(22, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', 'C6B510355551482B3C9F5604A2951B7F'),
(26, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', '29EF3257F0DD9220A9B52A8DA444AEA2'),
(27, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'AE2F3C3BB7E7E91C36EE18BD82C00D2B'),
(28, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', 'AE2F3C3BB7E7E91C36EE18BD82C00D2B'),
(29, 2, 'Watermelon Notebook', 199, 2, 398, '1494083826831watermelon notebook.jpg', '7D3147A8BEE637DBB1F3FC99EB38DFCD'),
(30, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', '836C67210E46185C44571BFDCDE7861C'),
(31, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', 'E8824606AED946CAC3355F2BB5E4E476'),
(32, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', 'E8824606AED946CAC3355F2BB5E4E476'),
(33, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '24ACACC0B87A7928E2FCE9EC32E03D89'),
(34, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '92F1F452BA200042C6A96D00EFF3CDEB'),
(35, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '92F1F452BA200042C6A96D00EFF3CDEB'),
(36, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '92F1F452BA200042C6A96D00EFF3CDEB'),
(37, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '57B5F0B08746420E166C6AF20D6BA341'),
(38, 8, 'Reasons Quote Notebook', 179, 1, 179, '1494175054821reasons1.jpg', '57B5F0B08746420E166C6AF20D6BA341'),
(39, 3, 'Into The Wild Cushion Cover', 399, 3, 1197, '1494174802271intothewild cushion.jpeg', 'AB066FD3B452BD9BD09CFA7169715280'),
(40, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', '55B1FB1A0BBE611431B91F68A6FCF1DC'),
(41, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'EF0227C4ACC5BF7B1D7ADE798083831A'),
(42, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'DE9D16C938D6D6B99142DDA8FAF276CE'),
(43, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', '9725A53F468F15E1D1AE97503CDB4493'),
(44, 11, 'Mugs2', 399, 1, 399, 'defaultproduct.jpg', 'B17E9354D5E7BABA63389E1EE10545A1'),
(45, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', '03063CE003BC2C64F0777E3F24D48D9F'),
(46, 2, 'Watermelon Notebook', 199, 1, 199, '1494083826831watermelon notebook.jpg', 'D7C5FAA00705AED791EFD4F3505A8FB3'),
(47, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '86B5CAE5E0BE19AF89401886CCDA738D'),
(50, 6, 'The Boy Who Lived Cushion Cover', 299, 1, 299, '1494175082702theboy cushion.jpeg', '6B25D6B4FEFD1A53EB69461CB3946B99'),
(51, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '6B25D6B4FEFD1A53EB69461CB3946B99'),
(52, 3, 'Into The Wild Cushion Cover', 399, 3, 1197, '1494174802271intothewild cushion.jpeg', '6B25D6B4FEFD1A53EB69461CB3946B99'),
(53, 6, 'The Boy Who Lived Cushion Cover', 299, 1, 299, '1494175082702theboy cushion.jpeg', '0EC2516392AC6480EA71EF09A9CCEA21'),
(54, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'FBDE28E2517DD61473777A5E04352A15'),
(56, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', '6A09466F7EE6CD7A3A47EF26E807DEC6'),
(57, 9, 'Mandela iPhone 6/6S Phone Cover', 399, 3, 1197, '1494175023045mandela.jpg', 'D99CBC0AA01300E7A824A34EA934BCCD'),
(58, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'F906F838348E41B222733E43533FBAB1'),
(59, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'E759203EC99C05EFF6E5771C9E6A67ED'),
(60, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'C05AA7668A7599E6F39C992C0CE375DE');

-- --------------------------------------------------------

--
-- Table structure for table `categorytable`
--

CREATE TABLE IF NOT EXISTS `categorytable` (
  `catid` int(11) NOT NULL AUTO_INCREMENT,
  `catname` varchar(200) NOT NULL,
  `catimage` varchar(300) NOT NULL,
  PRIMARY KEY (`catid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=104 ;

--
-- Dumping data for table `categorytable`
--

INSERT INTO `categorytable` (`catid`, `catname`, `catimage`) VALUES
(100, 'Stationary', '1494082682583notebooks.jpg'),
(101, 'Gifts', '1494082659444gift.jpg'),
(102, 'Home & Decor', '1494082818128cushions.jpg'),
(103, 'Accessories', '1494082590611accessories.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE IF NOT EXISTS `orderdetails` (
  `srno` int(100) NOT NULL AUTO_INCREMENT,
  `orderid` int(100) NOT NULL,
  `pid` int(100) NOT NULL,
  `pname` varchar(300) NOT NULL,
  `price` int(100) NOT NULL,
  `qty` int(100) NOT NULL,
  `totalcost` int(100) NOT NULL,
  `pimage` varchar(300) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`srno`),
  KEY `orderid` (`orderid`),
  KEY `orderid_2` (`orderid`),
  KEY `email` (`email`),
  KEY `email_2` (`email`),
  KEY `email_3` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `orderdetails`
--

INSERT INTO `orderdetails` (`srno`, `orderid`, `pid`, `pname`, `price`, `qty`, `totalcost`, `pimage`, `email`) VALUES
(5, 8, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'sugam.star@gmail.com'),
(6, 8, 1, 'Constellation Notebook', 199, 1, 199, '1494083868020conste notebook.jpg', 'sugam.star@gmail.com'),
(7, 9, 6, 'The Boy Who Lived Cushion Cover', 299, 1, 299, '1494175082702theboy cushion.jpeg', 'ashie.tennisace@gmail.com'),
(8, 9, 6, 'The Boy Who Lived Cushion Cover', 299, 1, 299, '1494175082702theboy cushion.jpeg', 'ashie.tennisace@gmail.com'),
(9, 10, 8, 'Reasons Quote Notebook', 179, 1, 179, '1494175054821reasons1.jpg', 'sugam.star@gmail.com'),
(10, 10, 8, 'Reasons Quote Notebook', 179, 1, 179, '1494175054821reasons1.jpg', 'sugam.star@gmail.com'),
(11, 10, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'sugam.star@gmail.com'),
(12, 10, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'sugam.star@gmail.com'),
(13, 12, 3, 'Into The Wild Cushion Cover', 399, 4, 1596, '1494174802271intothewild cushion.jpeg', 'ashie.tennisace@gmail.com'),
(14, 12, 3, 'Into The Wild Cushion Cover', 399, 4, 1596, '1494174802271intothewild cushion.jpeg', 'ashie.tennisace@gmail.com'),
(15, 13, 3, 'Into The Wild Cushion Cover', 399, 4, 1596, '1494174802271intothewild cushion.jpeg', 'ashie.tennisace@gmail.com'),
(16, 14, 3, 'Into The Wild Cushion Cover', 399, 4, 1596, '1494174802271intothewild cushion.jpeg', 'ashie.tennisace@gmail.com'),
(17, 15, 3, 'Into The Wild Cushion Cover', 399, 4, 1596, '1494174802271intothewild cushion.jpeg', 'ashie.tennisace@gmail.com'),
(18, 16, 8, 'Reasons Quote Notebook', 179, 1, 179, '1494175054821reasons1.jpg', 'sugam.star@gmail.com'),
(19, 16, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'sugam.star@gmail.com'),
(20, 16, 3, 'Into The Wild Cushion Cover', 399, 1, 399, '1494174802271intothewild cushion.jpeg', 'sugam.star@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `ordertable`
--

CREATE TABLE IF NOT EXISTS `ordertable` (
  `orderid` int(100) NOT NULL AUTO_INCREMENT,
  `email` varchar(300) NOT NULL,
  `name` varchar(300) NOT NULL,
  `address` varchar(500) NOT NULL,
  `phone` bigint(100) NOT NULL,
  `orderdate` date NOT NULL,
  `deliverydate` date NOT NULL,
  `totalcost` int(100) NOT NULL,
  `paymentmode` varchar(300) NOT NULL,
  `status` varchar(300) NOT NULL,
  PRIMARY KEY (`orderid`),
  KEY `email` (`email`),
  KEY `email_2` (`email`),
  KEY `email_3` (`email`),
  KEY `status` (`status`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `ordertable`
--

INSERT INTO `ordertable` (`orderid`, `email`, `name`, `address`, `phone`, `orderdate`, `deliverydate`, `totalcost`, `paymentmode`, `status`) VALUES
(2, 'sugam.star@gmail.com', '', '789jaklajksadfsfkkkdlnull', 3465938743, '2017-05-11', '2017-05-11', 378, 'Transfer to SBI Account', ''),
(3, 'sugam.star@gmail.com', '', '789jaklajksadfsfkkkdlnull', 3465938743, '2017-05-11', '2017-05-11', 378, 'Transfer to SBI Account', 'reached'),
(8, 'sugam.star@gmail.com', '', '43jalkljjalnull', 83789472847, '2017-05-15', '2017-05-25', 378, 'Transfer to SBI Account', ''),
(9, 'ashie.tennisace@gmail.com', 'Aayu', '32ShardanandJalPunj', 1234567890, '2017-05-19', '2017-05-29', 199, 'Cash On Delivery', 'Yet to be Dispatched'),
(10, 'sugam.star@gmail.com', 'dgdjhfh', 'HFDGSHFJ GJHGJH JHFJHF GJGH', 5347523465, '2017-05-19', '2017-05-29', 0, 'Transfer to SBI Account', 'Yet to be Dispatched'),
(11, 'ashie.tennisace@gmail.com', 'Aayu', '6478 jal jal punj', 4583749309, '2017-05-20', '2017-05-30', 0, 'Transfer to SBI Account', 'Yet to be Dispatched'),
(12, 'ashie.tennisace@gmail.com', 'Aayu', '6478 jal jal punj', 4583749309, '2017-05-20', '2017-05-30', 0, 'Transfer to SBI Account', 'Yet to be Dispatched'),
(13, 'ashie.tennisace@gmail.com', 'gyhfy', 'ujguifg hvjhvf jhbhj hhj', 8687576567, '2017-05-20', '2017-05-30', 0, 'Transfer to SBI Account', 'Yet to be Dispatched'),
(14, 'ashie.tennisace@gmail.com', 'Aayu', '76 jksk jkskj dlkf;slkd', 4786834783, '2017-05-20', '2017-05-30', 0, 'Cash On Delivery', 'Yet to be Dispatched'),
(15, 'ashie.tennisace@gmail.com', 'anchal', 'hghg jal fgshgh fghf', 5765656, '2017-05-20', '2017-05-30', 1636, 'Transfer to SBI Account', 'Yet to be Dispatched'),
(16, 'sugam.star@gmail.com', 'anchal', 'ja fysdyyui yiyy yyi', 47676546576, '2017-05-20', '2017-05-30', 1017, 'Transfer to SBI Account', 'Yet to be Dispatched');

-- --------------------------------------------------------

--
-- Table structure for table `producttable`
--

CREATE TABLE IF NOT EXISTS `producttable` (
  `catid` int(100) NOT NULL,
  `subcatid` int(100) NOT NULL,
  `pid` int(100) NOT NULL AUTO_INCREMENT,
  `pname` varchar(300) NOT NULL,
  `pimage` varchar(300) NOT NULL,
  `pimage2` varchar(300) NOT NULL,
  `pimage3` varchar(300) NOT NULL,
  `size` varchar(300) NOT NULL,
  `qty` int(100) NOT NULL,
  `price` int(100) NOT NULL,
  `pdescription` varchar(1000) NOT NULL,
  `shippingmin` int(11) NOT NULL,
  `shippingmax` int(11) NOT NULL,
  `limitedqty` int(11) NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `catid` (`catid`),
  KEY `subcatid` (`subcatid`),
  KEY `catid_2` (`catid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `producttable`
--

INSERT INTO `producttable` (`catid`, `subcatid`, `pid`, `pname`, `pimage`, `pimage2`, `pimage3`, `size`, `qty`, `price`, `pdescription`, `shippingmin`, `shippingmax`, `limitedqty`) VALUES
(100, 2, 1, 'Constellation Notebook', '1494083868020conste notebook.jpg', '1494083868022constellation notebook.jpg', '1494083868025common notebook.jpg', '', 247, 199, '<p>A constellation on a lined kraft brown notebook, perfect for your summer plan making. Staying organized just became a bit more fun with this hand crafted&nbsp;notebook. A perfect size to fit in your bag, ready to be filled with your sketches and lists.</p>\r\n<p>Notebook: 3.5 x 5.5 inches</p>\r\n<p>Pages: 64</p>', 4, 5, 3),
(100, 2, 2, 'Watermelon Notebook', '1494083826831watermelon notebook.jpg', '1494083826833watermelon2 notebook.jpg', '1494083826836common notebook.jpg', '', 253, 199, '<p>A watermelon painted&nbsp;on your notebook cover isperfect for your summer plan making. Staying organized just became a bit more fun with this hand embroidered notebook. A perfect size to fit in your bag, ready to be filled with your sketches and lists.</p>\r\n<p>Notebook: 3.5 x 5.5 inches</p>\r\n<p>Pages: 64</p>', 3, 5, 3),
(102, 1, 3, 'Into The Wild Cushion Cover', '1494174802271intothewild cushion.jpeg', '', '', '12" x 16"', 6, 399, '<p>Material: Canvas</p>\r\n<p>These cushion covers are like smiles for your sofa.<br />They are sized to fit a standard sized square cushion with ease, and can just as easily be removed to clean, if needed.</p>\r\n<p><em>*Product colour may slightly vary due to photographic lighting sources or your monitor settings.</em></p>', 3, 5, 5),
(100, 2, 4, ' Black & White Striped Notebook', '1494083790608millionare3.jpg', '1494083790610millionare2.jpg', '1494083790612millionare1.jpg', '', 299, 199, '<p>A Millionare Quote with black and white stripes&nbsp;on your notebook cover is perfect for your summer plan making. Staying organized just became a bit more fun with this pretty notebook. A perfect size to fit in your bag, ready to be filled with your sketches and lists.</p>\r\n<p>Notebook: 3.5 x 5.5 inches</p>\r\n<p>Pages: 80</p>', 4, 6, 6),
(100, 2, 5, 'All Things Notebook', '1494083913739all things.jpg', '1494083913741all thing2.jpg', '1494083913743common notebook.jpg', '', 200, 299, '<p>"All Things" Quote on your notebook cover is perfect for your summer plan making. Staying organized just became a bit more fun with this beautiful notebook. A perfect size to fit in your bag, ready to be filled with your sketches and lists.</p>\r\n<p>Notebook: 3.5 x 5.5 inches</p>\r\n<p>Pages: 64</p>', 4, 5, 6),
(102, 1, 6, 'The Boy Who Lived Cushion Cover', '1494175082702theboy cushion.jpeg', '', '', '', 249, 299, '<p>Material : POLYESTER &nbsp;</p>\r\n<p>(Insert Fill : 0.9 denier &nbsp;Micro Polyester Fiber.Filling Method: All machine filled. Forced blow air for 100% opening of fibers.)</p>\r\n<p>Fabric: Non-woven.&nbsp;</p>\r\n<p>Background Color : White</p>\r\n<p><em>*Product colour may slightly vary due to photographic lighting sources or your monitor settings.</em></p>', 5, 6, 6),
(100, 2, 7, 'My Travels Notebook', '1494158003383travels1.jpg', '1494158003385travels2.jpg', '1494158003386common notebook.jpg', '', 30, 199, '<p>A Travel quote&nbsp;on a lined kraft notebook is perfect for your summer plan making. Staying organized just became a bit more fun with this hand crafted&nbsp;notebook. A perfect size to fit in your bag, ready to be filled with your sketches and lists.</p>\r\n<p>Notebook: 3.5 x 5.5 inches</p>\r\n<p>Pages: 64</p>', 4, 6, 6),
(100, 2, 8, 'Reasons Quote Notebook', '1494175054821reasons1.jpg', '1494175054824reasons2.jpg', '1494159191869common notebook.jpg', 'sd', 226, 179, '<p>rerfeer</p>', 2, 4, 3),
(103, 3, 9, 'Mandela iPhone 6/6S Phone Cover', '1494175023045mandela.jpg', '1494175023047mandela2.jpg', '1494168081261common cover.jpg', '', 200, 399, '<p>Add your own charm and flare to your iPhone with a hard case. The case provides sleek lightweight protection. The printed design pops on a slightly sparkly metal surface with a glossy finish. <br /><br />- Snug fit, your phone will not jiggle and move inside the case.<br />- Easy to install, the case clips on to the back of your phone.<br />- Offers great protection for the sides and back of your phone.<br />- Openings for all of the side buttons, speakers.<br />- Sleek and light design.</p>', 3, 5, 5),
(103, 3, 10, 'Caticorn iPhone 6/6S Phone Cover', '1494168261861cati1.jpg', '1494168261864cati2.jpg', '1494168261865cati3.jpg', '', 200, 399, '<p>Add your own charm and flare to your iPhone with a hard case. The case provides sleek lightweight protection. The printed design pops on a slightly sparkly metal surface with a glossy finish. <br /><br />â??Snug fit, your phone will not jiggle and move inside the case.<br />â??Easy to install, the case clips on to the back of your phone.<br />â??Offers great protection for the sides and back of your phone.<br />â??Openings for all of the side buttons, speakers.<br />â??Sleek and light design.</p>', 5, 8, 6),
(101, 4, 11, 'Mugs2', 'defaultproduct.jpg', '', '', '', 300, 399, '<p>yaya</p>', 4, 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `sellertable`
--

CREATE TABLE IF NOT EXISTS `sellertable` (
  `sellerid` int(100) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) NOT NULL,
  `businessname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(300) NOT NULL,
  `contact` bigint(100) NOT NULL,
  PRIMARY KEY (`sellerid`),
  KEY `sellerid` (`sellerid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1002 ;

--
-- Dumping data for table `sellertable`
--

INSERT INTO `sellertable` (`sellerid`, `sname`, `businessname`, `email`, `password`, `contact`) VALUES
(1001, 'Rajeev Mehta', 'United Paints', 'rajeevmehta42@yahoo.in', 'c3a81e9db3746a75eb4230d19df5641e', 9780911926);

-- --------------------------------------------------------

--
-- Table structure for table `subcategorytable`
--

CREATE TABLE IF NOT EXISTS `subcategorytable` (
  `catid` int(100) NOT NULL,
  `subcatid` int(100) NOT NULL AUTO_INCREMENT,
  `subcatname` varchar(300) NOT NULL,
  `subcatimage` varchar(300) NOT NULL,
  PRIMARY KEY (`subcatid`),
  KEY `catid` (`catid`),
  KEY `catid_2` (`catid`),
  KEY `subcatid` (`subcatid`),
  KEY `subcatid_2` (`subcatid`),
  KEY `subcatid_3` (`subcatid`),
  KEY `subcatid_4` (`subcatid`),
  KEY `subcatid_5` (`subcatid`),
  KEY `subcatid_6` (`subcatid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `subcategorytable`
--

INSERT INTO `subcategorytable` (`catid`, `subcatid`, `subcatname`, `subcatimage`) VALUES
(102, 1, 'Cushion Covers', '1492920560743cushions.jpg'),
(100, 2, 'Notebooks', '1492970584638notebooks.jpg'),
(103, 3, 'Mobile Covers', '1494083454386mobilecovers.jpeg'),
(101, 4, 'Mugs', 'subcatdefault.png');

-- --------------------------------------------------------

--
-- Table structure for table `usercarttable`
--

CREATE TABLE IF NOT EXISTS `usercarttable` (
  `srno` int(100) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `pname` varchar(100) NOT NULL,
  `price` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `totalcost` int(11) NOT NULL,
  `pimage` varchar(100) NOT NULL,
  `email` varchar(300) NOT NULL,
  PRIMARY KEY (`srno`),
  KEY `pid` (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `usercarttable`
--

INSERT INTO `usercarttable` (`srno`, `pid`, `pname`, `price`, `qty`, `totalcost`, `pimage`, `email`) VALUES
(1, 10, 'My Travels Notebook', 199, 1, 199, '1494158003383travels1.jpg', 'aayushimehta17@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE IF NOT EXISTS `usertable` (
  `uname` varchar(100) DEFAULT NULL,
  `email` varchar(100) NOT NULL DEFAULT '',
  `password` varchar(300) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(100) NOT NULL,
  `timestamp` bigint(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`email`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` (`uname`, `email`, `password`, `dob`, `gender`, `timestamp`) VALUES
('Aayushi Mehta', 'aayushimehta17@gmail.com', '157b3b6ade020d511958e0450d53b72c', '1995-04-17', 'Female', 0),
('Ashie Mehta', 'ashie.tennisace@gmail.com', '6643a5185ff3cf32fd045e51dd3cad8b', '1995-04-17', 'Female', 0),
('Sugam Mehta', 'sugam.star@gmail.com', '6643a5185ff3cf32fd045e51dd3cad8b', '2000-01-03', 'Male', 0);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD CONSTRAINT `orderid` FOREIGN KEY (`orderid`) REFERENCES `ordertable` (`orderid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `producttable`
--
ALTER TABLE `producttable`
  ADD CONSTRAINT `category` FOREIGN KEY (`catid`) REFERENCES `categorytable` (`catid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `subcat` FOREIGN KEY (`subcatid`) REFERENCES `subcategorytable` (`subcatid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subcategorytable`
--
ALTER TABLE `subcategorytable`
  ADD CONSTRAINT `catsubcat` FOREIGN KEY (`catid`) REFERENCES `categorytable` (`catid`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
