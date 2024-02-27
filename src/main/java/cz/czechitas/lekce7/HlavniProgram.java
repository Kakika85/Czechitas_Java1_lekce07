package cz.czechitas.lekce7;

import java.time.Month;
import java.time.MonthDay;

/**
 * Hlaví třída pro lekci 7.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        Svatky svatky = new Svatky();

        System.out.printf("V seznamu je %d jmen.", svatky.getPocetJmen()).println();
        System.out.printf("Monika má svátek %s.", svatky.vratKdyMaSvatek("Monika")).println();
        System.out.printf("Eva je v seznamu svátků: %b.", svatky.jeVSeznamu("Eva")).println();

        System.out.println("V seznamu jsou následující jména:");
        svatky.getSeznamJmen().forEach(jmeno -> System.out.printf("- %s", jmeno).println());

/*
        svatky.smazSvatek("Přemysl");
        System.out.printf("Po smazání Přemysla je v seznamu je %d jmen.", svatky.getPocetJmen()).println();

        svatky.pridejSvatek("Laura", 1, 6);
        svatky.pridejSvatek("Jarmil", 2, Month.JUNE);
        svatky.pridejSvatek("Tamara", MonthDay.of(6, 3));
        svatky.pridejSvatek("Kevin", MonthDay.of(Month.JUNE, 3));
        System.out.printf("Po přidání Laury, Jarmila, Tamary a Kevina je v seznamu je %d jmen.", svatky.getPocetJmen()).println();
*/
    }

}
