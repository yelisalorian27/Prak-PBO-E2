/**
 * File     : MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 * Pembuat : Yelisa Lorian
 * Tanggal: 16 Mei 2025
 */

 public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager manager = new DAOManager();
        manager.setPersonDAO(new MySQLPersonDAO());

        try {
            manager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
