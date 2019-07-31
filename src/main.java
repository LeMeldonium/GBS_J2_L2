public class main {
    public static void main(String[] args) {
        String[][] str = new String[4][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                str[i][j] = "0";
            }
        }
        str[0][0] = "qwe";
        try {
            array.inputArray(str);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
