#include <iostream>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;

    int len = str.length();

    cout << "All substrings are:\n";
    for(int i = 0; i < len; i++) {
        for(int j = i; j < len; j++) {
            for(int k = i; k <= j; k++) {
                cout << str[k];
            }
            cout << endl;
        }
    }
    return 0;
}
