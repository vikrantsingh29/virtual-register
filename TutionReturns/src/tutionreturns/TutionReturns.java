package tutionreturns;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.ImageObserver;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.util.*;

import javax.swing.JOptionPane;

class second implements ActionListener//, ItemListener
	{
        String id,id2;		
    CheckboxGroup cbg;
		Checkbox cb1,cb2,cb3;
		JComboBox jc1,jc3;
		
		JFrame f1,f2,f3,f4,f5,f6,f7,f8,f9;
		JLabel lfeeid,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26;
                JLabel l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54,l55;
//		JComboBox jcb1;
		JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22;
		ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30;
		JTextField tffeeid,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27;
                JTextField tf28,tf29,tf30,tf31,tf32,tf33,tf34,tf35,tf36,tf37,tf38,tf39,tf40,tf41,tf42,tf43,tf44,tf45,tf46,tf47,tf48;
		
		JRadioButton jb1,jb2,jb3,jb4;
		ButtonGroup bg1;
	JTextArea jt1;
		 
public void aa()
{
	               
			jt1=new JTextArea(300,600);
                        try{
                                System.out.println("hello");   
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              System.out.println("hello");
              PreparedStatement ps= con.prepareStatement("Select ID,Name,Contact_no,DOJ from  information");
               
              Calendar c1=Calendar.getInstance();
     	      SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
     		//String s10=ff.format(c1.getTime());
                c1.add(Calendar.DATE, 7);
    		SimpleDateFormat ff2=new SimpleDateFormat("dd/MM/yyyy");
    		String s5=ff2.format(c1.getTime());
     		System.out.println("date: "+s5);
              ResultSet rs=ps.executeQuery();
              while(rs.next())
              {
              jt1.append(rs.getString(1)+"\t");
              jt1.append(rs.getString(2)+"\t");
              jt1.append(rs.getString(4)+"\t");
              jt1.append("\n");
              }
                        
                        
                        }
                        catch(Exception e)
                        {}

			
			f1=new JFrame();                                // main page
			p1=new JPanel();
			l40=new JLabel();
		    i1=new ImageIcon("images//image4.jpg");
		    l40.setIcon(i1);
		    
		    i10=new ImageIcon("images//button.png");
		    i11=new ImageIcon("images//records button.png");
		    
		    
		    
			b1=new JButton("");
			b2=new JButton("");
			b2.setIcon(i10);
			b1.setIcon(i11);
			f1.add(p1);
			p1.add(l40);
			
			l40.add(b1);
			l40.add(b2);
			l40.add(jt1);
			l40.setBounds(0,0,1200,800);
			b1.setBounds(350, 300, 200, 40);
			b2.setBounds(720, 300, 200, 40);
			jt1.setBounds(30, 30, 300, 300);
			p1.setLayout(null);
			f1.setVisible(true);
			f1.setSize(1200,700);
                        
	
			b1.addActionListener(this);
			b2.addActionListener(this);
		
		
	}
	
public void os()
{
	l41=new JLabel();
    i2=new ImageIcon("images//image4.jpg");
    l41.setIcon(i2);
	
    i12=new ImageIcon("images//back.png");
    i13=new ImageIcon("images//details.png");
    i14=new ImageIcon("images//submit.png");
			tf1 = new JTextField();
			l1=new JLabel("ID");
			f2=new JFrame();
			p2=new JPanel();
			b3=new JButton("");
			b4=new JButton("");
			b9=new JButton("");
			b9.setIcon(i12);
			b4.setIcon(i13);
			b3.setIcon(i14);
			
			f2.add(p2);
			p2.add(l41);
			l41.setBounds(0,0,1200,800);
			l41.add(b3);										// old student
			l41.add(b4);
			l41.add(b9);
			l41.add(tf1);
			l41.add(l1);
			l1.setBounds(400, 170, 200, 50);
			tf1.setBounds(500, 170, 150, 40);
			b3.setBounds(350, 270, 150, 48);
			b4.setBounds(550, 270, 150, 48);
			b9.setBounds(950,20,175,30);
			p2.setLayout(null);
			f1.setVisible(false);
			f2.setVisible(true);
			f2.setSize(1200,700);
		
			b3.addActionListener(this);
                        b4.addActionListener(this);
			b9.addActionListener(this);
			

}
	

public void ns()				// registration of new students
{
	l42=new JLabel();
    i3=new ImageIcon("images//image4.jpg");
    l42.setIcon(i3);
    
		l33=new JLabel("Id   :");
        tf32=new JTextField();
    	b10=new JButton("");
		b13=new JButton("");
	    i26=new ImageIcon("images//submitrecord.png");
	    b13.setIcon(i26);
		i15=new ImageIcon("images//b2p.png");	
		b10.setIcon(i15);
							jb1=new JRadioButton("Java");
							jb1.setActionCommand("Java");
							jb2=new JRadioButton("C");
							jb2.setActionCommand("C");
							jb3=new JRadioButton("C++");
							jb3.setActionCommand("C++");
							jb4=new JRadioButton("SQL");
							jb4.setActionCommand("SQL");
							
							
							bg1=new ButtonGroup();
							
		f5=new JFrame();
		p5=new JPanel();
	
		tf10=new JTextField();
		tf11=new JTextField();
		tf12=new JTextField();					// personal details 
		tf13=new JTextField();
                tf42=new JTextField();
                tf43=new JTextField();
                tf44=new JTextField();
                tf15=new JTextField();
		tf16=new JTextField();
		tf17=new JTextField();
		tf18=new JTextField();
		tf41=new JTextField();	
		l10=new JLabel("Name         :");
		l11=new JLabel("College      :");
		l12=new JLabel("Contact no.  :");
		l13=new JLabel("Address      :");
		l14=new JLabel("Language     :");
		l15=new JLabel("Course       :");
		l16=new JLabel("D.O.J.       :");
		l17=new JLabel("D.O.L.       :");
		l18=new JLabel("Total Fees   :");
                l49=new JLabel("next installment date  :");
                l50=new JLabel("second installment date :");
                l51=new JLabel("third installment date  :");
                
                
			tf32.setBounds(350, 100, 150, 30);
			tf10.setBounds(350, 140, 150, 30);
			tf11.setBounds(350, 180, 150, 30);
			tf12.setBounds(350, 220, 150, 30);
			tf13.setBounds(350, 260, 150, 30);
			//tf41.setBounds(350, 300, 150, 30);
						jb1.setBounds(350, 300, 60, 30);
						jb2.setBounds(420, 300, 60, 30);
						jb3.setBounds(490, 300, 60, 30);
						jb4.setBounds(560, 300, 60, 30);
			tf15.setBounds(350, 340, 150, 30);
			tf16.setBounds(350, 380, 150, 30);
			tf17.setBounds(350, 420, 150, 30);
			tf18.setBounds(350, 460, 150, 30);
			tf42.setBounds(350, 500, 150, 30);
                        tf43.setBounds(350, 540, 150, 30);
                        tf44.setBounds(350, 580, 150, 30);
		//	cb2.setBounds(300, 240, 50, 30);
		//	cb3.setBounds(350, 240, 50, 30);
			
			b10.setBounds(950,20,195,30);		 //for back button
			
			l33.setBounds(200, 100, 80, 30);
			l10.setBounds(200, 140, 80, 30);
			l11.setBounds(200, 180, 80, 30);
			l12.setBounds(200, 220, 80, 30);
			l13.setBounds(200, 260, 80, 30);
			l14.setBounds(200, 300, 80, 30);
			l15.setBounds(200, 340, 80, 30);
			l16.setBounds(200, 380, 80, 30);
			l17.setBounds(200, 420, 80, 30);
			l18.setBounds(200,460 , 80, 30);
                        l49.setBounds(200,500 , 170, 30);
                        l50.setBounds(200,540 , 130, 30);
                        l51.setBounds(200,580 , 130, 30);
			
			b13.setBounds(900,260,170,40); 		//submit button
				
			f5.add(p5);
			p5.add(l42);
			l42.setBounds(0,0,1200,800);
			l42.add(b13);
			l42.add(tf10);
			l42.add(tf18);
			l42.add(l18);
			l42.add(tf41);
                        //l42.add(l51);
                        //l42.add(l50);
                        l42.add(l49);
                       // l42.add(tf44);
                        //l42.add(tf43);
                        l42.add(tf42);
                        
		//	p5.add(cb2);
							l42.add(jb1);
							l42.add(jb2);
							l42.add(jb3);
							l42.add(jb4);
							bg1.add(jb1);
							bg1.add(jb2);
							bg1.add(jb3);
							bg1.add(jb4);
            l42.add(tf32);
            l42.add(l33);
		//	p5.add(cb3);
			l42.add(tf11);
			l42.add(tf12);
			l42.add(tf13);
			//p5.add(tf14);
			l42.add(tf15);
			l42.add(tf16);
			l42.add(tf17);
			l42.add(l10);
			l42.add(l11);
			l42.add(l12);
			l42.add(l13);
			l42.add(l14);
			l42.add(l15);
			l42.add(l16);
			l42.add(l17);
			//p5.add(jc1);
			l42.add(b10);
		p5.setLayout(null);
		f1.setVisible(false);
		f5.setVisible(true);
		f5.setSize(1200,700);
	
		b10.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		//cb1.addItemListener(this);
		//cb2.addItemListener(this);
		//cb3.addItemListener(this);
        b13.addActionListener(this);

}


public void osd()       				//old student details
{										//a block which leads to info of existing students				
	l43=new JLabel();
    i4=new ImageIcon("images//image4.jpg");
    l43.setIcon(i4);
   	
	
		b12=new JButton("");
		 i16=new ImageIcon("images//b2p.png");
		b12.setIcon(i16);	
		f3=new JFrame();
		p3=new JPanel();
		b5=new JButton("");

	    i22=new ImageIcon("images//personaldetails.png");
	    b5.setIcon(i22);
            b6=new JButton("");
            i23=new ImageIcon("images//feesdetails.png");
	    b6.setIcon(i23);
           b18=new JButton("Fees Updation ");
            
           b19=new JButton("Personal details updation");
		
		b7=new JButton("");
		i24=new ImageIcon("images//updation.png");
	    b7.setIcon(i24);
		
	
		f3.add(p3);
		p3.add(l43);
		l43.setBounds(0,0,1200,800);
		l43.add(b5);
		l43.add(b6);	
                l43.add(b18);
                l43.add(b19);
		//l43.add(b7);
		l43.add(b12);
		b5.setBounds(250, 300, 190, 45);
		b6.setBounds(480, 300, 190, 45);
		b7.setBounds(710, 300, 190, 45);
		b12.setBounds(950,20,195,30);
                b18.setBounds(300,370,190,45);
                b19.setBounds(550,370,190,45);
		
		p3.setLayout(null);
		f2.setVisible(false);
		f3.setVisible(true);
		f3.setSize(1200,700);
		b5.addActionListener(this);
                b6.addActionListener(this);
                  b7.addActionListener(this);
		b12.addActionListener(this); 
                b18.addActionListener(this);b19.addActionListener(this);
}


public void personald()				// personal details. inside old student.
{									// for finding info of a specific student		
	l44=new JLabel();
    i5=new ImageIcon("images//image4.jpg");
    l44.setIcon(i5);
	
		b11=new JButton("");
		i17=new ImageIcon("images//b2p.png");
		b11.setIcon(i17);
		//b14=new JButton("Submit Record");
		
		f4=new JFrame();
		p4=new JPanel();
                tf39=new JTextField();
		
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();				 
		tf5=new JTextField();
		//tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		
		
		l2=new JLabel("Name         :");
		l3=new JLabel("College      :");
		l4=new JLabel("Contact no.  :");
		l5=new JLabel("Address      :");
		l6=new JLabel("Language     :");
		l7=new JLabel("Course       :");
		l8=new JLabel("D.O.J.       :");
		l9=new JLabel("D.O.L.       :");
	
		b11.setBounds(950,20,195,30);
		//b14.setBounds(250,510,120,30);
		tf2.setBounds(250, 170, 150, 30);
		tf3.setBounds(250, 210, 150, 30);
		tf4.setBounds(250, 250, 150, 30);
		tf5.setBounds(250, 290, 150, 30);
		tf39.setBounds(250, 330, 150, 30);
		tf7.setBounds(250, 370, 150, 30);
		tf8.setBounds(250, 410, 150, 30);
		tf9.setBounds(250, 450, 150, 30);
		l2.setBounds(100, 170, 80, 30);
		l3.setBounds(100, 210, 80, 30);
		l4.setBounds(100, 250, 80, 30);
		l5.setBounds(100, 290, 80, 30);
		l6.setBounds(100, 330, 80, 30);
		l7.setBounds(100, 370, 80, 30);
		l8.setBounds(100, 410, 80, 30);
		l9.setBounds(100, 450, 80, 30);
		
		
			
		f4.add(p4);

		p4.add(l44);
		l44.setBounds(0,0,1200,800);
		l44.add(tf2);l44.add(tf3);l44.add(tf4);l44.add(tf5);l44.add(tf39);
		l44.add(tf7);l44.add(tf8);l44.add(tf9);l44.add(l2);
		l44.add(l3);l44.add(l4);l44.add(l5);l44.add(l6);
		l44.add(l7);l44.add(l8);l44.add(l9);
		l44.add(b11);
		//p4.add(b14);
	
	p4.setLayout(null);
	f3.setVisible(false);
	f4.setVisible(true);
	f4.setSize(1200,700);
	b11.addActionListener(this);
        //b14.addActionListener(this);
}
public void fd()
{
	l45=new JLabel();
    i6=new ImageIcon("images//image4.jpg");
    l45.setIcon(i6);
    
    b16=new JButton("");
    i18=new ImageIcon("images//b2p.png");
	b16.setIcon(i18);
    f6= new JFrame();
    p6= new JPanel();
    tf21=new JTextField();
    tf22=new JTextField();
    tf23=new JTextField();
    tf24=new JTextField();
    tf45=new JTextField();
    tf46=new JTextField();
    tf47=new JTextField();
    l21=new JLabel("TotalFees");
    l22=new JLabel("fees paid");
    l23=new JLabel("fees due");
    l24=new JLabel("last date fees paid");
    l52=new JLabel("first instl");
    l53=new JLabel("secnd instl");
    l54=new JLabel("third instl");
    f6.add(p6);
	p6.add(l45);
	l45.setBounds(0,0,1200,800);
    l45.add(tf21);l45.add(tf23);l45.add(tf22);l45.add(tf24);l45.add(tf45);
    //l45.add(tf46);l45.add(tf47);
    l45.add(l52);
    //l45.add(l53);l45.add(l54);
    l45.add(l21);l45.add(l22);l45.add(l23);l45.add(l24);l45.add(b16);
    l21.setBounds(100, 80, 80, 30);
    l22.setBounds(100, 120, 80, 30);
    l23.setBounds(100, 160, 80, 30);
    l24.setBounds(100, 200, 80, 30);
    l52.setBounds(100, 240, 80, 30);
    l53.setBounds(100, 280, 80, 30);
    l54.setBounds(100, 320, 80, 30);
    tf21.setBounds(250, 80, 150, 30);
    tf22.setBounds(250, 120, 150, 30);
    tf23.setBounds(250, 160, 150, 30);
    tf24.setBounds(250, 200, 150, 30);
     tf45.setBounds(250, 240, 150, 30);
      tf46.setBounds(250, 280, 150, 30);
       tf47.setBounds(250, 320, 150, 30);
    b16.setBounds(950,20,195,30);
    p6.setLayout(null);
    f3.setVisible(false);
    f6.setVisible(true);
    f6.setSize(1200,700);
   b16.addActionListener(this);
	
    
}
public void pdupdation()
{
	l46=new JLabel();
    i7=new ImageIcon("images//image4.jpg");
    l46.setIcon(i7);
    b15=new JButton("Submit Record");
	i30=new ImageIcon("images//submitrecord.png");
	    b15.setIcon(i30);
	        b17=new JButton("");	
	        i19=new ImageIcon("images//b2p.png");
			b17.setIcon(i19);
		f7=new JFrame();
		p7=new JPanel();
		//jc3=new JComboBox(language1);//language
		tf25=new JTextField();//name
		tf26=new JTextField();//college
		tf27=new JTextField();//contact no.		 
		tf28=new JTextField();//address
		//tf6=new JTextField();
		tf29=new JTextField();//course
		tf30=new JTextField();//doj
		tf31=new JTextField();//dol
                tf40=new JTextField();//language
		
		
		l25=new JLabel("Name         :");
		l26=new JLabel("College      :");
		l27=new JLabel("Contact no.  :");
		l28=new JLabel("Address      :");
		l29=new JLabel("Language     :");
		l30=new JLabel("Course       :");
		l31=new JLabel("D.O.J.       :");
		l32=new JLabel("D.O.L.       :");
	
		b17.setBounds(950,20,195,30);
		b15.setBounds(600,260,170,37);
		tf25.setBounds(250, 170, 150, 30);
		tf26.setBounds(250, 210, 150, 30);
		tf27.setBounds(250, 250, 150, 30);
		tf28.setBounds(250, 290, 150, 30);
		tf40.setBounds(250, 330, 150, 30);
		tf29.setBounds(250, 370, 150, 30);
		tf30.setBounds(250, 410, 150, 30);
		tf31.setBounds(250, 450, 150, 30);
		l25.setBounds(100, 170, 80, 30);
		l26.setBounds(100, 210, 80, 30);
		l27.setBounds(100, 250, 80, 30);
		l28.setBounds(100, 290, 80, 30);
		l29.setBounds(100, 330, 80, 30);
		l30.setBounds(100, 370, 80, 30);
		l31.setBounds(100, 410, 80, 30);
		l32.setBounds(100, 450, 80, 30);
		f7.add(p7);

		p7.add(l46);
		l46.setBounds(0,0,1200,800);
		l46.add(tf25);
                l46.add(tf26);
                l46.add(tf27);
                l46.add(tf28);
		l46.add(tf40);
		l46.add(tf29);
                l46.add(tf30);
                l46.add(tf31);
                
                l46.add(l25);
		l46.add(l26);
                l46.add(l27);
                l46.add(l28);
                l46.add(l29);
		l46.add(l30);
                l46.add(l31);
                l46.add(l32);
		l46.add(b15);
                l46.add(b17);
	p7.setLayout(null);
	f3.setVisible(false);
	f7.setVisible(true);
	f7.setSize(1200,700);
        b17.addActionListener(this);
        b15.addActionListener(this);
}
/*public void updation()
{
	l47=new JLabel();
    i8=new ImageIcon("images//image4.jpg");
    l47.setIcon(i8);
    
                f8=new JFrame();
		p8=new JPanel();
                b18=new JButton("");
                	i20=new ImageIcon("images//feesdetails.png");	
            		b18.setIcon(i20);
        
                b19=new JButton("");	
                	i27=new ImageIcon("images//personaldetails.png");	
            		b19.setIcon(i27);
        
                b20=new JButton("");
                	i28=new ImageIcon("images//b2p.png");	
                	b20.setIcon(i28);
        		             
                b18.setBounds(350,310,190,40);
                
                b19.setBounds(600,310,190,40);
                b20.setBounds(950,20,195,30);
                 f8.add(p8);

         		p8.add(l47);
         		l47.setBounds(0,0,1200,800);

                 l47.add(b18);
                l47.add(b19);
                  l47.add(b20);
        p8.setLayout(null);
	f3.setVisible(false);
	f8.setVisible(true);
	f8.setSize(1200,700);
         b18.addActionListener(this);
         b19.addActionListener(this);
         b20.addActionListener(this);
                
                
}*/
public void feeupdation()
{

	l48=new JLabel();
    i9=new ImageIcon("images//image4.jpg");
    l48.setIcon(i9);

	f9=new JFrame();
	p9=new JPanel();
	b21=new JButton("");

    i29=new ImageIcon("images//submitrecord.png");
    b21.setIcon(i29);
    
        b22=new JButton("");
        i21=new ImageIcon("images//b2p.png");	
		b22.setIcon(i21);
        
	tf33=new JTextField();
        tffeeid=new JTextField();
	tf34=new JTextField();
	tf35=new JTextField();
	tf36=new JTextField();
	tf37=new JTextField();
	tf38=new JTextField();
        tf48=new JTextField();
    l34=new JLabel("TotalFees");    
    l35=new JLabel("Fees Paid");    
    l36=new JLabel("Fees Left");
    l37=new JLabel("next installment date");    
    l38=new JLabel("Last date of paying Fees");
    l39=new JLabel("second");
    l55=new JLabel("third");
    lfeeid=new JLabel("ID");
    lfeeid.setBounds(100,100,80,30);
    l34.setBounds(100, 140, 80, 30);
    l35.setBounds(100, 180, 80, 30);
    l36.setBounds(100, 220, 80, 30);
    l37.setBounds(100, 300, 80, 30);
    l38.setBounds(100, 260, 80, 30);
    l39.setBounds(100, 340, 80, 30);
    l55.setBounds(100, 380, 80, 30);
    tffeeid.setBounds(250,100,150,30);
    tf33.setBounds(250, 140, 150, 30);
    tf34.setBounds(250, 180, 150, 30);
    tf35.setBounds(250, 220, 150, 30);
    tf36.setBounds(250, 300, 150, 30);
    tf37.setBounds(250, 260, 150, 30);
    tf38.setBounds(250, 340, 150, 30);
    tf48.setBounds(250, 380, 150, 30);
    b21.setBounds(620,200,170,37);
    b22.setBounds(950,20,195,30);
    f9.add(p9);
		p9.add(l48);
		l48.setBounds(0,0,1200,800);

    l48.add(tf33);l48.add(tf34);l48.add(tf35);l48.add(tf37);l48.add(tf36);
    //l48.add(tf38);l48.add(tf48);
    l48.add(l37);
    ///l48.add(l39);l48.add(l55);
    l48.add(l34);l48.add(l35);l48.add(l36);l48.add(l38);
    l48.add(b21);l48.add(b22);l48.add(lfeeid);l48.add(tffeeid);
    
    p9.setLayout(null);
    f3.setVisible(false);
    f9.setVisible(true);
    f9.setSize(1200,700);
     b21.addActionListener(this);
         b22.addActionListener(this);
    
}



public void actionPerformed(ActionEvent ae)
{
	
	if(ae.getSource()==b1)
	{
		
		os();
	}
       
	if(ae.getSource()==b2)								// action event function
	{
		ns();
                
                try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
              Statement ps=con.createStatement();
              
              ResultSet rs=ps.executeQuery("select id from start where admin='vikrant'");
              System.out.printf("hello");
              if(rs.next())
                      {
                          
                          int m=Integer.parseInt(rs.getString(1));
                          System.out.print(m);
                          String s=m+"";
                          tf32.setText(s);
                      } } 
         catch(Exception e)
         {}
          
        
        
        
        
        
        
        
        }
	
	if(ae.getSource()==b3)
	{
	    if(tf1.getText().equals(""))
            {
                  JOptionPane.showMessageDialog(f2,"Id cannot be blank");
            }
            else
            {
            id=tf1.getText();	
            
            osd();
	}
        }
            if(ae.getSource()==b4)
	{
		
	new clientinfo();
	}
       
       
	if(ae.getSource()==b5)
	{
            //String mm="name";
	  //{  mm=JOptionPane.showInputDialog(null,"enter the name  ");	
            personald();
                try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("Select Name,College,Address,Contact_no ,Language,Course,DOJ,DOL from information where id=?");
 
              ps.setString(1, id);
            ResultSet rs= ps.executeQuery();
              
              if(rs.next())
             {
                 //System.out.print(rs.getString(1));
             
                tf2.setText(rs.getString(1));
                tf3.setText(rs.getString(2));
                tf4.setText(rs.getString(3));
                tf5.setText(rs.getString(4));
                tf39.setText(rs.getString(5));
                tf7.setText(rs.getString(6));
                tf8.setText(rs.getString(7));
                 tf9.setText(rs.getString(8));
                
                
             }
                }
         catch(Exception e)
         {}
	}
      if(ae.getSource()==b6)
	{
		
		fd();
                  try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("Select Fees_Paid,Fees_Left,Last_date_of_paying_fees,first from FEES where id=?");
 
          ps.setString(1, id);
            ResultSet rs= ps.executeQuery();
              
              if(rs.next())
             {
                 //System.out.print(rs.getString(1));
             
              
                tf22.setText(rs.getString(1));
                tf23.setText(rs.getString(2));
                tf24.setText(rs.getString(3));
                tf45.setText(rs.getString(4));
                
                
                 //System.out.print("hello");
                
                
             }
                }
         catch(Exception e)
         {}
                  try{ Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("Select Total_Fees from information where id=?");
 
          ps.setString(1, id);
            ResultSet rs= ps.executeQuery();
              
              if(rs.next()){  tf21.setText(rs.getString(1));
	}} catch(Exception e)
         {}}
      /*if(ae.getSource()==b7)
	{
		
		updation();
	}*/
      if(ae.getSource()==b9)
	{
		f2.setVisible(false);
		aa();
	}
      if(ae.getSource()==b10)
	{
		f5.setVisible(false);
		aa();
	}
     if(ae.getSource()==b11)
	{
		f4.setVisible(false);
		osd();
	}
     if(ae.getSource()==b12)
	{
		f3.setVisible(false);
		os();
	}
         
     
     
     
     if(ae.getSource()==b13)
         { 
    	 String lang=bg1.getSelection().getActionCommand();
    	 System.out.print(lang);
    	
             System.out.print("hello");
             if((tf10.getText()).equals("")||(tf11.getText()).equals("")||(tf12.getText()).equals("")||(tf13.getText()).equals("")||lang.equals("")||(tf15.getText()).equals("")||(tf16.getText()).equals("")||(tf17.getText()).equals("")||(tf18.getText()).equals(""))
             {
            	 System.out.print("hello2");
                 JOptionPane.showMessageDialog(f5,"Fields cannot be blank");
             }
             else
             {try{
            	 System.out.println("hello3");
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              PreparedStatement ps= con.prepareStatement("insert into FEES(id,first,count) values(?,?,?)");
           System.out.print("record");
              ps.setString(1,tf32.getText());
              ps.setString(2,tf42.getText());
              ps.setString(3,"0");
              ps.executeUpdate();
             
              
             
             } 
         catch(Exception e)
         {}
             
             try{
            	 System.out.println("hello3");
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              PreparedStatement ps= con.prepareStatement("insert into information values(?,?,?,?,?,?,?,?,?,?)");
              
              System.out.print("record");
              ps.setString(1,tf32.getText());
              ps.setString(2,tf10.getText());
              ps.setString(3,tf11.getText());
              ps.setString(4,tf12.getText());
              ps.setString(5,tf13.getText());
              ps.setString(6,lang);
              System.out.println("hello4");
              //ps.setString(6,tf41.getText());
              ps.setString(7,tf15.getText());
              ps.setString(8,tf16.getText());
              ps.setString(9,tf17.getText());
               ps.setString(10,tf18.getText());
              
               int t=ps.executeUpdate();
              if(t>0)
              {JOptionPane.showMessageDialog(f5,"record has been submitted");
                  System.out.print("record has been inserted");
              }
            
             
             } 
         catch(Exception e)
         {}
          int x=Integer.parseInt(tf32.getText());
          x=x+1;
          
         try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
              PreparedStatement ps=con.prepareStatement("update start set id=? where admin='vikrant'");
              ps.setString(1, (x+""));
              ps.executeUpdate();
               } 
         catch(Exception e)
         {}
         
         
         
         
         
             }
         
         }
      if(ae.getSource()==b15) {
	try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("update information set Name= ?, College=?, Address=?, Contact_no=?, Language=?, Course=?, DOJ=?, DOL=?  where id=?");
                         
  ps.setString(1,tf25.getText());
  ps.setString(2,tf26.getText());
  ps.setString(3,tf27.getText());
  ps.setString(4,tf28.getText());
  ps.setString(5,tf40.getText());
  ps.setString(6,tf29.getText());
  ps.setString(7,tf30.getText());
  ps.setString(8,tf31.getText());
  ps.setString(9, id);
  int m=ps.executeUpdate();   
  if(m>0)
  {
      System.out.print("record has been updated");
  }
  //System.out.print("hello");
     //System.out.print(id);
      /*System.out.print(tf25.getText());
       System.out.print(tf26.getText());
        System.out.print(tf27.getText());
         System.out.print(tf28.getText());
          System.out.print(tf40.getText());
           System.out.print(tf29.getText());
            System.out.print(tf30);
             System.out.print(tf31);
     
  */
          
           /* ResultSet rs= ps.executeQuery();
              
              if(rs.next())
             {
                 //System.out.print(rs.getString(1));
             
                tf25.setText(rs.getString(1));
                tf26.setText(rs.getString(2));
                tf27.setText(rs.getString(3));
                tf28.setText(rs.getString(4));
                tf40.setText(rs.getString(5));
                tf29.setText(rs.getString(6));
                tf30.setText(rs.getString(7));
                 tf31.setText(rs.getString(8));
                 
                
                
             }*/
                }
         catch(Exception e)
         {}
		
      }
         if(ae.getSource()==b16)
	{
		f6.setVisible(false);
		osd();
	}if(ae.getSource()==b17)
	{
		f7.setVisible(false);
		osd();
	}
         if(ae.getSource()==b18)
	{
		
		
             feeupdation();
              tffeeid.setText(id);
              try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("Select Fees_Paid,Fees_Left,Last_date_of_paying_fees,first from FEES where id=?");
 
          ps.setString(1, id);
            ResultSet rs= ps.executeQuery();
              
              if(rs.next())
             {
                 //System.out.print(rs.getString(1));
             
              
                tf34.setText(rs.getString(1));
                tf35.setText(rs.getString(2));
                tf37.setText(rs.getString(3));
                tf36.setText(rs.getString(4));
                
                
                 //System.out.print("hello");
                
                
             }
                }
         catch(Exception e)
         {}
                  try{ Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("Select Total_Fees from information where id=?");
 
          ps.setString(1, id);
            ResultSet rs= ps.executeQuery();
              
              if(rs.next()){  tf33.setText(rs.getString(1));
	}} catch(Exception e)
         {}
                
	}
          if(ae.getSource()==b19)
	{
		pdupdation();
                try{
                     //
                     
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
                           PreparedStatement ps= con.prepareStatement ("Select Name,College,Address,Contact_no ,Language,Course,DOJ,DOL from information where id=?");
  ps.setString(1, id);
          
            ResultSet rs= ps.executeQuery();
              
              if(rs.next())
             {
                 //System.out.print(rs.getString(1));
             
                tf25.setText(rs.getString(1));
                tf26.setText(rs.getString(2));
                tf27.setText(rs.getString(3));
                tf28.setText(rs.getString(4));
                tf40.setText(rs.getString(5));
                tf29.setText(rs.getString(6));
                tf30.setText(rs.getString(7));
                 tf31.setText(rs.getString(8));
                 //System.out.print("hello");
                 
                 
                
                
             }
                }
         catch(Exception e)
         {}
                
	}
        if(ae.getSource()==b20)
	{
		f8.setVisible(false);
		osd();
	}
         if(ae.getSource()==b21)
         { 
             //updating next installment date
               
             Calendar c1;
             c1=Calendar.getInstance();
    		SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
    		String s4=ff.format(c1.getTime());
              c1.add(Calendar.DATE,20);
     		SimpleDateFormat ff2=new SimpleDateFormat("dd/MM/yyyy");
     		String s5=ff2.format(c1.getTime());
             
           
               
     		
     		
                tf37.setText(s4);
                tf36.setText(s5);
                
                //ends here 
             try{
                
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              PreparedStatement ps= con.prepareStatement ("select Fees_Paid,Fees_Left,Last_date_of_paying_fees,first from FEES where ID=?");
     
             // ps.setString(1,id); 
              // System.out.print("updated");
//              ps.setString(1,tf34.getText());
 //             System.out.print(tf34.getText());
   
  //            ps.setString(2,tf35.getText());
   //           System.out.print(tf35.getText());
              
             //  ps.setString(4,tf36.getText());
    //          ps.setString(3,tf37.getText());
     //         System.out.print(tf37.getText());
             
              ps.setString(1, tffeeid.getText());
   
             ResultSet rs=ps.executeQuery();
          
             if(!rs.next())
  {
      System.out.print("vikrant"); 
      try{
                
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con1=DriverManager.getConnection("jdbc:odbc:abc");
              PreparedStatement ps1= con.prepareStatement ("insert into FEES(Fees_Paid,Fees_Left,Last_date_of_paying_fees,ID,first) values(?,?,?,?,?)");
ps1.setString(1,tf34.getText());
 //             System.out.print(tf34.getText());
   
              ps1.setString(2,tf35.getText());
   //           System.out.print(tf35.getText());
              
             //  ps.setString(4,tf36.getText());
              ps1.setString(3,tf37.getText());
     //         System.out.print(tf37.getText());
             
              ps1.setString(4, tffeeid.getText());
              ps1.setString(5,tf36.getText());
              
   
             int m1=ps1.executeUpdate();
                 if(m1>0)
                 {
                     System.out.println("record has been inserted");
                 }
        
        
        }
        catch(Exception e)
        {}
 }
            else{Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con1=DriverManager.getConnection("jdbc:odbc:abc");
              PreparedStatement ps1= con1.prepareStatement (" update FEES  set Fees_Paid=? , Fees_Left=? , Last_date_of_paying_fees=? , first=? where id=? ") ;
                  ps1.setString(1,tf34.getText());
 //             System.out.print(tf34.getText());
 
   
             ps1.setString(2,tf35.getText());
   //           System.out.print(tf35.getText());
              
             //  ps.setString(4,tf36.getText());
               ps1.setString(3,tf37.getText());
     //         System.out.print(tf37.getText());
             
              
             
              ps1.setString(4,tf36.getText()); 
               ps1.setString(5, id);
              
   
             int m1;
             m1=ps1.executeUpdate();
                 if(m1>0)
                 {
                     System.out.println("record has been updated");
                 }
        
                
                  
             
             
             
             
             
             } 
                 
             
             
             
             
             
             
             
             }      
         catch(Exception e)
         {}
             { try{
                 
                 int count1=0;
                 //int s11=count1;
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              
              PreparedStatement ps1;
                     ps1 =con.prepareStatement ("Select count from FEES where ID=?");
             
                     ps1.setString(1, id);               
             ResultSet rs=ps1.executeQuery();
             
             
             if(rs.next())
             {
              
                 count1=Integer.parseInt(rs.getString("count"));
                
             }
           
             if(count1>=3)
             {tf35.setText("all fees paid");
             tf36.setText("all fees paid");
             }
             else
             
             count1++;
             ps1= con.prepareStatement ("update FEES set count=?  where ID=?");
             
             ps1.setString(1,count1+"");
             ps1.setString(2, id); 
             ps1.executeUpdate();
             System.out.println("ssssssssssssssssssss "+count1); 
            
              
                 
             }
           catch(Exception e)
                     {}
         }
             try{
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:abc");
              PreparedStatement ps= con.prepareStatement ("update information set Total_Fees where ID=?");
                         
   ps.setString(1,tf33.getText());
   System.out.print(tf33.getText());
             // ps.setString(2,tf35.getText());
             //  ps.setString(4,tf36.getText());
             // ps.setString(3,tf37.getText());
  ps.setString(2, id);
  int m=ps.executeUpdate();   
  if(m>0)
  {
      System.out.print("record has been updated");
  }
             }      
         catch(Exception e)
         {}
         
          }
        
        
         
         
         
  if(ae.getSource()==b22)
	{
		f9.setVisible(false);
		osd();
	}
         
         
         
         
         
         
         
         
         
         
         
         
         if(ae.getSource()==jb1)
     	{
     		
     		Calendar c1=Calendar.getInstance();
    		SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
    		String s4=ff.format(c1.getTime());
    		c1.add(Calendar.DATE, 10);
    		SimpleDateFormat ff2=new SimpleDateFormat("dd/MM/yyyy");
    		String s5=ff2.format(c1.getTime());
                c1.add(Calendar.DATE, 41);
    		SimpleDateFormat ff3=new SimpleDateFormat("dd/MM/yyyy");
    		String s6=ff3.format(c1.getTime());
                c1.add(Calendar.DATE, 41);
    		SimpleDateFormat ff4=new SimpleDateFormat("dd/MM/yyyy");
    		String s7=ff4.format(c1.getTime());
                c1.add(Calendar.DATE, 60);
    		SimpleDateFormat ff5=new SimpleDateFormat("dd/MM/yyyy");
    		String s8=ff5.format(c1.getTime());
        	 tf18.setText("4000");
        	 tf15.setText("6 months");
        	 tf16.setText(s4);
        	 tf42.setText(s5);
                 tf43.setText(s6);
                 tf44.setText(s7);
                 tf17.setText(s8);
        
     	}
         if(ae.getSource()==jb2)
      	{
      		
      		Calendar c1=Calendar.getInstance();
     		SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
     		String s4=ff.format(c1.getTime());
     		c1.add(Calendar.DATE, 10);
     		SimpleDateFormat ff2=new SimpleDateFormat("dd/MM/yyyy");
     		String s5=ff2.format(c1.getTime());
                 c1.add(Calendar.DATE, 25);
    		SimpleDateFormat ff3=new SimpleDateFormat("dd/MM/yyyy");
    		String s6=ff3.format(c1.getTime());
                c1.add(Calendar.DATE, 25);
    		SimpleDateFormat ff4=new SimpleDateFormat("dd/MM/yyyy");
    		String s7=ff4.format(c1.getTime());
                c1.add(Calendar.DATE, 18);
    		SimpleDateFormat ff5=new SimpleDateFormat("dd/MM/yyyy");
    		String s8=ff5.format(c1.getTime());
     			
     	   	 tf18.setText("2000");
     	   	 tf15.setText("3 months");
     	   	tf16.setText(s4);
     		 tf42.setText(s5);
                 tf43.setText(s6);
                 tf44.setText(s7);
                 tf17.setText(s8);
      	}
         if(ae.getSource()==jb3)
       	{

     		Calendar c1;
                c1=Calendar.getInstance();
     		SimpleDateFormat ff;
                ff=new SimpleDateFormat("dd/MM/yyyy");
     		String s4;
                s4=ff.format(c1.getTime());
     		
                c1.add(Calendar.DATE, 10);
     		SimpleDateFormat ff2=new SimpleDateFormat("dd/MM/yyyy");
     		String s5=ff2.format(c1.getTime());
                 
                c1.add(Calendar.DATE, 35);
    		SimpleDateFormat ff3=new SimpleDateFormat("dd/MM/yyyy");
    		String s6=ff3.format(c1.getTime());
                
                c1.add(Calendar.DATE, 30);
    		SimpleDateFormat ff4=new SimpleDateFormat("dd/MM/yyyy");
    		String s7=ff4.format(c1.getTime());
                
                c1.add(Calendar.DATE, 21);
    		SimpleDateFormat ff5=new SimpleDateFormat("dd/MM/yyyy");
    		String s8=ff5.format(c1.getTime());
     	tf18.setText("5000");
     	 tf15.setText("4 months");
     	 tf16.setText(s4);
     	 tf42.setText(s5);
                 tf43.setText(s6);
                 tf44.setText(s7);
                 tf17.setText(s8);
       	}
         if(ae.getSource()==jb4)
       	{

     		Calendar c1=Calendar.getInstance();
     		SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
     		String s4=ff.format(c1.getTime());
     		c1.add(Calendar.DATE, 10);
     		SimpleDateFormat ff2=new SimpleDateFormat("dd/MM/yyyy");
     		String s5=ff2.format(c1.getTime());
                 c1.add(Calendar.DATE, 15);
    		SimpleDateFormat ff3=new SimpleDateFormat("dd/MM/yyyy");
    		String s6=ff3.format(c1.getTime());
                c1.add(Calendar.DATE, 15);
    		SimpleDateFormat ff4=new SimpleDateFormat("dd/MM/yyyy");
    		String s7=ff4.format(c1.getTime());
                c1.add(Calendar.DATE, 15);
    		SimpleDateFormat ff5=new SimpleDateFormat("dd/MM/yyyy");
    		String s8=ff5.format(c1.getTime());
     	tf18.setText("2000");
     	 tf15.setText("2 months");
     	 tf16.setText(s4);
     	  tf42.setText(s5);
                 tf43.setText(s6);
                 tf44.setText(s7);
                 tf17.setText(s8);
       	}
            
}
}


public class TutionReturns{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
second x=new second();
	x.aa();

	}

}
