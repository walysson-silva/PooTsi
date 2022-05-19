public class Principal {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Maria", 12);

    System.out.println(p.getNome());
    System.out.println(p.getIdade());

    Carro Car = new Carro("Fiat", "Fiat Uno", 75, 4);
    System.out.println(Car.getMarca());
    System.out.println(Car.getModelo());
    System.out.println(Car.getVelocidade()+ " Quilomêtros");
    Car.acelerar();
    System.out.println(Car.getVelocidade()+ " Quilomêtros");
    System.out.println(Car.getMarcha()+ " Marcha");
    System.out.println();

    ContaAgua conta = new ContaAgua("Maria de Fulana", 10, 8.5);
    System.out.println("Olá "+conta.getConsumidor());
    System.out.println("Você consumiu "+conta.getMetroConsumido() + "metros de água");
    System.out.println("Cada metro vale " + conta.getValorMetro());
    System.out.println("Portanto seu débito atual é: " + conta.CalculoConta());
  }
}