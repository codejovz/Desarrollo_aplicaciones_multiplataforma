
#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>

int conts = 0;

void tac();
void ring();
void tic(){
 printf("TIC\n");
 signal(SIGALRM,tac);
 alarm(1);
 conts= conts+1;
}

void tac(){
 printf("TAC\n");
 signal(SIGALRM,tic);
 alarm(1);
 conts=conts+1;
}

void ring(){
  printf("RIIIING!!\n");
  signal(SIGALRM,tic);
  alarm(1);
}

int main(int argc, char *argv[]) {
    signal(SIGALRM, tic);
    alarm(1);
    
    while(1) {
        pause();
        if(conts%30 ==0){
          ring();
        }
    }
    return 0;
}


