//Group 2 
//Single-Server Queue Assignment

/* Group Members
    1. Gordon Josephat Ouma- SCII/00845/2019 
    2. Stephen Ogaro- SCII/01353/2018
    3. Boniface Kiplangat- SCII/01358/2018
    4. Dennis Lemayian- SCII/02309/2018
    5. Shumi Kulthum Njirainey- SCII/01343/2018 
*/


#include <iostream>
using namespace std;


int main() {

int  i, j, run = 15;
float sim_time;
int RN_Arr[15] = {82,91,12,77,90,75,33,61,19,58,41,54,52,16,86};
int IAT[15] = {4,5,1,4,5,4,2,3,1,3,2,3,3,1,4};
float ATC[15];
int RN_Ser[15] = {93,59,76,62,40,41,51,91,93,38,92,22,9,7,65};
int SV_T[15] = {6,3,5,4,3,3,3,6,6,3,6,2,1,1,4};
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
    TS_End[i] = (TS_Begin[i] - SV_T[i]/100);
}
sim_time = 1.00;
    ATC[0] = (IAT[0]/100+sim_time);
for (int i=1;i<15;i++){
    ATC[i] = (ATC[i-1] + IAT[i]);
}

TS_Begin[0]=ATC[0];
for (int i=1;i<15;i++){
    TS_Begin[i] = TS_End[i-1];
}

sim_time = 1.00;
    Idle[0] = (TS_Begin[0]-sim_time) * 100;

for(int i=1; i<15;i++){
        Idle[i]=TS_Begin[i]-TS_End[i-1];
    }

for (j=0; j<=run; j++){

    cout <<" \n "<<j + 1<<" \t "<<RN_Arr[j]<<" \t "<<IAT[j]<<" \t "<<ATC[j]<<" \t "<<RN_Ser[j]<<" \t "<<SV_T[j]<<" \t "<<TS_Begin[j]<<" \t "<<TS_End[j]<<" \t "<<Customer_Queue[j]<<" \t "<<Idle[j]<<" \t "<<Delay[j]<<" \n ";
    
} 

}