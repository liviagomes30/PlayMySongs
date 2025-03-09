package com.example.projetomysongs;

import java.io.IOException;
import com.example.projetomysongs.util.Usuario;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        if (usuario != null && senha != null) {
            String senhaCorreta = usuario.split("@")[0]; // Simples validação: antes do @ é a senha

            if (senha.equals(senhaCorreta)) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", new Usuario(usuario, "normal", "ativo"));

                // Verifica de onde veio o login e redireciona
                String referer = request.getHeader("referer");
                if (referer != null && referer.contains("login.html")) {
                    response.sendRedirect("upload.html");
                } else {
                    response.sendRedirect("index.jsp");
                }
                return;
            }
        }

        // Se falhar, redireciona com erro específico (erro=1 → Usuário ou senha incorretos)
        response.sendRedirect("login.html?erro=1");
    }

}
