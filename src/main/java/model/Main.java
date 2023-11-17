package model;

public class Main {

    /**
     *
     * Um carro tem os seguintes atributos:
     *  - cor
     *  - marca
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *  - velocidadeMáxima
     *
     *  Enquanto o carro estiver desligado deve ser capaz de:
     *  - Ligar
     *  - Mostrar estado atual (toString())
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     *
     * - Só podemos realizar as ações como acelerar e frear com o carro ligado
     * - Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - O carro não pode passar de sua velocidade máxima
     *
     */
    public static void main(String[] args) {

        // Teste #1 - Deve iniciar desligado
        // Given (Dado)
        Car carro_01 = new Car();
        // When (Quando)
        // Then (Então)

        System.out.println("Teste 01");
        System.out.println(carro_01.getLigado() == false);

        // Teste #2 - Deve iniciar com velocidade Zero
        // Given (Dado)
        Car carro_02 = new Car();
        // When (Quando)
        // Then (Então)
        System.out.println("Teste 02");
        System.out.println(carro_02.getVelocidadeAtual() == 0);

        // Teste #3 - Deve ligar corretamente
        // Given (Dado)
        Car carro_03 = new Car();

        // When (Quando)
        carro_03.ligar();

        // Then (Então)
        System.out.println("Teste 03");
        System.out.println(carro_03.getLigado() == true);


        // Teste #4 - Deve desligar corretamente um carro ligado
        // Given (Dado)
        Car carro_04 = new Car();

        // When (Quando)
        carro_04.ligar();
        carro_04.desligar();

        // Then (Então)
        System.out.println("Teste 04");
        System.out.println(carro_04.getLigado() == false);


        // Teste #5 - Deve acelerar corretamente um carro ligado
        // Given (Dado)
        Car carro_05 = new Car();

        // When (Quando)
        carro_05.ligar();
        carro_05.acelerar(10);

        // Then (Então)
        System.out.println("Teste 05");
        System.out.println(carro_05.getVelocidadeAtual() == 10);

        // Teste #6 - Não pode ultrapassar a velocidade maxima
        // Given
        Car carro_06 = new Car();

        // When
        carro_06.ligar();
        carro_06.acelerar(100);
        carro_06.acelerar(100);
        carro_06.acelerar(100);

        // Then
        System.out.println("Teste 06");
        System.out.println(carro_06.getVelocidadeAtual() == 200);

        // FAZER PRA AULA QUE VEM 06/11 ------> JUnit
    }

}
