package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame{

	 private JPanel colorPanel;
	    private JSlider redSlider, greenSlider, blueSlider;

	    public Slider() {
	        setTitle("Color Slider App");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);
	        initComponents();
	    }
	    

	    class ColorChangeListener implements ChangeListener {
	        public void stateChanged1(ChangeEvent e) {
	            int redValue = redSlider.getValue();
	            int greenValue = greenSlider.getValue();
	            int blueValue = blueSlider.getValue();

	            Color newColor = new Color(redValue, greenValue, blueValue);
	            colorPanel.setBackground(newColor);
	        }

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				
			}
	    }

	    private void initComponents() {
	        colorPanel = new JPanel();
	        redSlider = new JSlider(0, 255, 0);
	        greenSlider = new JSlider(0, 255, 0);
	        blueSlider = new JSlider(0, 255, 0);

	        colorPanel.setPreferredSize(new Dimension(300, 200));
	        colorPanel.setBackground(Color.BLACK);

	        redSlider.setOrientation(JSlider.VERTICAL);
	        greenSlider.setOrientation(JSlider.VERTICAL);
	        blueSlider.setOrientation(JSlider.VERTICAL);

	        redSlider.addChangeListener(new ColorChangeListener());
	        greenSlider.addChangeListener(new ColorChangeListener());
	        blueSlider.addChangeListener(new ColorChangeListener());

	        JPanel controlPanel = new JPanel(new GridLayout(1, 3, 10, 10));
	        controlPanel.add(redSlider);
	        controlPanel.add(greenSlider);
	        controlPanel.add(blueSlider);

	        getContentPane().setLayout(new BorderLayout());
	        getContentPane().add(colorPanel, BorderLayout.CENTER);
	        getContentPane().add(controlPanel, BorderLayout.EAST);
	    }

}
