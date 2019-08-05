//Luis Diego Solorzano Maroto - 2019042851

#include <string.h>
#include <stdio.h>

struct estudiantes{
    int carnet;
    char nombre_estudiante[20];
}arreglo[10];
typedef struct estudiantes lista_carnets;

int main(){
    lista_carnets estudiantes;
    int a;
    int carnet_ingresado;
    //El ciclo para guardar la informacion de los estudiantes
    for(int a=1; a<11; a+=1){
        printf("Escriba el nombre del estudiante a ingresar ");
        scanf("%s", &arreglo[a].nombre_estudiante);
        printf("Escriba el carnet a ingresar ");
        scanf("%d", &arreglo[a].carnet);
    }
    //Una vez terminado el ciclo anterior, el programa pregunta por la posicion del estudiante a buscar y su carnet y responde correctamente si la informacion concuerda.
    printf("Ingrese la posicion del estudiante a comprobar\n");
    scanf("%d", &a);
    printf("Ingrese el carnet\n", a);
    scanf("%d", &carnet_ingresado);
    if(carnet_ingresado == arreglo[a].carnet){
        printf("El carnet ingresado es el correcto\n");
    }
    //Si la informacion no es correcta le informa al usuario
    else{
        printf("El carnet ingresado es incorrecto\n");
    }
    return 0;
}