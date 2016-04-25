/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutionreturns;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class clientinfo extends JFrame
{
Connection con1;
Statement stmt;
ResultSet rs;
clientinfo()
{
super("client Information Table");
setSize(800,400);
setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getWidth()) / 2,
(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2);
setVisible(true);
Container c = getContentPane();

c.setLayout(new BorderLayout());

try
 {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con1 = DriverManager.getConnection("jdbc:odbc:abc");
stmt = con1.createStatement();
rs= stmt.executeQuery("select * from information");
}
catch(Exception e) {System.out.println(e);
 }


final String[ ] col = { "ID","Name","College","Address","Contact_no","Language","Course","DOJ","DOE","Total_fees"};


 String[ ][ ] data = new String[50][20];
    int i,j;
     i=0;
     j=0;

      try
        {
       while(rs.next())
        {
       data[i][j++]=rs.getString(1);

       data[i][j++]=rs.getString(2);

       data[i][j++]=rs.getString(3);

        data[i][j++]=rs.getString(4);

        data[i][j++]=rs.getString(5);

        data[i][j++]=rs.getString(6);

        data[i][j++]=rs.getString(7);

        data[i][j++]=rs.getString(8);

        data[i][j++]=rs.getString(9);
        data[i][j++]=rs.getString(10);
        //data[i][j++]=rs.getString(11);
        //data[i][j++]=rs.getString(12);
          j=0;
       i++;
    }
  }
     catch(Exception e) {System.out.println(e);

    }
     JTable table = new JTable(data, col);


      int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
      int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
      JScrollPane jsp = new JScrollPane(table, v, h);
      c.add(jsp, BorderLayout.CENTER);
}
}



