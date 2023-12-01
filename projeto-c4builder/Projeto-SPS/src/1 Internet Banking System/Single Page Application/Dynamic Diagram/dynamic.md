# Sistema de Prestação de Serviços - Visão Dinâmica

## Diagrama de Sequência - Solicitação de Serviços

**Ator Principal:** Cliente

**Objetivo:** Solicitar um serviço através da aplicação web.

**Cenário:**

1. **Cliente** acessa a interface da aplicação web.
2. **Aplicação Web** exibe opções de serviços disponíveis.
3. **Cliente** seleciona um serviço desejado.
4. **Aplicação Web** processa a solicitação e envia para o **Servidor de Aplicação**.
5. **Servidor de Aplicação** valida a solicitação e interage com o **Servidor de Banco de Dados** para obter informações necessárias.
6. **Servidor de Aplicação** retorna os detalhes do serviço ao **Cliente**.
7. **Cliente** confirma a solicitação.
8. **Servidor de Aplicação** realiza ações necessárias para confirmar a solicitação e atualiza o **Servidor de Banco de Dados**.
9. **Cliente** recebe confirmação da solicitação.


