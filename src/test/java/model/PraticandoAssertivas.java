package model;

import model.Car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PraticandoAssertivas {
    @Test
    public void praticandoAssertTrue(){
        boolean eMaiorDeIdade = true;

//        Assertions.assertTrue(eMaiorDeIdade);
    }
    @Test
    public void praticandoAssertFalse(){
        boolean foiReprovado = true;

        Assertions.assertEquals(true, foiReprovado);
    }

    @Test
    public void praticandoAssertNull(){
         Car carro = null;

        Assertions.assertNull(carro);
    }
    @Test
    public void praticandoAssertNotNull(){
        Car carro = new Car();

        Assertions.assertNotNull(carro);
    }

    @Test
    public void praticandoAssertArrayEquals(){
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3};

        Assertions.assertArrayEquals(nums1, nums2);
    }

    @Test
    public void praticandoAssertEquals_primitivos(){
        int a = 1;
        int b = 1;

        Assertions.assertEquals(a, b);

        char a1 = 'a';
        char b1 = 'a';

        Assertions.assertEquals(a1, b1);

        Integer a2 = 1;
        Integer b2 = 1;

        Assertions.assertEquals(a2, b2);
    }


    @Test
    public void praticandoAssertEquals_detalhes_nas_strings(){
        String nome1 = "Pedro";
        String nome2 = new String("Pedro");

        Assertions.assertEquals(nome1, nome2);
    }


}
