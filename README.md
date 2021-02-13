# Annotations

### Definitions

**JRE**: Java Runtime Environment
<br />
**JDK**: Java Development Kit
<br />
**JVM**: Java Virtual Machine

### Bytecode
Quando compilamos os arquivos `.java`, é gerado os arquivos `.class` correspondentes.
O formato desses arquivos é conhecido como `bytecode`. O `bytecode` é interpretado pela JVM.
A JVM é responsável por compilar para a linguagem do sistema operacional vigente.
Daí vem o jargão popular do Java "*Escreva uma vez e rode em qualquer lugar.*".

### JDK vs JRE
JDK e JRE são ambientes de execução de código java. O JRE é basicamente a JVM, ou seja,
o ambiente de produção que interpreta o bytecode. Já o JDK é o ambiente de desenvolvimento.
Aqui temos algumas ferramentas extras disponíveis, como o compilador, o javadoc,
ferramentas de depuração de código etc.

### Javac
Podemos usar o comando `javac` para compilar um arquivo `.java`:<br />
```shell
 javac AnyClass.java
 ```
Isso irá gerar um arquivo `AnyClass.class` no mesmo diretório que o arquivo `.java`.
Para executar esse arquivo, basta usarmos o próprio comando `java`:
````shell
java AnyClass.class ou java AnyClass
````