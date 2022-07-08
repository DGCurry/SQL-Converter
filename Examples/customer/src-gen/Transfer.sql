INSERT INTO [customer] (CustomerId, FirstName, LastName)
SELECT 
	CustomerId AS CustomerId,
	FirstName AS FirstName,
	LastName AS LastName
FROM [customers]


INSERT INTO [addressInfo] (CustomerId, Address, City, State, Country, PostalCode)
SELECT 
	CustomerId AS CustomerId,
	Address AS Address,
	City AS City,
	State AS State,
	Country AS Country,
	PostalCode AS PostalCode
FROM [customers]


