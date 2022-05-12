public class Carro {
  private String marca;
  private String modelo;
  private int velocidade;
  private int marcha;

  // construtor 
  public Carro(String marca, String modelo, int velocidade, int marcha) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidade = velocidade;
    this.marcha = marcha;
  }
  // construtor 

  // gets
  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public int getMarcha() {
    return marcha;
  }
  // gets

  // sets
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }

  public void setMarcha(int marcha) {
    this.marcha = marcha;
  }
  // sets
}
