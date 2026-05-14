package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGetGenM() {
        Persoana pers = new Persoana("Gigel", "1981208416992");
        assertEquals("M", pers.getSex());
    }

    @Test
    public void testGetGenFDupa2000() {
        Persoana pers2 = new Persoana("Gigela", "6981208416992");
        assertEquals("F", pers2.getSex());
    }

    @Test
    public void testGetCNP() {
        Persoana pers = new Persoana("Gigel", "1981208416992");
        assertTrue(pers.checkCNP());
    }

    @Test
    public void testBoundaryInferiorNascut2000() {
        Persoana pers2 = new Persoana("Gigela", "6000101416992");
        assertEquals("F", pers2.getSex());
    }

    @Test
    public void testBoundarySuperiorNascutAzi() {
        Persoana pers2 = new Persoana("Gigela", "6260514416992");
        assertEquals(0, pers2.getVarsta());
    }

    @Test
    public void crossCheckGetGen() {
        String cnp = "6260514416992";
        Persoana pers = new Persoana("Gigela", cnp);
        String expected="", actual="";
        actual = pers.getSex();
        if(Integer.parseInt(String.valueOf(cnp.charAt(0))) % 2 == 0) {
            expected = "F";
        } else
            expected = "M";
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class) //testul pica daca NU sunt aruncate exceptiile
    public void errorConditionLungimeCNP(){
        Persoana pers = new Persoana("Gigela", "626051441699");
        pers.checkCNP();
    }

}