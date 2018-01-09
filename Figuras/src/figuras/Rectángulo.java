/*
 * Rectangulo
 */
package figuras;


public class Rectángulo implements FigGeo
{
    private double base;
    private double altura;
    private double areaRectangulo;

    public Rectángulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }
    /*aplicamos la formula de calculo del area*/
    @Override
    public void area() 
    {
        areaRectangulo = (2*base) + (2*altura);
    }
}
