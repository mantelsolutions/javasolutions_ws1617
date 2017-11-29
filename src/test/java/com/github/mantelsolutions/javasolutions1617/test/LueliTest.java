package com.github.mantelsolutions.javasolutions1617.test;

import com.github.mantelsolutions.javasolutions1617.Lueli;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LueliTest {

    private Lueli fixture = new Lueli();

    @Test
    public void testGetGluehwein_zuFrueh() {
        String result = this.fixture.getGluehwein(0, 0);
        assertEquals("Glühwein wurde ausgeschenkt, obwohl keine Geschäftszeit vorlag", null, result);
    }

    @Test
    public void testGetGluehwein_zuSpaet() {
        String result = this.fixture.getGluehwein(23, 0);
        assertEquals("Glühwein wurde ausgeschenkt, obwohl keine Geschäftszeit vorlag", null, result);
    }

    @Test
    public void testGetGluehwein_nach5GluehweinNurAlkoholfrei() {
        String result = this.fixture.getGluehwein(20, 5);
        assertEquals("Glühwein wurde ausgeschenkt, obwohl keine Geschäftszeit vorlag", Lueli.ALKOHOLFREIER_GLUEHWEIN, result);
    }

    @Test
    public void testGetGluehwein_weisserGluehwein() {
        String result = this.fixture.getGluehwein(20, 1);
        assertEquals("Glühwein wurde ausgeschenkt, obwohl keine Geschäftszeit vorlag", Lueli.WEIßER_GLUEHWEIN, result);
    }

    @Test
    public void testGetGluehwein_roterGluehwein() {
        String result = this.fixture.getGluehwein(21, 1);
        assertEquals("Glühwein wurde ausgeschenkt, obwohl keine Geschäftszeit vorlag", Lueli.ROTEN_GLUEHWEIN, result);
    }
}
