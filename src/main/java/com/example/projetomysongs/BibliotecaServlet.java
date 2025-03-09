package com.example.projetomysongs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "BibliotecaServlet", value = "/biblioteca-servlet")
public class BibliotecaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json"); // Define o tipo da resposta como JSON
        response.setCharacterEncoding("UTF-8");

        File pastaMusicas = new File(getServletContext().getRealPath("/") + "/music"); // obtém o caminho absoluto da pasta /music
        List<String> listaMusicas = new ArrayList<>();

        if (pastaMusicas.exists() && pastaMusicas.listFiles() != null) {
            for (File file : pastaMusicas.listFiles()) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".mp3")) {
                    listaMusicas.add(file.getName());
                }
            }
        }

        PrintWriter out = response.getWriter();
        out.print("[");
        for (int i = 0; i < listaMusicas.size(); i++) {
            out.print("\"" + listaMusicas.get(i) + "\""); // aspas duplas
            if (i < listaMusicas.size() - 1) {
                out.print(",");
            }
        }
        out.print("]");
        // ex: ["rock_song.mp3", "pop_music.mp3", "jazz_tune.mp3"]
        out.flush();
    }
}
