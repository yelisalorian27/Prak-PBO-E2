/**
 * File     : DAOManager.java
 * Deskripsi: pengelola DAO dalam program
   Pembuat : Yelisa Lorian
*  Tanggal: 16 Mei 2025
*/ 

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
