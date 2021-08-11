# Exceções checadas e não checadas

Em Java, as classes de exceções estão organizadas em dois grandes grupos:
- Checked Exceptions
- Not Checked Exceptions

### Checked Exceptions
O compilador consegue identificar quando uma exceção desse grupo está sendo lançada e exige que tornamos isso explícito na assinatura do método.
O tratamento da exceção também será exibido.  
A principal classe desse grupo é a `Exception`.

### Not Checked Exceptions
O tratamento das exceções desse grupo são opcionais.  
A principal classe de grupo é a `RuntimeException`.