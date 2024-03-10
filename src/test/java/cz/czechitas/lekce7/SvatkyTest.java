package cz.czechitas.lekce7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

    /**
     * Testuje metodu {@link Svatky#vratKdyMaSvatek(String)}
     */
    @Test
    void kdyMaSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(MonthDay.of(5, 18), svatky.vratKdyMaSvatek("Nataša"));
        assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    @Test
    void testKdyMaSvatekMonika() {
        Svatky svatky = new Svatky();
        MonthDay kdyMaSvatekMonika = svatky.vratKdyMaSvatek("Monika");
        System.out.println(kdyMaSvatekMonika);

        assertEquals(MonthDay.of(5, 21), kdyMaSvatekMonika);
    }

    /**
     * Testuje metodu {@link Svatky#jeVSeznamu(String)}
     */
    @Test
    void jeVSeznamu() {
        Svatky svatky = new Svatky();
        Assertions.assertTrue(svatky.jeVSeznamu("Radoslav"));
        Assertions.assertFalse(svatky.jeVSeznamu("marný"));
    }

    /**
     * Testuje metodu {@link Svatky#getPocetJmen()}
     */
    @Test
    void getPocetJmen() {
        Svatky svatky = new Svatky();
        Assertions.assertEquals(svatky.getSeznamJmen().size(), svatky.getPocetJmen());
    }

    /**
     * Testuje metodu {@link Svatky#getSeznamJmen()}
     */
    @Test
    void getSeznamJmen() {
        Svatky svatky = new Svatky();
        Set<String> seznamJmen = svatky.getSeznamJmen();
        Assertions.assertEquals(37, seznamJmen.size());
    }

    /**
     * Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, int)}
     */
    @Test
    void pridatSvatekDenMesicInt() {
        Svatky svatky = new Svatky();
        Assertions.assertEquals(MonthDay.of(5, 17), svatky.vratKdyMaSvatek("Aneta"));
        Assertions.assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    /**
     * Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, Month)}
     */
    @Test
    void pridatSvatekDenMesicMonth() {
        Svatky svatky = new Svatky();

        svatky.pridejSvatek("Anežka", 2, Month.of(3));

        Assertions.assertTrue(svatky.jeVSeznamu("Anežka"));
        Assertions.assertEquals(MonthDay.of(3, 2), svatky.vratKdyMaSvatek("Anežka"));
    }

    /**
     * Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
     * Testuje metodu {@link Svatky#pridejSvatek(String, MonthDay)}
     */
    @Test
    void prridatSvatekMonthDay() {
        Svatky svatky = new Svatky();

        svatky.pridejSvatek("Anežka", MonthDay.of(3, 2));

        Assertions.assertTrue(svatky.jeVSeznamu("Anežka"));
        Assertions.assertEquals(MonthDay.of(3, 2), svatky.vratKdyMaSvatek("Anežka"));
    }

    /**
     * Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
     * Testuje metodu {@link Svatky#smazSvatek(String)}
     */
    @Test
    void smazatSvatek() {
        Svatky svatky = new Svatky();

        svatky.smazSvatek("Emil");

        Assertions.assertEquals(36, svatky.getPocetJmen());
    }
}
