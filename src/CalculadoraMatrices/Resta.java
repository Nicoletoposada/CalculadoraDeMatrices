package CalculadoraMatrices;

public class Resta implements Interface
{
    @Override
    public String operacion(int n, int n2)
    {
        int num[][] = new int[n2][n2];
        int i, j;
        String imprimir = "";
        
        for(i = 0; i <= (n2 - 1); i++)//Filas de la matriz
        {
            for(j = 0; j <= (n2 - 1); j++)//Columnas de la matriz
            {
                num[i][j] = (int) (Math.random() * (100 - 1) + 1);//Creación de la matriz de forma aleatoria
                imprimir += " " + num[i][j] + " ";//Forma de organizar la mtriz por filas y columnas
            }
            imprimir += "\n";
        }
        imprimir += "Con resta de 5\n";
        for(i = 0; i <= (n2 - 1); i++)
        {
            for(j = 0; j <= (n2 - 1); j++)
            {
                num[i][j] -= n;//Donde se hace la resta a cada numero de la matriz
                imprimir += " " + num[i][j] + " ";
            }
            imprimir += "\n";
        }
        return imprimir;//Se retorna la im presión de la matriz normal, y de la matriz despues de la operacion
    }

}