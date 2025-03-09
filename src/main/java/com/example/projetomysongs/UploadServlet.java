package com.example.projetomysongs;

import com.example.projetomysongs.util.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
import jakarta.servlet.http.*;

@WebServlet(name = "UploadServlet", value = "/upload-servlet")
@MultipartConfig(location="/", maxFileSize=1024*1024*10)
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuario usuario = (Usuario) session.getAttribute("usuario");

        if (usuario == null) {
            response.sendRedirect("login.html");
            return;
        }

        String nome = request.getParameter("nome").replaceAll("[^a-zA-Z0-9_ ]", "").replace(" ", "");
        String estilo = request.getParameter("estilo").replaceAll("[^a-zA-Z0-9]", "");
        String artista = request.getParameter("artista").replaceAll("[^a-zA-Z0-9_ ]", "").replace(" ", "");

        Part filePart = request.getPart("file");
        String fileName = nome + "_" + estilo + "_" + artista + ".mp3";

        File pastaMusicas = new File(getServletContext().getRealPath("/") + "/music");
        pastaMusicas.mkdir();

        File file = new File(pastaMusicas, fileName);
        try (InputStream fileContent = filePart.getInputStream();
             OutputStream out = new FileOutputStream(file)) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = fileContent.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
        }

        response.sendRedirect("upload.html");
    }
}
