package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;

public class Crear implements ActionListener {

	private ParaUi paraui;

	public Crear(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraui.addCliente();
	}

}
