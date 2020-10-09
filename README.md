# **Document Assembler**
Document Assembler desenvolvido em Java utilizando os padrões Composite (na implementação dos nós) e Strategy (na implementação dos métodos de percorrimento da árvore). 

### **Funcionamento**
O Document Assembler recebe a referência à raiz de uma árvore, que é composta por objetos do tipo __Branch__ e __Leaf__, ambos implementações da classe abstrata __Node__. Os objetos do tipo __Node__ tem métodos públicos para acesso de grau e altura. Já objetos do tipo __Node__ tem subnós, que podem ser do tipo __Leaf__ ou ainda do tipo __Branch__, com seus respectivos subnós, de acordo com o padrão *Composite*.
Objetos do tipo __Branch__ tem métodos de acesso, adição e remoção de seus subnós, que são gerenciados por _ArrayLists_. Por fim, objetos do tipo __Leaf__ tem métodos de acesso e sobrescrição de seu campo de texto. Há dois métodos de impressão: __consoleAssemble__, que retorna o texto construído no terminal, e ó __txtAssemble__, que retorna o texto num txt indicado na construção do document assembler.

__Percorrimento__: Há duas estratégias de percorrimento: *em ordem* e *em ordem com log*, que imprime informações como o nível do nó, grau, etc.

### **Construção**
Para executar o programa, execute o seguinte comando na pasta imediatamente anterior à raiz:
```
java documentassembler.documentAssembler;
```

### **Licença**
Não se aplica.
