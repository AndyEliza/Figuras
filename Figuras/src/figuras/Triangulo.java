
package figuras;


public class Triangulo implements FigGeo
{
    private double base;
    private double altura;
    private double areaTriangulo;
    

    public Triangulo(double base, double altura) 
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

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }
    /*Aplica la formlua del calculo*/
    @Override
    public void area() 
    {
        areaTriangulo = (base * altura) / 2;
    }    
    
}
