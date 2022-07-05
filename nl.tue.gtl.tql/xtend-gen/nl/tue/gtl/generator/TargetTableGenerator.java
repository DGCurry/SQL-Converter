package nl.tue.gtl.generator;

import nl.tue.gtl.tql.model.Column;
import nl.tue.gtl.tql.model.TargetTable;
import nl.tue.gtl.tql.model.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TargetTableGenerator {
  public CharSequence mapTargetTableToTable(final TargetTable targetTable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _name = targetTable.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    _builder.newLine();
    _builder.append("\t");
    final Function1<Column, String> _function = (Column it) -> {
      return this.mapTargetColumnToColumn(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<Column, String>map(targetTable.getColumns(), _function), ",\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }

  public String mapTargetColumnToColumn(final Column column) {
    CharSequence parsedType = this.typeToSQLType(column.getType());
    StringConcatenation _builder = new StringConcatenation();
    String _name = column.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(parsedType);
    return _builder.toString();
  }

  public CharSequence typeToSQLType(final Type type) {
    CharSequence _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("bit");
          _switchResult = _builder;
          break;
        case DATE:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Date");
          _switchResult = _builder_1;
          break;
        case FLOAT:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Float");
          _switchResult = _builder_2;
          break;
        case INTEGER:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("int");
          _switchResult = _builder_3;
          break;
        default:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("NVARCHAR(max)");
          _switchResult = _builder_4;
          break;
      }
    } else {
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("NVARCHAR(max)");
      _switchResult = _builder_4;
    }
    return _switchResult;
  }
}
