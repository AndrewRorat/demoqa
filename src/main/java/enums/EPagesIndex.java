package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EPagesIndex {
    ALERTS_FRAME_WINDOWS_PAGE("Alerts, Frame & Windows"),
    BOOK_STORE_APP_PAGE("Book Store Application"),
    ELEMENTS_PAGE("Elements"),
    FORMS_PAGE("Forms"),
    INTERACTIONS_PAGE("Interactions"),
    WIDGETS_PAGE("Widgets");

    private String name;
}
