

/* The program tell the user the TOTAL number of ounces they'll need of each ingredient. */

 

#include <iostream>

using namespace std;

 

int main()

{   // three ingredient names

    string Int1st;

    string Int2nd;

    string Int3rd;

   

    // three ingredient amounts

    double ounce1= 0.0;

    double ounce2= 0.0;

    double ounce3= 0.0;

   

    // an total number of servings

    int Servings = 0;

 

  // Ask the user to type in three different ingredient names for a smoothie.

    cout << "First ingredient:";

    cin >> Int1st;

   

    cout << "Second ingredient:";

    cin >> Int2nd;

   

    cout << "Third ingredient:";

    cin >> Int3rd;

   

    // Ask the user for the number of ounces of each ingredient

    cout << "Ounces of " << Int1st << ":";

    cin >> ounce1;

   

    cout <<  "Ounces of " << Int2nd << ":";

    cin >> ounce2;

   

    cout <<   "Ounces of " << Int3rd << ":";

    cin >> ounce3;

   

    //Ask the user how many servings of the smoothie

    cout << "Servings:";

    cin >> Servings;

   

    //Tell the user the TOTAL number of ounces

    cout << "You'll need " << ounce1* Servings << " ounces of " << Int1st << ", "

  << ounce2* Servings << " ounces of " << Int2nd << ", and "   << ounce3* Servings << " ounces of " << Int3rd   << "." << endl;

   

}
