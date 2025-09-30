package art;

import art.grammar.ArtBaseListener;

public class ArtCompiler extends ArtBaseListener {

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

