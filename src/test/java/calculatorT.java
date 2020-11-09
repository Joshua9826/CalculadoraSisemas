import SI2.operacion;

/**
 *
 * @author joshu
 */
public class calculatorT {
    public calculatorT() {
    }
    operacion calculator1 = new operacion();
    @Test
    public void testSuma1(){
        assertEquals(5, calculator1.sum(2, 3));
    }
    @Test
    public void testSuma2(){
        assertEquals(6, calculator1.sum(3,3));
    }
    @Test
    public void testResta1(){
        assertEquals(2, calculator1.rest(5, 3));
    }
    @Test
    public void testResta2(){
        assertEquals(2, calculator1.rest(6, 3));
    }
    @Test
    public void testMultiplicacion1(){
        assertEquals(5, calculator1.multip(2, 3));
    }
    @Test
    public void testMultiplicacion2(){
        assertEquals(6, calculator1.multip(3,3));
    }
    @Test
    public void testDivision1(){
        assertEquals(2, calculator1.div(5, 3));
    }
    @Test
    public void testDivision2(){
        assertEquals(2, calculator1.div(6, 3));
    }
    @Test
    public void testExponenciacion1(){
        assertEquals(2, calculator1.exp(5, 3));
    }
    @Test
    public void testExponenciacion2(){
        assertEquals(2, calculator1.exp(6, 3));
    }

    
    private void assertEquals(int i, int sum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
