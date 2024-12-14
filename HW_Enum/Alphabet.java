package HW_Enum;

public enum Alphabet {
    А(1), Б(2), В(3), Г(4), Д(5), Е(6),
    Ё(7), Ж(8), З(9), И(10), Й(11),
    К(12), Л(13), М(14), Н(15), О(16), П(17),
    Р(18), С(19), Т(20), У(21), Ф(22), Х(23),
    Ц(24), Ч(25), Ш(26), Щ(27), Ь(28),
    Ы(29), Ъ(30), Э(32), Ю(31), Я(33);

    private final int position;

    Alphabet(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public static int getPosition(char letter) {
        for (Alphabet alphabet : Alphabet.values()) {
            if (alphabet.name().charAt(0) == Character.toUpperCase(letter)) {
                return alphabet.getPosition();
            }
        }
        return -1; // Если буква не найдена
    }
}
