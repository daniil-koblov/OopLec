package OopLec2.Ex006.Interface;

import OopLec2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
