#include<stdio.h>
#include<conio.h>
float min;
void nhonhat(float a[],int n,int vitri[],int &tongvitri){
	min = a[0];
	for(int i = 1;i < n;i++)
		if (a[i] < min) min = a[i];
	for(int i = 0;i < n;i++)
		if (a[i] == min){
			tongvitri++;
			vitri[tongvitri] = i;
		}
}
void doctep(float a[],int &n){
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d",&n);
	for(int i = 0;i < n;i++)
		fscanf(f,"%f",&a[i]);
	fclose(f);
}
void ghitep(int vitri[],int tongvitri,float m){
	FILE *f = fopen("output.txt","w");
	fprintf(f,"GTNN: %f -",min);
	for(int i = 1;i <= tongvitri;i++)
		fprintf(f," Vi tri %d ",vitri[i]);
	fclose(f);
}
main(){
	float a[100];
	int vitri[100],n,tongvitri = 0;
	doctep(a,n);
	nhonhat(a,n,vitri,tongvitri);
	ghitep(vitri,tongvitri,min);
}
