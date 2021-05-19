package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

public class Table extends ContainerElement{
    private int row, column;
    private String caption;
    private ColGroup colGroup;
    private String[][] tableArray;

    private Table(Builder builder){
        this.row = builder.row;
        this.column = builder.column;
        this.caption = builder.caption;
        this.colGroup = builder.colGroup;

    }

    public String[][] getTableArray() {
        return tableArray;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getCaption() {
        return caption;
    }

    public ColGroup getColGroup() {
        return colGroup;
    }
    private String getTable(){
        String s= "";
        for(int i = 0; i<this.row; i++){
            for(int j=0; j<this.column; j++){
                if(this.tableArray[i][j] != null){
                    s += this.tableArray[i][j];
                }
            }
        }
        return s;
    }
    public String toString(){
        return "<table>\n" + colGroup.toString() + getTable() + "</table>\n";
    }

    public static class Builder implements IBuilder{
        private int row, column;
        private String[][] tableArray;
        private String caption;
        private ColGroup colGroup;

        public Builder(int row, int column){
            this.row = row;
            this.column = column;
            this.caption = "";
            this.colGroup = new ColGroup.Builder().build();
            this.tableArray = new String[row][column];
        }

        /**
         * row x column
         * Sets the size of the table
         * @param row
         * @param column
         * @return
         */
        public Builder setSize(int row, int column){
            this.row = row;
            this.column = column;
            this.tableArray = new String[this.row][this.column];
            return this;
        }


        /**
         * Sets the caption on the table
         * @param caption
         * @return
         */
        public Builder setCaption(String caption){
            this.caption = caption;
            return this;
        }

        /**
         * Sets the colgroup that is used by the table
         * @param colgroup
         * @return
         */
        public Builder setColgroup(ColGroup colgroup){
            this.colGroup = colgroup;
            return this;
        }

        /**
         * Sets one or more on headers a specified row
         * @param row
         * @param text
         * @return
         */
        public Builder insertHeaders(int row, String... text){
            int count = 0;
            this.tableArray[row][0] = "<thead>\n<tr>\n";
            if(text.length>1) {
                for(String s: text){
                    if(count != text.length-1){
                        this.tableArray[row][count] += "<th>"+s+"</th>\n";
                    }else{
                        this.tableArray[row][count] = "<th>"+s+"</th>\n </tr>\n </thead>\n";
                    }
                    count++;
                }
            }else {
                this.tableArray[row][text.length - 1] += "<th>" + text[0] + "</th>\n </tr>\n</thead>\n";
            }
            return this;
        }

        /**
         * Sets one or more HTML-elements as headers in a specified row
         * @param row
         * @param elements
         * @return
         */
        public Builder insertHeaders(int row, Element... elements){
            int count = 0;
            this.tableArray[row][0] = "<thead>\n<tr>\n";
            if(elements.length>1) {
                for(Element e: elements){
                    if(count != elements.length-1){
                        this.tableArray[row][count] += "<th>"+e+"</th>\n";
                    }else{
                        this.tableArray[row][count] = "<th>"+e+"</th>\n </tr>\n </thead>\n";
                    }
                    count++;
                }
            }else {
                this.tableArray[row][elements.length - 1] += "<th>" + elements[0] + "</th>\n </tr>\n</thead>\n";
            }
            return this;
        }

        /**
         * Insert one or more strings at specified row
         * @param row
         * @param text
         * @return
         */
        public Builder insert(int row, String... text){
            int count = 0;
            this.tableArray[row][0] = "<tbody>\n <tr>\n";
            if(text.length >1) {
                for (String s : text) {
                    if(count!= text.length) {
                        insertValue(row, count, s);
                        count++;
                    }else{
                        insertValue(row,count,s);
                        this.tableArray[row][count] += "</tr>\n</tbody>\n";
                    }
                }
            }else{
                this.tableArray[row][text.length-1] += "<td>"+text[0]+"</td>\n</tr>\n</tbody>\n";
            }
            return this;
        }

        /**
         * Insert one or more HTML-element at specified row
         * @param row
         * @param elements
         * @return
         */
        public Builder insert(int row, Element... elements){
            int count = 0;
            this.tableArray[row][0] = "<tbody>\n <tr>\n";
            if(elements.length >1) {
                for (Element e : elements) {
                    if(count!= elements.length) {
                        insertValue(row, count, e);
                        count++;
                    }else{
                        insertValue(row,count,e);
                        this.tableArray[row][count] += "</tr>\n</tbody>\n";
                    }
                }
            }else{
                this.tableArray[row][elements.length-1] += "<td>"+elements[0]+"</td>\n</tr>\n</tbody>\n";
            }
            return this;
        }

        /**
         * Insert text at specified location in table
         * @param row
         * @param column
         * @param text
         * @return
         */
        private Builder insertValue(int row, int column, String text){
            // <tbody>
            //    <tr><td>January</td></tr>
            // </tbody>
            String s = "<td>"+text+"</td>\n";
            if(column != this.column){
                this.tableArray[row][column] += s;

            }else {
                this.tableArray[row][column] = s + "</tr>";
            }
            return this;
        }

        /**
         * Insert element at specified location in table
         * @param row
         * @param column
         * @param element
         * @return
         */
        private Builder insertValue(int row, int column, Element element){
            // <tbody>
            //    <tr><td>January</td></tr>
            // </tbody>
            String s = "<td>"+element+"</td>\n";
            if(column != this.column){
                this.tableArray[row][column] += s;
            }else{

                this.tableArray[row][column] = s + "</tr>";
            }

            return this;
        }

        /**
         * Sets a footer with one or more strings at specified row
         * @param row
         * @param text
         * @return
         */
        public Builder insertFoot(int row, String... text){
            // <tfoot>
            //    <tr><td>January</td></tr>
            // </tfoot>
            int count = 0;
            this.tableArray[row][0] = "<tfoot>\n<tr>\n";
            if(text.length != 1) {
                for (String s : text) {
                    if(count!= text.length-1) {
                        insertValue(row, count, s);
                    } else{
                        this.tableArray[row][count] = "<td>"+s+"</td>\n</tr>\n</tfoot>\n";
                    }
                    count++;
                }

            }else {
                this.tableArray[row][this.column - 1] += "<td>" + text[0]
                        + "</td>\n </tr>\n</tfoot>\n";
            }
            return this;
        }

        /**
         * Sets footer with one or more elements at specified row
         * @param row
         * @param elements
         * @return
         */
        public Builder insertFoot(int row, Element... elements){
            int count = 0;
            this.tableArray[row][0] = "<tfoot>\n<tr>\n";
            if(elements.length != 1) {
                for (Element e : elements) {
                    if(count!= elements.length-1) {
                        insertValue(row, count, e);
                    } else{
                        this.tableArray[row][count] = "<td>"+e+"</td>\n</tr>\n</tfoot>\n";
                    }
                    count++;
                }

            }else {
                this.tableArray[row][this.column - 1] += "<td>" + elements[0].toString()
                        + "</td>\n </tr>\n</tfoot>\n";
            }
            return this;
        }


        /**
         * Creates a Table-object
         * @return
         */
        @Override
        public Table build() {
            Table t = new Table(this);
            verify();
            return t;
        }


    }
}


/*this.tableArray[row][count] += "<td>" + element + "</td>\n";

                    if (count == e.length - 1) {
                        this.tableArray[row][this.column-1] ="";
                        this.tableArray[row][count] = "<td>" + element.toString()
                                + "</td>\n </tr>\n</tfoot>\n";
                    }*/