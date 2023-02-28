#include<iostream>
using namespace std;

int main(){
int i, fre, Demand[7]={6,7,8,9,10,11,12};
float prob;

cout<<"Demand Table"<<endl;
cout<<"Demand \t"<<"Frequency \t"<<"Probability \t"<<"Cumulative Prob \t"<<"IRND \n";

for (i=1;i<=6;i++){
    if(Demand[i] = 6){
        fre = 3;
        prob = fre/36;
       
    }
    if(Demand[i] = 7){
        fre = 4;
        prob = fre/36;
        
    }
    if(Demand[i] = 8){
        fre = 6;
        prob = fre/36;
        
    }
    if(Demand[i] = 9){
        fre = 12;
        prob = fre/36;
       
    }
    if(Demand[i] = 10){
        fre = 9;
        prob = fre/36;
        
    }
    if(Demand[i] = 11){
        fre = 1;
        prob = fre/36;
        
    }
    if(Demand[i] = 12){
        fre = 1;
        prob = fre/36;
        
    }
    cout<<Demand[i]<<"\t\t"<<fre<<"\t\t\t"<<prob<<"\t\n";
}
}