package model;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;
public class Login implements Cloneable,Serializable {
//private int id;
//private String usuario;
//private String senha;
private int perfil;
	public Login() {

	    }

	  

	    public int getPerfil() {
	          return this.perfil;
	    }
	    public void setPerfil(int PerfilIn) {
	          this.perfil = PerfilIn;
	    }

}


