package model;
// Generated 23/03/2016 04:10:05 AM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String correo;
     private String nombreusuario;
     private String contrasena;
     private Comentario comentario;

    public Usuario() {
    }

	
    public Usuario(String correo) {
        this.correo = correo;
    }
    public Usuario(String correo, String nombreusuario, String contrasena, Comentario comentario) {
       this.correo = correo;
       this.nombreusuario = nombreusuario;
       this.contrasena = contrasena;
       this.comentario = comentario;
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombreusuario() {
        return this.nombreusuario;
    }
    
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Comentario getComentario() {
        return this.comentario;
    }
    
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }




}


