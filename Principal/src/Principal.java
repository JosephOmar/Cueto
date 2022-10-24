import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import Package1.Alumno;
import Package1.ArrayAlumno;

public class Principal extends JApplet implements ActionListener,ItemListener {
	// Declaración de variables
	Font fuente1 = new Font("Times New Roman",1,25);
	Font fuente2 = new Font("Times New Roman",1,15);
	JButton btnBorrar, btnProcesar,btnIngresar,btnCancelar;
	JLabel lbl1,lblOpcion, lblCodigo, lblNombre, lblEdad, lblPrograma,lblCiclo,lblMensaje;
	JTextField txtCodigo,txtNombre,txtEdad,txtUsuario;
	JPasswordField txtClave;
	JComboBox cboOpcion,cboPrograma,cboCiclo;
	JTextArea txtSalida;
	JScrollPane scpScroll;
	JPanel pnlLogin,pnlMenu;
	String Mensaje="";
	
	ArrayAlumno aper = new ArrayAlumno();
	//--------------------------------------------------------------------------
	// Crea la interfaz gráfica de usuario	
	public void init() {
		setSize(1000,600);
		
		pnllogin();
	}
	
	public void pnllogin(){
		
		pnlLogin = new JPanel();
		pnlLogin.setSize(1000,600);
		pnlLogin.setLayout(null);
		pnlLogin.setVisible(true);
		pnlLogin.setBackground(new Color(28,230,221));
		add(pnlLogin);
		
		lbl1 = new JLabel("SISTEMA DE MATRICULA");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(250,60,500,30);
		lbl1.setFont(fuente1);
		pnlLogin.add(lbl1);
		
		lbl1 = new JLabel("I.E.S.T.P CARLOS CUETO FERNANDINI");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(250,100,500,30);
		lbl1.setFont(fuente1);
		pnlLogin.add(lbl1);
		
		lbl1 = new JLabel("Usuario");
		lbl1.setBounds(400,230,200,30);
		lbl1.setFont(fuente2);
		pnlLogin.add(lbl1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(400,260,200,30);
		txtUsuario.setFont(fuente2);
		pnlLogin.add(txtUsuario);
		
		lbl1 = new JLabel("Contraseña");
		lbl1.setBounds(400,300,200,30);
		lbl1.setFont(fuente2);
		pnlLogin.add(lbl1);
		
		txtClave = new JPasswordField();
		txtClave.setBounds(400,330,200,30);
		pnlLogin.add(txtClave);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(300,400,150,30);
		btnIngresar.setFont(fuente2);
		btnIngresar.addActionListener(this);
		pnlLogin.add(btnIngresar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(550,400,150,30);
		btnCancelar.setFont(fuente2);
		btnCancelar.addActionListener(this);
		pnlLogin.add(btnCancelar);
		
		getContentPane().add(pnlLogin);
	}
	
	public void pnlmenu(){
		
		pnlMenu = new JPanel();
		pnlMenu.setSize(1000,600);
		pnlMenu.setLayout(null);
		pnlMenu.setVisible(true);
		pnlMenu.setBackground(new Color(28,230,221));
		add(pnlMenu);
		
		lblOpcion=new JLabel("Opción");
		lblOpcion.setBounds(100,20,150,30);
		lblOpcion.setFont(fuente2);
		pnlMenu.add(lblOpcion);
		
		lblCodigo=new JLabel("Codigo");
		lblCodigo.setBounds(100,60,150,30);
		lblCodigo.setFont(fuente2);
		pnlMenu.add(lblCodigo);
		
		lblNombre=new JLabel("Nombre");
		lblNombre.setBounds(100,100,150,30);
		lblNombre.setFont(fuente2);
		pnlMenu.add(lblNombre);
		
		lblEdad=new JLabel("Edad");
		lblEdad.setBounds(100,140,150,30);
		lblEdad.setFont(fuente2);
		pnlMenu.add(lblEdad);
		
		lblPrograma=new JLabel("Programa");
		lblPrograma.setBounds(100,180,150,30);
		lblPrograma.setFont(fuente2);
		pnlMenu.add(lblPrograma);
		
		lblCiclo=new JLabel("Ciclo");
		lblCiclo.setBounds(100,220,150,30);
		lblCiclo.setFont(fuente2);
		pnlMenu.add(lblCiclo);
		
		cboOpcion=new JComboBox();
		cboOpcion.setBounds(250,20,220,30);
		cboOpcion.addItem("Ingresar");
		cboOpcion.addItem("Modificar");
		cboOpcion.addItem("Eliminar");
		cboOpcion.addItem("Buscar");
		cboOpcion.addItem("Listar");
		cboOpcion.addItemListener(this);
		pnlMenu.add(cboOpcion);
		
		txtCodigo=new JTextField();
		txtCodigo.setBounds(250,60,220,30);
		txtCodigo.setFont(fuente2);
		pnlMenu.add(txtCodigo);
		
		txtNombre=new JTextField();
		txtNombre.setBounds(250,100,220,30);
		txtNombre.setFont(fuente2);
		pnlMenu.add(txtNombre);
		
		txtEdad=new JTextField();
		txtEdad.setBounds(250,140,220,30);
		txtEdad.setFont(fuente2);
		pnlMenu.add(txtEdad);
		
		cboPrograma= new JComboBox();
		cboPrograma.setBounds(250,180,220,30);
		cboPrograma.setFont(fuente2);
		cboPrograma.addItem("Computación");
		cboPrograma.addItem("Contabilidad");
		cboPrograma.addItem("Electrónica");
		cboPrograma.addItem("Laboratorio");
		cboPrograma.addItem("Automotriz");
		cboPrograma.addItem("Producción");
		cboPrograma.addItem("Metalurgia");
		pnlMenu.add(cboPrograma);
		
		cboCiclo = new JComboBox();
		cboCiclo.setBounds(250,220,220,30);
		cboCiclo.setFont(fuente2);
		cboCiclo.addItem("I");
		cboCiclo.addItem("II");
		cboCiclo.addItem("III");
		cboCiclo.addItem("IV");
		cboCiclo.addItem("V");
		cboCiclo.addItem("VI");
		pnlMenu.add(cboCiclo);
		
		btnBorrar=new JButton("BORRAR");
		btnBorrar.setBounds(700,100,200,30);
		btnBorrar.setFont(fuente2);
		btnBorrar.addActionListener(this);
		pnlMenu.add(btnBorrar);
		
		btnProcesar=new JButton("PROCESAR");
		btnProcesar.setBounds(700,160,200,30);
		btnProcesar.setFont(fuente2);
		btnProcesar.addActionListener(this);
		pnlMenu.add(btnProcesar);
		
		txtSalida=new JTextArea();
		txtSalida.setFont(fuente2);
		txtSalida.setEditable(false);
		
		scpScroll=new JScrollPane(txtSalida);
		scpScroll.setBounds(50,260,900,330);
		pnlMenu.add(scpScroll);
		
		getContentPane().add(pnlMenu);
	}
	//--------------------------------------------------------------------------
	// Procesa eventos de tipo ActionEvent
	public void actionPerformed( ActionEvent e ){
		//Boton para acceder a Panel Menu
		if(e.getSource()==btnIngresar){
			Ingresar();
		}
		//Boton para limpiar Usuarios Ingresados
		if(e.getSource()==btnCancelar){
			txtUsuario.setText("");
			txtClave.setText("");
		}
		if(e.getSource()==btnProcesar){
			procesar();
			JOptionPane.showMessageDialog(null,Mensaje);
		}
		if(e.getSource()==btnBorrar){
		borrar();
		}
	}
	public void Ingresar(){
			String Usuario= txtUsuario.getText();
			String Clave= txtClave.getText();
			if(Usuario.equals("ADMINISTRADOR") && Clave.equals("MATRICULA")){
				pnlLogin.setVisible(false);
				pnlmenu();
				pnlMenu.setVisible(true);
			}else{
				JOptionPane.showMessageDialog(null,"USUARIO ERRONEO");
				txtUsuario.setText("");
				txtClave.setText("");
			}
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()== cboOpcion)
		seleccionar();
	}
	void seleccionar(){
		switch(cboOpcion.getSelectedIndex()){
			case 0:
			lblCodigo.setVisible(true);
			txtCodigo.setVisible(true);
			lblNombre.setVisible(true);
			txtNombre.setVisible(true);
			lblEdad.setVisible(true);
			txtEdad.setVisible(true);
			lblPrograma.setVisible(true);
			cboPrograma.setVisible(true);
			lblCiclo.setVisible(true);
			cboCiclo.setVisible(true);
			break;
			case 1:
			case 2:
			case 3:
			lblCodigo.setVisible(true);
			txtCodigo.setVisible(true);
			lblNombre.setVisible(false);
			txtNombre.setVisible(false);
			lblEdad.setVisible(false);
			txtEdad.setVisible(false);
			lblPrograma.setVisible(false);
			cboPrograma.setVisible(false);
			lblCiclo.setVisible(false);
			cboCiclo.setVisible(false);
			break;
			case 4:
			lblCodigo.setVisible(false);
			txtCodigo.setVisible(false);
			lblNombre.setVisible(false);
			txtNombre.setVisible(false);
			lblEdad.setVisible(false);
			txtEdad.setVisible(false);
			lblPrograma.setVisible(false);
			cboPrograma.setVisible(false);
			lblCiclo.setVisible(false);
			cboCiclo.setVisible(false);
		}
	}
	void borrar(){
		txtCodigo.setText("");
		txtNombre.setText("");
		txtEdad.setText("");
		txtCodigo.requestFocus();
	}
	void procesar(){
		switch(cboOpcion.getSelectedIndex()){
			case 0:
				ingresar();
				borrar();
				break;
			case 1:
				modificar();
				borrar();
				break;
			case 2:
				eliminar();
				borrar();
				break;
			case 3:
				buscar();
				borrar();
				break;
			case 4:
				Mensaje = "LISTA DE ALUMNOS";
				listar();
				borrar();
				break;
		}
	}
	int getCodigo(){
		return Integer.parseInt(txtCodigo.getText());
	}
	String getNombre(){
		return txtNombre.getText();
	}
	int getEdad(){
		return Integer.parseInt(txtEdad.getText());
	}
	String getPrograma(){
		return (String)cboPrograma.getSelectedItem();
	}
	String getCiclo(){
		return (String)cboCiclo.getSelectedItem();
	}
	
	void imprimir(){
		txtSalida.setText("");
	}
	void imprimir(String s){
		txtSalida.append(s+"\n");
	}

	void listar(){
		imprimir();
		txtSalida.append("Codigo\tNombre\tEdad\tPrograma\t\tCiclo\n");	
		for(int i=0;i<aper.tamaño();i++){
			Alumno x = aper.obtener(i);
			txtSalida.append(x.getCodigo()+"\t"+x.getNombre()+"\t"+x.getEdad()+"\t"+x.getPrograma()+"\t\t"+x.getCiclo()+"\n");
		}
	}
	void ingresar(){
		if(aper.buscar(getCodigo()) == -1){
			Alumno x = new Alumno(getCodigo(),getNombre(),getEdad(),getPrograma(),getCiclo());
			aper.adicionar(x);
			Mensaje="ALUMNO AGREGADO";
			listar();
		}else{
			Mensaje="ALUMNO YA REGISTRADO";
		}
	}
	void modificar(){
		buscar();
		if(aper.buscar(getCodigo()) != -1){
			txtCodigo.setEditable(false);
			lblNombre.setVisible(true);
			txtNombre.setVisible(true);
			lblEdad.setVisible(true);
			txtEdad.setVisible(true);
			lblPrograma.setVisible(true);
			cboPrograma.setVisible(true);
			lblCiclo.setVisible(true);
			cboCiclo.setVisible(true);
			
			Alumno x = aper.obtener(aper.buscar(getCodigo()));
			x = new Alumno(getCodigo(),getNombre(),getEdad(),getPrograma(),getCiclo());
			aper.adicionar(x);
			txtSalida.setText("Codigo\tNombre\tEdad\tPrograma\t\tCiclo\n");	
			txtSalida.append(x.getCodigo()+"\t"+x.getNombre()+"\t"+x.getEdad()+"\t"+x.getPrograma()+"\t\t"+x.getCiclo());
			eliminar();
			Mensaje = "DATOS CAMBIADOS";
		}
		txtCodigo.setEditable(true);
	}
	void buscar(){
		if(aper.buscar(getCodigo()) == -1){
			Mensaje = "ALUMNO NO ENCONTRADO";
		}else{
			Alumno x = aper.obtener(aper.buscar(getCodigo()));
			Mensaje = "ALUMNO ENCONTRADO";
			txtSalida.setText("Codigo\tNombre\tEdad\tPrograma\t\tCiclo\n");	
			txtSalida.append(x.getCodigo()+"\t"+x.getNombre()+"\t"+x.getEdad()+"\t"+x.getPrograma()+"\t\t"+x.getCiclo());
		}
	}
	void eliminar(){
		int i = aper.buscar(getCodigo());
		aper.eliminar(i);
		Mensaje = "ALUMNO RETIRADO DE LISTA - ACTUALIZAR";
	}
}
