//Gioco

#include <stdio.h>
#include <stdlib.h>
#include "mutex.h"
#include "shm.h"

int Gioco(int *g1, int *g2);

int main(int argc, char *argv[])
{
	if(argc != 1){
		printf("USAGE:%s\n", *argv);
	}
	int arbitro;
	int* g1;
	int* g2;
	Gioco(g1, g2);

	return 0;
}

void Gioco(int *g1, int* g2){
	if(!fork()){
		mutexLock(mtx);
		srand(time(NULL));
		prestaz = rand();
		exit(prestaz);
	}
}