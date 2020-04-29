
package prodavnicafilmovaapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class MySQL {
   
    public static void main(String args []){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonekcijaGUI1().setVisible(true);
            }
        });
    } 
    
    
     Connection konekcija=null;
        
        public boolean Konekcija(String server, String korisnickoIme, String lozinka, String baza){
        
        boolean status=false;
      
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            String url="jdbc:mysql://localhost:3306/prodavnicafilmova?autoReconnect=true&useSSL=false";
            konekcija=DriverManager.getConnection(url, "root", "");
                if(!konekcija.isClosed()){
                status = true;
                        JOptionPane.showMessageDialog(null, "Konekcija uspjesna!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Konekcija neuspjesna!");
                    }
                        
        }
        catch (ClassNotFoundException | SQLException e){
            
        }
        return status;
    }
    public boolean Insert(String idFilma, String nazivFilma, String kolicina, String cijena, String idZanra, String idDobavljaca){
        boolean stat=false;
        
        try{
            String query = "INSERT INTO film (idFilma, nazivFilma, kolicina, cijena, idZanra, idDobavljaca) " 
                   + "VALUES ('"+idFilma+"', '"+nazivFilma+"', '"+kolicina+"', '"+cijena+"', '"+idZanra+"', '"+idDobavljaca+"')";
            
            Statement stmt = konekcija.createStatement();
            int rezultat = stmt.executeUpdate(query);
            if (rezultat==1){
                stat = true;
                JOptionPane.showMessageDialog(null, "Uspjesan unos podataka!");
            }
            else {
                stat=false;
                JOptionPane.showMessageDialog(null, "Neuspjesan unos podataka!");
            }
        }
        catch (SQLException e){
            stat=false;
        }
        return stat;
    }
       
    public void PrikaziPodatke(JTable jtbt) {
        try{
                   String query="SELECT * FROM film";
                   Statement stmt = konekcija.createStatement();
                   ResultSet rs = stmt.executeQuery(query);
                   int brojac = 0;
                   while(rs.next()){
                   brojac++;
                   }
                Object nazivKolona[]={"idFilma", "nazivFilma", "kolicina", "cijena", "idZanra", "idDobavljaca"};
                Object podaci[][]=new Object [brojac][6];
                rs=stmt.executeQuery(query);
                int i=0;
                while (rs.next()){
                  podaci [i][0]=rs.getInt("idFilma");
                  podaci [i][1]=rs.getString("nazivFilma");
                  podaci [i][2]=rs.getInt("kolicina");
                  podaci [i][3]=rs.getDouble("cijena");
                  podaci [i][4]=rs.getInt("idZanra");
                  podaci [i][5]=rs.getInt("idDobavljaca");
                i++;
}
jtbt.setModel(new javax.swing.table.DefaultTableModel(podaci, nazivKolona));
}
        catch(SQLException e){
}
    }
    public void Delete(String idFilma) {
        try{
            String query = "DELETE FROM film WHERE idFilma='"+idFilma+"'";
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izbrisan!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
        }
        catch(SQLException e){
    }
            
}
        
       
    
    public boolean UnesiZanr(String idZanra, String nazivZanra) {
        boolean stat=false;
        
        try{
            String query = "INSERT INTO zanr (idZanra, nazivZanra) " 
                   + "VALUES ('"+idZanra+"', '"+nazivZanra+"')";
            
            Statement stmt = konekcija.createStatement();
            int rezultat = stmt.executeUpdate(query);
            if (rezultat==1){
                stat = true;
                JOptionPane.showMessageDialog(null, "Uspjesan unos podataka!");
            }
            else {
                stat=false;
                JOptionPane.showMessageDialog(null, "Neuspjesan unos podataka!");
            }
        }
        catch (SQLException e){
            stat=false;
        }
        return stat;
    }
    
    public void PrikaziPodatkeZanr(JTable jtbt) {
        try{
                   String query="SELECT * FROM zanr";
                   Statement stmt = konekcija.createStatement();
                   ResultSet rs = stmt.executeQuery(query);
                   int brojac = 0;
                   while(rs.next()){
                   brojac++;
                   }
                Object nazivKolona[]={"idZanra", "nazivZanra"};
                Object podaci[][]=new Object [brojac][2];
                rs=stmt.executeQuery(query);
                int i=0;
                while (rs.next()){
                  podaci [i][0]=rs.getInt("idZanra");
                  podaci [i][1]=rs.getString("nazivZanra");
                  i++;
}
jtbt.setModel(new javax.swing.table.DefaultTableModel(podaci, nazivKolona));
}
        catch(SQLException e){
}
    }
    public void ObrisiZanr(String idZanra) {
        try{
            String query = "DELETE FROM zanr WHERE idZanra='"+idZanra+"'";
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izbrisan!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
        }
        catch(SQLException e){
    }
}
    
    public void AzuriranjeZanr(String idZanra, String noviZanr) {
        try{
            String query = "UPDATE zanr SET nazivZanra='"+noviZanr+"' WHERE idZanra='"+idZanra+"'";
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izmijenjen!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
        }
        catch(SQLException e){
            
        }
}
    public boolean UnesiDobavljac(String idDobavljaca, String nazivDobavljaca, String adresa, String email) {
        boolean stat=false;
        
        try{
            String query = "INSERT INTO dobavljac (idDobavljaca, nazivDobavljaca, adresa, email) " 
                   + "VALUES ('"+idDobavljaca+"', '"+nazivDobavljaca+"','"+adresa+"', '"+email+"')";
            
            Statement stmt = konekcija.createStatement();
            int rezultat = stmt.executeUpdate(query);
            if (rezultat==1){
                stat = true;
                JOptionPane.showMessageDialog(null, "Uspjesan unos podataka!");
            }
            else {
                stat=false;
                JOptionPane.showMessageDialog(null, "Neuspjesan unos podataka!");
            }
        }
        catch (SQLException e){
            stat=false;
        }
        return stat;
    }
    
    public void PrikaziPodatkeDobavljac(JTable jtbt) {
        try{
                   String query="SELECT * FROM dobavljac";
                   Statement stmt = konekcija.createStatement();
                   ResultSet rs = stmt.executeQuery(query);
                   int brojac = 0;
                   while(rs.next()){
                   brojac++;
                   }
                Object nazivKolona[]={"idDobavljaca", "nazivDobavljaca", "adresa", "email"};
                Object podaci[][]=new Object [brojac][4];
                rs=stmt.executeQuery(query);
                int i=0;
                while (rs.next()){
                  podaci [i][0]=rs.getInt("idDobavljaca");
                  podaci [i][1]=rs.getString("nazivDobavljaca");
                  podaci [i][2]=rs.getString("adresa");
                  podaci [i][3]=rs.getString("email");
                  i++;
}
jtbt.setModel(new javax.swing.table.DefaultTableModel(podaci, nazivKolona));
}
        catch(SQLException e){
}
    }
    public void ObrisiDobavljac(String idDobavljaca) {
        try{
            String query = "DELETE FROM dobavljac WHERE idDobavljaca='"+idDobavljaca+"'";
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izbrisan!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
        }
        catch(SQLException e){
    }
}
    
    public void AzuriranjeDobavljac(String idDobavljaca, String noviDobavljac) {
        try{
            String query = "UPDATE dobavljac SET nazivDobavljaca='"+noviDobavljac+"' WHERE idDobavljaca='"+idDobavljaca+"'";
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izmijenjen!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
        }
        catch(SQLException e){
            
        }
}
    
       
    public void PrikaziPodatkeRacun(JTable jtbt) {
        try{
                   String query="SELECT * FROM Racun";
                   Statement stmt = konekcija.createStatement();
                   ResultSet rs = stmt.executeQuery(query);
                   int brojac = 0;
                   while(rs.next()){
                   brojac++;
                   }
                Object nazivKolona[]={"idRacuna", "DatumProdaje", "idRadnika"};
                Object podaci[][]=new Object [brojac][3];
                rs=stmt.executeQuery(query);
                int i=0;
                while (rs.next()){
                  podaci [i][0]=rs.getInt("idRacuna");
                  podaci [i][1]=rs.getDate("DatumProdaje");
                  podaci [i][2]=rs.getInt("idradnika");
                  
                  i++;
}
jtbt.setModel(new javax.swing.table.DefaultTableModel(podaci, nazivKolona));
}
        catch(SQLException e){
}
    }
    public void ObrisiRacun(String idRacuna) {
        try{
            String query = "DELETE FROM racun WHERE idRacuna='"+idRacuna+"'";
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izbrisan!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
        }
        catch(SQLException e){
    }
}
     public void PrikaziPodatkeFilmDob(JTable jtbt) {
        try{
                   String query="SELECT nazivFilma, nazivDobavljaca FROM prodavnicafilmova.film, prodavnicafilmova.dobavljac WHERE (prodavnicafilmova.film.idDobavljaca=prodavnicafilmova.dobavljac.idDobavljaca);";
                   Statement stmt = konekcija.createStatement();
                   ResultSet rs = stmt.executeQuery(query);
                   int brojac = 0;
                   while(rs.next()){
                   brojac++;
                   }
                Object nazivKolona[]={"nazivFilma", "nazivDobavljaca"};
                Object podaci[][]=new Object [brojac][2];
                rs=stmt.executeQuery(query);
                int i=0;
                while (rs.next()){
                  podaci [i][0]=rs.getString("nazivFilma");
                  podaci [i][1]=rs.getString("nazivDobavljaca");
                                 
                  i++;
}
jtbt.setModel(new javax.swing.table.DefaultTableModel(podaci, nazivKolona));
}
        catch(SQLException e){
}
}   
 public void PrikaziPodatkeFilmZanr(JTable jtbt) {
        try{
                   String query="SELECT nazivFilma, nazivZanra FROM prodavnicafilmova.film, prodavnicafilmova.zanr WHERE (prodavnicafilmova.film.idZanra=prodavnicafilmova.zanr.idZanra)";
                   Statement stmt = konekcija.createStatement();
                   ResultSet rs = stmt.executeQuery(query);
                   int brojac = 0;
                   while(rs.next()){
                   brojac++;
                   }
                Object nazivKolona[]={"nazivFilma", "nazivZanra"};
                Object podaci[][]=new Object [brojac][2];
                rs=stmt.executeQuery(query);
                int i=0;
                while (rs.next()){
                  podaci [i][0]=rs.getString("nazivFilma");
                  podaci [i][1]=rs.getString("nazivZanra");
                                   
                  i++;
}
jtbt.setModel(new javax.swing.table.DefaultTableModel(podaci, nazivKolona));
}
        catch(SQLException e){
}
 }

     
}
   


         
    
   

    
   
    



    
   


