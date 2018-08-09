

package proyecto;

import com.sun.javafx.font.Glyph;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import sun.invoke.empty.Empty;

/**
 *
 * @author toshiba
 */
public class SeleccionJugador extends javax.swing.JFrame {

    /**
     * Creates new form RegistroJugador
     */
    ArrayList<Personajes> ListaPersonajes = new ArrayList<Personajes>();
    
    ArrayList<Object> jugador=new ArrayList<>();
    int cont=0;
    int victorias=0;
    
    ArrayList ListaJugadas = new ArrayList ();
    ArrayList Estadisticas = new ArrayList ();
    ClsControlador controller =new ClsControlador();

    DefaultComboBoxModel listaJugadoresModel = 
            new DefaultComboBoxModel(jugador.toArray());
    
   String[] personajes = new String[]{"Neptuno","Fire","Lodo","Avatar"};
    DefaultComboBoxModel combopersonajes= new DefaultComboBoxModel(personajes);
    ///////////
    
    boolean activarjugador1=false;
    boolean activarjugador2=false;
    
     ////////////////////pantalla Batalla//////////////
    boolean repetircancion = true; 
    
    int vida1;
    int estamina1;
    int ataque1;
    int ataquefinal1;
    boolean defensa1;
    int curar1;
    int vida2;
    int estamina2;
    int ataque2;
    int ataquefinal2;
    boolean defensa2;
    int curacion2;
    int perso1,perso2;
    boolean defensaactiva1 = false;
    boolean defensaactiva2 = false;
    int contdefensa1=0;
    int contdefensa2=0;
    
    
       
        Personajes personajeagua = new Personajes (700,600,100,210);
        Personajes personajefuego = new Personajes (700,500,110,230);
        Personajes personajetierra = new Personajes (700,700,95,156);
        Personajes personajeaire = new Personajes (700,400,140,200);
    
    public SeleccionJugador() {
        initComponents();
        AreaJugadas.setText("");
        AreaJugadas.setEnabled(false);
        txtEstadisticas.setText("");
        txtEstadisticas.setEnabled(false);
        
        cmbPersonajes.setModel(combopersonajes);
        
        jugador=controller.extraerObjetos("jugadores.dat");
     
        llenarCombo();
        llenarTabla();
     
        ListaPersonajes.add(personajeagua);
        ListaPersonajes.add(personajefuego);
        ListaPersonajes.add(personajetierra);
        ListaPersonajes.add(personajeaire);
        
     if(jugador.size() > 0){
            ClsJugador ultimo = (ClsJugador) jugador.get(jugador.size()-1);
            cont=ultimo.getId();
        }
     //para los botononbes de eliminar y editar esten desabilidatos
        //el lapiz actualiza o edita la lista
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
      
        ///////////// desabilitado de los botones de batalla////
        txtVida1.setEnabled(false);
        txtVida2.setEnabled(false);
        txtEstamina1.setEnabled(false);
        txtEstamina2.setEnabled(false);      
        btnAtaque1.setEnabled(true);
        btnAtaqueFinal1.setEnabled(false);
        btnDefenza1.setEnabled(false);
        btnCurar1.setEnabled(false);
        
         btnEmpezar.setEnabled(false);
                  
       
    }

    public void llenarCombo(){
       if(jugador.size() > 0){
            cmbJugadores.setEnabled(true);
            
            jugador = controller.extraerObjetos("jugadores.dat");
            cmbJugadores.setModel(new javax.swing.DefaultComboBoxModel(jugador.toArray()));
            cmbJugador1.setModel(new javax.swing.DefaultComboBoxModel(jugador.toArray()));
            cmbJugador2.setModel(new javax.swing.DefaultComboBoxModel(jugador.toArray()));
        }else{
            cmbJugadores.setEnabled(false);
            
        }         
    }
    
    
    
    public void llenarTabla(){
        
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String usuario=txtUsuario.getText();
        String cedula=txtCedula.getText();

       if(jugador.size() > 0){         
            ClsJugador est=new ClsJugador(cont,nombre,apellido,cedula,usuario,victorias);
            DefaultTableModel model = (DefaultTableModel) tblRegistros.getModel();
            for(int i = 0; i < jugador.size(); i ++){
                est = (ClsJugador) jugador.get(i);
                Object jugadorG [] = {est.getId(),est.getNombre(),est.getApellido(),est.getCedula(),est.getUsuario()};
                model.insertRow(i, jugadorG);
            }
        }     
       
    }
    
     public void limpiar(){
         
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtUsuario.setText(null);
        
        btnGuardar.setEnabled(true);
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroJugador = new javax.swing.JFrame();
        cmbJugadores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        btnSeleccionPersonaje = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        PantallaCargar = new javax.swing.JFrame();
        btnJugar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PantallaBatalla = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNombreJugador1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtVida1 = new javax.swing.JTextField();
        txtEstamina1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblNombreJugador2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtVida2 = new javax.swing.JTextField();
        txtEstamina2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAtaque1 = new javax.swing.JButton();
        btnDefenza1 = new javax.swing.JButton();
        btnAtaqueFinal1 = new javax.swing.JButton();
        btnCurar1 = new javax.swing.JButton();
        btnAtaque2 = new javax.swing.JButton();
        btnAtaqueFinal2 = new javax.swing.JButton();
        btnDefenza2 = new javax.swing.JButton();
        btnCurar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaJugadas = new javax.swing.JTextArea();
        lblLuchador1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLuchador2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        EstadisticasJugadores = new javax.swing.JFrame();
        btnSalir = new javax.swing.JButton();
        btnVolverSeleccion = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEstadisticas = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblTituloPersonajes = new javax.swing.JLabel();
        cmbJugador1 = new javax.swing.JComboBox<>();
        cmbJugador2 = new javax.swing.JComboBox<>();
        btnRegistrarJugador = new javax.swing.JButton();
        cmbPersonajes = new javax.swing.JComboBox<>();
        lblPersonaje1 = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        lblPersonaje3 = new javax.swing.JLabel();
        btnSelectJugador1 = new javax.swing.JButton();
        bntSelectJugador2 = new javax.swing.JButton();
        lblPersonaje2 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblPerso1 = new javax.swing.JLabel();
        lblPerso2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        RegistroJugador.setMinimumSize(new java.awt.Dimension(597, 510));
        RegistroJugador.getContentPane().setLayout(null);

        cmbJugadores.setBackground(new java.awt.Color(102, 255, 255));
        cmbJugadores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbJugadores.setForeground(new java.awt.Color(255, 255, 255));
        cmbJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugadoresActionPerformed(evt);
            }
        });
        RegistroJugador.getContentPane().add(cmbJugadores);
        cmbJugadores.setBounds(159, 42, 255, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        RegistroJugador.getContentPane().add(jLabel4);
        jLabel4.setBounds(135, 93, 60, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");
        RegistroJugador.getContentPane().add(jLabel5);
        jLabel5.setBounds(135, 131, 60, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cedula");
        RegistroJugador.getContentPane().add(jLabel6);
        jLabel6.setBounds(135, 169, 60, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario");
        RegistroJugador.getContentPane().add(jLabel7);
        jLabel7.setBounds(135, 210, 60, 14);

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        RegistroJugador.getContentPane().add(txtNombre);
        txtNombre.setBounds(205, 80, 183, 30);

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        txtApellido.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        RegistroJugador.getContentPane().add(txtApellido);
        txtApellido.setBounds(205, 118, 183, 30);

        txtCedula.setBackground(new java.awt.Color(0, 0, 0));
        txtCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedula.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCedula.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        RegistroJugador.getContentPane().add(txtCedula);
        txtCedula.setBounds(205, 156, 183, 30);

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        RegistroJugador.getContentPane().add(txtUsuario);
        txtUsuario.setBounds(205, 197, 183, 30);

        btnGuardar.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        RegistroJugador.getContentPane().add(btnGuardar);
        btnGuardar.setBounds(460, 120, 100, 40);

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        RegistroJugador.getContentPane().add(btnEliminar);
        btnEliminar.setBounds(460, 190, 100, 43);

        btnModificar.setBackground(new java.awt.Color(255, 255, 51));
        btnModificar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        RegistroJugador.getContentPane().add(btnModificar);
        btnModificar.setBounds(460, 50, 100, 45);

        tblRegistros.setBackground(new java.awt.Color(0, 0, 0));
        tblRegistros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblRegistros.setForeground(new java.awt.Color(255, 255, 255));
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id:", "Nombre:", "Apellido:", "Cedula:", "Usuario:", "Victorias:"
            }
        ));
        tblRegistros.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setHeaderValue("id:");
            tblRegistros.getColumnModel().getColumn(1).setHeaderValue("Nombre:");
            tblRegistros.getColumnModel().getColumn(2).setHeaderValue("Apellido:");
            tblRegistros.getColumnModel().getColumn(3).setHeaderValue("Cedula:");
            tblRegistros.getColumnModel().getColumn(4).setHeaderValue("Usuario:");
            tblRegistros.getColumnModel().getColumn(5).setHeaderValue("Victorias:");
        }

        RegistroJugador.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 270, 511, 120);

        btnSeleccionPersonaje.setBackground(new java.awt.Color(51, 204, 255));
        btnSeleccionPersonaje.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        btnSeleccionPersonaje.setText("Ir a la Selección de Personaje");
        btnSeleccionPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionPersonajeActionPerformed(evt);
            }
        });
        RegistroJugador.getContentPane().add(btnSeleccionPersonaje);
        btnSeleccionPersonaje.setBounds(160, 420, 310, 50);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.jpg"))); // NOI18N
        RegistroJugador.getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 590, 490);

        PantallaCargar.getContentPane().setLayout(null);

        btnJugar.setBackground(new java.awt.Color(255, 102, 153));
        btnJugar.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        PantallaCargar.getContentPane().add(btnJugar);
        btnJugar.setBounds(170, 240, 150, 33);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando.gif"))); // NOI18N
        PantallaCargar.getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 490, 290);

        PantallaBatalla.setMinimumSize(new java.awt.Dimension(773, 821));
        PantallaBatalla.getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelFondo.setBackground(new java.awt.Color(153, 255, 153));
        panelFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFondo.setMaximumSize(new java.awt.Dimension(100, 100));
        panelFondo.setPreferredSize(new java.awt.Dimension(600, 600));
        panelFondo.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombreJugador1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblNombreJugador1.setText("Name");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Vida:");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("Estamina:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstamina1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVida1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstamina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel4);
        jPanel4.setBounds(12, 25, 252, 151);

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombreJugador2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblNombreJugador2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("Vida:");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("Estamina: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstamina2)
                    .addComponent(txtVida2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addComponent(txtVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstamina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel5);
        jPanel5.setBounds(489, 216, 236, 142);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        btnAtaque1.setBackground(new java.awt.Color(255, 102, 102));
        btnAtaque1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnAtaque1.setText("Ataque");
        btnAtaque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque1ActionPerformed(evt);
            }
        });

        btnDefenza1.setBackground(new java.awt.Color(255, 102, 102));
        btnDefenza1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnDefenza1.setText("Defenza");
        btnDefenza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenza1ActionPerformed(evt);
            }
        });

        btnAtaqueFinal1.setBackground(new java.awt.Color(255, 102, 102));
        btnAtaqueFinal1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnAtaqueFinal1.setText("Ataque Final");
        btnAtaqueFinal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueFinal1ActionPerformed(evt);
            }
        });

        btnCurar1.setBackground(new java.awt.Color(255, 102, 102));
        btnCurar1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnCurar1.setText("Curar");
        btnCurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurar1ActionPerformed(evt);
            }
        });

        btnAtaque2.setBackground(new java.awt.Color(102, 153, 0));
        btnAtaque2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnAtaque2.setText("Ataque");
        btnAtaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque2ActionPerformed(evt);
            }
        });

        btnAtaqueFinal2.setBackground(new java.awt.Color(102, 153, 0));
        btnAtaqueFinal2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnAtaqueFinal2.setText("Ataque Final");
        btnAtaqueFinal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueFinal2ActionPerformed(evt);
            }
        });

        btnDefenza2.setBackground(new java.awt.Color(102, 153, 0));
        btnDefenza2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnDefenza2.setText("Defenza");
        btnDefenza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenza2ActionPerformed(evt);
            }
        });

        btnCurar2.setBackground(new java.awt.Color(102, 153, 0));
        btnCurar2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnCurar2.setText("Curar");
        btnCurar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurar2ActionPerformed(evt);
            }
        });

        AreaJugadas.setColumns(20);
        AreaJugadas.setRows(5);
        jScrollPane2.setViewportView(AreaJugadas);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtaque1)
                            .addComponent(btnDefenza1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtaqueFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCurar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtaque2)
                            .addComponent(btnDefenza2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtaqueFinal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCurar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtaque1)
                    .addComponent(btnAtaqueFinal1)
                    .addComponent(btnAtaque2)
                    .addComponent(btnAtaqueFinal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDefenza1)
                    .addComponent(btnCurar1)
                    .addComponent(btnDefenza2)
                    .addComponent(btnCurar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel6);
        jPanel6.setBounds(10, 420, 720, 220);

        lblLuchador1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        panelFondo.add(lblLuchador1);
        lblLuchador1.setBounds(30, 210, 220, 170);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/vs.jpg"))); // NOI18N
        jLabel11.setMinimumSize(new java.awt.Dimension(468, 468));
        jLabel11.setName(""); // NOI18N
        panelFondo.add(jLabel11);
        jLabel11.setBounds(1076, 13, 0, 468);
        jLabel11.getAccessibleContext().setAccessibleParent(jPanel6);

        lblLuchador2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        panelFondo.add(lblLuchador2);
        lblLuchador2.setBounds(512, 40, 210, 157);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fond.jpg"))); // NOI18N
        panelFondo.add(jLabel17);
        jLabel17.setBounds(-10, -60, 760, 590);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.gif"))); // NOI18N
        panelFondo.add(jLabel18);
        jLabel18.setBounds(0, 470, 750, 310);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelFondo.getAccessibleContext().setAccessibleParent(panelFondo);

        PantallaBatalla.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 760, 800);

        EstadisticasJugadores.setMinimumSize(new java.awt.Dimension(618, 535));
        EstadisticasJugadores.getContentPane().setLayout(null);

        btnSalir.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        EstadisticasJugadores.getContentPane().add(btnSalir);
        btnSalir.setBounds(260, 420, 100, 30);

        btnVolverSeleccion.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        btnVolverSeleccion.setText("Selección Personaje");
        btnVolverSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSeleccionActionPerformed(evt);
            }
        });
        EstadisticasJugadores.getContentPane().add(btnVolverSeleccion);
        btnVolverSeleccion.setBounds(210, 460, 240, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ganaste.png"))); // NOI18N
        EstadisticasJugadores.getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 10, 430, 280);

        txtEstadisticas.setBackground(new java.awt.Color(153, 255, 255));
        txtEstadisticas.setColumns(20);
        txtEstadisticas.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        txtEstadisticas.setRows(5);
        jScrollPane4.setViewportView(txtEstadisticas);

        EstadisticasJugadores.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(200, 300, 210, 110);

        jLabel13.setBackground(new java.awt.Color(255, 255, 102));
        EstadisticasJugadores.getContentPane().add(jLabel13);
        jLabel13.setBounds(5, 4, 600, 530);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(942, 720));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 0, 0));
        lblTitulo.setText("battle pro");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(330, 30, 161, 44);

        lblTituloPersonajes.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        lblTituloPersonajes.setForeground(new java.awt.Color(204, 0, 0));
        lblTituloPersonajes.setText("PERSONAJES");
        getContentPane().add(lblTituloPersonajes);
        lblTituloPersonajes.setBounds(325, 110, 110, 21);

        cmbJugador1.setFont(new java.awt.Font("Lucida Handwriting", 2, 12)); // NOI18N
        cmbJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmbJugador1);
        cmbJugador1.setBounds(42, 77, 160, 40);

        cmbJugador2.setFont(new java.awt.Font("Lucida Handwriting", 2, 12)); // NOI18N
        cmbJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(cmbJugador2);
        cmbJugador2.setBounds(561, 77, 150, 40);

        btnRegistrarJugador.setBackground(new java.awt.Color(51, 255, 102));
        btnRegistrarJugador.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        btnRegistrarJugador.setText("REGISTRAR JUGADOR");
        btnRegistrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarJugador);
        btnRegistrarJugador.setBounds(260, 450, 340, 60);

        cmbPersonajes.setBackground(new java.awt.Color(102, 255, 102));
        cmbPersonajes.setFont(new java.awt.Font("Lucida Handwriting", 3, 12)); // NOI18N
        cmbPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPersonajesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPersonajes);
        cmbPersonajes.setBounds(305, 140, 180, 50);
        getContentPane().add(lblPersonaje1);
        lblPersonaje1.setBounds(40, 140, 130, 130);

        btnEmpezar.setBackground(new java.awt.Color(255, 255, 51));
        btnEmpezar.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        btnEmpezar.setText("Empezar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpezar);
        btnEmpezar.setBounds(340, 380, 160, 40);
        getContentPane().add(lblPersonaje3);
        lblPersonaje3.setBounds(320, 220, 146, 124);

        btnSelectJugador1.setBackground(new java.awt.Color(0, 153, 255));
        btnSelectJugador1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        btnSelectJugador1.setText("Seleccionar Jugador 1 ");
        btnSelectJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectJugador1);
        btnSelectJugador1.setBounds(30, 311, 210, 60);

        bntSelectJugador2.setBackground(new java.awt.Color(0, 153, 255));
        bntSelectJugador2.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        bntSelectJugador2.setText("Seleccionar Jugador 2");
        bntSelectJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSelectJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(bntSelectJugador2);
        bntSelectJugador2.setBounds(570, 300, 210, 60);
        getContentPane().add(lblPersonaje2);
        lblPersonaje2.setBounds(590, 140, 120, 130);

        lblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoP.jpg"))); // NOI18N
        lblFondo2.setMaximumSize(new java.awt.Dimension(900, 800));
        lblFondo2.setMinimumSize(new java.awt.Dimension(900, 800));
        lblFondo2.setName(""); // NOI18N
        getContentPane().add(lblFondo2);
        lblFondo2.setBounds(0, -70, 940, 610);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 20, 750, 470);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clic.gif"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 214, 460, 150);
        getContentPane().add(lblPerso1);
        lblPerso1.setBounds(90, 270, 0, 0);
        getContentPane().add(lblPerso2);
        lblPerso2.setBounds(610, 270, 0, 0);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empezar.gif"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 490, 770, 220);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empezar.gif"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(760, 490, 170, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJugadorActionPerformed
        // TODO add your handling code here:
        RegistroJugador.setVisible(true);//Sea visible la ventana de registro
        RegistroJugador.setSize(597,515);//Dimension de la ventana  
        RegistroJugador.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrarJugadorActionPerformed

    private void btnSelectJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectJugador1ActionPerformed
        activarjugador2=true;
         //activarjugador1=true;
        int opcion = cmbPersonajes.getSelectedIndex();

        ImageIcon agua = new ImageIcon  (getClass().getResource("/Imagenes/agua2.gif"));
        ImageIcon fuego = new ImageIcon  (getClass().getResource("/Imagenes/fuego2.gif"));
        ImageIcon tierra = new ImageIcon  (getClass().getResource("/Imagenes/tierra2.gif"));
        ImageIcon aire = new ImageIcon  (getClass().getResource("/Imagenes/aire2.gif"));
        
        
        ImageIcon icono1 = new ImageIcon (agua.getImage().getScaledInstance(lblPersonaje1.getWidth(), lblPersonaje1.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono2 = new ImageIcon (fuego.getImage().getScaledInstance(lblPersonaje1.getWidth(), lblPersonaje1.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono3 = new ImageIcon (tierra.getImage().getScaledInstance(lblPersonaje1.getWidth(), lblPersonaje1.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono4 = new ImageIcon (aire.getImage().getScaledInstance(lblPersonaje1.getWidth(), lblPersonaje1.getHeight(), Image.SCALE_DEFAULT));
//        ImageIcon icono5 = new ImageIcon (tierra2.getImage().getScaledInstance(lblLuchador1.getHeight(), lblLuchador1.getWidth(), Image.SCALE_DEFAULT));

        switch(opcion){
            case 0:
                lblPersonaje1.setIcon(icono1);
                lblLuchador1.setIcon(icono1);
                vida1 = personajeagua.getVida();
                txtVida1.setText(Integer.toString(vida1)+"/700");
                estamina1 = personajeagua.getEstamina();
                txtEstamina1.setText(Integer.toString(estamina1)+"/600");
                lblPerso1.setText("0");
                break;
            case 1:
                lblPersonaje1.setIcon(icono2);
                lblLuchador1.setIcon(icono2);
                vida1 = personajefuego.getVida();;
                txtVida1.setText(Integer.toString(vida1)+"/700");
                estamina1 = personajefuego.getEstamina();;
                txtEstamina1.setText(Integer.toString(estamina1)+"/500");
                lblPerso1.setText("1");
                break;
            case 2:
                lblPersonaje1.setIcon(icono3);
                lblLuchador1.setIcon(icono3);
                vida1 = personajetierra.getVida();
                txtVida1.setText(Integer.toString(vida1)+"/700");
                estamina1 = personajetierra.getEstamina();
                txtEstamina1.setText(Integer.toString(estamina1)+"/700");
                lblPerso1.setText("2");
                break;
            case 3:
                lblPersonaje1.setIcon(icono4);
                lblLuchador1.setIcon(icono4);
                vida1 = personajeaire.getVida();
                txtVida1.setText(Integer.toString(vida1)+"/700");
                estamina1 = personajeaire.getEstamina();
                txtEstamina1.setText(Integer.toString(estamina1)+"/400");
                lblPerso1.setText("3");
                break;
            default:
                
                break;
        }
        
         if (activarjugador1 && activarjugador2){
            btnEmpezar.setEnabled(true);             
         }
         
        
    }//GEN-LAST:event_btnSelectJugador1ActionPerformed

    private void cmbJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugador1ActionPerformed
        // TODO add your handling code here:  
        
       String NombreJugador1=cmbJugador1.getSelectedItem().toString();
       lblNombreJugador1.setText(NombreJugador1);
    }//GEN-LAST:event_cmbJugador1ActionPerformed

    private void cmbJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugadoresActionPerformed
        // TODO add your handling code here:
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();

        txtNombre.setText(jugadorSeleccionado.getNombre());
        txtApellido.setText(jugadorSeleccionado.getApellido());
        txtUsuario.setText(jugadorSeleccionado.getUsuario());
        txtCedula.setText(jugadorSeleccionado.getCedula());
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);

    }//GEN-LAST:event_cmbJugadoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String cedula=txtCedula.getText();
        String usuario=txtUsuario.getText();
        cont++;
        boolean jugadorExiste=false;
        
        ClsJugador jugadorP=new ClsJugador(cont, nombre, apellido,cedula, usuario,victorias);
        for(Object jugadorObj: jugador){
            
            ClsJugador m=(ClsJugador)jugadorObj;
            if(m.getCedula().equals(jugadorP.getCedula()) || m.getUsuario().equals(jugadorP.getUsuario())){
                jugadorExiste=true;
                
                JOptionPane.showMessageDialog(rootPane, "Jugador con la misma cedula o usuario");
                break;
            }
         
        }
       
        
        if( !jugadorExiste &&!nombre.equals("") && !apellido.equals("") && !usuario.equals("")&&!cedula.equals("") ){

            jugador.add(jugadorP);
            controller.escribirObjeto("jugadores.dat", jugador);
            jugador=controller.extraerObjetos("jugadores.dat");

            limpiar();
            llenarCombo();

            Object jugadoresG [] = {jugadorP.getId(),jugadorP.getNombre(),jugadorP.getApellido(),jugadorP.getCedula(),jugadorP.getUsuario()};
            DefaultTableModel model = (DefaultTableModel) tblRegistros.getModel();
            model.addRow(jugadoresG);

        }
        
        else {
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
        }
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ClsJugador jugadorSelect = (ClsJugador)cmbJugadores.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblRegistros.getModel();
        //System.out.println(cmbestudiantes.getSelectedIndex());
        //elimina el estudiante de la tabla cn remove row y select index x q elimina el indece d la tabla
        model.removeRow(cmbJugadores.getSelectedIndex());
        jugador.remove(jugadorSelect);
        controller.escribirObjeto("jugadores.dat", jugador);
        llenarCombo();
        limpiar();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        cont--;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();

        jugadorSeleccionado.setNombre(txtNombre.getText());
        jugadorSeleccionado.setCedula(txtCedula.getText());
        jugadorSeleccionado.setApellido(txtApellido.getText());
        jugadorSeleccionado.setUsuario(txtUsuario.getText());

        int id=jugadorSeleccionado.getId();
        String nombre=jugadorSeleccionado.getNombre();
        String apellido=jugadorSeleccionado.getApellido();
        String cedula=jugadorSeleccionado.getCedula();
        String usuario=jugadorSeleccionado.getUsuario();
        
        boolean jugadorExiste=false;
        ClsJugador jugadorP=new ClsJugador(cont, nombre, apellido,cedula, usuario,victorias);
        for(Object jugadorObj: jugador){
            
            ClsJugador m=(ClsJugador)jugadorObj;
            if(m.getCedula().equals(jugadorP.getCedula()) || m.getUsuario().equals(jugadorP.getUsuario())){
                jugadorExiste=true;
                
                JOptionPane.showMessageDialog(rootPane, "Jugador con la misma cedula o usuario");
                break;
            }else{
            Object jugadoresG [] = {id,nombre,apellido,cedula,usuario};
        DefaultTableModel model = (DefaultTableModel) tblRegistros.getModel();
        model.removeRow(cmbJugadores.getSelectedIndex());
        jugador.remove(cmbJugadores.getSelectedIndex());
        model.insertRow(cmbJugadores.getSelectedIndex(), jugadoresG);
        jugador.add(cmbJugadores.getSelectedIndex(), jugadorSeleccionado);
        controller.escribirObjeto("jugadores.dat", jugador);
        llenarCombo();
        limpiar();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
            }

        } 
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSeleccionPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionPersonajeActionPerformed
        // TODO add your handling code here:
        RegistroJugador.setVisible(false);//Cierra la ventana de registro
        RegistroJugador.setSize(700, 500);
        RegistroJugador.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSeleccionPersonajeActionPerformed

    private void bntSelectJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSelectJugador2ActionPerformed
        int opcion = cmbPersonajes.getSelectedIndex();
        activarjugador1=true;
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        String nombre = jugadorSeleccionado.getNombre();
        String apellido = jugadorSeleccionado.getApellido();
        String usuario = jugadorSeleccionado.getUsuario();
        ClsJugador jugador2a = new ClsJugador (nombre,apellido,usuario,victorias);
         
        ImageIcon agua = new ImageIcon  (getClass().getResource("/Imagenes/agua2.gif"));
        ImageIcon fuego = new ImageIcon  (getClass().getResource("/Imagenes/fuego2.gif"));
        ImageIcon tierra = new ImageIcon  (getClass().getResource("/Imagenes/tierra2.gif"));
        ImageIcon aire = new ImageIcon  (getClass().getResource("/Imagenes/aire2.gif"));
        
        
        ImageIcon icono1 = new ImageIcon (agua.getImage().getScaledInstance(lblPersonaje2.getWidth(), lblPersonaje2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono2 = new ImageIcon (fuego.getImage().getScaledInstance(lblPersonaje2.getWidth(), lblPersonaje2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono3 = new ImageIcon (tierra.getImage().getScaledInstance(lblPersonaje2.getWidth(), lblPersonaje2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono4 = new ImageIcon (aire.getImage().getScaledInstance(lblPersonaje2.getWidth(), lblPersonaje2.getHeight(), Image.SCALE_DEFAULT));
        
        switch(opcion){
            case 0:
                lblPersonaje2.setIcon(icono1);
                lblLuchador2.setIcon(icono1);
                vida2 = personajeagua.getVida();
                estamina2 = personajeagua.getVida();
                txtEstamina2.setText(Integer.toString(estamina2)+"/600");
                txtVida2.setText(Integer.toString(vida2)+"/700");
                lblPerso2.setText("0");
                break;
            case 1:
                
                lblPersonaje2.setIcon(icono2);
                lblLuchador2.setIcon(icono2);
                vida2 = personajefuego.getVida();
                txtVida2.setText(Integer.toString(vida2)+"/700");
                estamina2 = personajefuego.getEstamina();
                txtEstamina2.setText(Integer.toString(estamina2)+"/500");
                lblPerso2.setText("1");
                break;
            case 2:
                lblPersonaje2.setIcon(icono3);
                lblLuchador2.setIcon(icono3);
                vida2 = personajetierra.getVida();
                txtVida2.setText(Integer.toString(vida2)+"/700");
                estamina2 = personajetierra.getEstamina();
                txtEstamina2.setText(Integer.toString(estamina2)+"/700");
                lblPerso2.setText("2");
                break;
            case 3:
                lblPersonaje2.setIcon(icono4);
                lblLuchador2.setIcon(icono4);
                vida2 = personajeaire.getVida();
                txtVida2.setText(Integer.toString(vida2)+"/700");
                estamina2 = personajeaire.getEstamina();
                txtEstamina2.setText(Integer.toString(estamina2)+"/400");
                lblPerso2.setText("3");

                break;
            default:
                
                break;
        }
         if (activarjugador1 && activarjugador2){
            btnEmpezar.setEnabled(true);             
         }
                                  
    }//GEN-LAST:event_bntSelectJugador2ActionPerformed

    private void cmbPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPersonajesActionPerformed
        // TODO add your handling code here:
        int opcion = cmbPersonajes.getSelectedIndex();
        ImageIcon agua = new ImageIcon  (getClass().getResource("/Imagenes/agua2.jpg"));
        ImageIcon fuego = new ImageIcon  (getClass().getResource("/Imagenes/fuego1.png"));
        ImageIcon tierra = new ImageIcon  (getClass().getResource("/Imagenes/tierra.png"));
        ImageIcon aire = new ImageIcon  (getClass().getResource("/Imagenes/airee.jpg"));
        
        
        ImageIcon icono1 = new ImageIcon (agua.getImage().getScaledInstance(lblPersonaje3.getWidth(), lblPersonaje3.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono2 = new ImageIcon (fuego.getImage().getScaledInstance(lblPersonaje3.getWidth(), lblPersonaje3.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono3 = new ImageIcon (tierra.getImage().getScaledInstance(lblPersonaje3.getWidth(), lblPersonaje3.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon icono4 = new ImageIcon (aire.getImage().getScaledInstance(lblPersonaje3.getWidth(), lblPersonaje3.getHeight(), Image.SCALE_DEFAULT));

        switch(opcion){
            case 0:
                lblPersonaje3.setIcon(icono1);
                
                break;
            case 1:
                
                lblPersonaje3.setIcon(icono2);
                break;
            case 2:
                lblPersonaje3.setIcon(icono3);
                break;
            case 3:
                lblPersonaje3.setIcon(icono4);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmbPersonajesActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        // TODO add your handling code here:
        String SelectJugador1=cmbJugador1.getSelectedItem().toString();
        String SelectJugador2=cmbJugador2.getSelectedItem().toString();   
        Jugadas jugador1 = new Jugadas ((ClsJugador) jugador.get(perso1),ListaPersonajes.get(perso1));
        btnAtaque2.setEnabled(false);
        btnAtaqueFinal2.setEnabled(false);
        btnCurar2.setEnabled(false);
        btnDefenza2.setEnabled(false);
        btnAtaque1.setEnabled(true);
        btnAtaqueFinal1.setEnabled(true);
        btnCurar1.setEnabled(true);
        btnDefenza1.setEnabled(true);
        
        if(SelectJugador1.equals(SelectJugador2)){
           JOptionPane.showMessageDialog(rootPane, "Los jugadores son los mismos");
           
        }
        else if( !cmbJugador1.equals(null)&&!cmbJugador2.equals(null)){
           
            PantallaCargar.setVisible(true);
           PantallaCargar.setSize(500,330);
           PantallaCargar.setLocationRelativeTo(null);
            
        }
       
        int i1=Integer.parseInt(lblPerso1.getText());
        int i2=Integer.parseInt(lblPerso2.getText());
        vida1 = ListaPersonajes.get(i1).getVida();
        vida2 = ListaPersonajes.get(i2).getVida();
        int j1 =Integer.parseInt(lblPerso2.getText());
        estamina1 = ListaPersonajes.get(i1).getEstamina();
        estamina2 = ListaPersonajes.get(i2).getEstamina();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void cmbJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugador2ActionPerformed
        // TODO add your handling code here:
        
       String NombreJugador2=cmbJugador2.getSelectedItem().toString();
       lblNombreJugador2.setText(NombreJugador2);
    }//GEN-LAST:event_cmbJugador2ActionPerformed

    private void btnCurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurar1ActionPerformed
        
        ListaJugadas.add("Jugador 1: Curación");
        estamina1 = estamina1-20;
        vida1 = vida1+20;
        int i1= Integer.parseInt(lblPerso1.getText());
        txtVida1.setText(vida1+"/"+ListaPersonajes.get(i1).getVida());
        txtEstamina1.setText(estamina1+"/"+ListaPersonajes.get(i1).getEstamina());
        jugadas();
        turnoJ2();
    }//GEN-LAST:event_btnCurar1ActionPerformed

    private void btnAtaque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque1ActionPerformed
        
        ListaJugadas.add("Jugador 1: Ataque");
        int i2= Integer.parseInt(lblPerso2.getText());
        
        
        if(contdefensa2==3){
            defensaactiva2=false;
        }
        
        if(defensaactiva2 == true){
            contdefensa2++;
            int ataque=(75*personajeagua.getAtaque())/100;
            if(lblPerso1.getText().equals("0")){
            vida2-=ataque;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(0).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/600");
        }else if(lblPerso1.getText().equals("1")){
            int ataque1=(75*personajefuego.getAtaque())/100;
            vida2-=ataque1;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(1).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/500");
        }else if(lblPerso1.getText().equals("2")){
            int ataque2=(75*personajetierra.getAtaque())/100;
            vida2-=ataque2;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(2).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/700");
        }else if(lblPerso1.getText().equals("3")){
            int ataque3=(75*personajeaire.getAtaque())/100;
            vida2-=ataque3;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(3).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/400");
        }
        }else{
        if(lblPerso1.getText().equals("0")){
            vida2-=personajeagua.getAtaque();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(0).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/600");
        }else if(lblPerso1.getText().equals("1")){
            vida2-=personajefuego.getAtaque();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(1).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/500");
        }else if(lblPerso1.getText().equals("2")){
            vida2-=personajetierra.getAtaque();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(2).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/700");
        }else if(lblPerso1.getText().equals("3")){
            vida2-=personajeaire.getAtaque();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(3).getEstamina()*5)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/400");
        }
        }
        if(vida2 <=0){
            String NombreJugador1=cmbJugador1.getSelectedItem().toString();
            Estadisticas.add(NombreJugador1);
            EstadisticasJugadores.setVisible(true);
            EstadisticasJugadores.setSize(600, 700);
            EstadisticasJugadores.setLocationRelativeTo(null);
            PantallaBatalla.setVisible(false);
            
        }
        estadisticas();
        jugadas();
        turnoJ2();
     
    }//GEN-LAST:event_btnAtaque1ActionPerformed

    private void btnAtaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque2ActionPerformed
        
        ListaJugadas.add("Jugador 2: Ataque");
        
        int i1= Integer.parseInt(lblPerso1.getText());
        if(contdefensa1==3){
            defensaactiva1=false;
        }
        if(defensaactiva1 == true){
            contdefensa1++;
            int ataque=(75*personajeagua.getAtaque())/100;
            if(lblPerso2.getText().equals("0")){
            vida1-=ataque;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(0).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/600");
        }else if(lblPerso2.getText().equals("1")){
            int ataque1=(75*personajefuego.getAtaque())/100;
            vida1-=ataque1;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(1).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/500");
        }else if(lblPerso2.getText().equals("2")){
            int ataque2=(75*personajetierra.getAtaque())/100;
            vida1-=ataque2;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(2).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/700");
        }else if(lblPerso2.getText().equals("3")){
            int ataque3=(75*personajeaire.getAtaque())/100;
            vida1-=ataque3;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(3).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/400");
        }
        }else{
        if(lblPerso2.getText().equals("0")){
            vida1-=personajeagua.getAtaque();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(0).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/600");
        }else if(lblPerso2.getText().equals("1")){
            vida1-=personajefuego.getAtaque();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(1).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/500");
        }else if(lblPerso2.getText().equals("2")){
            vida1-=personajetierra.getAtaque();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(2).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/700");
        }else if(lblPerso2.getText().equals("3")){
            vida1-=personajeaire.getAtaque();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(3).getEstamina()*5)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/400");
        }
        }
        
        if(vida1 <=0){
            String NombreJugador1=cmbJugador2.getSelectedItem().toString();
            Estadisticas.add(NombreJugador1);
            EstadisticasJugadores.setVisible(true);
            EstadisticasJugadores.setSize(600, 700);
            EstadisticasJugadores.setLocationRelativeTo(null);
            PantallaBatalla.setVisible(false);
        }
        estadisticas();
        jugadas();
        turnoJ1();
    }//GEN-LAST:event_btnAtaque2ActionPerformed

    private void btnAtaqueFinal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueFinal1ActionPerformed
        
        ListaJugadas.add("Jugador 1: Ataque Final");
        
        int i2= Integer.parseInt(lblPerso2.getText());
        if(contdefensa2==3){
            defensaactiva2=false;
        }
        if(defensaactiva2 == true){
            contdefensa2++;
            int ataquefinal=(75*personajeagua.getAtaqueFinal())/100;
            if(lblPerso1.getText().equals("0")){
            vida2-=ataquefinal;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(0).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/600");
        }else if(lblPerso1.getText().equals("1")){
            int ataquefinal1=(75*personajefuego.getAtaqueFinal())/100;
            vida2-=ataquefinal1;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(1).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/500");
        }else if(lblPerso1.getText().equals("2")){
            int ataquefinal2=(75*personajetierra.getAtaqueFinal())/100;
            vida2-=ataquefinal2;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(2).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/700");
        }else if(lblPerso1.getText().equals("3")){
            int ataquefinal3=(75*personajeaire.getAtaqueFinal())/100;
            vida2-=ataquefinal3;
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(3).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/400");
        }
        }else{
        if(lblPerso1.getText().equals("0")){
            vida2-=personajeagua.getAtaqueFinal();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(0).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/600");
        }else if(lblPerso1.getText().equals("1")){
            vida2-=personajefuego.getAtaqueFinal();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(1).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/500");
        }else if(lblPerso1.getText().equals("2")){
            vida2-=personajetierra.getAtaqueFinal();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(2).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/700");
        }else if(lblPerso1.getText().equals("3")){
            vida2-=personajeaire.getAtaqueFinal();
            txtVida2.setText(Integer.toString(vida2)+"/"+ListaPersonajes.get(i2).getVida());
            estamina1-=(ListaPersonajes.get(3).getEstamina()*50)/100;
            txtEstamina1.setText(Integer.toString(estamina1)+"/400");
        }
        }
        if(vida2 <=0){
            String NombreJugador1=cmbJugador1.getSelectedItem().toString();
            Estadisticas.add(NombreJugador1);
            EstadisticasJugadores.setVisible(true);
            EstadisticasJugadores.setSize(600, 700);
            EstadisticasJugadores.setLocationRelativeTo(null);
            PantallaBatalla.setVisible(false);
            
        }
        estadisticas();
        jugadas();
        turnoJ2();
    }//GEN-LAST:event_btnAtaqueFinal1ActionPerformed

    private void btnAtaqueFinal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueFinal2ActionPerformed
        
        ListaJugadas.add("Jugador 2: Ataque Final");
        int i1= Integer.parseInt(lblPerso1.getText());
        
        if(contdefensa1==3){
            defensaactiva1=false;
        }
        if(defensaactiva1 == true){
            contdefensa1++;
            int ataquefinal=(75*personajeagua.getAtaqueFinal())/100;
            if(lblPerso2.getText().equals("0")){
            vida1-=ataquefinal;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(0).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/600");
        }else if(lblPerso2.getText().equals("1")){
            int ataquefinal1=(75*personajefuego.getAtaqueFinal())/100;
            vida1-=ataquefinal1;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(1).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/500");
        }else if(lblPerso2.getText().equals("2")){
            int ataquefina2=(75*personajetierra.getAtaqueFinal())/100;
            vida1-=ataquefina2;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(2).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/700");
        }else if(lblPerso2.getText().equals("3")){
            int ataquefina3=(75*personajeaire.getAtaqueFinal())/100;
            vida1-=ataquefina3;
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(3).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/400");
        }
        }else{
        if(lblPerso2.getText().equals("0")){
            vida1-=personajeagua.getAtaqueFinal();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(0).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/600");
        }else if(lblPerso2.getText().equals("1")){
            vida1-=personajefuego.getAtaqueFinal();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(1).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/500");
        }else if(lblPerso2.getText().equals("2")){
            vida1-=personajetierra.getAtaqueFinal();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(2).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/700");
        }else if(lblPerso2.getText().equals("3")){
            vida1-=personajeaire.getAtaqueFinal();
            txtVida1.setText(Integer.toString(vida1)+"/"+ListaPersonajes.get(i1).getVida());
            estamina2-=(ListaPersonajes.get(3).getEstamina()*50)/100;
            txtEstamina2.setText(Integer.toString(estamina2)+"/400");
        }
        }
        if(vida1 <=0){
            String NombreJugador1=cmbJugador2.getSelectedItem().toString();
            Estadisticas.add(NombreJugador1);
            EstadisticasJugadores.setVisible(true);
            EstadisticasJugadores.setSize(600, 700);
            EstadisticasJugadores.setLocationRelativeTo(null);
            PantallaBatalla.setVisible(false);
        }
        estadisticas();
        jugadas();
        turnoJ1();
    }//GEN-LAST:event_btnAtaqueFinal2ActionPerformed

    private void btnDefenza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenza1ActionPerformed
        
        ListaJugadas.add("Jugador 1: Defensa");
        defensaactiva1 = true;
        estamina1=estamina1-25;
        int i1= Integer.parseInt(lblPerso1.getText());
        txtEstamina1.setText(estamina1+"/"+ListaPersonajes.get(i1).getEstamina());
        jugadas();
        turnoJ2();

    }//GEN-LAST:event_btnDefenza1ActionPerformed

    private void btnCurar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurar2ActionPerformed
        
        ListaJugadas.add("Jugador 2: Curación");
        estamina2 = estamina2-20;
        vida2 = vida2+20;
        int i2= Integer.parseInt(lblPerso2.getText());
        txtVida2.setText(vida2+"/"+ListaPersonajes.get(i2).getVida());
        txtEstamina2.setText(estamina2+"/"+ListaPersonajes.get(i2).getEstamina());
        jugadas();
        turnoJ1();
    }//GEN-LAST:event_btnCurar2ActionPerformed

    private void btnDefenza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenza2ActionPerformed

        ListaJugadas.add("Jugador 2: Defensa");
        defensaactiva2 = true;
        estamina2=estamina2-25;
        int i2= Integer.parseInt(lblPerso2.getText());
        txtEstamina2.setText(estamina2+"/"+ListaPersonajes.get(i2).getEstamina());
        jugadas();
        turnoJ1();
    }//GEN-LAST:event_btnDefenza2ActionPerformed

    private void btnVolverSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSeleccionActionPerformed
        // TODO add your handling code here:
        EstadisticasJugadores.setVisible(false);
    }//GEN-LAST:event_btnVolverSeleccionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        RegistroJugador.setVisible(false);
        PantallaBatalla.setVisible(false);
        EstadisticasJugadores.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
         PantallaCargar.setVisible(false);
         PantallaBatalla.setVisible(true);
           PantallaBatalla.setSize(800, 800);
           PantallaBatalla.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void turnoJ2 (){
        
        btnAtaque1.setEnabled(false);
        btnAtaqueFinal1.setEnabled(false);
        btnDefenza1.setEnabled(false);
        btnCurar1.setEnabled(false);
        btnAtaque2.setEnabled(true);
        btnAtaqueFinal2.setEnabled(true);
        btnDefenza2.setEnabled(true);
        btnCurar2.setEnabled(true);
        estamina2 = estamina2+10;
        int i2=Integer.parseInt(lblPerso2.getText());
        txtEstamina2.setText(estamina2+"/"+ListaPersonajes.get(i2).getEstamina());
        if(estamina2<=25){
            btnAtaque2.setEnabled(false);
            btnAtaqueFinal2.setEnabled(false);
            btnDefenza2.setEnabled(false);
            turnoJ1();
        }

    }
    
    public void turnoJ1 (){
        
        btnAtaque2.setEnabled(false);
        btnAtaqueFinal2.setEnabled(false);
        btnDefenza2.setEnabled(false);
        btnCurar2.setEnabled(false);
        btnAtaque1.setEnabled(true);
        btnAtaqueFinal1.setEnabled(true);
        btnDefenza1.setEnabled(true);
        btnCurar1.setEnabled(true);
        estamina1 = estamina1+10;
        int i1=Integer.parseInt(lblPerso1.getText());
        txtEstamina1.setText(estamina1+"/"+ListaPersonajes.get(i1).getEstamina());
        if(estamina1<=25){
            btnAtaque1.setEnabled(false);
            btnAtaqueFinal1.setEnabled(false);
            btnDefenza1.setEnabled(false);
            turnoJ2();
        }
    }
    
    public void jugadas (){
        AreaJugadas.setText("");
        for (Object item : ListaJugadas){
              
              AreaJugadas.setText(AreaJugadas.getText()+"\n"+item);
              
          }
    }
    
    public void estadisticas(){
        txtEstadisticas.setText("");
        for (Object item : Estadisticas){
              
              txtEstadisticas.setText(txtEstadisticas.getText()+"\n"+item);
              
          }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeleccionJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaJugadas;
    private javax.swing.JFrame EstadisticasJugadores;
    private javax.swing.JFrame PantallaBatalla;
    private javax.swing.JFrame PantallaCargar;
    private javax.swing.JFrame RegistroJugador;
    private javax.swing.JButton bntSelectJugador2;
    private javax.swing.JButton btnAtaque1;
    private javax.swing.JButton btnAtaque2;
    private javax.swing.JButton btnAtaqueFinal1;
    private javax.swing.JButton btnAtaqueFinal2;
    private javax.swing.JButton btnCurar1;
    private javax.swing.JButton btnCurar2;
    private javax.swing.JButton btnDefenza1;
    private javax.swing.JButton btnDefenza2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrarJugador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionPersonaje;
    private javax.swing.JButton btnSelectJugador1;
    private javax.swing.JButton btnVolverSeleccion;
    public static javax.swing.JComboBox<String> cmbJugador1;
    public static javax.swing.JComboBox<String> cmbJugador2;
    private javax.swing.JComboBox<String> cmbJugadores;
    private javax.swing.JComboBox<String> cmbPersonajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblLuchador1;
    private javax.swing.JLabel lblLuchador2;
    private javax.swing.JLabel lblNombreJugador1;
    private javax.swing.JLabel lblNombreJugador2;
    private javax.swing.JLabel lblPerso1;
    private javax.swing.JLabel lblPerso2;
    private javax.swing.JLabel lblPersonaje1;
    private javax.swing.JLabel lblPersonaje2;
    private javax.swing.JLabel lblPersonaje3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloPersonajes;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtEstadisticas;
    private javax.swing.JTextField txtEstamina1;
    private javax.swing.JTextField txtEstamina2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtVida1;
    private javax.swing.JTextField txtVida2;
    // End of variables declaration//GEN-END:variables
}
