package com.mbayne.utils;

public class Utils {
  static public StringBuilder pad(StringBuilder sb, String padding, int num) {
    MB: {
      if (sb == null || num <= 0 || padding == null) {
        break MB;
      }
      for(int i=0; i < num; i++) {
        sb.append(padding);
      }
    } /* END OF MB */
    return(sb);
  }
}
      

