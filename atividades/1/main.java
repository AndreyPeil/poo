public class main{
    public static void main(String[] args) {
        carro carro1 = new carro("Miata", "MX-5", 1990, -1);

        System.out.println("modelo:" + carro1.getModelo());
        System.out.println("marca:" + carro1.getMarca());
        System.out.println("ano:" + carro1.getAno());
        System.out.println("preco:" + carro1.getPreco());

    
    }
}