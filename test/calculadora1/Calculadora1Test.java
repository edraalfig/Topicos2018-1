/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Edwin
 */
@RunWith(value = Parameterized.class)

public class Calculadora1Test {

    private Calculadora1 cal;
    private int a, b, Resultado;

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> Datos = new ArrayList<>();
        Datos.add(new Object[]{10, 2, 12}); //parametros dados a la suma
        Datos.add(new Object[]{2, 2, 4});   //parametros dados a la suma
        return Datos;
    }

    public Calculadora1Test(int a, int b, int Resultado) {
        this.a = a;
        this.b = b;
        this.Resultado = Resultado;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void Before() {
        cal = new Calculadora1();
    }

    @After
    public void After() {
        System.out.println("Limpiar");
        System.out.println("\n");
        cal.clear();
    }
    // Solo se le esta aplicando el parametrizado a la suma 
    @Test
    public void testSuma() {
        System.out.println("suma");
        int result = cal.suma(a, b);
        System.out.println("El Resultado Esperado Es:"+Resultado+"\nEl Obtenido Es: "+result);
        System.out.println("\n");
        assertThat(Resultado,is(result));  //Uso Del AsserThat Sirve para comparar un tipo de dato u objeto.
        
    }

    @Test
    public void testResta() {
        System.out.println("Resta");
        Calculadora1 instance = new Calculadora1();
        int result = cal.resta(3, 3);
        int Esperado=0;
        System.out.println("El Resultado Esperado Es:"+Esperado+"\nEl Obtenido Es: "+result);
        System.out.println("\n");
        assertEquals(Esperado,result);
        assertSame(Esperado, result); //assertSame Sirve para comparar dos tipos de datos y afirmar que iguales.
        
    }

    @Test
    public void testAdd() {
        System.out.println("Add");
        Calculadora1 instance = new Calculadora1();
        int result = cal.add(3);
        int Esperado=3;
        System.out.println("El Resultado Esperado Es:"+Esperado+"\nEl Obtenido Es: "+result);
        System.out.println("\n");
        assertEquals(Esperado, result);
        assertNotNull(result); // uso del Sirve para afirmar que un tipo de dato u objeto no es nulo.
    }

    @Test
    public void testDivi() {
        System.out.println("Div");
        Calculadora1 instance = new Calculadora1();
        int result = cal.divi(5, 0); //Se genera el ArithmeticException debido a que se esta dividiendo en 0 por lo tanto genera Error en junit
        int Esperado=1;
        System.out.println("El Resultado Esperado Es:"+Esperado+"\nEl Obtenido Es: "+result);
        System.out.println("\n");
        assertEquals(Esperado, result);
    }

    @Test
    public void testSub() {
        System.out.println("Sub");
        Calculadora1 instance = new Calculadora1();
        int result = cal.sub(3);
        int Esperado=-3;
        System.out.println("El Resultado Esperado Es:"+Esperado+"\nEl Obtenido Es: "+result);
        System.out.println("\n");
        assertEquals(Esperado, result);
    }

    @Test
    public void testClear() {
        System.out.println("Clear");
        Calculadora1 instance = new Calculadora1();
        int result = cal.clear();
        System.out.println("\n");
        assertEquals(0, result);
    }

    @Test(timeout = 3000)
    public void testOptima() {
        System.out.println("optima");
        Calculadora1 instance = new Calculadora1();
        instance.optima();
    }

}
