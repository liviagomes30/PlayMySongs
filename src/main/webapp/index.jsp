<%@ page import="com.example.projetomysongs.util.Usuario" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    boolean logado = (usuario != null);
%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home - PlayMySongs</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">PlayMySongs</a>

        <% if (!logado) { %>
        <form class="d-flex ms-auto" action="login-servlet" method="post">
            <input class="form-control me-2" type="email" name="usuario" placeholder="Email" required>
            <input class="form-control me-2" type="password" name="senha" placeholder="Senha" required>
            <button class="btn btn-light" type="submit">Login</button>
        </form>
        <% } else { %>
        <span class="text-light me-3">Bem-vindo(a), <%= usuario.getNome() %>!</span>
        <a href="logoff-servlet" class="btn btn-danger">Sair</a>
        <% } %>
    </div>
</nav>

<div class="container text-center mt-5">
    <!-- Mensagem de erro dinâmica -->
    <div id="mensagemErro" class="alert alert-danger text-center d-none mt-3" role="alert"></div>

    <h2 class="mb-4"><i class="fas fa-music"></i> Bem-vindo(a) ao PlayMySongs</h2>
    <button class="btn btn-custom btn-lg m-2" onclick="verificarLogin('upload.html')">📤 Enviar Música</button>
    <button class="btn btn-custom btn-lg m-2" onclick="location.href='search.html'">🔍 Buscar Música</button>
    <button class="btn btn-custom btn-lg m-2" onclick="location.href='biblioteca.html'">🎶 Carregar Biblioteca</button>
</div>

<script>
    function verificarLogin(destino) {
        <% if (!logado) { %>
        window.location.href = "login.html";
        <% } else { %>
        window.location.href = destino;
        <% } %>
    }

</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
