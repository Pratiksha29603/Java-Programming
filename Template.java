// Template.java


import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


class ClockLabel extends JLabel implements ActionListener
{
	String type;
	SimpleDateFormat sdf;
	
	public ClockLabel(String type)
	{
		this.type=type;
		setForeground(Color.green);
		
		switch(type)
		{
			case "date" :sdf=new SimpleDateFormat("MMMM dd yyyy");
			setFont(new Font("sans-serif", Font.PLAIN,12));
			setHorizontalAlignment(SwingConstant.LEFT);
			break;
			
			case "time" :sdf=new SimpleDateFormat("hh:mm:ss a");
			setFont(new Font("sans-serif", Font.PLAIN,40));
			setHorizontalAlignment(SwingConstant.CENTER);
			break;
			
			case "day" :sdf=new SimpleDateFormat("EEEE");
			setFont(new Font("sans-serif", Font.PLAIN,16));
			setHorizontalAlignment(SwingConstant.RIGHT);
			break;
			
			default: sdf=new SimpleDateFormat();
			break;
			
		}
		
		Timer t=new Timer(1000,this);
		t.start();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Date d=new Date();
		setText(sdf.format(d));
	}
}


class Template extends JFrame implements Serializable, ActionListener
{
	JPanel _header;
	JPanel _content;
	JPanel _top;
	
	ClockLabel dayLabel;
	ClockLabel timeLabel;
	ClockLabel dateLabel;
	
	JButton minimize, exit;
	
	public Template()
	{
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		GridBagLayout grid=new GridBagLayout();
		setLayout(grid);
		
		_top=new JPanel();
		_top.setBackground(Color.LIGHT_GRAY);
		
		_top.setLayout(null);
		
		getContentPane().add(_top,new GridBagConstraints(0,0,1,1,1,5,GridBagConstraints.BASELINE,GridBagConstraints.BOTH, new Insets(0,0,0,0,),0,0));
		
		_header=new JPanel();
		_header.setLayout(null);
		
		_header.setBackground(Color.white);
		getContentPane().add(_header,new GridBagConstraints(0,1,1,1,1,20,GridBagConstraints.BASELINE,GridBagConstraints.BOTH, new Insets(0,0,0,0,),0,0));
		
		_content=new JPanel();
		_content.setLayout(null);
		_content.setBackground(new Color(0,50,120));
		
		
	}
	

}















