import java.applet.Applet;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This will act as the front end for the server
 * @author Sanat Moningi
 * VIP Collaborative Workforce
 *
 */

public class ServerApplet extends Applet implements ActionListener {
	//Instance Variables
	Label portLabel, sampleLabel, pointsLabel, fftLabel, amplitudeLabel, weightLabel;
	TextField portField, sampleField, pointsField, fftField, amplitudeField, weightField;
	Button submitButton = new Button("Submit");
	
	public ServerApplet() throws HeadlessException{	
		this.setLayout(new GridLayout(7,2,20,30));
		
		portLabel = new Label("Port Number");
		this.add(portLabel);
		portField = new TextField();
		this.add(portField);
		
		sampleLabel = new Label("Recording Sample Rate");
		this.add(sampleLabel);
		sampleField = new TextField();
		this.add(sampleField);
		
		pointsLabel = new Label("Number of points per FFT");
		this.add(pointsLabel);
		pointsField = new TextField();
		this.add(pointsField);
		
		fftLabel = new Label("Number of FFT's per second");
		this.add(fftLabel);
		fftField = new TextField();
		this.add(fftField);
		
		amplitudeLabel = new Label("Target FFT Amplitude (0-1)");
		this.add(amplitudeLabel);
		amplitudeField = new TextField();
		this.add(amplitudeField);
		
		weightLabel = new Label("Weight of Previous AGC input (0-1)");
		this.add(weightLabel);
		weightField = new TextField();
		this.add(weightField);
		
		submitButton.addActionListener(this);
		this.add(submitButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
