package lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arrStringToInt = {{"one", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] arrOutSize = {{"1", "2", "3", "4"}, {"five", "6", "7", "8"}, {"9", "10", "11", "12"}};

        String[][] arrNormal = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        CheckException testarrays = new CheckException();

        testarrays.arrayChecking(arrNormal);

        try {
            testarrays.arrayChecking(arrOutSize);
        }catch (MyArraySizeException ex){
            System.out.println("Ошибка в размере массива");
        }

        try {
            testarrays.arrayChecking(arrStringToInt);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}
