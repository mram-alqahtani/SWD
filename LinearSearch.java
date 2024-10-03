//----------------------------------------------------------------------------------------------
// Maram Alqahtani
// s444004008
// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in arr[]

            static int search(int array[], int g, int y)

            {

                        for (int i = 0; i < g; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (array[i] == y)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] array = { 3, 4, 1, 7, 5 };

                        int g = array.length;

                        int y = 4;

                        int index = search(array, g, y);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------