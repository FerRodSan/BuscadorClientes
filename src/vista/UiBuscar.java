package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UiBuscar extends JPanel {
	private JComboBox comboBox;
	private JTextField txtBuscar;
	private JTextField txtMensajeBuscar;
	private JButton btnBuscar;

	/**
	 * Create the panel.
	 */
	public UiBuscar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblBuscarCliente = new JLabel("Buscar Cliente");
		lblBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarCliente.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblBuscarCliente.setFont(new Font("Papyrus", Font.BOLD, 25));
		GridBagConstraints gbc_lblBuscarCliente = new GridBagConstraints();
		gbc_lblBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_lblBuscarCliente.gridwidth = 3;
		gbc_lblBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarCliente.gridx = 1;
		gbc_lblBuscarCliente.gridy = 1;
		add(lblBuscarCliente, gbc_lblBuscarCliente);

		JLabel lblEligeCliente = new JLabel("Elige Cliente :");
		GridBagConstraints gbc_lblEligeCliente = new GridBagConstraints();
		gbc_lblEligeCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblEligeCliente.gridx = 1;
		gbc_lblEligeCliente.gridy = 3;
		add(lblEligeCliente, gbc_lblEligeCliente);

		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);

		btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 3;
		gbc_btnBuscar.gridy = 4;
		add(btnBuscar, gbc_btnBuscar);

		JLabel lblApellidos = new JLabel("Apellidos :");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 5;
		add(lblApellidos, gbc_lblApellidos);

		txtBuscar = new JTextField();
		txtBuscar.setBackground(Color.BLACK);
		txtBuscar.setEnabled(false);
		GridBagConstraints gbc_txtBuscar = new GridBagConstraints();
		gbc_txtBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscar.gridx = 3;
		gbc_txtBuscar.gridy = 5;
		add(txtBuscar, gbc_txtBuscar);
		txtBuscar.setColumns(10);

		JLabel lblMensaje = new JLabel("Mensaje :");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 7;
		add(lblMensaje, gbc_lblMensaje);

		txtMensajeBuscar = new JTextField();
		txtMensajeBuscar.setBackground(Color.BLACK);
		txtMensajeBuscar.setEnabled(false);
		txtMensajeBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtMensajeBuscar = new GridBagConstraints();
		gbc_txtMensajeBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensajeBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensajeBuscar.gridx = 3;
		gbc_txtMensajeBuscar.gridy = 7;
		add(txtMensajeBuscar, gbc_txtMensajeBuscar);
		txtMensajeBuscar.setColumns(10);

	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JTextField getTxtBuscar() {
		return txtBuscar;
	}

	public JTextField getTxtMensajeBuscar() {
		return txtMensajeBuscar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

}
