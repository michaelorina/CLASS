//Group 5 Queue-single Server Assignment

/* Group Members
1. Michael Orina        SCII/00825/2019.
2. Gloria Cherotich     SCII/00828/2019.
3. Vincent Kemboi       SCII/00832/2019.
4. Meshack Mwaura       SCII/00815/2019.
5. Isaac Kinyanjui      SCII/00817/2019.
*/


#include <iostream>
using namespace std;


int main() {

//Single Server Que:

//arrays to hold values
int  i, j, run = 15;
float simT;
int RN_Arr[15] = {82,91,12,77,90,75,33,61,19,58,41,54,52,16,86};
int IAT[15] = {4,5,1,4,5,4,2,3,1,3,2,3,3,1,4};
float ATC[15];
int RN_Ser[15] = {93,59,76,62,40,41,51,91,93,38,92,22,9,7,65};
int ST[15] = {6,3,5,4,3,3,3,6,6,3,6,2,1,1,4};
float TS_Begin[15];
float TS_End[15];
int Customer_Queue[15] = {0,1,1,1,1,1,1,1,2,2,3,3,4,5,5};
int Idle[15];
int Delay[15] ;

cout<< " Customers \t RN(Arr) \t IAT \t AT_on_CLOCK \t RN(Service) \t Service_Time \t Time_Service_Begin \t Time_Service_End \t Customer_In_Queue \t Server_Idle_Time \t Delay";

for (int i=0;i<15;i++){
    Delay[i] = (TS_Begin[i] - ATC[i]) * 100;
}
for (int i=0;i<15;i++){
    TS_End[i] = (TS_Begin[i] - ST[i]/100);
}
simT = 1.00;
    ATC[0] = (IAT[0]/100+simT);
for (int i=1;i<15;i++){
    ATC[i] = (ATC[i-1] + IAT[i]);
}

TS_Begin[0]=ATC[0];
for (int i=1;i<15;i++){
    TS_Begin[i] = TS_End[i-1];
}

simT = 1.00;
    Idle[0] = (TS_Begin[0]-simT) * 100;

for(int i=1; i<15;i++){
        Idle[i]=TS_Begin[i]-TS_End[i-1];
    }

for (j=0; j<=run; j++){

    cout <<" \n "<<j + 1<<" \t "<<RN_Arr[j]<<" \t "<<IAT[j]<<" \t "<<ATC[j]<<" \t "<<RN_Ser[j]<<" \t "<<ST[j]<<" \t "<<TS_Begin[j]<<" \t "<<TS_End[j]<<" \t "<<Customer_Queue[j]<<" \t "<<Idle[j]<<" \t "<<Delay[j]<<" \n ";
    
} 

}