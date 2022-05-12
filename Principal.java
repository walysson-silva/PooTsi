public class Principal {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Maria", 12);

    System.out.println(p.getNome());
    System.out.println(p.getIdade());

    Carro carro = new Carro("Fiat", "Fiat Uno", 75, 4);
    System.out.println(carro.getMarca());
    System.out.println(carro.getModelo());
    System.out.println(carro.getVelocidade());
    System.out.println(carro.getMarcha());
  }
}