package example;

import example.grammar.XpresBaseListener;

public class Compiler extends XpresBaseListener {

    private StringBuilder out = new StringBuilder();

    // Skriv endast över de metoder som du verkligen behöver här

    /**
     * Hämtar den kompilerade stackmaskinkoden.
     *
     * @return Kompilerad kod.
     */
    public String getCompiledCode() {
        return out.toString();
    }
}
