import java.util.Arrays;


public class DynamicArray{
    private int size;
    private int capacity;
    private int[] array;

    /**
     * Default constructor to initial array with size one
     */
    public DynamicArray(){
        size = 0;
        capacity = 1;
        array = new int[capacity];
    }

    /**
     * Par constructor to set the array size for specific  array
     * @param size the starter size of the array
     */
    public DynamicArray(int size){
        size = 0;
        this.capacity = size;
        this.array = new int[size];
    }

    /**
     * return the number of current elements of the array
     * @return the size
     */
    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Contains method find the number if existed in array or not
     * @param number the number you need to find
     * @return true if the number is existed otherwise false
     */
    public boolean contains(int number){
        for(int i = 0; i < size; ++i){
            if(array[i] == number) return true;
        }
        return false;
    }

    // 8:50

    /**
     * get element by index and throw exception if the index >= the size
     * @param index the index need to get its element
     * @return the index element
     */
    public int getByIndex(int index){
        if(index >= size){
          CustomException.OutOfBoundException("Out of bound");
        }
        return array[index];
    }

    /**
     * search for the element and return the first position
     * @param element need to search for
     * @return the first position for this element
     */
    public int search(int element){
        for(int i = 0;i < size; ++i){
            if(array[i] == element) return i;
        }
        return -1;
    }

    public int countNumberOfPositions(int element){
        int positions = 0;
        for(int i = 0;i < size; ++i){
            if(array[i] ==  element) positions++;
        }
        return positions;
    }

    public int[] searchForAllPositions(int element){
        int positions = countNumberOfPositions(element);
        int[] elementPositions = new int[positions];
        int currentEmptyIndex = 0;
        for(int i = 0;i < size; ++i){
            if(array[i] == element){
                elementPositions[currentEmptyIndex] = i;
                currentEmptyIndex++;
            }
        }
        return elementPositions;
    }

    public void sort(){
        Arrays.sort(array);
    }

    public void reverse(){
        int left  = 0,right = size - 1;
        while (left <= right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public boolean isSorted(){
        for(int i = 0; i < size - 1; ++i){
            if(array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    private void dynamicAlloc(){
        capacity *= 2;
        int[] arr = new int[capacity];
        for(int i = 0;i < size; ++i){
            arr[i] = array[i];
        }
        array = arr;
    }

    public void add(int element){
        if(size == capacity){
            dynamicAlloc();
        }
        array[size] = element;
        size++;
    }

    public void removeBack(){
        if(isEmpty()){
            CustomException.RuntimeException("Array is empty");
        }
        size--;
    }

    public void removeByIndex(int index){
        if(index >= size){
            CustomException.OutOfBoundException("Index out of bound");
        }
        leftShifting(index);
        size--;
    }

    private void leftShifting(int index) {
        for(int i = index + 1; i < size; ++i){
            array[i - 1] = array[i];
        }
    }

    public void addByIndex(int element, int index){
        if(index > size){
            CustomException.RuntimeException("Out of allowed space");
        }
        if(index == size){
            add(element);
            return;
        }
        if(size == capacity){
            dynamicAlloc();
        }
        rightShifting(index);
        array[index] = element;
        size++;
    }

    private void rightShifting(int index) {
        for(int i = size - 1; i >= index; --i){
            array[i + 1] = array[i];
        }
    }

}
