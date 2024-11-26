#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>


void tac();

void tic(){
 printf("TIC\n");
 signal(SIGALRM,tac);
 alarm(1);
}

void tac(){
 printf("TAC\n");
 signal(SIGALRM,tic);
 alarm(1);
}

int main(int argc, char *argv[]) {
    signal(SIGALRM, tic);
    
    
    long int MAXCOUNT = 1000000000000;
    long int cont = 0;
    for(long int i = 0; i < MAXCOUNT ; i++) {
        cont ++;
        if(i%1000000000 == 0){
          tic();
  
        }
    }
    return 0;}

