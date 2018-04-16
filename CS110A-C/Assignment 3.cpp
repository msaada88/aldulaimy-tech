

#include <iostream>

#include <cmath>

using namespace std;

 

int main()

{

               

                /*This program will help the user to find two possible solutions when he/she solves the X */

    double sol_1, sol_2, a, b, c, root ;

   

    cout << "a: ";

    cin >> a;

   

    cout << "b: ";

    cin >> b;

   

    cout << "c: ";

    cin >> c;

   

    root = sqrt (b * b - 4.0 * a * c);

   

    sol_1 =  0.5 * (root - b) / a ;

   

    sol_2 = -0.5 * (root + b ) / a;

   

    cout << "Solution 1: " << sol_1 << "\n";

    cout << "Solution 2: " << sol_2 << "\n";

   

    return (0);

}
