SELECT 
	Name AS Name
FROM [media_types]
WHERE MediaTypeId = 3


SELECT 
	Name AS Name,
	CASE WHEN Milliseconds / 1000 / 60 < 30 THEN
		30
	ELSE
		CASE WHEN Milliseconds / 1000 / 60 > 42 THEN
			42
		ELSE
			Milliseconds / 1000 / 60
		END
	END
	 AS MinutesInRange,
	Bytes / 1000000 AS MegaBytes,
	UnitPrice AS Price
FROM [tracks]
WHERE MediaTypeId = 3


