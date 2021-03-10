package HTML.LowLevel.Element;

import java.util.Map;

public class ColGroup {
    // Allows arbitrary amount of attributes
    public void addCol(Map Attributes){}

    // Span only and Style (CSS)
    public void addCol(int span, String style){}

    // Style (CSS)
    public void addCol(String style){}
}

/*
<table>
  <colgroup>
    <col span="2" style="background-color:red">
    <col style="background-color:yellow">
  </colgroup>
  <tr>
    <th>ISBN</th>
    <th>Title</th>
    <th>Price</th>
  </tr>
  <tr>
    <td>3476896</td>
    <td>My first HTML</td>
    <td>$53</td>
  </tr>
</table>
 */