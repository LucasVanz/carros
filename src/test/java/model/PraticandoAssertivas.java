package model;

import model.Car;
import org.junit.Assert;
import org.junit.Test;

public class PraticandoAssertivas {
    @Test
    public void praticandoAssertTrue(){
        boolean eMaiorDeIdade = true;

        Assert.assertTrue(eMaiorDeIdade);
    }
    @Test
    public void praticandoAssertFalse(){
        boolean foiReprovado = false;

        Assert.assertFalse(foiReprovado);
    }

    @Test
    public void praticandoAssertNull(){
         Car carro = null;

         Assert.assertNull(carro);
    }
    @Test
    public void praticandoAssertNotNull(){
        Car carro = new Car();

        Assert.assertNotNull(carro);
    }

    @Test
    public void praticandoAssertArrayEquals(){
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3};

        Assert.assertArrayEquals(nums1, nums2);
    }

    @Test
    public void praticandoAssertEquals_primitivos(){
        int a = 1;
        int b = 1;

        Assert.assertEquals(a, b);

        char a1 = 'a';
        char b1 = 'a';

        Assert.assertEquals(a1, b1);

        Integer a2 = 1;
        Integer b2 = 1;

        Assert.assertEquals(a2, b2);
    }
    @Test
    public void praticandoAssertEquals_objeto(){
        Car carro = new Car("azul", "fiat", "uno");
        Car carro2 = new Car("azul", "fiat", "uno");

        Assert.assertEquals(carro, carro2);
    }

    @Test
    public void praticandoAssertEquals_detalhes_nas_strings(){
        String nome1 = "Pedro";
        String nome2 = new String("Pedro");

        Assert.assertEquals(nome1, nome2);
    }


}
