# Sistema de Prestação de Serviços - Visão do Sistema

## Componentes

### 1. Módulo de Clientes

- **Responsabilidades:**
  - Gerenciar perfis de clientes.
  - Processar solicitações de serviços.
  - Manter histórico de transações.

### 2. Módulo de Prestadores de Serviços

- **Responsabilidades:**
  - Gerenciar perfis de prestadores de serviços.
  - Aceitar/rejeitar solicitações de serviços.
  - Manter disponibilidade e histórico de serviços prestados.

### 3. Módulo de Agendamento

- **Responsabilidades:**
  - Facilitar o agendamento de serviços entre clientes e prestadores.
  - Gerenciar horários disponíveis.

### 4. Módulo de Pagamento

- **Responsabilidades:**
  - Processar transações financeiras entre clientes e prestadores.
  - Manter registros de transações.

### 5. Módulo Administrativo

- **Responsabilidades:**
  - Administrar usuários e permissões.
  - Monitorar atividades do sistema.
  - Gerar relatórios.

## Relacionamentos

- O Módulo de Clientes interage com o Módulo de Agendamento e o Módulo de Pagamento.
- O Módulo de Prestadores de Serviços interage com o Módulo de Agendamento e o Módulo de Pagamento.
- O Módulo de Agendamento coordena entre clientes e prestadores.
- O Módulo de Pagamento facilita transações financeiras entre clientes e prestadores.
- O Módulo Administrativo interage com todos os outros módulos para administração global.

