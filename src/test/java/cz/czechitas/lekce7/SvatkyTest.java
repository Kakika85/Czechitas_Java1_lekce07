package cz.czechitas.lekce7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.util.Set;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {
    Svatky svatky;

    @BeforeEach
    void prepareTest() {
        svatky = new Svatky();
    }

    /**
     * Testuje metodu {@link Svatky#vratKdyMaSvatek(String)}
     */
    @Test
    void kdyMaSvatek() {
        Assertions.assertEquals(MonthDay.of(5, 18), svatky.vratKdyMaSvatek("Nataša"));

        Assertions.assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    @Test
    void testKdyMaSvatekMonika() {
        MonthDay kdyMaSvatekMonika = svatky.vratKdyMaSvatek("Monika");

        Assertions.assertEquals(MonthDay.of(5, 21), kdyMaSvatekMonika);
    }

    /**
     * Testuje metodu {@link Svatky#jeVSeznamu(String)}
     */
    @Test
    void jeVSeznamu() {
        Assertions.assertTrue(svatky.jeVSeznamu("Radoslav"));
        Assertions.assertFalse(svatky.jeVSeznamu("marný"));
    }

    /**
     * Testuje metodu {@link Svatky#getPocetJmen()}
     */
    @Test
    void getPocetJmen() {
        Assertions.assertEquals(svatky.getSeznamJmen().size(), svatky.getPocetJmen());
    }

    /**
     * Testuje metodu {@link Svatky#getSeznamJmen()}
     */
    @Test
    void getSeznamJmen() {
        Set<String> seznamJmen = svatky.getSeznamJmen();

        Assertions.assertEquals(37, seznamJmen.size());
    }

    /**
     * Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, int)}
     */
    @Test
    void pridatSvatekDenMesicInt() {
        Assertions.assertFalse(svatky.jeVSeznamu("Brigita"));

        svatky.pridejSvatek("Brigita", 21, 5);

        Assertions.assertTrue(svatky.jeVSeznamu("Brigita"));
        Assertions.assertEquals(MonthDay.of(5, 21), svatky.vratKdyMaSvatek("Brigita"));
    }

    /**
     * Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, Month)}
     */
    @Test
    void pridatSvatekDenMesicMonth() {
        Assertions.assertFalse(svatky.jeVSeznamu("Anežka"));

        svatky.pridejSvatek("Anežka", 2, Month.of(3));

        Assertions.assertTrue(svatky.jeVSeznamu("Anežka"));
        Assertions.assertEquals(MonthDay.of(3, 2), svatky.vratKdyMaSvatek("Anežka"));

    }

    /**
     * Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
     * Testuje metodu {@link Svatky#pridejSvatek(String, MonthDay)}
     */
    @Test
    void pridatSvatekMonthDay() {
        Assertions.assertFalse(svatky.jeVSeznamu("Anežka"));

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
        svatky.smazSvatek("Emil");

        Assertions.assertFalse(svatky.jeVSeznamu("Emil"));
    }
}
