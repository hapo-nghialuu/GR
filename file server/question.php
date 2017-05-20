<?php
	$connection = mysqli_connect("localhost", "root", "", "gr");

	$type = $_GET["type"];

	$query = "SELECT * from question WHERE type=$type";
	
	$result = mysqli_query($connection, $query);

	while ($row = mysqli_fetch_assoc($result)) {
		$array1 = null;
		$query1 = "SELECT * FROM test WHERE question_id  = ?";
		$stmt1 = mysqli_prepare($connection,$query1);
		$stmt1->bind_param("s", $row["id"]);
		$stmt1->execute();
		$result1 = $stmt1->get_result();
		while ($row1 = mysqli_fetch_assoc($result1)) {
			$array1[] = $row1; 
		}
		$row["test"]=$array1;
		$array[] = $row;
	}
	echo json_encode($array);

?>