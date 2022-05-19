public class ContaAgua {
  private String consumidor;
  private double metroConsumido;
  private double valorMetro;

  // construtor 
  public ContaAgua(String consumidor, double metroConsumido, double valorMetro) {
    this.consumidor = consumidor;
    this.metroConsumido = metroConsumido;
    this.valorMetro = valorMetro;
  }
  // construtor

  public String getConsumidor() {
    return consumidor;
  }

  public void setConsumidor(String consumidor) {
    this.consumidor = consumidor;
  }

  public double getMetroConsumido() {
    return metroConsumido;
  }

  public void setMetroConsumido(double metroConsumido) {
    this.metroConsumido = metroConsumido;
  }

  public double getValorMetro() {
    return valorMetro;
  }

  public void setValorMetro(double valorMetro) {
    this.valorMetro = valorMetro;
  }

  public double CalculoConta(){
    return valorMetro * metroConsumido;
  }

}