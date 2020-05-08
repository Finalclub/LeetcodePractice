SELECT
	quantity,
	Rank 
FROM
	(
	SELECT
		quantity,
		@curRank :=
	IF
		( @preVal = quantity, @curRank := @curRank + 0, @curRank := @curRank + 1 ) AS Rank,
		@preVal = quantity
		
	FROM
		orderitems,
		( SELECT @curRank := 0, @preVal := NULL ) r 
	ORDER BY
	quantity DESC
	) e;