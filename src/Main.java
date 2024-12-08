import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(6);
        array.add(3);
        array.add(0);
        array.add(2);
        array.add(1);
        array.add(0);
        array.add(4);
        array.add(0);
//        for(int i = 0;i < array.getSize(); ++i){
//            System.out.print(array.getByIndex(i) + " ");
//        }
//        System.out.println();
//        System.out.println("Size "+ array.getSize());
//        System.out.println("Capacity "+ array.getCapacity());
//        System.out.println("isEmpty: " + array.isEmpty());
//        System.out.println("iSorted: " + array.isSorted());
//        System.out.println("Contains: " + array.contains(0));
//        System.out.println("Contains: " + array.contains(10));
//        System.out.println("Search: " + array.search(0));
//        System.out.println("Search: " + array.search(10));
//        System.out.println("number of pos: " + array.countNumberOfPositions(0));
//        int[] arr = array.searchForAllPositions(0);
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0;i < array.getSize(); ++i){
//            System.out.print(array.getByIndex(i) + " ");
//        }
//        System.out.println();
//        array.reverse();
//        for(int i = 0;i < array.getSize(); ++i){
//            System.out.print(array.getByIndex(i) + " ");
//        }
//        System.out.println();
//        array.sort();
//        for(int i = 0;i < array.getSize(); ++i){
//            System.out.print(array.getByIndex(i) + " ");
//        }
//        System.out.println();
//        array.removeBack();
//        for(int i = 0;i < array.getSize(); ++i){
//            System.out.print(array.getByIndex(i) + " ");
//        }  System.out.println();
//        array.add(14);
//        for(int i = 0;i < array.getSize(); ++i){
//            System.out.print(array.getByIndex(i) + " ");
//        }
//        System.out.println();
//        array.removeByIndex(10);
        for(int i = 0;i < array.getSize(); ++i){
            System.out.print(array.getByIndex(i) + " ");
        }
        System.out.println();
        array.removeByIndex(4);
        for(int i = 0;i < array.getSize(); ++i){
            System.out.print(array.getByIndex(i) + " ");
        }
        System.out.println();
        array.addByIndex(100,2);
        for(int i = 0;i < array.getSize(); ++i){
            System.out.print(array.getByIndex(i) + " ");
        }
        System.out.println();
        array.addByIndex(200,array.getSize());
        for(int i = 0;i < array.getSize(); ++i){
            System.out.print(array.getByIndex(i) + " ");
        }
        System.out.println();
    }
}