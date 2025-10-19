package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int numElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numElements = 0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
        numElements = list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    private void increaseSize()
    {
        int[] newList = new int[list.length * 2];
        for(int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
    public void addElement(int newVal)
    {
        if (numElements == list.length) {
            increaseSize();
        }

        list[numElements] = newVal;
        numElements++;
    }
    public void removeFirst(int newVal)
    {
        int index = -1;
        for (int i = 0; i < numElements; i++) {
            if (list[i] == newVal) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < numElements - 1; i++) {
                list[i] = list[i + 1];
            }
            numElements--;
            list[numElements] = 0;
        }
    }

    public void removeAll(int newVal)
    {
        int i = 0;
        while (i < numElements) {
            if (list[i] == newVal) {
                removeFirst(newVal);
            } else {
                i++;
            }
        }
    }

}