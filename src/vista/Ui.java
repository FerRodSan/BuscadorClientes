package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ui extends JFrame {

	private JPanel cardPane;
	private UiBuscar uiBuscar = new UiBuscar();
	private UiCrear uiCrear = new UiCrear();

	/**
	 * Create the frame.
	 */
	public Ui() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 342);
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Opciones");
		menuBar.add(mnMenu);

		cardPane = new JPanel();
		cardPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cardPane);
		cardPane.setLayout(new CardLayout(0, 0));

		GridBagLayout gridBagLayout = (GridBagLayout) uiCrear.getLayout();
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 24, 0, 0, 0 };
		cardPane.add(uiCrear, "c");

		GridBagLayout gbl_uiBuscar = new GridBagLayout();
		gbl_uiBuscar.columnWidths = new int[] { 0 };
		gbl_uiBuscar.rowHeights = new int[] { 0 };
		gbl_uiBuscar.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_uiBuscar.rowWeights = new double[] { Double.MIN_VALUE };
		cardPane.add(uiBuscar, "b");

		CardLayout layout = (CardLayout) cardPane.getLayout();
		layout.show(cardPane, "c");

		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(cardPane, "b");
			}
		});
		mnMenu.add(mntmBuscar);

		JMenuItem mntmCrear = new JMenuItem("Crear");
		mntmCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(cardPane, "c");
			}
		});
		mnMenu.add(mntmCrear);
	}
	
	public JButton getBotoncitoBuscar() {
		return uiBuscar.getBtnBuscar();
	}
	
	public JButton getBotoncitoCrear() {
		return uiCrear.getBtnCrear();
	}
	
	public JTextField getTxtMensajitoBuscar() {
		return uiBuscar.getTxtMensajeBuscar();
	}
	public JTextField getTxtMensajitoCrear() {
		return uiCrear.getTxtMensajeCrear();
	}

	public JComboBox getComboClientes() {
		return uiBuscar.getComboBox();
	}
	
	public JTextField getNombreUsuario() {
		return uiCrear.getTxtNombre();
	}

	public JTextField getApellidoUsuario() {
		return uiCrear.getTxtApellidos();
	}
	
	public JTextField getBuscar() {
		return uiBuscar.getTxtBuscar();
	}
}
