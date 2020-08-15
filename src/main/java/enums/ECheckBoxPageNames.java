package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ECheckBoxPageNames {

    HOME("Home"),
    DESKTOP("Desktop"),
    NOTES("Notes"),
    COMMANDS("Commands"),
    DOCUMENTS("Documents"),
    WORKSPACE("Workspace"),
    REACT("React"),
    ANGULAR("Angular"),
    VEU("Veu"),
    OFFICE("Office"),
    PUBLIC("Public"),
    PRIVATE("Private"),
    CLASSIFIED("Classified"),
    GENERAL("General"),
    DOWNLOADS("Downloads"),
    WORD_FILE_DOC("Word File.doc"),
    EXCEL_FILE_DOC("Excel File.doc");

    private String name;
}
