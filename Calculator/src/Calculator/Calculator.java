package Calculator;

public class Calculator {
    int numbA;
    int numbB;

    public Calculator(int numbA, int numbB) {
        this.numbA = numbA;
        this.numbB = numbB;
    }
    public int tambah() {
        return this.numbA + this.numbB;
    }

    public int kurang() {
        return this.numbA - this.numbB;
    }

    public int bagi() {
        return this.numbA / this.numbB;
    }
    
    public int kali() {
        return this.numbA * this.numbB;
    }
    
    public int modulus() {
        return this.numbA % this.numbB;
    }
}
