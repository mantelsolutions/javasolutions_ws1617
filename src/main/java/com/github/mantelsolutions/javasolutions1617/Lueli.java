package com.github.mantelsolutions.javasolutions1617;

/**
 * Gluehwein task.
 */
public class Lueli {

    public static final String ALKOHOLFREIER_GLUEHWEIN = "alkoholfreier Gluehwein";
    public static final String WEIßER_GLUEHWEIN = "weißer Gluehwein";
    public static final String ROTEN_GLUEHWEIN = "roten Gluehwein";

    /**
     * Method for getting gluehwein using certain criterias, see return.
     *
     * @param uhrzeit                     time you request a gluehwein
     * @param anzahlGetrunkenerGluehweine number of gluehwein drunk
     * @return null if outside the business hours, ALKOHOLFREIER_GLUEHWEIN if you drunk 5 or more gluehwein, WEIßER_GLUEHWEIN if you order before 21:00, ROTEN_GLUEHWEIN if you order after 21:00 but before 22:00.
     */
    public String getGluehwein(int uhrzeit, int anzahlGetrunkenerGluehweine) {
        if (uhrzeit < 16 || uhrzeit > 22) {
            return null;
        } else if (anzahlGetrunkenerGluehweine >= 5) {
            return ALKOHOLFREIER_GLUEHWEIN;
        } else if (uhrzeit < 21) {
            return WEIßER_GLUEHWEIN;
        } else {
            return ROTEN_GLUEHWEIN;
        }

    }
}
