package main;

import javax.swing.JFrame;

import main.mainContainer.MainPanel;
import oneteampos.login.components.LoginJPanel;
import oneteampos.login.components.LoginStaffIDJLabel;
import oneteampos.login.components.LoginStaffNameJLabel;

public class MainFrame extends JFrame {
	
	public final static int FRAME_WIDTH = 1280;
	public final static int FRAME_HEIGHT = 720;
	
	private MainPanel mainPanel;
	private LoginStaffIDJLabel loginStfIdLabel;
	private LoginStaffNameJLabel loginStfNameLabel;
	
	public MainFrame() {
		this.mainPanel = new MainPanel(this);
		this.loginStfIdLabel = new LoginStaffIDJLabel(this);
		this.loginStfNameLabel = new LoginStaffNameJLabel(this);
//		add(mainPanel.getCardPanel());
		settings();
	}

	private void settings() {
		setTitle("팀 프로젝트 테스트");
		setVisible(true);
		setResizable(false);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MainPanel getMainPanel() {
		return this.mainPanel;
	}
	
	public LoginStaffIDJLabel getLoginStaffIDJLabel() {
		return this.loginStfIdLabel;
	}
	
	public LoginStaffNameJLabel getStaffNameJLabel() {
		return this.loginStfNameLabel;
	}
	
	public static void main(String[] args) {
		MainFrame mframe = new MainFrame();
		new LoginJPanel(mframe);
	}
}
