/*  Program     : tqueue.c
    Deskripsi   : File body modul tqueue tipe 1 karakter.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 27 September 2024  */

#include <stdio.h>
#include "tqueue.h"

void createQueue(tqueue *Q) {
    for (int i = 1; i <= 10; i++) {
        Q->wadah[i] = '-';
    }

    Q->head = 0;
    Q->tail = 0;
}

boolean isEmptyQueue(tqueue Q) {
    return Q.head == 0;
}
 
boolean isFullQueue(tqueue Q) {
    return Q.tail == 10;
}

boolean isOneElement(tqueue Q) {
    return Q.tail == 1;
}

int infoHead(tqueue Q) {
    if (!isEmptyQueue(Q)) {
        return Q.wadah[Q.head];
    } else {
        return '-';
    }
}

int infoTail(tqueue Q) {
    if (!isEmptyQueue(Q)) {
        return Q.wadah[Q.tail];
    } else {
        return '-';
    }
}

int sizeQueue(tqueue Q) {
    return Q.tail;
}

void printQueue(tqueue Q) {
    for (int i = 1; i <= 10; i++) {
        printf("%c ", Q.wadah[i]);
    }
}

void viewQueue(tqueue Q) {
    if (!isEmptyQueue(Q)) {
        for (int i = 1; i <= Q.tail; i++) {
            printf("%c ", Q.wadah[i]);
        }
    } else {
        printf("Queue kosong.");
    }
}

void enqueue(tqueue *Q, char e) {
    if (!isFullQueue(*Q)) {
        Q->wadah[Q->tail + 1] = e;

        if (isEmptyQueue(*Q)) {
            Q->head++;
        }

        Q->tail++;
    } else {
        printf("Queue penuh.");
    }
}
  
void dequeue(tqueue *Q, char *e) {
    *e = Q->wadah[1];
    
    if (!isEmptyQueue(*Q)) {
        if (isOneElement(*Q)) {
            Q->wadah[1] = '-';
            Q->head = 0;
            Q->tail = 0;
        } else {
            for (int i = 1; i <= Q->tail - 1; i++) {
                Q->wadah[i] = Q->wadah[i + 1];
            }

            Q->wadah[Q->tail] = '-';
            Q->tail--;
        }
    } else {
        printf("Queue kosong.");
    }
}

void enqueue1(tqueue *Q, char e) {
    if (isFullQueue(*Q)) {
        char trash;

        dequeue(Q, &trash);
    }

    enqueue(Q, e);
}

int maxlength(tqueue Q1, tqueue Q2) {
    if (sizeQueue(Q1) >= sizeQueue(Q2)) {
        return sizeQueue(Q1);
    } else {
        return sizeQueue(Q2);
    }
}

void enqueue2(tqueue *Q1, tqueue *Q2, char e) {
    if (sizeQueue(*Q1) <= sizeQueue(*Q2)) {
        if (!isFullQueue(*Q1)) {
            enqueue(Q1, e);
        } else {
            printf("Kedua queue penuh.");
        }
    } else {
        enqueue1(Q2, e);
    }
}

void dequeue2(tqueue *Q1, tqueue *Q2, char *e) {
    if (sizeQueue(*Q1) >= sizeQueue(*Q2)) {
        dequeue(Q1, e);
    } else {
        dequeue(Q2, e);
    }
}
