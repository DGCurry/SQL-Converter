CREATE TABLE customer
(
	CustomerId int,
	FirstName NVARCHAR(max),
	LastName NVARCHAR(max)
);


CREATE TABLE addressInfo
(
	CustomerId int,
	Address NVARCHAR(max),
	City NVARCHAR(max),
	State NVARCHAR(max),
	Country NVARCHAR(max),
	PostalCode NVARCHAR(max)
);


