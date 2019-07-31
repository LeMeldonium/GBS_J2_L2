public class array {

    static Integer[][] arr = new Integer[4][4];

    public static void inputArray(String[][] input) throws MyArraySizeException, MyArrayDataException{
        try {
            for (int i = 0; i < input[0].length; i++) {
                for (int j = 0; j < input.length; j++) {
                    arr[i][j] = Integer.parseInt(input[i][j]);
                }
            }
        } catch (NumberFormatException e){
            throw new MyArrayDataException();
        } catch (Exception e){
            throw new MyArraySizeException("Подаётся слишком большой массив");
        }
    }
}
