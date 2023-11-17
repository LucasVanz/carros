package model;

import model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroTest {

    @Test
    public void deveIniciarDesligado(){
        Car carro = new Car();


        Assertions.assertFalse(carro.getLigado());
    }
    @Test
    public void deveIniciarComVelocidadeZero(){
        Car carro = new Car();
        // When (Quando)
        // Then (Então)
        Assertions.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }
    @Test
    public void deveLigarCorretamente(){
        Car carro = new Car();

        // When (Quando)
        carro.ligar();


        Assertions.assertTrue(carro.getLigado());
    }
    @Test
    public void deveDesligarCorretamenteUmCarroLigado(){
        Car carro = new Car();

        // When (Quando)
        carro.ligar();
        carro.desligar();

        Assertions.assertFalse(carro.getLigado());
    }
    @Test
    public void deveAcelerarCorretamente(){
        Car carro = new Car();
        carro.ligar();
        carro.acelerar(10);


        Assertions.assertEquals((Integer) 10, carro.getVelocidadeAtual());
    }
    @Test
    public void naoUltrapassaVelocidadeMaxima(){
        Car carro = new Car();

        // When
        carro.ligar();
        carro.acelerar(100);
        carro.acelerar(100);
        carro.acelerar(100);


        Assertions.assertEquals((Integer) 200, carro.getVelocidadeAtual());
    }

    @Test
    public void naoDeveTerVelocidadeInferiorAZero(){
        Car carro = new Car();
        carro.ligar();
        carro.acelerar(100);
        carro.frear(50);
        carro.frear(51);
        Assertions.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }

    @Test
    public void testaMarcaIgual(){
        Car carro1 = new Car("fiat", "uno");
        Car carro2 = new Car("fiat", "uno");
        Assertions.assertEquals(carro1, carro2);
    }

    @Test
    public void aoTrancarUmCarroJaTrancadoNaoDeveFazerNada() {
        // Given
        Car carro = new Car();
        carro.ligar();

        // When
        carro.trancar();
        carro.trancar();

        // Then
        Assertions.assertEquals(true, carro.getTrancado());
    }

}
