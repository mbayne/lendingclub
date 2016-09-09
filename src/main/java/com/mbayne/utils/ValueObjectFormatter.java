package com.mbayne.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class ValueObjectFormatter {
  private String name;
  private int offset;
  private StringBuilder sb = new StringBuilder();
  private LinkedHashMap<String, Object>
    nameValues = new LinkedHashMap<String, Object>();

  public ValueObjectFormatter(String name) {
    this.name = name;
  }

  public ValueObjectFormatter(String name, int offset) {
    this.name = name;
    this.offset = offset;
  }

  private StringBuilder indent(int indent) {
    return(Utils.pad(sb, " ", offset+indent));
  } 

  private StringBuilder indent() {
    return(indent(0));
  } 

  public void append(String name, Object value) {
    nameValues.put(name, value==null?"nullValue":value);
  }

  public String format() {
    MB: {
      if (name == null) {
        break MB;
      }
      sb.setLength(0);
      if (nameValues.size() == 0) {
        indent().append(name).append("EMPTY}");
        break MB;
      } /*endif*/

      indent().append(name).append(" {\n");

      boolean first=true;
      for(Map.Entry<String, Object> entry: nameValues.entrySet()) {
        if (!first || (first = !first)) {
          sb.append(",\n");
        } /*endif*/
        indent(2).append(entry.getKey()).append("=")
          .append(entry.getValue().toString());
      } /*endfor*/
      indent().append("\n} /* END OF ").append(name).append(" */");
    } /*endMB*/
    return(sb.toString());
  } /* END OF format */
}
