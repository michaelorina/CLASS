#include <iostream>

using namespace std;

int main(){

    int Aray[3][3], i, j,sum = 0;

    cout<< "This is Michael guys having fun... Welcome!!";

    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            cout<<"Enter Value to the matrix:";
            cin>>Aray[i][j];
        }
    }

    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            cout<<"\t"<<Aray[i][j];
            cout<<"\n";
            
            sum = sum + i + j;
            
        }
    }    

    cout<<"sum = "<<sum;
    
return 0;
}