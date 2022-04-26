package formatter;

import workdata.Data;

public class FormatterConsole implements Formatter{
    @Override
    public String format(Data data) {
        String formatterConsole = data.getAnimalData().replaceAll("#", "\n");
        return "****** Animal clinic \"Pet cemetery\" ******" + "\n" + formatterConsole;
    }
}
