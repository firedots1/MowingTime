import java.util.Scanner;

public class MowingTime {
    //START // ***PSEUDOCODE*** //
    // Using the mowing time algorithm below, break it into modules.
    // Then write a program to reflect your pseudocode.
    //Prompt operator for block_length, block_width
    //Get block_length, block_width
    //block_area = block_length * block_width
    //Prompt operator for house_length, house_width
    //Get house_length, house_width
    //house_area = house_length * house_width
    //mowing_area = block_area – house_area
    //mowing _time = mowing_area/2
    //Output mowing_time to screen
    //END //***PSEUDOCODE***//



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figure block = new Figure();
        System.out.println("What is the Block Length? ");
        block.setLength(sc.nextInt());
        System.out.println("What is the Block Width? ");
        block.setWidth(sc.nextInt());
        block.setArea(MethodCalArea(block.getLength(), block.getWidth()));
        System.out.println("Total Area Block is: " + block.getArea());
        System.out.println("What is the House Length? ");
        block.setLength(sc.nextInt());
        System.out.println("What is the House Width? ");
        block.setWidth(sc.nextInt());
        block.setArea(MethodCalArea(block.getLength(), block.getWidth()));
        System.out.println("Total Area of House is: " + block.getArea());
    }
    public static int MethodCalArea(int lengthBlock, int widthBlock) {
        return lengthBlock*widthBlock;
    }


}

