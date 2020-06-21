package quntear.dpf.boundry;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("index")
@ViewScoped
public class IndexView implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private LoginBean loginBean;
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
	
	public void update() {
		this.username = loginBean.getUsername();
		this.password = loginBean.getPassword();
	}
}
