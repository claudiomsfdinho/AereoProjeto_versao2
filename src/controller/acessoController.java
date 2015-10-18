package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginControle;
import to.LoginTO;
@WebServlet("/Login")
public class acessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public acessoController() {
        super();
       }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		if(usuario.trim().equals("") || senha.trim().equals(""))
			throw new ServletException("Campo (s) em branco (s) ");
		HttpSession session = request.getSession();
		session.setAttribute("Autenticado", usuario);
		LoginTO loginto = new LoginTO();
		LoginControle cont = new LoginControle(usuario, senha);
		request.getSession().setAttribute("PerfilAcesso",loginto.getPerfil() );
		response.sendRedirect("principal.jsp");
		
		}
		
		}


