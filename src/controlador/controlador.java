/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.vista;

/**
 *
 * @author fer
 */
public class controlador implements ActionListener,MouseListener {

 vista vista = new vista();  
    
    
 public controlador(vista vista) {
     this.vista = vista;
 } 
 
 public enum BaresMVC{
     //Botones menu inicial
     btnBaresNorte,
     btnBaresSur,
     
     //Menu Secundario
     btnBares,
     btnRecaudaciones,
     
     //btnAtras
     btnAtrasmenu,
     btnAtrasdialogBares,
     btnAtrasdetalles,
     
     //MenuBares
     btnModificarBar,
     btnAñadirBar,
     btnEliminarBar,
     btnDetallesBar,
     tbBar,
     
     //detallesBar(empleados)
      btnAgregarEmpleado,
      btnEliminarEmpleado,
      btnModificarEmpleado,
      tbEmpleado,
      
     //detallesBar(Titulares)
      btnAgregarTitular,
      btnEliminarTitular,
      btnModificarTitular,
      tbTitulares,
      
      //detallesBar(Inventario)
      btnAñadirProducto,
      btnEliminarProducto,
      btnModificarProducto,
      tbProductos,
     
     
     
     
     
 }
    
public void iniciar() {
    
 this.vista.setVisible(true);
 this.vista.setLocationRelativeTo(null);
 
 this.vista.btnBaresNorte.addActionListener(this);
 this.vista.btnBaresNorte.setActionCommand("btnBaresNorte");
 
 this.vista.btnBaresSur.addActionListener(this);
 this.vista.btnBaresSur.setActionCommand("btnBaresSur");
 
 this.vista.btnBares.addActionListener(this);
 this.vista.btnBares.setActionCommand("btnBares");
 
 this.vista.btnRecaudaciones.addActionListener(this);
 this.vista.btnRecaudaciones.setActionCommand("btnRecaudaciones");
 
 this.vista.btnAñadirBar.addActionListener(this);
 this.vista.btnAñadirBar.setActionCommand("btnAñadirBar");
 
 this.vista.btnEliminarBar.addActionListener(this);
 this.vista.btnEliminarBar.setActionCommand("btnEliminarBar");
 
 this.vista.btnModificarBar.addActionListener(this);
 this.vista.btnModificarBar.setActionCommand("btnModificarBar");
 
 this.vista.btnDetallesBar.addActionListener(this);
 this.vista.btnDetallesBar.setActionCommand("btnDetallesBar");
 
 this.vista.btnAgregarEmpleado.addActionListener(this);
 this.vista.btnAgregarEmpleado.setActionCommand("btnAgregarEmpleado");
 
 this.vista.btnEliminarEmpleado.addActionListener(this);
 this.vista.btnEliminarEmpleado.setActionCommand("btnEliminarEmpleado");
 
 this.vista.btnModificarEmpleado.addActionListener(this);
 this.vista.btnModificarEmpleado.setActionCommand("btnModificarEmpleado");
 
 this.vista.btnAgregarTitular.addActionListener(this);
 this.vista.btnAgregarTitular.setActionCommand("btnAgregarTitular");
 
 this.vista.btnEliminarTitular.addActionListener(this);
 this.vista.btnEliminarTitular.setActionCommand("btnEliminarTitular");
 
 this.vista.btnModificarTitular.addActionListener(this);
 this.vista.btnModificarTitular.setActionCommand("btnModificarTitular");
 
 this.vista.btnAñadirProducto.addActionListener(this);
 this.vista.btnAñadirProducto.setActionCommand("btnAñadirProducto");
 
 this.vista.btnEliminarProducto.addActionListener(this);
 this.vista.btnEliminarProducto.setActionCommand("btnEliminarProducto");
 
 this.vista.btnModificarProducto.addActionListener(this);
 this.vista.btnModificarProducto.setActionCommand("btnModificarProducto");
 
 this.vista.btnAtrasmenu.addActionListener(this);
 this.vista.btnAtrasmenu.setActionCommand("btnAtrasmenu");
 
 this.vista.btnAtrasdialogBares.addActionListener(this);
 this.vista.btnAtrasdialogBares.setActionCommand("btnAtrasdialogBares");
 
 this.vista.btnAtrasdetalles.addActionListener(this);
 this.vista.btnAtrasdetalles.setActionCommand("btnAtrasdetalles");
 
 this.vista.tbBar.addMouseListener(this);
 this.vista.tbBar.setName("tbBar");
 
 this.vista.tbEmpleado.addMouseListener(this);
 this.vista.tbEmpleado.setName("tbEmpleado");
 
 this.vista.tbTitulares.addMouseListener(this);
 this.vista.tbTitulares.setName("tbTitulares");
 
 this.vista.tbProductos.addMouseListener(this);
 this.vista.tbProductos.setName("tbProductos");
 
        
        
    
}    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(BaresMVC.valueOf(e.getActionCommand())){
            
            case btnBaresNorte:
               
            break;
            
            case btnBaresSur:
            
            break;
            
            case btnBares:
            
            break;
            
            case btnRecaudaciones:
                
                break;
                
            case btnAñadirBar:
                
                break;
                
            case btnEliminarBar:
                
                break;
                
            case btnModificarBar:
                
                break;
                
            case btnDetallesBar:
                
                break;
                
            case btnAgregarEmpleado:
                
                break;
                
            case btnEliminarEmpleado:
                
                break;
                
            case btnModificarEmpleado:
                
                break;
                
            case btnAgregarTitular:
                
                break;
                
            case btnEliminarTitular:
                
                break;
                
            case btnModificarTitular:
                
                break;
                
            case btnAñadirProducto:
                
                break;
                
            case btnEliminarProducto:
                
                break;
                
            case btnModificarProducto:
                
                break;
                
            case btnAtrasmenu:
                
                break;
                
            case btnAtrasdialogBares:
                
                break;
                
            case btnAtrasdetalles:
                
                break;
                
                
            
        }
         
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila;
        switch (controlador.BaresMVC.valueOf(e.getComponent().getName())){           
        
            case tbBar:
                
                break;
                
            case tbEmpleado:
                
                break;
                
            case tbTitulares:
                
                break;
                
            case tbProductos:
                
                break;
             
            
               
             }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
