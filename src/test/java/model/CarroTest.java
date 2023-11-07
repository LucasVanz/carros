package model;

import model.Car;
import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    // GRUPO: Camila, Pedro Henrique, Adir e Lucas Vanzella
    @Test
    public void deveIniciarDesligado(){
        Car carro = new Car();

        Assert.assertFalse(carro.getLigado());
    }
    @Test
    public void deveIniciarComVelocidadeZero(){
        Car carro = new Car();
        // When (Quando)
        // Then (Então)
        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }
    @Test
    public void deveLigarCorretamente(){
        Car carro = new Car();

        // When (Quando)
        carro.ligar();


        Assert.assertTrue(carro.getLigado());
    }
    @Test
    public void deveDesligarCorretamenteUmCarroLigado(){
        Car carro = new Car();

        // When (Quando)
        carro.ligar();
        carro.desligar();


        Assert.assertFalse(carro.getLigado());
    }
    @Test
    public void deveAcelerarCorretamente(){
        Car carro = new Car();
        carro.ligar();
        carro.acelerar(10);


        Assert.assertEquals((Integer) 10, carro.getVelocidadeAtual());
    }
    @Test
    public void naoUltrapassaVelocidadeMaxima(){
        Car carro = new Car();

        // When
        carro.ligar();
        carro.acelerar(100);
        carro.acelerar(100);
        carro.acelerar(100);


        Assert.assertEquals((Integer) 200, carro.getVelocidadeAtual());
    }

    @Test
    public void naoDeveTerVelocidadeInferiorAZero(){
        Car carro = new Car();
        carro.ligar();
        carro.acelerar(100);
        carro.frear(50);
        carro.frear(51);
        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }

}
