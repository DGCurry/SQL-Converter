SELECT 
	Name AS Name
FROM [media_types]
WHERE MediaTypeId = 3


SELECT 
	Name AS Name,
	CASE WHEN  <  THEN
		30
	ELSE
		CASE WHEN  >  THEN
			42
		ELSE
			 / 
		END
	END
	 AS MinutesInRange,
	 /  AS MegaBytes,
	UnitPrice AS Price
FROM [tracks]
WHERE MediaTypeId = 3


