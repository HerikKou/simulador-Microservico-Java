package src.Model;

public class Cliente{
    private int clienteId;
    private String nome;
    private String email;
    private double saldo;
    public Cliente(Builder builder){
        this.clienteId = builder.clienteId;
        this.nome = builder.nome;
        this.email = builder.email;
        this.saldo = builder.saldo;
    }
    //   public Cliente() {
    // }
    public Builder build(){
        return new Builder();
    }
    public static class Builder{
    private int clienteId;
    private String nome;
    private String email;
    private double saldo;
        public Builder clienteId(int clienteId){this.clienteId = clienteId; return this;}
        public Builder nome(String nome){this.nome = nome; return this;}
        public Builder email(String email){this.email = email; return this;}
        public Builder saldo(double saldo){this.saldo = saldo; return this;}
        public Cliente build(){return new Cliente(this);}
    }


  
    public int getclienteId() {
        return clienteId;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return"ClienteId:"+clienteId +"|" +"\s" +"Nome:"+nome +"|" +"\s" +"Email:"+email +"|" +"Saldo:"+saldo +"|"+"\n";
    }
}
