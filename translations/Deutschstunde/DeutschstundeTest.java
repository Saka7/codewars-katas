import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeutschstundeTest {

  @Test
  public void derDieDasTest() {
    Deutschstunde d = new Deutschstunde();
    assertEquals("4 Vokale -> der OOOpa", d.derDieDas("OOOpa"), "der OOOpa");
    assertEquals("3 Vokale -> die Suppenhuhn", d.derDieDas("Suppenhuhn"), "die Suppenhuhn");
    assertEquals("5 Vokale -> der Geheimdienst", d.derDieDas("Geheimdienst"), "der Geheimdienst");
    assertEquals("5 Vokale -> der Ofenkartoffel", d.derDieDas("Ofenkartoffel"), "der Ofenkartoffel");
    assertEquals("1 Vokal -> das Fisch", d.derDieDas("Fisch"), "das Fisch");
    assertEquals("1 Umlaut, 1 Vokal -> die Knödel", d.derDieDas("Knödel"), "die Knödel");
    assertEquals("6 Vokale -> der Leberkaassemmi", d.derDieDas("Leberkaassemmi"), "der Leberkaassemmi");
  }
}