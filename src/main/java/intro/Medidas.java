// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Bom dia!!!");
        System.out.println("Calculo de Areas");
        // Calculo de área = Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + ", e comprimento de "
                + comprimento + ", a área do tapete é de " + largura * comprimento + " m².");

    }

    public void calcularAreaModoExtenso(){
        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + ", e comprimento de "
                + comprimento + ", a área do tapete é de " + resultado + " m².");

    }

    public void calcularAreaModoCompacto(){
        // Calculo de área = Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + ", e comprimento de "
                            + comprimento + ", a área do tapete é de " + largura * comprimento + " m².");
    }

}
