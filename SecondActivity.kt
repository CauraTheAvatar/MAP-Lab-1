fun main() 
{
    // Define the number of rows in the pyramid
    val numRows = 5

    // Iterate through each row of the pyramid
    for (i in 1..numRows)
    {
        // Print the leading dollar signs for the current row
        for (j in 1..i) 
        {
            print("$")
        }

        // Print the trailing asterisks for the current row
        for (j in i until numRows + 1)
        {
            print("*$")
        }

        // Move to the next line
        println()
    }
}