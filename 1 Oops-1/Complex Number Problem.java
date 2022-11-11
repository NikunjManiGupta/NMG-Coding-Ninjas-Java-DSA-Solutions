public class ComplexNumbers {
    
    private int real , imaginary;
    
    public ComplexNumbers(int real , int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    
    public void plus(ComplexNumbers n){
        this.real=this.real +n.real;
        this.imaginary=this.imaginary+ n.imaginary;
    }
    
    public void multiply(ComplexNumbers c2){
      	int r = this.real*c2.real-this.imaginary*c2.imaginary;          
      	this.imaginary=this.real*c2.imaginary+this.imaginary*c2.real;
      	this.real =r;
    }
    
    public void print(){
    	System.out.println(this.real+" + i"+this.imaginary);
    }
	
}
