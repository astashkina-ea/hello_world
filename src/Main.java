public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world");

        //вывести четные элементы массива умноженные на 5
        //определяем массив в Java
        int[] array = new int[5];

        //заполняем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        Calculate calculate = new Calculate();
        int[] result = calculate.calculate(array, 5);

        //вывод массива
        for (int i = 0; i < array.length; i++) {
            if (array[i]  % 2 == 0) {
                System.out.println(result[i]);
            }
        }
    }
}