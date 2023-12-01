# Componentes

## Aplicação Web - Frontend

### Página Inicial
- Exibe a interface principal da aplicação, permitindo a navegação para outras funcionalidades.

### Formulário de Cadastro
- Permite o preenchimento de informações para o cadastro de prestadores de serviço e clientes.

### Painel Administrativo
- Interface destinada aos administradores para gerenciar prestadores de serviço, avaliações e configurações.

### Página de Serviços
- Apresenta os serviços disponíveis para os clientes, permitindo a solicitação e agendamento.

## API - Serviços

### Gestão de Prestadores
- Fornece serviços para cadastrar, atualizar e consultar informações de prestadores de serviço.

### Gestão de Clientes
- Responsável pelo cadastro, atualização e consulta de informações dos clientes.

### Agendamento de Serviços
- Gerencia a criação, atualização e consulta de agendamentos de serviços.

### Avaliações
- Fornece serviços relacionados a avaliações, permitindo que clientes avaliem prestadores de serviço.

## Banco de Dados - Persistência

### PrestadorDAO
- Lida com a persistência de dados relacionados a prestadores de serviço.

### ClienteDAO
- Gerencia a persistência de informações dos clientes.

### ServicoDAO
- Responsável pela persistência de dados relacionados a serviços oferecidos.

### AvaliacaoDAO
- Realiza a persistência de avaliações feitas pelos clientes.

## Servidor de Aplicação

### Tomcat
- Servidor web utilizado para implantar e executar a aplicação.

## Banco de Dados

### MySQL
- Banco de dados relacional utilizado para armazenar dados do sistema.

## Componentes Externos

### API de Pagamento
- Integração com um serviço externo para processar pagamentos de serviços.

### API de Geolocalização
- Utilizada para obter informações de localização para serviços que dependem de geolocalização.

Este é um exemplo básico e você deve personalizar conforme as necessidades específicas do seu sistema de prestação de serviço. Certifique-se de incluir componentes relevantes e descrever suas responsabilidades.