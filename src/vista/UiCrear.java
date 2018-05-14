package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class UiCrear extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JButton btnCrear;
	private JTextField txtMensajeCrear;

	/**
	 * Create the panel.
	 */
	public UiCrear() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblDarDeAlta = new JLabel("Crear Cliente");
		lblDarDeAlta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDarDeAlta.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblDarDeAlta.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		GridBagConstraints gbc_lblDarDeAlta = new GridBagConstraints();
		gbc_lblDarDeAlta.fill = GridBagConstraints.BOTH;
		gbc_lblDarDeAlta.gridwidth = 3;
		gbc_lblDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDarDeAlta.gridx = 1;
		gbc_lblDarDeAlta.gridy = 1;
		add(lblDarDeAlta, gbc_lblDarDeAlta);

		JLabel lblNombre = new JLabel("Nombre :");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos : ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 5;
		add(lblApellidos, gbc_lblApellidos);

		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 2;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 2;
		gbc_txtApellidos.gridy = 5;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);

		btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.gridwidth = 3;
		gbc_btnCrear.fill = GridBagConstraints.BOTH;
		gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrear.gridx = 1;
		gbc_btnCrear.gridy = 7;
		add(btnCrear, gbc_btnCrear);

		JLabel lblMensaje = new JLabel("Mensaje :");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 8;
		add(lblMensaje, gbc_lblMensaje);

		txtMensajeCrear = new JTextField();
		txtMensajeCrear.setBackground(Color.BLACK);
		txtMensajeCrear.setEnabled(false);
		GridBagConstraints gbc_txtMensajeCrear = new GridBagConstraints();
		gbc_txtMensajeCrear.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensajeCrear.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensajeCrear.gridx = 3;
		gbc_txtMensajeCrear.gridy = 8;
		add(txtMensajeCrear, gbc_txtMensajeCrear);
		txtMensajeCrear.setColumns(10);

	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellidos() {
		return txtApellidos;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public JTextField getTxtMensajeCrear() {
		return txtMensajeCrear;
	}

}
