package formatter;

import workdata.Data;

public class FormatterHtml implements Formatter {
    @Override
    public String format(Data data) {
        String formatterHtml = data.getAnimalData().replaceAll("#", "<br>");
        return formatterHtml;
    }
}
