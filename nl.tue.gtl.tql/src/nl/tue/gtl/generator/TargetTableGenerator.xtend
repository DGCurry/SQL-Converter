package nl.tue.gtl.generator

import nl.tue.gtl.tql.model.TargetTable
import nl.tue.gtl.tql.model.Column
import nl.tue.gtl.tql.model.Type

class TargetTableGenerator {
	def mapTargetTableToTable(TargetTable targetTable) {
		'''
		CREATE TABLE «targetTable.name»
		(
			«targetTable.columns.map[mapTargetColumnToColumn].join(',\n')»
		);
		'''
	}
	
	def mapTargetColumnToColumn(Column column) {
		var parsedType = typeToSQLType(column.type)
		return '''«column.name» «parsedType»'''
	}
	
	def typeToSQLType(Type type) {
		switch (type) {
			case BOOLEAN : '''bit'''
			case DATE : '''Date'''
			case FLOAT : '''Float'''
			case INTEGER : '''int'''
			default : '''NVARCHAR(max)'''
		}
	}
}