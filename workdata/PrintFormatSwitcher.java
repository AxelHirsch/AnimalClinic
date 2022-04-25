package workdata;

public class PrintFormatSwitcher {
    public Formatter formatSwitcher(PrintType type) {
        Formatter f = new ToConsole();
        switch (type) {
            case CONSOLE:
                f = new ToConsole();
                break;

            case TXT:
                f = new ToTxt();
                break;
        }
        return f;
    }
}
