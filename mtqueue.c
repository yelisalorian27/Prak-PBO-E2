/*  Program     : mtqueue.c
    Deskripsi   : File driver modul tqueue tipe 1 karakter.
    NIM/Nama    : 24060123130082/Yelisa Lorian
    Tanggal     : 27 September 2024  */

#include <stdio.h>
#include "tqueue.c"

int main() {
    char hold1, hold2;
    tqueue Q1, Q2;

    createQueue(&Q1);
    printQueue(Q1);
    printf("\nApakah Q1 kosong: %d\n\n", isEmptyQueue(Q1));

    enqueue(&Q1, 'a');
    printQueue(Q1);
    printf("\nUkuran Q1 adalah: %d", sizeQueue(Q1));
    printf("\nApakah Q1 berisi satu elemen: %d\n\n", isOneElement(Q1));
    
    for (int i = 0; i <= 8; i++) {
        enqueue(&Q1, 'b' + i);
    }
    viewQueue(Q1);
    printf("\nApakah Q1 penuh: %d", isFullQueue(Q1));
    printf("\nHead Q1 adalah: %c", infoHead(Q1));
    printf("\nTail Q1 adalah: %c\n\n", infoTail(Q1));

    dequeue(&Q1, &hold1);
    printQueue(Q1);
    printf("\nElemen yang di dequeue: %c\n\n", hold1);

    createQueue(&Q2);
    for (int i = 0; i <= 10; i++) {
        enqueue1(&Q2, 'a' + i);
    }
    printQueue(Q1);
    printf("\n");
    viewQueue(Q2);
    printf("\nUkuran terbesar antara Q1 dan Q2 adalah: %d\n\n", maxlength(Q1, Q2));

    enqueue2(&Q1, &Q2, 'l');
    viewQueue(Q1);
    printf("\n");
    viewQueue(Q2);

    dequeue2(&Q1, &Q2, &hold2);
    printf("\n\n");
    printQueue(Q1);
    printf("\n");
    viewQueue(Q2);
    printf("\nElemen yang di dequeue: %c", hold2);

    return 0;
}
