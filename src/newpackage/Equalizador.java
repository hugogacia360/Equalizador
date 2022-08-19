package newpackage;

public class Equalizador 
{
    private  int volume;
    private  int grave;
    private  int medio;
    private  int agudo;
    private String nome;

    public Equalizador(int volume, int grave, int medio, int agudo, String nome) 
    {
        this.volume = 0;
        this.grave = 0;
        this.medio = 0;
        this.agudo = 0;
        this.nome = nome;
    }
    
    public Equalizador(int volume, int grave, int medio, int agudo) 
    {
        this.volume = 0;
        this.grave = 0;
        this.medio = 0;
        this.agudo = 0;
        this.nome = "Ajuste sem nome";
    }

    
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    
    
    public int getVolume() 
    {
        return volume;
    }

    public void setVolume(int volume) 
    {
        this.volume = volume;
    }

    public int getGrave() 
    {
        return grave;
    }

    public void setGrave(int grave) 
    {
        this.grave = grave;
    }

    public int getMedio() 
    {
        return medio;
    }

    public void setMedio(int medio) 
    {
        this.medio = medio;
    }

    public int getAgudo() {
        return agudo;
    }

    public void setAgudo(int agudo) 
    {
        this.agudo = agudo;
    }
    
    //Operando os valores do volume
    public void aumentaVolume()
    {
        if(volume<100)
        {
            this.volume ++;
        }
        else 
        {
            this.volume = 100;
            System.out.println("Volume excedido");
        }    
    }        
    public void abaixaVolume()
    {
        if(volume>0)
        {
            this.volume --;
        }    
        else 
        {
            this.volume = 0;
            System.out.println("Volume minimo atingido");
        }
    }        
    
     //Operando os valores do grave
    public void aumentaGrave()
    {
        if(grave<100)
        {
            this.grave++;
        }
        else 
        {
            this.grave = 100;
            System.out.println("Grave excedido");
        }    
    }        
    public void abaixaGrave()
    {
        if(grave>0)
        {
            this.grave --;
        }    
        else 
        {
            this.grave = 0;
            System.out.println("Grave minimo atingido");
        }
    }        
    //Operando os valores do medios
    public void aumentaMedio()
    {
        if(medio<100)
        {
            this.medio++;
        }
        else 
        {
            this.medio = 100;
            System.out.println("Medio excedido");
        }    
    }        
    public void abaixaMedio()
    {
        if(medio>0)
        {
            this.medio--;
        }    
        else 
        {
            this.medio = 0;
            System.out.println("Medio minimo atingido");
        }
    }        
        //Operando os valores do volume
    public void aumentaAgudo()
    {
        if(agudo<100)
        {
            this.agudo++;
        }
        else 
        {
            this.agudo = 100;
            System.out.println("Agudo excedido");
        }    
    }        
    public void abaixaAgudos()
    {
        if(agudo>0)
        {
            this.agudo--;
        }    
        else 
        {
            this.agudo = 0;
            System.out.println("Agudo minimo atingido");
        }
    }        

    @Override
    public String toString() 
    {
        return "Equalizacao{" + "volume=" + volume + ", grave=" + grave + ", medio=" + medio + ", agudo=" + agudo + ", nome=" + nome + '}';
    }
    
    
    

}