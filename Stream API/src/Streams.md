# Streams

## Tipos de operadores
- Built Operations
- Intermediaries Operations
- Terminal Operations

### Built Operations
Built Operations são operações que nos permitem criar streams, como o método, stream() de uma lista.

### Intermediaries Operations
Intermediaries Operations são operações que podemos utilizar para compor funcionalidades em uma stream.
O retorno de uma operação intermediária é uma nova stream.

### Terminal Operations
Terminal Operations são operações que devemos utilizar no final de uma stream.
O retorno de uma operação de término pode ser um valor diferente de uma stream,
como um tipo primitivo ou um retorno void.

## Tipos de Streams
- Ordenadas
- Não ordenadas

## Tipos de processamento
- Sequencial (um dado por vez, uma única linha de processamento)
- Paralelo (mais de um dado por vez, várias linhas simultâneas de processamento)