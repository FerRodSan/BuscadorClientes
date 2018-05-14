package modelo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.print.attribute.standard.Sides;

import control.ParaUi;

public class GestorCliente {

	private ParaUi paraui;
	private String ruta;
	private File file;
	private FileOutputStream flujoW;
	private FileInputStream flujoR;
	private ObjectInputStream adaptadorR;
	private ObjectOutputStream adaptadorW;

	public GestorCliente(String ruta) {
		super();
		this.ruta = ruta;
		this.file = new File(ruta);

	}

	public boolean almacena(Object obj) {
		boolean retorno = false;
		boolean existe = file.exists();
		try {
			flujoW = new FileOutputStream(file, true);
			if (!existe) {
				adaptadorW = new ObjectOutputStream(flujoW);
			}else{
				adaptadorW = new MyObjectOutputStream(flujoW);
			}
			adaptadorW.writeObject(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			adaptadorW.close();
			flujoW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}

	public Object recuperar(int posicion) {
		Object obj = null;
		try {
			flujoR = new FileInputStream(file);
			adaptadorR = new ObjectInputStream(flujoR);
			for (int i = 0; i < posicion; i++) {
				obj = adaptadorR.readObject();
			}
			obj = adaptadorR.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			adaptadorR.close();
			flujoR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
