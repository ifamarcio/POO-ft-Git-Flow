public abstract class FiguraGeometrica {
 private String nomeFigura;


 public float area (){
    //indica uma área invalida , pois não existe área negativa.
    return -1;
 }
 
 //Construtor

 public FiguraGeometrica(String nomeFigura){
    this.nomeFigura = nomeFigura;
 }

//Encapsulamento: permite acesso ao lado do atributo
public String getNomeFigura(){
    return nomeFigura;+
}


}
