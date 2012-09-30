package edu.wpi.cs.wpisuitetng.janeway.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;
import edu.wpi.cs.wpisuitetng.janeway.models.IJanewayModule;

/**
 * The main application window for the Janeway client
 *
 */
@SuppressWarnings("serial")
public class JanewayFrame extends JFrame {
	
	/** A panel to contain the ribbon */
	protected RibbonPanel ribbonPanel;
	
	/**
	 * Construct a new JanewayFrame
	 */
	public JanewayFrame(List<IJanewayModule> modules) {
		// Set window properties
		setTitle("Janeway - WPI Suite Desktop Client");
		setMinimumSize(new Dimension(800, 600)); // minimum window size is 800 x 600
		setSize(1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Setup the layout manager
		this.setLayout(new BorderLayout());
		
		// Add the ribbon tab panel
		ribbonPanel = new RibbonPanel(modules);
		//ribbonPanel.setPreferredSize(new Dimension(JanewayFrame.WIDTH, 100));
		this.add(ribbonPanel, BorderLayout.CENTER);		
	}
}
