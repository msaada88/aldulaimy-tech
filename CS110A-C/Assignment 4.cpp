

/*program will store a secret word. It will ask the user to guess a letter. */

#include <iostream>

using namespace std;

 

int main()

{

    // secret word

    string secret_word;

    secret_word = "programming";

    

    // guess a letter

    string letter;

    cout << "Guess: ";

    getline(cin, letter);

    //check whether the length of the user's guess is NOT exactly 1

    if (letter.length() != 1)

    {

                cout << "That is more than one character." << endl;

    }

   

    //check  a lowercase letter.

    else if (letter[0] < 'a' || letter[0] > 'z')

    {

                cout << "Your guess must be a lowercase letter." << endl;

    }

    else

    {

                size_t index0= secret_word.find(letter[0]);

                // check index is equal to string::npos.

                if (index0 == string::npos)

                {

                                cout << "Incorrect!" << endl;

                }

                else

                {

                                cout << "Correct! Index: " << index0 << endl;

                }

    }

}
