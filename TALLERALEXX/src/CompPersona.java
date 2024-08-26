
class CompPersona {
    private double estatura;
    private int edad;

    public CompPersona (double estatura, int edad){
       this.estatura = estatura;
       this.edad = edad;
    }

    public Double getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {

        CompPersona persona1 = new CompPersona(1.70,20);
        CompPersona persona2 = new CompPersona(1.80,25);

        if (persona1.edad > persona2.edad && persona1.estatura > persona2.estatura ){
            System.out.println("la primera persona es mayor de edad y es mas alta ");
        } else {
            System.out.println("la segunda persona es mayor y mas alta ");
        }

    }

}
