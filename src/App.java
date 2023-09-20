import domain.Aeroporto;
import domain.Cidade;
import domain.Cliente;
import domain.Escala;
import domain.Passagem;
import domain.Voo;

public class App {
    public static void main(String[] args) {
        // Criando cidades
        Cidade cidade1 = new Cidade(1, "Rio de Janeiro", "6,748 milhões");
        Cidade cidade2 = new Cidade(2, "São Paulo", "12,252 milhões");

        // Criando aeroportos
        Aeroporto aeroporto1 = new Aeroporto(1, "Galeão", "22° 48' 36\" S 43° 15' 02\" O", cidade1);
        Aeroporto aeroporto2 = new Aeroporto(2, "Congonhas", "23° 37' 34\" S 46° 39' 49\" O", cidade2);

        // Criando voos
        Voo voo1 = new Voo("G3 1331", "Voo do Galeão para Congonhas", 170, aeroporto1, aeroporto2);
        Voo voo2 = new Voo("JJ 5678", "Voo de Congonhas para Galeão", 140, aeroporto2, aeroporto1);

        // Criando clientes
        Cliente cliente1 = new Cliente("000.000.000-00", "Ronaldo Fenômeno", "ronaldofenomeno@gmail.com");
        Cliente cliente2 = new Cliente("111.111.111-11", "Neymar Jr.", "neymar@gmail.com");

        // Criando passagens
        Passagem passagem1 = new Passagem("HKGAUL", 585.56, cliente1, voo1);
        Passagem passagem2 = new Passagem("DKBRIO", 720.0, cliente2, voo2);

        // Adicionando escalas às passagens
        Escala escala1 = new Escala("5/9", "21:06", "22:24", "Poltrona 1A");
        Escala escala2 = new Escala("6/9", "19:35", "21:00", "Poltrona 2B");

        passagem1.addEscala(escala1);
        passagem1.addEscala(escala2);

        Escala escala3 = new Escala("7/9", "19:30", "20:55", "Poltrona 3C");
        passagem2.addEscala(escala3);

        // Exibindo informações
        System.out.println(cliente1);
        System.out.println(passagem1);

        System.out.println(cliente2);
        System.out.println(passagem2);
    }
}
