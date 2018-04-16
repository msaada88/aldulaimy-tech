
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
    
    string  dashes = "-----------";
    
    int left_n=10;
    
    
    
  while ((left_n>0) && (dashes !=secret_word))
  {  
  	         	cout << dashes << endl;
  	
  		cout << left_n << " incorrect guesses left." << endl;
  	
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
                                 left_n=left_n - 1;

                }

                else

                {                 

                                for (int i = 0 ; i < secret_word.length(); i++)
                                {     
                                	if (secret_word[i] == letter[0])
                                	 {
                                	 	dashes[i] = letter[0];
                                	 }
                                }
                                
                                cout << "Correct!" << endl;

                }

    }
  }
  
  //an if - else statement to figure out what happened.
  if (dashes == secret_word)
  {
  	cout << "You win!" << endl;
  }
  else 
  {
  	cout << "You lose."  << endl;
  }
  
  //print what the word was
  cout << "The word was: programming" << endl;

}
