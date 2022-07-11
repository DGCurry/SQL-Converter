INSERT INTO [specific_item] (InvoiceItemId, PercentageForTotal, CombinedPrice)
SELECT 
	InvoiceLineId AS InvoiceItemId,
	 *  AS PercentageForTotal,
	 *  AS CombinedPrice
FROM [invoice_items]
WHERE InvoiceLineId < 50


