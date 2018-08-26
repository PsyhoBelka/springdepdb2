package ua.rozhkov.springdepdb.DAO.enums;

public enum Base {
    NINE_CLASS("9 клас"),
    ELEV_CLASS("11 клас"),
    KVAL_ROB("кваліфікований робітник");

    private String string;

    private Base(String s) {
        string = s;
    }

    public String getString() {
        return string;
    }
}
