<html>
<body>
<?php
$item = $_POST['item'];


$con = mysqli_connect("localhost","root","","web");

if (mysqli_connect_errno()) {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  exit();
}

// 
$result = mysqli_query($con,"SELECT * FROM orders where item") 
or die(mysqli_error($con));  

echo "<table border='1'>";
echo "<tr> <th>Item</th> <th>Quantity</th> </tr>";
// keeps getting the next row until there are no more to get
while($row = mysqli_fetch_array( $result )) {
	// Print out the contents of each row into a table
	echo "<tr><td>"; 
	echo $row['item'];
	echo "</td><td>"; 
	echo $row['quantity'];
	echo "</td></tr>"; 
} 

echo "</table>";
?>


</body>
</html>