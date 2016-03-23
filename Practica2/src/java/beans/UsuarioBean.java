package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.codec.digest.DigestUtils;

import dao.UsuarioDAO;
import model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String verificarDatos() throws Exception{
		UsuarioDAO usuDAO = new UsuarioDAO();
		Usuario user;
		try{
                    user = usuDAO.verificarDatos(this.usuario);
                    if (user != null) {
                        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", user);
                        return "valid";
                    }else
                        return "invalid";
                }catch(Exception e){
                    throw e;
                }
	}

	public boolean verificarSesion() {
		if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") == null)
                    return false;
		else
                    return true;
	}

	public String cerrarSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "index";
	}
}