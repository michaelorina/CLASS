<html>
<body>
<?php
$quantity = $_POST['quantity'];
$item = $_POST['item'];


$con = mysqli_connect("localhost","root","","web");

if (mysqli_connect_errno()) {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  exit();
}

// 
$query = "INSERT INTO `orders` (`item`, `quantity`) VALUES ('$item', '$quantity')";
mysqli_query($con, $query);

echo "You ordered ". $quantity . " " . $item . ".<br />";
echo "Thank you for ordering from Tizag Art Supplies!";

?>
</body>
</html>