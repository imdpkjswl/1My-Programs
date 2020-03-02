/*
Given a File of N employee records with a set K of Keys(4-digit) which uniquely determine the
records in file F. Assume that file F is maintained in memory by a Hash Table(HT) of m memory
locations with L as the set of memory addresses (2-digit) of locations in HT. Let the keys in K and
addresses in L are Integers. Design and develop a Program in C that uses Hash function H: K ®L
as H(K)=K mod m (remainder method), and implement hashing technique to map a given key K
to the address space L. Resolve the collision (if any) using linear probing.
*/
#include<stdio.h>

#define m 10
int HT[m];


int hash(int key)
{
    return key%m;

}
void linear_probe(int hk,int key)
{
    int i,flag=0;
    for(i=hk+1; i<m; i++)
    {
        if(HT[i]==-1)
        {
            HT[i]=key;
            flag=1;
            break;

        }
    }
    for(i=0; i<hk&&flag==0; i++)
    {
        if(HT[i]==-1)
        {
            HT[i]=key;
            flag=1;
            break;
        }

    }
    if(!flag)
        printf("hash table is full\n\n");
}



void main()
{
    FILE *fp;
    int i,hk,key;
    char name[100];
    for(i=0; i<m; i++)
        HT[i]=-1;

    fp=fopen("deepak.txt","r");
    while(!feof(fp))
    {
        fscanf(fp,"%d%s ",&key,name);
        hk=hash(key);

        if(HT[hk]==-1)
            HT[hk]=key;
        else
        {
            printf("collision for key %d.\n",key);
            linear_probe(hk,key);
            printf("collision solved By Linear Probing\n");


        }
    }

    printf("Hash table\n\n");

    printf("Address\t\t Key\n");
    for(i=0; i<m; i++)
        printf("%02d\t\t %d\n",i,HT[i]);
}
