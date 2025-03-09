# 🎵 Sistema de Gerenciamento de Músicas - Java Web  

Este é um **projeto acadêmico** desenvolvido na disciplina de **Ferramentas Computacionais 3**, utilizando **Java EE (Servlets e JSP)** para criar um **sistema simples de gerenciamento de músicas**.

## 📌 Funcionalidades  
✅ **Autenticação de Usuário** → Login simples com mensagens dinâmicas de erro.  
✅ **Upload de Músicas** → Envio de arquivos MP3 com validação no front e back-end.  
✅ **Biblioteca de Músicas** → Listagem dinâmica dos arquivos armazenados no servidor.  
✅ **Busca de Músicas** → Pesquisa interativa com carregamento assíncrono.  
✅ **Organização por Gêneros** → Músicas classificadas automaticamente.  
✅ **Reprodutor de Áudio** → Interface básica para ouvir as músicas diretamente na plataforma.  

---

## 🛠️ Tecnologias Utilizadas  
🔹 **Java EE (Servlets, JSP)** → Processamento de requisições dinâmicas.  
🔹 **Apache Tomcat** → Servidor de aplicações para execução do projeto.  
🔹 **Bootstrap 5** → Layout responsivo e estilizado.  
🔹 **JavaScript (Fetch API, DOM Manipulation)** → Interatividade dinâmica no front-end.  
🔹 **HTML + CSS** → Estruturação e personalização da interface.  

---

## 🚀 Configuração do Ambiente de Desenvolvimento  

### 1️⃣ Instalando o Apache Tomcat  
🔹 **Baixe o Tomcat** acessando:  
➡️ [Apache Tomcat 10.1.36](https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.36/bin/apache-tomcat-10.1.36.zip)  

🔹 **Crie uma pasta para o Tomcat:**  
Crie uma pasta chamada **`ApacheTomCat`** no diretório `C:\` e extraia o arquivo **.zip** dentro dela:  
C:\ApacheTomCat\apache-tomcat-10.1.36\


🔹 **Executando o Tomcat:**  
- Para **ativar** o Tomcat, execute o seguinte arquivo:  
%CATALINA_HOME%\bin\startup.bat

- Para **desativar** o Tomcat, execute:  
%CATALINA_HOME%\bin\shutdown.bat

🔹 **Testando a instalação:**  
Acesse no navegador:  
➡️ `http://localhost:8080/`  
Se a página do Tomcat abrir, a instalação foi concluída com sucesso.  

---

### 2️⃣ Baixando e Configurando o Projeto  
#### 📥 Clonando o repositório do GitHub  
Abra o terminal ou **Git Bash** e execute:  
```bash
git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
```
Ou baixe o projeto manualmente clicando em "Code" → "Download ZIP" no GitHub e extraia os arquivos.
## 📁 Importando o Projeto no IntelliJ IDEA Ultimate

1. Abra o IntelliJ IDEA Ultimate.
2. Vá para `File → Open` e selecione a pasta do projeto.
3. Aguarde o IntelliJ carregar todas as dependências.

## 3️⃣ Configurando o Tomcat no IntelliJ

1. Vá para `File → Settings`.
2. Localize `Application Servers`.
3. Adicione o caminho do Apache Tomcat instalado anteriormente.

### Configuração da Execução do Servidor

1. Vá para `Run → Edit Configurations`.
2. Clique no botão `+`, selecione `Tomcat Server → Local`.
3. Clique no botão `"Fix"` e selecione a opção `"...exploded"`.
4. Clique em `"Apply"` e `"OK"`.

## Rodando a Aplicação

 ### 1️⃣ Execute o projeto clicando no botão `"Run"` (ou `Shift + F10`). Acesse no navegador:

   ```arduino
   http://localhost:8080/SistemaDeMusicas/
   ```
### 2️⃣ Realizando Login
- **Use um e-mail qualquer para login.**
- **A senha é o nome de usuário antes do @**  
  *(Exemplo: usuario@gmail.com → Senha: usuario).*
- **Se errar a senha, um alerta será exibido na tela.**

### 3️⃣ Enviando Músicas
- **Vá até a tela de Upload e selecione um arquivo MP3 válido.**
- **Após o envio, a música será adicionada à biblioteca.**

### 4️⃣ Buscando e Reproduzindo Músicas
- **Acesse a opção Buscar Música e pesquise pelo nome do arquivo.**
- **Clique no play para ouvir diretamente no navegador.**

### 5️⃣ Visualizando a Biblioteca
- **Acesse a opção Carregar Biblioteca para visualizar todas as músicas disponíveis.**
- **As músicas são organizadas automaticamente por gênero com base no nome do arquivo.**
