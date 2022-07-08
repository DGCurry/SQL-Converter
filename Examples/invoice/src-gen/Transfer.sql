INSERT INTO [specific_item] (InvoiceItemId, PercentageForTotal, CombinedPrice)
SELECT 
	InvoiceLineId AS InvoiceItemId,
	1 / Quantity * 100 AS PercentageForTotal,
	UnitPrice * Quantity AS CombinedPrice
FROM [invoice_items]
WHERE InvoiceLineId < 50

