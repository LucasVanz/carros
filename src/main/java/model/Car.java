package model;

import java.util.Objects;

public class Car {
        private String marca;
        private String modelo;
        private Boolean ligado;
        private Integer velocidadeAtual;
        private Integer velocidadeMaxima;
        private Boolean trancado;

    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Car() {
            this.velocidadeAtual = 0;
            this.ligado = false;
            this.velocidadeMaxima = 200;
            this.trancado = true;
        }
        public void ligar() {
            this.ligado = true;
        }

        public void desligar() {
            this.ligado = false;
        }

        public void acelerar(Integer velocidade) {
//        this.velocidadeAtual += velocidade;
            if(this.velocidadeMaxima <= velocidade + velocidadeAtual) {
                this.velocidadeAtual = this.velocidadeMaxima;
            } else {
                this.velocidadeAtual = velocidade + velocidadeAtual;
            }
        }

        public void frear(Integer velocidade) {
            this.velocidadeAtual -= velocidade;
            this.velocidadeAtual = Math.max(this.velocidadeAtual - velocidade, 0);
        }

        public void trancar(){
        if(trancado == true) {
                System.out.println("Ja esta trancado");
            } else {
                trancado = true;
            }
        }


        public Boolean getLigado() {
            return ligado;
        }

        public Integer getVelocidadeAtual() {
            return velocidadeAtual;
        }

        public Boolean getTrancado() {
        return trancado;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(marca, car.marca) && Objects.equals(modelo, car.modelo);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(marca, modelo);
//    }
}