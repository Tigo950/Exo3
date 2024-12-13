package jeu.test;

import jeu.personnage.personnage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class personnageTest {

        @Test
        public void testTournerUneFois() {
            personnage personnage = new personnage();
            assertEquals("EST", personnage.tourner(1));
        }

        @Test
        public void testTournerDeuxFois() {
            personnage personnage = new personnage();
            assertEquals("SUD", personnage.tourner(2));
        }
    @Test
    public void testTournertroisFois() {
        personnage personnage = new personnage();
        assertEquals("OUEST", personnage.tourner(3));
    }
    @Test
    public void testTournerQuatreFois() {
        personnage personnage = new personnage();
        assertEquals("NORD", personnage.tourner(4));
    }
    @Test
    public void testTournerAvecGrandNombre() {
        personnage personnage = new personnage();
        assertEquals("OUEST", personnage.tourner(7)); // Équivalent à 1 tour
    }
        /*
@Test
        public void testTournerQuatreFois() {
            personnage personnage = new personnage();
            assertEquals("NORD", personnage.tourner(4));
        }
        @Test
        public void testTournerAvecGrandNombre() {
            personnage personnage = new personnage();
            assertEquals("EST", personnage.tourner(5)); // Équivalent à 1 tour
        }

        @Test
        public void testTournerZeroFois() {
            personnage personnage = new personnage();
            assertEquals("NORD", personnage.tourner(0));
        }

        */
    }


