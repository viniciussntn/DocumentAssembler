package documentassembler;

 /*
- **Grau:** Denomina-se grau o número de subárvores de um nó. Nós de grau zero são chamados de **nós externos** ou **folhas**. Os demais são chamados de **nós internos**.
- **Descendentes**: Nós abaixo de um determinado nó (pertencentes à suas subárvores) são seus descendentes.
- **Nível:** o nível de um nó é o nó de seu pai somado a um. O grau da raiz é zero.
- **Altura:** A altura de um nó é o comprimento do caminho mais longo entre ele e uma folha. A altura de uma árvore é a altura da raiz.
- **Profundidade:** A profundidade de um nó é a distância percorrida da raiz a esse nó.
  */

public abstract class Node {

    public int profundidade;
    public int altura;
    public int grau;
    public int nivel;

    public abstract String getText();
    public abstract int getGrau();
    public abstract int getAltura();

    public void setNivel(int nivel) {
      this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }
}