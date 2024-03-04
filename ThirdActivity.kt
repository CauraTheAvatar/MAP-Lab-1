import java.util.Scanner

fun main()
{
    // Prompt the user to input three integers
    print("Enter three integers separated by spaces: ")
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val middle = scanner.nextInt()
    val end = scanner.nextInt()

    // Iterate through the range of numbers from the start to the end (inclusive)
    for (i in start..end)
    {
        // Check if the current number is the start, middle or end number
        if (i == start || i == middle || i == end)
        {
            continue
        }

        // Calculate and print the second immediate numbers
        var num = i
        when
        {
            num % 2 == 1 ->
            {
                // The current number is odd
                num++
                print("$num ")
                num += 2
                print("$num ")
            }
            num % 2 == 0 ->
            {
                // The current number is even
                num += 2
                print("$num ")
                num += 2
                print("$num ")
            }
        }
    }
    println()
}