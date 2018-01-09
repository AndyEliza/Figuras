
package figuras;

public class Geometria 
{
   
    public static void main(String[] args) 
    {
        /*Cuadrado*/
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.area();
        System.out.println("Cuadrado lado 5: " + 
                cuadrado.getareaCuadrado());
        /*Circulo*/
        Circulo circulo = new Circulo(2);
        circulo.area();
        System.out.println("Círculo  radio 2: " + 
                circulo.getAreaRadio());
        /*Rectangulo*/
        Rectángulo rectangulo = new Rectángulo(50, 10);
        rectangulo.area();
        System.out.println("Rectángulo base 50 -- altura 10: " + 
                rectangulo.getAreaRectangulo());
        /*Triangulo*/
        Triangulo triangulo = new Triangulo(2, 5);
        triangulo.area();
        System.out.println("Triángulo base 2 -- altura 5: " + 
                triangulo.getareaTriangulo());        
    }    
}
