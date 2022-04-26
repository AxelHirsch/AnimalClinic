package formatter;

public class FormatterFactory {
    public Formatter formatFactory(FormatterType type) {
        Formatter f = new FormatterConsole();
        switch (type) {
            case CONSOLE:
                f = new FormatterConsole();
                break;

            case HTML:
                f = new FormatterHtml();
                break;
        }
        return f;
    }
}
