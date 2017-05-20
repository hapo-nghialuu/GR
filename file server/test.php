<?php
	$connection = mysqli_connect("localhost", "root", "", "gr");


	$query = "SELECT * from lesson";
	$result = mysqli_query($connection, $query);

	while ($row = mysqli_fetch_assoc($result)) {
		$array1 = null;
		$query1 = "SELECT * FROM lesson_content WHERE lesson_id = ?";
		$stmt = mysqli_prepare($connection,$query1);
		$stmt->bind_param("s", $row["id"]);
		$stmt->execute();
		$result1 = $stmt->get_result();
		while ($row1 = mysqli_fetch_assoc($result1)) {
			$array1[] = $row1; 
		}
		$row["lesson_content"]=$array1;
		$array[] = $row;
	}
	echo json_encode($array);

?>