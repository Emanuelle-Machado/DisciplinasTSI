# Sistema de Prestação de Serviços - Visão de Implantação

## Ambientes

### Ambiente de Produção

- **Servidores:**
  - Servidor Web
  - Servidor de Aplicação
  - Servidor de Banco de Dados

### Ambiente de Desenvolvimento

- **Servidores:**
  - Servidor de Desenvolvimento
  - Servidor de Testes

## Servidores

### Servidor Web

- **Localização:** Ambiente de Produção
- **Responsabilidade:** Servir páginas web estáticas e atuar como ponto de entrada para solicitações de clientes.

### Servidor de Aplicação

- **Localização:** Ambiente de Produção e Desenvolvimento
- **Responsabilidade:** Hospedar a lógica de negócios da aplicação e interagir com o servidor de banco de dados.

### Servidor de Banco de Dados

- **Localização:** Ambiente de Produção
- **Responsabilidade:** Armazenar e fornecer acesso aos dados do sistema.

## Conexões

- **Cliente <-> Servidor Web:**
  - Protocolo HTTPS para comunicação segura.
  
- **Servidor Web <-> Servidor de Aplicação:**
  - Comunicação HTTP ou protocolo de aplicação específico.

- **Servidor de Aplicação <-> Servidor de Banco de Dados:**
  - Conexão segura usando protocolo específico do banco de dados.


