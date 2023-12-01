# Sistema de Prestação de Serviços - Visão de Contêiner

## Contêineres

### 1. Aplicação Web

- **Tecnologia:**
  - Framework da Web (por exemplo, Spring Boot, Django).
  - Frontend (HTML, CSS, JavaScript).

- **Responsabilidades:**
  - Fornecer interface de usuário para clientes e prestadores.
  - Facilitar interações do usuário com os módulos do sistema.

### 2. Servidor de Aplicação

- **Tecnologia:**
  - Apache Tomcat, Nginx, etc.

- **Responsabilidades:**
  - Hospedar a aplicação web.
  - Gerenciar solicitações HTTP.

### 3. Servidor de Banco de Dados

- **Tecnologia:**
  - MySQL, PostgreSQL, etc.

- **Responsabilidades:**
  - Armazenar dados do sistema.
  - Gerenciar transações de banco de dados.

## Relacionamentos

- A Aplicação Web interage com os Servidores de Aplicação e Servidores de Banco de Dados.
- Os Servidores de Aplicação hospedam a lógica da aplicação e processam solicitações HTTP.
- Os Servidores de Banco de Dados armazenam e recuperam dados do sistema.


