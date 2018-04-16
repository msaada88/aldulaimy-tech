//Make a treasure map
//Find the treasure!
#include <iostream>
#include <stdlib.h>    // new #include for srand and rand
#include <time.h>      // new #include for time
using namespace std;

    // Array dimensions
    const int NUM_ROWS = 10;
    const int NUM_COLS = 10;


void print_grid(char grid_to_print[NUM_ROWS][NUM_COLS])
{
    for (int row = 0; row < NUM_ROWS; row++)
    {
        for (int col = 0; col < NUM_COLS; col++)
        {
            cout << grid_to_print[row][col] << " ";
        }
        cout << endl;
    }
}


int main()
{

   
    // Declare array
    char products[NUM_ROWS][NUM_COLS];
   
    // Compute each value
    for (int row = 0; row < NUM_ROWS; row++)
    {
        for (int col = 0; col < NUM_COLS; col++)
        {
            products[row][col] = '-';
        }
    }
        srand(time(NULL));

    products[rand() % NUM_ROWS][rand() % NUM_COLS] = 'x';
   
   
    // Print values
    for (int row = 0; row < NUM_ROWS; row++)
    {
        for (int col = 0; col < NUM_COLS; col++)
        {
            if (products[row][col]=='x')
        {
            cout << "Row: "<< row << endl;;
            cout <<"Column:  "<< col <<endl;
        }
        }
    }   
   
  print_grid (products);
}
