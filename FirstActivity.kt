import java.util.Scanner;

fun main()
{
    // Prompt the user to define the size of the array
    print("Enter the size of the array: ")
    val scanner = Scanner(System.in)
    val arraySize = scanner.nextInt()

    // Create an array of the specified size
    val array = IntArray(arraySize)

    // Prompt the user to enter values into the array
    print("Enter $arraySize numbers: ")
    for (i in 0 until arraySize)
    {
        array[i] = scanner.nextInt()
    }

    // Find the two largest numbers in the array
    var largest1 = array[0]
    var largest2 = array[1]
    if (largest2 > largest1)
    {
        val temp = largest1
        largest1 = largest2
        largest2 = temp
    }

    for (i in 2 until arraySize) 
    {
        if (array[i] > largest1)
        {
            largest2 = largest1
            largest1 = array[i]
        }
        else if (array[i] > largest2)
        {
            largest2 = array[i]
        }
    }

    // Print two largest numbers
    print("The two largest numbers are: $largest1 and $largest2")
}