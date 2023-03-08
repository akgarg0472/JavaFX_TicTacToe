package TicTacToeJavaFX;

/**
 * @author Akhilesh Garg
 * @since 08-03-2023
 */
final class Utils {

    private Utils() {
        throw new UnsupportedOperationException();
    }

    static boolean isStringValid(final String str) {
        return str != null && !str.trim().isEmpty();
    }

}
