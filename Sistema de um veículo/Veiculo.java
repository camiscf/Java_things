//NOME : CAMILA CALEONES DE FIGUEIREDO 

public class Veiculo {
    public String marca;
    public String modelo;
    public String dono;
    private double tanque_capacidad;//*
    private double tanque_atual;
    private double autonomia_km_l;//*
    private double km_rodados;

    

    public Veiculo(String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l){
        this.marca = marca;
        this.modelo = modelo;
        this.dono = dono;
        this.tanque_atual = 0;
        this.km_rodados = 0;

    
        if(validarProp(tanque_capacid)){
            this.tanque_capacidad = tanque_capacid;
        }else{
            System.out.println("Parâmetro inválido");
            this.tanque_capacidad = 10;
        }

        if(validarProp(autonomia_km_l)){
            this.autonomia_km_l = autonomia_km_l;
        }else { 
            System.out.println("Parâmetro inválido");
            this.autonomia_km_l = 10;
        }
        


    }

    public double lerTanqueAtual(){
        return tanque_atual;
    }

    public double lerTanqueCapacidad(){
        return tanque_capacidad;
    }

    public double lerAutonomia(){
        return autonomia_km_l;
    }

    public double lerRodagem(){
        return km_rodados;
    }

   public boolean alterarAutonomia(double autonomia){
        if(validarProp(autonomia)){
            this.autonomia_km_l = autonomia;
            return true; 
        } else{
            return false;
        }
    }

    public boolean abastecerTanque(double litros){
        if(validarProp(litros)){
            if((litros + tanque_atual) <= tanque_capacidad){
                tanque_atual += litros;
                return true;
            }else{
                return false;
            }
           
        }
        return false;
    }
    public boolean fazerViagem(double km){
        double litros = km/autonomia_km_l;
        if(validarProp(km)){
            if (litros <= tanque_atual){
                tanque_atual -=litros;
                km_rodados +=km;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    private static boolean validarProp(double prop){
        if (prop < 0){
            return false;
        } else{
            return true;
        }
    }
}
    

