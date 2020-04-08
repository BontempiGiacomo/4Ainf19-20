#include <stdlib.h>
#include <stdio.h>
#include <pthread.h>
#include <string.h>
#include <unistd.h>

typedef struct {
    pthread_mutex_t mutex_id;
    int dati;
    int numVolte;
} Param;

int* produt(void*);
int* consum(void*);

int main(int argc, char* argv[]){

    if(argc!= 2){
        printf("USAGE %s #NUMVOLTE\n", argv[0]);
        return -2;
    }

    Param params;
    pthread_t produt_id, consum_id1, consum_id2, consum_id3;
    int pid = getpid();

    params.numVolte = atoi(argv[1]);
    srand(time(NULL));
    params.dati=0;

    /*Creazione mutex*/
    int mut = pthread_mutex_init(&params.mutex_id, NULL);
    if(mut != 0){
        printf("Errore nella creazione del mutex %d\n", pid);
        return -3;
    }

    /*Creazione del produttore*/
    mut = pthread_create(&produt_id, NULL, produt, (int*) &params);
    if(mut != 0){
        printf("Errore nella creazione del produttore %d\n", pid);
        return -4;
    }

    int cons1 = 0;
    int cons2 = 0;
    int cons3 = 0;

    /*Creazione dei consumatori*/
    mut = pthread_create(&consum_id1, NULL, consum, (int*) &params);
    cons1 = mut;
    if(mut != 0){
        printf("Errore nella creazione del consumatore 1 %d\n", pid);
        return -5;
    }

    mut = pthread_create(&consum_id2, NULL, consum, (int*) &params);
    cons2 = mut;
    if(mut != 0){
        printf("Errore nella creazione del consumatore 2 %d\n", pid);
        return -6;
    }

    mut = pthread_create(&consum_id3, NULL, consum, (int*) &params);
    cons3 = mut;
    if(mut != 0){
        printf("Errore nella creazione del consumatore 3 %d\n", pid);
        return -7;
    }

    /*Attendo i thread finiscono*/
    pthread_join(consum_id1, NULL);
    pthread_join(consum_id2, NULL);
    pthread_join(consum_id3, NULL);
    pthread_join(produt_id, NULL);

    if(cons1 > cons2){
    	if(cons1 > cons3){
    		printf("Il consumatore 1 ha avuto piu' accessi\n");
    	}
    	else{
    		printf("Il consumatore 3 ha avuto piu' accessi\n");	
    	}
    }else{
    	if(cons2 > cons3){
    		printf("Il consumatore 2 ha avuto piu' accessi\n");
    	}
    	else{
    		printf("Il consumatore 3 ha avuto piu' accessi\n");	
    	}
    }

    /*Distruzione mutex*/
    mut = pthread_mutex_destroy(&params.mutex_id);
    if(mut != 0){
        printf("Errore nella distruzione del mutex %d\n", pid);
    }

    return 0;
}

int* produt(void  *prod){
    Param* params = (Param*) prod;

    int tot = 0;
    for(int i = 0; i<params->numVolte;){
        if(pthread_mutex_trylock(&params->mutex_id) == 0){
            if(params-> dati == 0 ){
                params->dati = rand() % 20 + 1;
                tot = tot + params->dati;
                i++;
            }
            pthread_mutex_unlock(&params->mutex_id);
            printf("Unlock del mutex %li\n", pthread_self());
        } else{
            printf("Mutex non disponibile %li\n", pthread_self());
        }
    }
    printf("Il totale prodotto e' di: %d", tot);

    return -1;
}

int* consum(void *con){
    Param * params = (Param*) con;
    int tot = 0;
    for (int i = 0; i<params->numVolte;){
        if(pthread_mutex_trylock(&params->mutex_id) == 0){
            if(params->dati != 0){
                tot = tot + params->dati;
                params->dati = 0;
                i++;
            }
            pthread_mutex_unlock(&params->mutex_id);
            printf("Rilascio mutex %li\n", pthread_self());
        } else{
            printf("Mutex non disponibile %li\n", pthread_self());
        }
    }
    printf("Il consumo totale è di: %d", tot);
    return tot;
}