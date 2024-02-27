package cz.czechitas.lekce7;

import java.time.Month;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Třída s informacemi o tom,kdo má kdy svátek.
 */
public class Svatky {
    private final Map<String, MonthDay> svatky = new HashMap<>();

    public Svatky() {
        svatky.put("Zikmund", MonthDay.of(5, 2));
        svatky.put("Alexej", MonthDay.of(5, 3));
        svatky.put("Alex", MonthDay.of(5, 3));
        svatky.put("Květoslav", MonthDay.of(5, 4));
        svatky.put("Klaudie", MonthDay.of(5, 5));
        svatky.put("Klaudia", MonthDay.of(5, 5));
        svatky.put("Claudia", MonthDay.of(5, 5));
        svatky.put("Radoslav", MonthDay.of(5, 6));
        svatky.put("Stanislav", MonthDay.of(5, 7));
        svatky.put("Ctibor", MonthDay.of(5, 9));
        svatky.put("Stibor", MonthDay.of(5, 9));
        svatky.put("Blažena", MonthDay.of(5, 10));
        svatky.put("Svatava", MonthDay.of(5, 11));
        svatky.put("Pankrác", MonthDay.of(5, 12));
        svatky.put("Servác", MonthDay.of(5, 13));
        svatky.put("Bonifác", MonthDay.of(5, 14));
        svatky.put("Žofie", MonthDay.of(5, 15));
        svatky.put("Přemysl", MonthDay.of(5, 16));
        svatky.put("Aneta", MonthDay.of(5, 17));
        svatky.put("Nataša", MonthDay.of(5, 18));
        svatky.put("Ivo", MonthDay.of(5, 19));
        svatky.put("Zbyšek", MonthDay.of(5, 20));
        svatky.put("Monika", MonthDay.of(5, 21));
        svatky.put("Emil", MonthDay.of(5, 22));
        svatky.put("Vladimír", MonthDay.of(5, 23));
        svatky.put("Vladimíra", MonthDay.of(5, 23));
        svatky.put("Jana", MonthDay.of(5, 24));
        svatky.put("Vanesa", MonthDay.of(5, 24));
        svatky.put("Viola", MonthDay.of(5, 25));
        svatky.put("Filip", MonthDay.of(5, 26));
        svatky.put("Valdemar", MonthDay.of(5, 27));
        svatky.put("Vilém", MonthDay.of(5, 28));
        svatky.put("Viliam", MonthDay.of(5, 28));
        svatky.put("Maxmilián", MonthDay.of(5, 29));
        svatky.put("Maxim", MonthDay.of(5, 29));
        svatky.put("Ferdinand", MonthDay.of(5, 30));
        svatky.put("Kamila", MonthDay.of(5, 31));
    }

    /**
     * Vrací den, kdy má zadané jméno svátek.
     *
     * @param jmeno Hledané jméno.
     * @return Den a měsíc, případně {@code null}, pokud jméno nebylo nalezeno.
     */
    public MonthDay vratKdyMaSvatek(String jmeno) {
        //TODO
        return null;
    }

    /**
     * Vrací informaci, zda je dané jméno uvedeno v seznamu.
     *
     * @param jmeno Hledané jméno.
     * @return {@code true}, pokud je jméno v seznamu. Jinak vrací {@code false}.
     */
    public boolean jeVSeznamu(String jmeno) {
        //TODO
        return false;
    }

    /**
     * Vrací počet jmen uvedených v seznamu.
     *
     * @return
     */
    public int getPocetJmen() {
        //TODO
        return 0;
    }

    /**
     * Vrací seznam jmen, pro které je uveden datum svátku.
     *
     * @return Neseřazený seznam jmen.
     */
    public Set<String> getSeznamJmen() {
        //TODO
        return null;
    }

    /**
     * Přidá na seznam svátků nové jméno.
     *
     * @param jmeno    Jméno.
     * @param denMesic Den a měsíc, kdy má dané jméno svátek.
     */
    public void pridejSvatek(String jmeno, MonthDay denMesic) {
        //TODO
    }

    /**
     * Přidá na seznam svátků nové jméno.
     *
     * @param jmeno Jméno.
     * @param den   Den v měsíci, kdy má dané jméno svátek (1–31).
     * @param mesic Měsíc, kdy má dané jméno svátek (1–12).
     */
    public void pridejSvatek(String jmeno, int den, int mesic) {
        //TODO
    }

    /**
     * Přidá na seznam svátků nové jméno.
     *
     * @param jmeno Jméno.
     * @param den   Den v měsíci, kdy má dané jméno svátek (1–31).
     * @param mesic Měsíc, kdy má dané jméno svátek.
     */
    public void pridejSvatek(String jmeno, int den, Month mesic) {
        //TODO
    }

    /**
     * Smaže jméno ze seznamu svátků.
     *
     * @param jmeno Jméno ke smazání.
     */
    public void smazSvatek(String jmeno) {
        //TODO
    }
}
