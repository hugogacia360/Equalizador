package newpackage;

import java.util.*;

public class Usuario 
{
    ArrayList<Equalizador> eq = new ArrayList();
    
    
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) 
    {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    
    public void salvaAjuste(Equalizador e, String nomeAjuste)
    {
        if(nomeAjuste == null)
        {
            nomeAjuste = e.getNome()+eq.size();
            e.setNome(nomeAjuste);
        }
        
        eq.add(e);
        System.out.println("Ajuste salvo !");
    }        
    
    public void deletaAjuste(Equalizador e)
    {
        eq.remove(e);
    }        
    
    public boolean deletaAjuste(String nomeAjuste)
    {
        for(int i = 0 ; i< eq.size();i++)
        {    
            if(eq.get(i).getNome().equals(nomeAjuste))
            {
                eq.remove(i);
                System.out.println("Ajuste removido");
                return true;
            }
        }
        System.out.println("Ajuste nao encontrado");
        return false;
    }        
    public void editaAjuste(Equalizador e)
    {
       /* for(int i = 0 ; i<eq.size();i++)
        {    
            if(eq.get(i).getNome().equals(nomeAjuste))
            {
                eq.remove(i);
                System.out.println("Ajuste removido");
                return true;
            }
        }
        System.out.println("Ajuste nao encontrado");
        return false;
        */
    }        

    public void listarAjuste(Equalizador e)
    {
        for (int i = 0; i<eq.size(); i++)
        {
            System.out.println(eq.get(i));
        }    
    }        
    
    public boolean buscarAjuste (String nomeAjuste)
    {
        for(Equalizador aux: eq)
        {
            if(aux.getNome().equals(nomeAjuste))
            {
                System.out.println(aux);         
                return true;
            }        
        }    
            System.out.println("Ajuste nao encontrado");
            return false;   
    }        
}
