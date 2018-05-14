package control;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import acciones.Buscar;
import acciones.Crear;
import modelo.GestorCliente;
import modelo.Cliente;
import vista.Ui;

public class ParaUi extends Ui {

	private GestorCliente gestorCliente;
	private Buscar buscar;
	private Crear crear;

	public ParaUi() {
		super();
		this.gestorCliente = new GestorCliente("src/Archivo/listaClientes.txt");
		this.buscar = new Buscar(this);
		this.crear = new Crear(this);
		asignarListener();
		actualizarVista();
	}

	public void asignarListener() {
		this.getBotoncitoCrear().addActionListener(this.crear);
		this.getBotoncitoBuscar().addActionListener(this.buscar);
	}

	public void actualizarVista() {
		this.getNombreUsuario().setText("");
		this.getApellidoUsuario().setText("");
		this.getTxtMensajitoCrear().setText("");
	}

	public GestorCliente getGestorCliente() {
		return gestorCliente;
	}

	public void agregarClienteCombo(Cliente cliente) {
		this.getComboClientes().addItem(cliente.getNombre());
	}

	public boolean comprobarVacios() {
		if (this.getNombreUsuario().getText().isEmpty() || this.getApellidoUsuario().getText().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void addCliente() {
		if (!comprobarVacios()) {
			Cliente cliente = new Cliente(this.getNombreUsuario().getText(), this.getApellidoUsuario().getText());
			this.gestorCliente.almacena(cliente);
			agregarClienteCombo(cliente);
			actualizarVista();
			addMensaje("cliente creado");
		} else {
			actualizarVista();
			addMensaje("campos vacios");
		}
	}

	private void addMensaje(String mensaje) {
		this.getTxtMensajitoCrear().setText(mensaje);
	}

	public void buscarCliente() {
		Cliente cliente=(Cliente) this.gestorCliente.recuperar(this.getComboClientes().getSelectedIndex());
		buscarApellido(cliente);
	}

	public void buscarApellido(Cliente cliente) {
		this.getBuscar().setText(cliente.getApellido());
		addMensajeBuscar("Cliente encontrado");
	}

	private void addMensajeBuscar(String string) {
		this.getTxtMensajitoBuscar().setText(string);
	}

}
