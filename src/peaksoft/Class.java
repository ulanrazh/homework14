package peaksoft;

public class Class {
    private int numbers;
    private String text;
    private int[] arrays;


    public Class(int numbers, String text, int[] arrays) {
        this.numbers = numbers;
        this.text = text;
        this.arrays = arrays;
    }
    public void showInfo() {
        System.out.println("Numbers: " + numbers);
        System.out.println("Words: " + text);
        System.out.print("Arrays: ");
        for (int array: arrays) {
            System.out.print(array + ",");
        }
    }
}
