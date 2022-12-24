package br.com.fasda.erp.util;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesMessages implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private void add(String msg, FacesMessage.Severity severety) {
		FacesMessage facesMessage = new FacesMessage(msg);
		facesMessage.setSeverity(severety);
		
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
	public void info(String msg) {
		add(msg, FacesMessage.SEVERITY_INFO);
	}

}
