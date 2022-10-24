public class Triangulo extends FiguraGeometrica {
   private float base;
   private float altura;

   public Triangulo (){
    super ("Triâng ulo");

   }

   // Representa a definição do metodo : Polimorfismo
   @Override
    public float area (){
         return ((this.base * this.altura) / (float)2);
    }

   public float getBase(){
return base;

   }

   public void setBase(float base){

    this.base =base;
   }

public float getAltura (){
    return altura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
}










}